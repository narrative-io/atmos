import _root_.io.narrative.build._

name := "atmos"

version := "2.3"

description := "minimalist retry-on-failure behavior for scala"

homepage := Some(url("http://github.com/paradoxical-io/"))

startYear := Some(2013)

organization := "io.paradoxical"

organizationName := "paradoxical.io"

scalacOptions ++= Seq (
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:experimental.macros",
  "-unchecked",
  "-Xlint"
)

scalacOptions --= Seq(
  "-Xfatal-warnings"
)

organizationHomepage := Some(url("http://github.com/paradoxical-io/"))

scalaVersion := "2.13.10"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.5" % "provided"
)

enablePlugins(LibraryProjectPlugin)

