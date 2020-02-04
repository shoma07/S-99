package S99

object P07 {
  def flatten(list: List[Any]): List[Any] = {
    list match {
      case x :: l => x match {
        case y: List[Any] => flatten(y) ::: flatten(l)
        case y: Any       => y :: flatten(l)
      }
      case _ => Nil
    }
  }
}
