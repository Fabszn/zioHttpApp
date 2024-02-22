import Dependencies.versions.*
import sbt.*

object Dependencies {
  object versions {
    lazy val zioVersion        = "2.0.21"
    lazy val zioConfigVersion  = "4.0.0-RC16"
    lazy val zioPreludeVersion = "1.0.0-RC21"
    lazy val apachePoiVersion  = "5.2.4"

    lazy val logbackVersion    = "1.2.12"
    lazy val logstashVersion   = "7.2"
    lazy val slf4jVersion      = "1.7.36"
    lazy val log4j2Version     = "2.20.0"
    lazy val zioLoggingVersion = "2.1.15"

    lazy val fs2Version               = "3.9.3"
    lazy val ziocatsInteropVersion    = "23.1.0.0"
    lazy val catsVersion              = "2.10.0"
    lazy val catsEffectVersion        = "3.5.2"
    lazy val sttpClientVersion        = "3.9.1"
    lazy val sttpLoggerSlf4jVersion   = "3.5.2"
    lazy val refinedVersion           = "0.11.0"
    lazy val refinedZioConfigVersion  = "4.0.0-RC16"
    lazy val circeVersion             = "0.14.6"
    lazy val circeGenericExtraVersion = "0.14.3"
    lazy val scalaCacheVersion        = "1.0.0-M6"
    lazy val catsLogVersion           = "2.6.0"
    lazy val zioHttpVersion           = "3.0.0-RC4"
    lazy val zioMetricsVersion        = "2.1.0"
    lazy val quillJdbcZioVersion      = "4.8.0"
    lazy val jdbcVersion              = "42.7.1"
    lazy val flywayVersion            = "9.6.0"
    lazy val zioKafkaVersion          = "2.7.1"
    lazy val avro4sVersion            = "5.0.9"
    lazy val zioJsonVersion           = "0.6.2"
  }

  lazy val scalaCache = "com.github.cb372" %% "scalacache-core" % scalaCacheVersion

  lazy val zioConfig            = "dev.zio"             %% "zio-config"             % zioConfigVersion
  lazy val zioConfigMagnolia    = "dev.zio"             %% "zio-config-magnolia"    % zioConfigVersion
  lazy val zioConfigTypeSafe    = "dev.zio"             %% "zio-config-typesafe"    % zioConfigVersion
  lazy val zioConfigRefined     = "dev.zio"             %% "zio-config-refined"     % zioConfigVersion
  lazy val zioKafka             = "dev.zio"             %% "zio-kafka"              % zioKafkaVersion
  lazy val avro4s               = "com.sksamuel.avro4s" %% "avro4s-core"            % avro4sVersion
  lazy val zioJson              = "dev.zio"             %% "zio-json"               % zioJsonVersion
  lazy val zioConfigLibs        = Seq(zioConfig, zioConfigMagnolia, zioConfigTypeSafe, zioConfigRefined)
  lazy val zioKMetricsConnector = "dev.zio"             %% "zio-metrics-connectors" % zioMetricsVersion // core library
  lazy val zioKMetricsPrometeus =
    "dev.zio" %% "zio-metrics-connectors-prometheus" % zioMetricsVersion // Prometheus client
  lazy val zioKHttp     = "dev.zio"       %% "zio-http"       % zioHttpVersion
  lazy val driverJdbc   = "org.postgresql" % "postgresql"     % jdbcVersion
  lazy val quillJdbcZio = "io.getquill"   %% "quill-jdbc-zio" % quillJdbcZioVersion
  lazy val flyway       = "org.flywaydb"   % "flyway-core"    % flywayVersion

  lazy val fs2Core = "co.fs2" %% "fs2-core" % fs2Version

  lazy val fs2Io = "co.fs2" %% "fs2-io" % fs2Version

  lazy val fs2Libs    = Seq(fs2Core, fs2Io)
  lazy val zio        = "dev.zio"       %% "zio"         % zioVersion
  lazy val zioPrelude = "dev.zio"       %% "zio-prelude" % zioPreludeVersion
  lazy val apachePoi  = "org.apache.poi" % "poi"         % apachePoiVersion

  lazy val apachePoiOoxml = "org.apache.poi" % "poi-ooxml" % apachePoiVersion

  lazy val catsLibs = Seq(
    "org.typelevel" %% "cats-core"      % catsVersion,
    "org.typelevel" %% "cats-kernel"    % catsVersion,
    "org.typelevel" %% "cats-free"      % catsVersion,
    "org.typelevel" %% "cats-effect"    % catsEffectVersion,
    "org.typelevel" %% "log4cats-slf4j" % catsLogVersion
  )
  lazy val sttpClient      = "com.softwaremill.sttp.client3" %% "async-http-client-backend-zio" % sttpClientVersion
  lazy val sttpClientCirce = "com.softwaremill.sttp.client3" %% "circe"                         % sttpClientVersion
  lazy val sttpLoggerSlf4j = "com.softwaremill.sttp.client3" %% "slf4j-backend"                 % sttpLoggerSlf4jVersion
  lazy val sttpLibs        = Seq(sttpClient, sttpLoggerSlf4j, sttpClientCirce)

  lazy val zioCatsInterop = "dev.zio" %% "zio-interop-cats" % ziocatsInteropVersion

  lazy val refined           = "eu.timepit" %% "refined"            % refinedVersion
  lazy val refinedPureConfig = "dev.zio"    %% "zio-config-refined" % "4.0.0-RC16" % refinedZioConfigVersion
  lazy val refinedLibs       = Seq(refined)

  lazy val circeLibs = Seq(
    "io.circe" %% "circe-core"    % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,
    "io.circe" %% "circe-parser"  % circeVersion
  )

  lazy val zioLoggingSlf4j = "dev.zio"                 %% "zio-logging-slf4j"        % zioLoggingVersion
  lazy val zioLogging      = "dev.zio"                 %% "zio-logging"              % zioLoggingVersion
  lazy val logback         = "ch.qos.logback"           % "logback-classic"          % logbackVersion
  lazy val log4jBridge     = "org.apache.logging.log4j" % "log4j-to-slf4j"           % log4j2Version
  lazy val logstashEncoder = "net.logstash.logback"     % "logstash-logback-encoder" % logstashVersion
  lazy val zioTest =
    Seq("dev.zio" %% "zio-test" % zioVersion % "test", "dev.zio" %% "zio-test-sbt" % zioVersion % "test")

}
