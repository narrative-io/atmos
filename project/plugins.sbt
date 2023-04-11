resolvers ++= Seq(
  "Narrative Releases plugins" at "s3://s3.amazonaws.com/narrative-artifact-releases"
)

addSbtPlugin("io.narrative" % "common-build" % "4.0.0")
