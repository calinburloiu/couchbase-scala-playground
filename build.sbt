name := "couchbase-scala-playground"

scalaVersion := "2.10.4"

resolvers ++= Seq(
  "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "ReactiveCouchbase Releases" at "https://raw.github.com/ReactiveCouchbase/repository/master/releases/"
)

//resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.couchbase.client" % "couchbase-client" % "1.3.2",
//  "org.reactivecouchbase" %% "reactivecouchbase-core" % "0.1",
  "com.typesafe.play" %% "play-json" % "2.2.1"
)

initialCommands in console := """
import play.api.libs.json._
import playground._
//val defaultCli = CouchbaseClientFactory("localhost", "default", "")
"""
