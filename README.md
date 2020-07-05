# Reproducing a weird dotty compiler error message:

There are 2 files:
- package.scala

  The contents can be commented or not.
  
- ToplevelDefinitions.scala

  There are two variants for an implicit/extension.
  
  
There are 4 cases:

| package.scala | ToplevelDefinitions.scala |
|---------------|---------------------------|
| Commented     | Either variant OK         |
| Uncommented   | extension compiles OK     |
| Uncommented   | implicit compiles w/ error|


```
[error] -- [E083] Type Error: /opt/local/github.dotty/scala2-to-scala3-course.bug/exercises/src/main/scala/org/lunatechlabs/dotty/sudoku/ToplevelDefinitions.scala:5:0 
[error] 5 |implicit class SudokuFieldOps(val sudokuField: SudokuField) extends AnyVal {
[error]   |^
[error]   |org.lunatechlabs.dotty.sudoku.SudokuFieldOps.type is not a valid singleton type, since it is not an immutable path
```