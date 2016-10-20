require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./merge-sort.rb"
# require "../test/test.rb"
# include Test
require 'basic_test'
include BasicTest

test "MergeSort.sort, with no options",
  expected = [1, 2, 3, 4, 5, 6, 7, 8, 9],
  actual   = MergeSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1])

test "MergeSort.sort, ascending",
  expected = [1, 2, 3, 4, 5, 6, 7, 8, 9],
  actual   = MergeSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1], :asc)

test "MergeSort.sort, descending",
  expected = [9, 8, 7, 6, 5, 4, 3, 2, 1],
  actual   = MergeSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1], :desc)
