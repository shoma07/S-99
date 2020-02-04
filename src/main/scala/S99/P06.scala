package S99

import S99._

object P06 {
  def isPalindrome[A](list: List[A]): Boolean = {
    // 本当は前半部分と後半部分の検証のみでよい
    list == P05.reverse(list)
  }
}
