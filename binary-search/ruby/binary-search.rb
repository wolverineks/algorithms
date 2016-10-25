module BinarySearch
  extend self
  require 'wikipedia'

  def search(array, key)
    lower = 0
    upper = array.length - 1
    result = nil

    while lower <= upper
      mid = (upper + lower) / 2

      if array[mid] == key
        return mid
      elsif array[mid] > key
        upper = mid - 1
      else
        lower = mid + 1
      end
    end
  end

  def search_for(array, key, which = :first)
    lower = 0
    upper = array.length - 1
    result = nil

    while lower <= upper
      mid = (upper + lower) / 2

      if array[mid] == key
        result = mid
        upper = mid - 1 if which == :first
        lower = mid + 1 if which == :last
      elsif array[mid] > key
        upper = mid - 1
      else
        lower = mid + 1
      end
    end

    result
  end

  def count(array, key)
    lower = 0
    upper = array.length - 1
    result = 0

    first = search_for(array, key, :first)
    return result unless first
    last  = search_for(array, key, :last)

    result = last - first + 1
  end

  def rotations(array, method: :recursion)
    case method
    when :iteration
      iteration_rotations(array)
    when :recursion
      recursion_rotations(array)
    end
  end

  def iteration_rotations(array)
    low = 0
    high = (array.length - 1)

    while array[low] > array[high]
      mid = (low + high) / 2
      if array[mid] > array[high]
        low = mid + 1
      else
        high = mid
      end
    end

    low
  end

  def recursion_rotations(array, lower = 0, upper = (array.length - 1), method: :recursion)
    mid = (upper + lower) / 2

    if array[lower] > array[mid]
      recursion_rotations(array, lower, mid)
    elsif array[mid] > array[upper]
      recursion_rotations(array, mid + 1, upper)
    else
      lower
    end
  end

  def circular_search(array, key)
    start = rotations(array)
    array = array[start..-1] + array[0..start - 1]
    unaltered_result = search(array, key)

    unaltered_result ? unaltered_result + start : nil
  end

  def profile
    page = Wikipedia.find( 'Binary Search' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
