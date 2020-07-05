val rewriteToNewSyntax =
  Seq(
    "-new-syntax",
    "-rewrite"
  )

scalacOptions ++= rewriteToNewSyntax
  