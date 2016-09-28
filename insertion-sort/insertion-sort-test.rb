require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./insertion-sort.rb"
require "../test/test.rb"
include Test

test "InsertionSort.sort, with no options",
  expected = [1, 2, 3, 4, 5, 6, 7, 8, 9],
  actual   = InsertionSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1])

test "InsertionSort.sort, ascending",
  expected = [1, 2, 3, 4, 5, 6, 7, 8, 9],
  actual   = InsertionSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1], :asc)

test "InsertionSort.sort, descending",
  expected = [9, 8, 7, 6, 5, 4, 3, 2, 1],
  actual   = InsertionSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1], :desc)
