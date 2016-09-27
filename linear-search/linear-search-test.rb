require "./linear-search.rb"
require "../test/test.rb"
include Test

test "LinearSearch.search, with element present",
  expected = 6,
  actual   = LinearSearch.search([3, 2, 6, 8, 4, 7, 5, 9, 1], 5)

test "LinearSearch.search, with element not present",
  expected = nil,
  actual   = LinearSearch.search([3, 2, 6, 8, 4, 7, 5, 9, 1], 21)
