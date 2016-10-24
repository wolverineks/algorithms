module InsertionSort
  extend self
  require 'wikipedia'

  def sort(array, options = :asc)
    for j in (1..array.length - 1) do
      key = array[j]
      i = j - 1
      if options == :asc
        while i >= 0 && array[i] > key
          array[i + 1] = array[i]
          i = i - 1
        end
      elsif options == :desc
        while i >= 0 && array[i] < key
          array[i + 1] = array[i]
          i = i - 1
        end
      end
      array[i + 1] = key
    end
    array
  end

  def swap(array, index1, index2)
    temp = array[index1]
    array[index1] = array[index2]
    array[index2] = temp
  end

  def profile
    page = Wikipedia.find( 'Insertion Sort' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
