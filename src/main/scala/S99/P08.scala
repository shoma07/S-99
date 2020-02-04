package S99

object P08 {
  def compress[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case x :: y :: l if x == y => compress(x :: l)
    case x :: l => x :: compress(l)
  }
}
