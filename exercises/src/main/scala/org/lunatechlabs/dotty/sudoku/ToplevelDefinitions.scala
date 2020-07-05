package org.lunatechlabs.dotty.sudoku

final case class SudokuField(sudoku: Int)

implicit class SudokuFieldOps(val sudokuField: SudokuField) extends AnyVal {}