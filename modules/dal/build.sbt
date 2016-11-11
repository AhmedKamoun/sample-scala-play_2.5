Common.serviceSettings("dal")

libraryDependencies ++= Common.commonDependencies ++: Seq(
  // Add here the specific dependencies for this module:
  "com.mysema.querydsl" % "querydsl-jpa" % "3.6.0",
  "com.mysema.querydsl" % "querydsl-apt" % "3.6.0"
)
libraryDependencies += cache