# Reproducing a weird dotty compiler error message:

/opt/local/github.dotty/scala2-to-scala3-course.bug/exercises/src/main/scala/org/lunatechlabs/dotty/sudoku/SodokuFieldOps.scala:3
org.lunatechlabs.dotty.sudoku.SudokuFieldOps.type is not a valid singleton type, since it is not an immutable path
implicit class SudokuFieldOps(val sudokuField: SudokuField) extends AnyVal {}
