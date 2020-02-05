package S99

import S99._

object P09 {
  def pack[A](list: List[A]): List[List[A]] = {
    list match {
      case x :: l => packR(List(x), l)
      case _      => Nil
    }
  }
  private def packR[A](packed: List[A], list: List[A]): List[List[A]] = {
    (P03.nth(0, packed), list) match {
      case (x, y :: l) if x == y => packR(packed ::: List(y), l)
      case (_, l)                => packed :: pack(l)
    }
  }
}
