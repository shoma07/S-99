package S99

object P14 {
  def duplicate[A](list: List[A]): List[A] = list match {
    case x :: l => x :: x :: duplicate(l)
    case _      => Nil
  }
}
