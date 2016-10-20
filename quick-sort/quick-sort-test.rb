require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./quick-sort.rb"
# require "../test/test.rb"
# include Test
require 'basic_test'
include BasicTest

test "QuickSort.sort, with no options",
  expected = [1, 2, 3, 3, 4, 5, 6, 7, 8, 9],
  actual   = QuickSort.sort([3, 3, 2, 6, 8, 1, 4, 7, 5, 9])

test "QuickSort.sort, ascending",
  expected = [1, 2, 3, 3, 4, 5, 6, 7, 8, 9],
  actual   = QuickSort.sort([3, 3, 2, 6, 8, 1, 4, 7, 5, 9], order: :asc)

test "QuickSort.sort, descending",
  expected = [9, 8, 7, 6, 5, 4, 3, 2, 1],
  actual   = QuickSort.sort([3, 2, 6, 8, 1, 4, 7, 5, 9], order: :desc)
