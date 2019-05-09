name := "ascii-graphs"

organization := "com.github.mdr"

version := "0.0.6"

scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.11.11", "2.12.8")

scalacOptions ++= Seq("-deprecation")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.7" % "test"

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"

//EclipseKeys.withSource := true
//
//EclipseKeys.eclipseOutput := Some("bin")

import com.typesafe.sbt.SbtScalariform.ScalariformKeys

ScalariformKeys.preferences := baseDirectory { dir =>
  scalariform.formatter.preferences.PreferencesImporterExporter.loadPreferences((dir / "formatterPreferences.properties").getPath)
}.value

//publishMavenStyle := true
//
//publishArtifact in Test := false
//
//publishTo <<= isSnapshot(
//  if (_) Some("snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/")
//  else   Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2/"))
//
//pomExtra := {
//    <inceptionYear>2012</inceptionYear>
//    <url>http://github.com/mdr/ascii-graphs</url>
//    <licenses>
//      <license>
//        <name>MIT License</name>
//        <url>http://www.opensource.org/licenses/mit-license.php</url>
//        <distribution>repo</distribution>
//      </license>
//    </licenses>
//    <scm>
//      <url>git@github.com:mdr/ascii-graphs.git</url>
//      <connection>scm:git:git@github.com:mdr/ascii-graphs</connection>
//    </scm>
//    <developers>
//      <developer>
//        <id>mdr</id>
//        <name>Matt Russell</name>
//        <url>https://github.com/mdr/</url>
//      </developer>
//    </developers>
//  }

