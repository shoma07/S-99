package S99

import S99._

object P18 {
  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
    (start, end, list) match {
      case (s, e, _ :: l) if s > 0 => slice(s - 1, e - 1, l)
      case (s, e, v :: l) if e > 0 => v :: slice(0, e - 1, l)
      case (_, _, _)               => Nil
    }
  }
}
