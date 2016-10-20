require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./binary-search.rb"
# require "../test/test.rb"
# include Test
require 'basic_test'
include BasicTest

test "BinarySearch.search, with element present",
  expected = 0,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 1)

test "BinarySearch.search, with element present",
  expected = 3,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 4)

test "BinarySearch.search, with element present",
  expected = 8,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 9)

test "BinarySearch.search, with element not present",
  expected = nil,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 21)

test "BinarySearch.search_for, with element present",
  expected = 2,
  actual   = BinarySearch.search_for([2, 4, 10, 10, 10, 18], 10, :first)

test "BinarySearch.search_for, with element not present",
  expected = nil,
  actual   = BinarySearch.search_for([2, 4, 10, 10, 10, 18], 21, :first)

test "BinarySearch.search_for, with element present, short array",
  expected = 0,
  actual   = BinarySearch.search_for([10], 10, :first)

test "BinarySearch.search_for, with element not present, short array",
  expected = nil,
  actual   = BinarySearch.search_for([10], 21, :first)

test "BinarySearch.search_for, with element present",
  expected = 4,
  actual   = BinarySearch.search_for([2, 4, 10, 10, 10, 18], 10, :last)

test "BinarySearch.search_for, with element not present",
  expected = nil,
  actual   = BinarySearch.search_for([2, 4, 10, 10, 10, 18], 21, :last)

test "BinarySearch.search_for, with element present, short array",
  expected = 0,
  actual   = BinarySearch.search_for([10], 10, :last)

test "BinarySearch.search_for, with element not present, short array",
  expected = nil,
  actual   = BinarySearch.search_for([10], 21, :last)

test "BinarySearch.count, with element present",
  expected  = 5,
  actual    = BinarySearch.count([2, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 18], 10)

test "BinarySearch.count, with element not present",
  expected  = 0,
  actual    = BinarySearch.count([2, 4, 5, 6, 7, 8, 9, 10, 10, 10, 18], 11)

test "BinarySearch.rotations",
  expected  = 4,
  actual    = BinarySearch.rotations([5, 6, 7, 8, 9, 1, 2, 3, 4])

test "BinarySearch.rotations",
  expected  = 1,
  actual    = BinarySearch.rotations([2, 3, 4, 5, 6, 1])

test "BinarySearch.rotations",
  expected  = 6,
  actual    = BinarySearch.rotations([9, 1, 2, 3, 4, 5, 6])

test "BinarySearch.rotations, with no rotations",
  expected  = 0,
  actual    = BinarySearch.rotations([1, 2, 3, 4, 5, 6, 7, 8, 9])
