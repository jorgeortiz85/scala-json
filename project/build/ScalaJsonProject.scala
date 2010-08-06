import sbt._
import com.twitter.sbt._


class ScalaJsonProject(info: ProjectInfo) extends DefaultProject(info) {
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.5"
}
