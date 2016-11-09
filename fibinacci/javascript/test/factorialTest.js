Factorial = require('../factorial')

test = function(testName, expected, actual) {
  let ANSI_RED = "\u001B[31m";
  let ANSI_RESET = "\u001B[0m";
  let result = expected == actual;

  if(result) {
    console.log(testName + ": ");
    console.log('PASS');
  } else {
    console.log(ANSI_RED + testName + ": ");
    console.log('Expected: ' + expected);
    console.log('Actual:' + actual);
    console.log('FAIL' + ANSI_RESET);
  }
  console.log('----------------------------------');
}

test("Factorial.compute, with no options",
  expected = 1,
  actual   = Factorial.compute(1)
);

test("Factorial.compute, recursive",
  expected = 1,
  actual   = Factorial.compute(1, "recursive")
);

test("Factorial.compute, recursive",
  expected = 2,
  actual   = Factorial.compute(2, "recursive")
);

test("Factorial.compute, recursive",
  expected = 6,
  actual   = Factorial.compute(3, "recursive")
);

test("Factorial.compute, recursive",
  expected = 24,
  actual   = Factorial.compute(4, "recursive")
);

test("Factorial.compute, recursive",
  expected = 120,
  actual   = Factorial.compute(5, "recursive")
);

test("Factorial.compute, recursive",
  expected = 720,
  actual   = Factorial.compute(6, "recursive")
);

test("Factorial.compute, iterative",
  expected = 1,
  actual   = Factorial.compute(1, "iterative")
);

test("Factorial.compute, iterative",
  expected = 2,
  actual   = Factorial.compute(2, "iterative")
);

test("Factorial.compute, iterative",
  expected = 6,
  actual   = Factorial.compute(3, "iterative")
);

test("Factorial.compute, iterative",
  expected = 24,
  actual   = Factorial.compute(4, "iterative")
);

test("Factorial.compute, iterative",
  expected = 120,
  actual   = Factorial.compute(5, "iterative")
);

test("Factorial.compute, iterative",
  expected = 720,
  actual   = Factorial.compute(6, "iterative")
);
