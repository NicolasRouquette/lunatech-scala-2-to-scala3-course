package org.lunatechlabs.dotty

package object sudoku:

  implicit class RowUpdatesToSudokuField(val update: Vector[Int])
      extends AnyVal:
    def toSudokuField: SudokuField = ???
