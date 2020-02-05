package S99

object P13 {
  def encodeDirect[A](list: List[A]): List[(Int, A)] = list match {
    case x :: l => encodeDirectR((1, x), l)
    case _      => Nil
  }
  private def encodeDirectR[A](tupl: (Int, A), list: List[A]): List[(Int, A)] = {
    list match {
      case x :: l if tupl._2 == x => encodeDirectR((tupl._1 + 1, x), l)
      case l                      => tupl :: encodeDirect(l)
    }
  }
}
