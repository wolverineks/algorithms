module Factorial
  extend self
  require 'wikipedia'

  def compute(number)
    return 1 if number <= 1
    number * compute(number - 1)
  end

  def profile
    page = Wikipedia.find( 'factorial' )
    puts page.summary.split("\n").map { |a| a.strip }.join(" ").gsub(/{.+}/, "")
  end

end
