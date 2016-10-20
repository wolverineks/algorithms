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

  def rotations(array)
    lower = 0
    upper = array.length - 1
    return 0 if array[lower] < array[upper]

    while lower <= upper
      mid = (upper + lower) / 2

      if array[lower] < array[mid]
        lower = mid
      elsif array[upper] > array[mid]
        upper = mid
      else
        return array.length - 1 - mid
      end
    end
  end

  def profile
    page = Wikipedia.find( 'Binary Search' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
