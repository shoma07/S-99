package S99

object P03 {
  def nth[A](index: Int, list: List[A]): A = list match {
    case v :: _ if index == 0 => v
    case _ :: l               => nth(index - 1, l)
    case _                    => throw new NoSuchElementException
  }
}
