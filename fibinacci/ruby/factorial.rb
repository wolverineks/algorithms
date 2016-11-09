module Factorial
  extend self
  require 'wikipedia'

  def compute(number, method = :recursive)
    if method == :iterative
      computeIterative(number)
    else
      computeRecursive(number, :recursive)
    end
  end

  def computeRecursive(number, method)
    return 1 if number <= 1
    number * compute(number - 1)
  end

  def computeIterative(number)
    result = 1
    while number > 0
      result *= number
      number -= 1
    end
    result
  end

  def profile
    page = Wikipedia.find( 'factorial' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
