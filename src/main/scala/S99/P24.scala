package S99

import S99._

object P24 {
  def lotto(num: Int, max: Int): List[Int] = {
    P23.randomSelect(num, P22.range(1, max))
  }
}
