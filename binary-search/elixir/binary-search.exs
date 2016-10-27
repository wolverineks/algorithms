defmodule BinarySearch do

  def search(list, key), do: do_search(list, key, 0, length(list) - 1)

  defp do_search(_list, _key, low, high) when high < low, do: -1
  defp do_search(list, key, low, high) do
    mid_index = div((high + low), 2)
    mid = Enum.at(list, mid_index)

    cond do
      mid < key -> do_search(list, key, mid_index + 1, high)
      mid > key -> do_search(list, key, low, mid_index - 1)
      true -> mid_index
    end
  end

end
