Common.serviceSettings("dom")

libraryDependencies ++= Common.commonDependencies ++: Seq(
  // Add here the specific dependencies for this module:
  "org.hibernate" % "hibernate-entitymanager" % "4.3.11.Final",
  "org.hibernate" % "hibernate-core" % "4.3.11.Final",
  "org.hibernate" % "hibernate-ehcache" % "4.3.11.Final",
  "org.hibernate" % "hibernate-validator" % "4.3.2.Final",
  "org.hibernate.javax.persistence" % "hibernate-jpa-2.1-api" % "1.0.0.Final",
  "org.jadira.usertype" % "usertype.jodatime" % "2.0.1",
  "org.springframework.data" % "spring-data-commons" % "1.12.4.RELEASE"
)