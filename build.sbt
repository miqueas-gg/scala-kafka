name := "$name$"

version := "0.1.0"

scalaVersion := "2.13.14"

libraryDependencies ++= Seq(
  "org.apache.kafka" %% "kafka" % "3.6.1",
  "org.scalatest" %% "scalatest" % "3.2.18" % Test
)

enablePlugins(GitVersioning)
