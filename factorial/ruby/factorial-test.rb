require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./factorial.rb"
require 'basic_test'
include BasicTest

test "Factorial.compute, with no options",
  expected = 1,
  actual   = Factorial.compute(1)

test "Factorial.compute",
  expected = 2,
  actual   = Factorial.compute(2)

test "Factorial.compute",
  expected = 6,
  actual   = Factorial.compute(3)

test "Factorial.compute",
  expected = 24,
  actual   = Factorial.compute(4)

test "Factorial.compute",
  expected = 120,
  actual   = Factorial.compute(5)

test "Factorial.compute",
  expected = 720,
  actual   = Factorial.compute(6)
