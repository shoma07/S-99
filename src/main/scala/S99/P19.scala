package S99

import S99._

object P19 {
  def rotate[A](num: Int, list: List[A]): List[A] = (num, list) match {
    case (n, l)      if n < 0 => rotate(P04.length(l) + n, l)
    case (n, x :: l) if n > 0 => rotate(n - 1, l ::: List(x))
    case (_, l)               => l
 }
}
