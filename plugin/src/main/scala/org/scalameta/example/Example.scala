package org.scalameta.example

import scala.meta.internal.ast._
import scala.meta.semantic._
import scala.meta.internal.hosts.scalac._

trait Example {
  val global: scala.tools.nsc.Global
  implicit val c = Scalahost.mkSemanticContext(global)

  def example(sources: List[Source]): Unit = {
    // ...
  }
}
