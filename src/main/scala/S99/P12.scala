package S99

import S99._

object P12 {
  def decode[A](list: List[(Int, A)]): List[A] = {
    list match {
      case (i, v) :: l => make(i, v) ::: decode(l)
      case _      => Nil
    }
  }

  def make[A](i: Int, v: A): List[A] = {
    if(i > 0) v :: make(i - 1, v) else Nil
  }
}
