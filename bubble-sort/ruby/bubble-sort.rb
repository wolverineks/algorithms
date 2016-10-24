module BubbleSort
  extend self

  def sort(array, order: :asc)
    sorted = true

    case order
    when :asc
      for i in 0..array.length - 2
        if array[i] > array[i + 1]
          sorted = false
          swap(array, i, i + 1)
        end
      end
    when :desc
      for i in 0..array.length - 2
        if array[i] < array[i + 1]
          sorted = false
          swap(array, i, i + 1)
        end
      end
    end

    sorted ? array : sort(array, order: order)
  end

  def swap(array, index_1, index_2)
    temp = array[index_1]
    array[index_1] = array[index_2]
    array[index_2] = temp
  end

end
