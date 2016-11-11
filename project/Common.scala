import sbt.Keys._
import sbt._


object Common {

  def appName = "seed-project"

  // Settings for the app, i.e. the root project
  val appSettings = settings(appName)

  // Add here more common dependencies:
  val commonDependencies = Seq(
    "com.jason-goodwin" %% "authentikat-jwt" % "0.4.1",
    "joda-time" % "joda-time" % "2.9.1",
    // send mail
    "com.typesafe.play" %% "play-mailer" % "5.0.0",
    //
    "com.stripe" % "stripe-java" % "2.7.0",
    "org.apache.poi" % "poi" % "3.8",
    //
    "org.springframework" % "spring-context" % "4.2.8.RELEASE",
    "org.springframework.data" % "spring-data-jpa" % "1.10.4.RELEASE",
    "org.springframework.data" % "spring-data-mongodb" % "1.9.4.RELEASE",
    //
    "mysql" % "mysql-connector-java" % "5.1.39",
    "cglib" % "cglib" % "3.2.3",
    "com.mchange" % "c3p0" % "0.9.5.2"
  )


  // Settings for every service, i.e. for backend module
  def serviceSettings(module: String) = moduleSettings(module) ++: Seq()

  // Settings for every module, i.e. for every module
  def moduleSettings(module: String) = settings(module) ++: Seq(
    javaOptions in Test += s"-Dconfig.resource=application.conf"
  )

  // Common settings for every project
  def settings(theName: String) = Seq(
    name := theName,
    organization := "loyalcraft.org",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.8",
    doc in Compile <<= target.map(_ / "none"),
    scalacOptions in ThisBuild ++= Seq(
      "-target:jvm-1.8",
      "-encoding", "UTF-8",
      "-deprecation", // warning and location for usages of deprecated APIs
      "-feature", // warning and location for usages of features that should be imported explicitly
      "-unchecked", // additional warnings where generated code depends on assumptions
      "-language:reflectiveCalls",
      "-Xlint", // recommended additional warnings
      "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver
      "-Ywarn-value-discard", // Warn when non-Unit expression results are unused
      "-Ywarn-inaccessible",
      "-Ywarn-dead-code"
    )
  )
}
