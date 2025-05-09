name := "$name$"

version := "0.1.0"

scalaVersion := "2.13.14"

libraryDependencies ++= Seq(
  "org.apache.kafka" %% "kafka" % "3.6.1",
  "org.scalatest" %% "scalatest" % "3.2.18" % Test
)

enablePlugins(GitVersioning)

enablePlugins(SonarQubePlugin)

sonarqube {
  properties(
    "sonar.projectKey" -> "miqueas-gg_scala-kafka",
    "sonar.projectName" -> "scala-kafka",          // Nombre de tu proyecto
    "sonar.projectVersion" -> "0.0.1",              // Versión de tu proyecto
    "sonar.sources" -> "src/main/scala",          // Directorio donde se encuentran los fuentes de código
    "sonar.host.url" -> "https://sonarcloud.io",  // URL de SonarCloud
    "sonar.language" -> "scala",                  // Lenguaje del proyecto (puede ser scala o java)
    "sonar.exclusions" -> "**/test/**"            // Si quieres excluir tests u otros archivos, agrégalo aquí
  )
}

