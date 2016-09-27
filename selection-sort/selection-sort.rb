module SelectionSort
  extend self

  def sort(array, options = :asc)
    #iterate over the given array
    for i in (0..array.length - 1)
      # iterate over the remaining elements
      for j in ((i + 1)..array.length - 1)
        # if the elements are out of order, switch them
        if array[j] < array[i] && options == :asc
          array[j], array[i] = array[i], array[j]
        elsif array[j] > array[i] && options == :desc
          array[j], array[i] = array[i], array[j]
        end
      end
    end
    array
  end

  def profile
    puts "-----------------------------------------------------------"
    puts "    In computer science, selection sort is a sorting algorithm,
    specifically an in-place comparison sort"
    puts "-----------------------------------------------------------"
    puts "    Good with memory management"
    puts "-----------------------------------------------------------"
    puts "    Complexity: O(n^2)"
    puts "-----------------------------------------------------------"
  end

end
