module InsertionSort
  extend self
  require 'wikipedia'

# Insertion sort is a simple sorting algorithm that builds
# the final sorted array (or list) one item at a time.
  def sort(array, options = :asc)
    # iterate over all but first element in array
    for j in (1..array.length - 1) do
      key = array[j]
      # compare current element to each preceding element of array
      i = j - 1

      # sort in ascending order
      if options == :asc
        while i >= 0 && array[i] > key
          # if preceding element is greater than the current element
          # move that element one index to the right
          array[i + 1] = array[i]
          i = i - 1
        end
      # sort in descending order (default)
      elsif options == :desc
        while i >= 0 && array[i] < key
          # if preceding element is greater than the current element
          # move that element one index to the right
          array[i + 1] = array[i]
          i = i - 1
        end
      end
      # start checking the next element in the array
      array[i + 1] = key
    end
    # return the now sorted array
    array
  end

  def profile
    page = Wikipedia.find( 'Insertion Sort' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
