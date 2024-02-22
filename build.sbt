import Dependencies.*
import com.github.sbt.git.SbtGit

lazy val root = (project in file("."))
  .enablePlugins(JavaAppPackaging, DockerPlugin, BuildInfoPlugin, GitPlugin)
  .settings(
    name          := "ZioHttpApp",
    buildInfoKeys := Seq(name, version, SbtGit.GitKeys.gitHeadCommit),
    buildInfoOptions ++= Seq(
      BuildInfoOption.BuildTime
    ),
    scalaVersion := "3.3.0",
    name         := "ZioHttpApp",
    version      := "0.0.1-SNAPSHOT",
    libraryDependencies ++= Seq(
      zio,
      zioPrelude,
      apachePoi,
      apachePoiOoxml,
      logstashEncoder,
      logback,
      log4jBridge,
      zioLogging,
      zioLoggingSlf4j,
      zioCatsInterop,
      scalaCache,
      zioKMetricsConnector,
      zioKMetricsPrometeus,
      zioKHttp,
      quillJdbcZio,
      driverJdbc,
      flyway,
      zioKafka,
      avro4s,
      zioJson
    ) ++
      zioTest ++
      fs2Libs ++
      zioConfigLibs ++
      catsLibs ++
      refinedLibs ++
      circeLibs ++
      sttpLibs,
    scalacOptions ++= Seq(
      "-deprecation"
      // ,"-explain"
    )
  )

Global / onChangedBuildSource := ReloadOnSourceChanges

Global / wartremoverErrors ++= Seq(
  Wart.ArrayEquals,
  Wart.AsInstanceOf,
  Wart.EitherProjectionPartial,
  Wart.Enumeration,
  Wart.FinalCaseClass,
  Wart.IsInstanceOf,
  Wart.LeakingSealed,
  Wart.Null,
  Wart.OptionPartial,
  Wart.Overloading,
  Wart.Return,
  Wart.ToString,
  Wart.TryPartial,
  Wart.Var,
  Wart.NonUnitStatements
)
