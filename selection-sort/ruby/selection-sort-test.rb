require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./selection-sort.rb"
# require "../test/test.rb"
# include Test
require 'basic_test'
include BasicTest

test "SelectionSort.sort, with no options",
  expected = [2, 3, 6],
  actual   = SelectionSort.sort([6, 3, 2])

test "SelectionSort.sort, ascending",
  expected = [0, 1, 2, 3, 5, 6, 8, 9, 9],
  actual   = SelectionSort.sort([3, 5, 8, 1, 6, 2, 9, 9, 0], :asc)

test "SelectionSort.sort, descending",
  expected = [9, 9, 8, 6, 5, 3, 2, 1, 0],
  actual   = SelectionSort.sort([3, 5, 8, 1, 6, 2, 9, 9, 0], :desc)
