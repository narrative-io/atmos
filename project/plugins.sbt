resolvers ++= Seq(
  Resolver.url("sbts3 ivy resolver", url("https://dl.bintray.com/emersonloureiro/sbt-plugins")      )(Resolver.ivyStylePatterns)
)

addSbtCoursier
// addSbtPlugin("io.narrative" % "common-build" % "2.0.9")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
