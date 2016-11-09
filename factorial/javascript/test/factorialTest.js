const { expect } = require('chai')

const Factorial = require('../factorial')

process.stdout.write('\x1Bc')

describe('Factorial', () => {
  it('compute, with no options', () => {
    const expected = 1
    const actual = Factorial.compute(1)

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, recursive', () => {
    const expected = 1
    const actual = Factorial.compute(1, 'recursive')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, recursive', () => {
    const expected = 2
    const actual = Factorial.compute(2, 'recursive')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, recursive', () => {
    const expected = 6
    const actual = Factorial.compute(3, 'recursive')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, recursive', () => {
    const expected = 24
    const actual = Factorial.compute(4, 'recursive')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, recursive', () => {
    const expected = 120
    const actual = Factorial.compute(5, 'recursive')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, recursive', () => {
    const expected = 720
    const actual = Factorial.compute(6, 'recursive')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, iterative', () => {
    const expected = 1
    const actual = Factorial.compute(1, 'iterative')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, iterative', () => {
    const expected = 2
    const actual = Factorial.compute(2, 'iterative')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, iterative', () => {
    const expected = 6
    const actual = Factorial.compute(3, 'iterative')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, iterative', () => {
    const expected = 24
    const actual = Factorial.compute(4, 'iterative')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, iterative', () => {
    const expected = 120
    const actual = Factorial.compute(5, 'iterative')

    expect(actual).to.equal(expected)
  })

  it('Factorial.compute, iterative', () => {
    const expected = 720
    const actual = Factorial.compute(6, 'iterative')

    expect(actual).to.equal(expected)
  })
})
