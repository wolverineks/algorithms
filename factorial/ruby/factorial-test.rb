require 'simplecov'
SimpleCov.start
SimpleCov.command_name 'Unit Tests'

require "./factorial.rb"
require 'basic_test'
include BasicTest

test "Factorial.compute, with no options",
  expected = 1,
  actual   = Factorial.compute(1)

test "Factorial.compute, recursive",
  expected = 2,
  actual   = Factorial.compute(2, :recursive)

test "Factorial.compute, recursive",
  expected = 6,
  actual   = Factorial.compute(3, :recursive)

test "Factorial.compute, recursive",
  expected = 24,
  actual   = Factorial.compute(4, :recursive)

test "Factorial.compute, recursive",
  expected = 120,
  actual   = Factorial.compute(5, :recursive)

test "Factorial.compute, recursive",
  expected = 720,
  actual   = Factorial.compute(6, :recursive)

test "Factorial.compute, iterative",
  expected = 2,
  actual   = Factorial.compute(2, :iterative)

test "Factorial.compute, iterative",
  expected = 6,
  actual   = Factorial.compute(3, :iterative)

test "Factorial.compute, iterative",
  expected = 24,
  actual   = Factorial.compute(4, :iterative)

test "Factorial.compute, iterative",
  expected = 120,
  actual   = Factorial.compute(5, :iterative)

test "Factorial.compute, iterative",
  expected = 720,
  actual   = Factorial.compute(6, :iterative)
