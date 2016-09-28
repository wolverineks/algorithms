module BinarySearch
  extend self
  require 'wikipedia'

  def search(array, key, upper = array.length - 1, lower = 0)
    mid = (upper + lower) / 2

    if lower > upper
      nil
    elsif array[mid] == key
      mid
    elsif key > array[mid]
      lower = mid + 1
      search(array, key, upper, lower)
    else
      upper = mid - 1
      search(array, key, upper, lower)
    end
  end

  def profile
    page = Wikipedia.find( 'Binary Search' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
