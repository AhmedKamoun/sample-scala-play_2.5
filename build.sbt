Common.appSettings

lazy val constants = (project in file("modules/constants")).enablePlugins(PlayScala)

lazy val dom = (project in file("modules/dom")).enablePlugins(PlayScala).dependsOn(constants)

lazy val dal = (project in file("modules/dal")).enablePlugins(PlayScala).dependsOn(dom)

lazy val bl = (project in file("modules/bl")).enablePlugins(PlayScala).dependsOn(dom, constants, dal)

lazy val backend = (project in file("modules/backend")).enablePlugins(PlayScala).dependsOn(constants, dom, dal, bl)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
  .aggregate(constants, dom, dal, bl, backend)
  .dependsOn(constants, dom, dal, bl, backend)

libraryDependencies ++= Common.commonDependencies
