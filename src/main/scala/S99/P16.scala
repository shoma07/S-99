package S99

object P16 {
  def drop[A](index: Int, list: List[A]): List[A] = {
    (index, list) match {
      case (1, x :: l)           => l
      case (i, x :: l) if i > 1  => x :: drop(i - 1, l)
      case (_, l)                => l
    }
  }
}
