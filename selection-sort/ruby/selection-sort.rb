module SelectionSort
  extend self
  require 'wikipedia'

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
    page = Wikipedia.find( 'Selection Sort' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
