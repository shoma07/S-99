package S99

import S99._

object P11 {
  def encodeModified[A](list: List[A]): List[Any] = {
    P10.encode(list).map { t => if(t._1 == 1) t._2 else t }
  }
}
