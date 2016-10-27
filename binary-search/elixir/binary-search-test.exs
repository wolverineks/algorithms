defmodule BinarySearchTest do

  @ansi_red "\u001B[31m"
  @ansi_reset "\u001B[0m"

  def test(test_name, expected, actual) do
    display_results(test_name, expected, actual)
  end

  defp display_results(test_name, expected, actual) do
    start_time = System.system_time
    result = (expected == actual.())
    end_time = System.system_time
    duration = duration_in_microseconds(start_time, end_time)

    if result do
      IO.puts test_name
      IO.puts "PASS: (#{duration} μs)"
    else
      start_red_text
      IO.puts test_name
      IO.puts "Expected: #{expected}"
      IO.puts "Actual:   #{actual}"
      IO.puts "FAIL: (#{duration} μs)"
      reset_text_color
    end
    IO.puts "----------------------------------"
  end

  defp duration_in_microseconds(start_time, end_time) do
    ((end_time - start_time) / 1_000)
  end

  defp start_red_text do
    IO.write @ansi_red
  end

  defp reset_text_color do
    IO.write @ansi_reset
  end

  def measure(function) do
    function
    |> :timer.tc
    |> elem(0)
  end

  def clear_screen do
    IO.write "\e[H\e[J"; IEx.dont_display_result
  end

end

BinarySearchTest.clear_screen

Code.load_file "./binary-search.exs"
# import BinarySearch

long_list = 1..1_000_000
  |> Enum.into([])

BinarySearchTest.test(
  "BinarySearch.search, when element is present",
  1,
  fn -> BinarySearch.search(long_list, 2) end
)

BinarySearchTest.test(
  "BinarySearch.search, when element is not present",
  -1,
  fn -> BinarySearch.search(long_list, 0) end
)
