module LinearSearch
  extend self

  def search(array, element)
    # iterate over the given array
    for index in (0..array.length - 1)
      key = array[index]
      # if the desired element is found, return it
      if key == element
        return index
      end
    end
    nil
  end

  def self.profile
    puts "-----------------------------------------------------------"
    puts "    In computer science, linear search or sequential search is a
    method for finding a target value within a list. It sequentially
    checks each element of the list for the target value until a
    match is found or until all the elements have been searched."
    puts "-----------------------------------------------------------"
    puts "    Very fast for lists < 10"
    puts "-----------------------------------------------------------"
    puts "    Complexity: O(n^2)"
    puts "-----------------------------------------------------------"
  end

end
