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
  expected = 1,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 2)

test "BinarySearch.search, with element present",
  expected = 2,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 3)

test "BinarySearch.search, with element present",
  expected = 3,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 4)

test "BinarySearch.search, with element present",
  expected = 4,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 5)

test "BinarySearch.search, with element present",
  expected = 5,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 6)

test "BinarySearch.search, with element present",
  expected = 6,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 7)

test "BinarySearch.search, with element present",
  expected = 7,
  actual   = BinarySearch.search([1, 2, 3, 4, 5, 6, 7, 8, 9], 8)

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

test "BinarySearch.search_for, with element present",
  expected = 4,
  actual   = BinarySearch.search_for([2, 4, 10, 10, 10, 18], 10, :last)

test "BinarySearch.search_for, with element not present",
  expected = nil,
  actual   = BinarySearch.search_for([2, 4, 10, 10, 10, 18], 21, :last)
