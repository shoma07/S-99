package S99

object P02 {
  def penultimate[A](list: List[A]): A = list match {
    case v :: _ :: Nil => v
    case _ :: l        => penultimate(l)
    case _             => throw new NoSuchElementException
  }
}
