package S99

object P05 {
  def reverse[A](list: List[A]): List[A] = list match {
    case Nil      => Nil
    case v :: l   => reverse(l) ::: List(v)
  }
}
