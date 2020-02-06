package S99

object P20 {
  def removeAt[A](index: Int, list: List[A]): (List[A], A) = {
    (index, list) match {
      case (0, x :: l)          => (l, x)
      case (i, x :: l) if i > 0 => removeAt(i - 1, l) match {
        case (m, y) => (x :: m, y)
      }
      case (_, _)               => throw new NoSuchElementException
    }
  }
}
