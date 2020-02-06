package S99

import scala.util.Random
import S99._

object P23 {
  def randomSelect[A](num: Int, list: List[A]): List[A] = {
    if(num <= 0) Nil
    else {
      val (l, x) = P20.removeAt(Random.nextInt(P04.length(list)), list)
      x :: randomSelect(num - 1, l)
    }
  }
}
