module LinearSearch
  extend self
  require 'wikipedia'

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

  def profile
    page = Wikipedia.find( 'Linear Search' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
