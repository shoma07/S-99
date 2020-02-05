package S99

import S99._

object P10 {
  def encode[A](list: List[A]): List[(Int, A)] = {
    P09.pack(list).map { l => (P04.length(l), P03.nth(0, l)) }
  }
}
