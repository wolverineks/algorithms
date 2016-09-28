module MergeSort
  extend self
  require 'wikipedia'

  def sort(array, options = :asc)
    if array.length <= 1 # Base Case
      array
    else
      middle = (array.length / 2).floor
      left   = sort(array[0..middle - 1], options) # Divide
      right  = sort(array[middle...array.length], options) # Divide

      options == :asc ? merge_asc(left, right) : merge_desc(left, right) # Conquer
    end
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
    page = Wikipedia.find( 'Merge Sort' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
