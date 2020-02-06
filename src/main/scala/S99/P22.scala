package S99

object P22 {
  def range(from: Int, to: Int): List[Int] = {
    if(from <= to) from :: range(from + 1, to) else Nil
  }
}
