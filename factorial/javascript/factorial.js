function compute (number, method = 'recursive') {
  if (method === 'iterative') {
    return computeIterative(number)
  } else {
    return computeRecursive(number)
  }
}

function computeRecursive (number) {
  if (number < 2) {
    return 1
  }

  return number * computeRecursive(number - 1)
}

function computeIterative (number) {
  var result = 1
  while (number > 0) {
    result = result * number
    number--
  }

  return result
}

module.exports = {
  compute: compute
}
