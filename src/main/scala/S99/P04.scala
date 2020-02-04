package S99

object P04 {
  def length[A](list: List[A]): Int = list match {
    case Nil    => 0
    case _ :: l => 1 + length(l)
  }
}
