import play.sbt.PlayImport._

Common.serviceSettings("bl")

// Add here the specific settings for this module

libraryDependencies ++= Common.commonDependencies ++: Seq(
  "com.cloudinary" % "cloudinary-http42" % "1.2.1",
  "com.sksamuel.scrimage" %% "scrimage-core" % "2.0.1" //Scala image processing library

)

libraryDependencies += ws
libraryDependencies += cache