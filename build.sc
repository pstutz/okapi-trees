import mill._
import mill.scalalib._

object trees extends ScalaModule {
  def scalaVersion = "2.11.12"

  override def ivyDeps = Agg(
    ivy"org.scala-lang:scala-reflect:${scalaVersion()}"
  )

  object test extends Tests {
    override def ivyDeps = Agg(
      ivy"org.scalatest::scalatest:3.0.5"
    )

    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }

}
