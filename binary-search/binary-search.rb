module BinarySearch
  extend self

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

end
