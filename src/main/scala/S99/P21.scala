package S99

object P21 {
  def insertAt[A](elem: A, index: Int, list: List[A]): List[A] = {
    (index, list) match {
      case (0, l)               => elem :: list
      case (i, x :: l) if i > 0 => x :: insertAt(elem, i - 1, l)
      case (_, _)               => throw new NoSuchElementException
    }
  }
}
