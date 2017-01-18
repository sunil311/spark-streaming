name := "Spark-Streaming"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "commons-logging" % "commons-logging" % "1.2"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.11" % "1.6.3"
libraryDependencies += "org.apache.spark" % "spark-streaming-flume_2.11" % "2.1.0"
libraryDependencies += "com.typesafe" % "config" % "1.3.1"

