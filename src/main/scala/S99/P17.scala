package S99

object P17 {
  def split[A](index: Int, list: List[A]): (List[A], List[A]) = {
    (index, list) match {
      case (i, x :: l) if i > 0 => split(i - 1, l) match {
        case (y, m) => (x :: y, m)
      }
      case (_, l)               => (Nil, l)
    }
  }
}
