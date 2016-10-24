require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./bubble-sort.rb"
# require "../test/test.rb"
# include Test
require 'basic_test'
include BasicTest

test "BubbleSort.sort, with no options",
  expected = [1, 2, 3, 3, 4, 5, 6, 7, 8, 9],
  actual   = BubbleSort.sort([3, 3, 2, 6, 8, 1, 4, 7, 5, 9])

test "BubbleSort.sort, ascending",
  expected = [1, 2, 3, 3, 4, 5, 6, 7, 8, 9],
  actual   = BubbleSort.sort([3, 3, 2, 6, 8, 1, 4, 7, 5, 9], order: :asc)

test "BubbleSort.sort, descending",
  expected = [9, 8, 7, 6, 5, 4, 3, 3, 2, 1],
  actual   = BubbleSort.sort([3, 3, 2, 6, 8, 1, 4, 7, 5, 9], order: :desc)
