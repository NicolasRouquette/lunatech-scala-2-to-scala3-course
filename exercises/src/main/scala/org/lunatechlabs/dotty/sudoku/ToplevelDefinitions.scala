package org.lunatechlabs.dotty.sudoku

final case class SudokuField(sudoku: Int)

// This form compiles only when package.scala is commented.
// This form compiles with error when package.scala is uncommented.
implicit class SudokuFieldOps(val sudokuField: SudokuField) extends AnyVal {
  def foo: Int = ???
}

// This form compiles OK regardless of whether package.scala is commented or not.
//extension on (sudokuField: SudokuField) {
//  def foo: Int = ???
//}