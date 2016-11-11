
Common.serviceSettings("backend")

// Add here the specific settings for this module
routesGenerator := InjectedRoutesGenerator

libraryDependencies ++= Common.commonDependencies ++: Seq(
  // Add here the specific dependencies for this module:
)
libraryDependencies += filters
libraryDependencies += ws
libraryDependencies += cache

