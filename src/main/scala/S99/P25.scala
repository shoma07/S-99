package S99

import S99._

object P25 {
  def randomPermute[A](list: List[A]): List[A] = {
    P23.randomSelect(P04.length(list), list)
  }
}
