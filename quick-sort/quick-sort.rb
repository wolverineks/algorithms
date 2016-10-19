module QuickSort
  extend self
  require 'wikipedia'

  def sort(array: [], low: 0, high: array.length - 1, order: :asc)
    if low < high
      p_index = partition(array, low, high, order)
      sort(array: array, low: low, high: p_index - 1, order: order)
      sort(array: array, low: p_index + 1, high: high, order: order)
    end

    array
  end

  def partition(array, low, high, order)
    pivot   = array[high]
    p_index = low

    if order == :asc
      for i in low..(high - 1)
        if array[i] < pivot
          swap(array, i, p_index)
          p_index += 1
        end
      end
    end

    if order == :desc
      for i in low..(high - 1)
        if array[i] > pivot
          swap(array, i, p_index)
          p_index += 1
        end
      end
    end

    swap(array, p_index, high)

    p_index
  end

  def swap(array, a, b)
    temp = array[a]
    array[a] = array[b]
    array[b] = temp
  end

  def profile
    page = Wikipedia.find( 'Quick Sort' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end
end
