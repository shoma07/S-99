package S99

object P15 {
  def duplicateN[A](i: Int, list: List[A]): List[A] = {
    list match {
      case x :: l if i > 0 => x :: duplicateN(i - 1, List(x)) ::: duplicateN(i, l)
      case _      => Nil
    }
  }
}
