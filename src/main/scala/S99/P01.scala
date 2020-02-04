package S99

object P01 {
  def last[A](list: List[A]): A = list match {
    case v :: Nil => v
    case _ :: l   => last(l)
    case _        => throw new NoSuchElementException
  }
}
