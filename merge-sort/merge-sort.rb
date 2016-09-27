module MergeSort
  extend self

  def sort(array, options = :asc)
    return array if array.length == 1 # Base Case
    middle = (array.length / 2).floor
    left   = sort(array[0...middle], options) # Divide
    right  = sort(array[middle...array.length], options) # Divide

    options == :asc ? merge_asc(left, right) : merge_desc(left, right) # Conquer
  end

  def merge_asc(left, right)
    if left == []
      right
    elsif right == []
      left
    elsif left[0] < right[0]
      [left[0]] + (merge_asc(left[1..left.length], right))
    elsif right[0] < left[0]
      [right[0]] + (merge_asc(right[1..right.length], left))
    end
  end

  def merge_desc(left, right)
    if left == []
      right
    elsif right == []
      left
    elsif left[0] > right[0]
      [left[0]] + (merge_desc(left[1..left.length], right))
    elsif right[0] > left[0]
      [right[0]] + (merge_desc(right[1..right.length], left))
    end
  end

  def profile
    puts "-----------------------------------------------------------"
    puts "    In computer science, merge sort (also commonly spelled
    mergesort) is an efficient, general-purpose, comparison-based
    sorting algorithm. Most implementations produce a stable sort,
    which means that the implementation preserves the input order of
    equal elements in the sorted output."
    puts "-----------------------------------------------------------"
    puts "    Very fast for lists < 10"
    puts "-----------------------------------------------------------"
    puts "    Complexity: O(n^2)"
    puts "-----------------------------------------------------------"
  end

end
