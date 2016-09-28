require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./selection-sort.rb"
require "../test/test.rb"
include Test

test "SelectionSort.sort, with no options",
  expected = [2, 3, 6],
  actual   = SelectionSort.sort([6, 3, 2])

test "SelectionSort.sort, ascending",
  expected = [1, 2, 3, 4, 5, 6, 7, 8, 9],
  actual   = SelectionSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1], :asc)

test "SelectionSort.sort, descending",
  expected = [9, 8, 7, 6, 5, 4, 3, 2, 1],
  actual   = SelectionSort.sort([3, 2, 6, 8, 4, 7, 5, 9, 1], :desc)
