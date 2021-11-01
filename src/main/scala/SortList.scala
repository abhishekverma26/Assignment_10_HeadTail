class SortList {

  def isort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))
  }

  def insert(element: Int, list: List[Int]): List[Int] = {
    if (list.isEmpty || element <= list.head) element :: list
    else list.head :: insert(element, list.tail)
  }
}

object Main extends App {
  val list = List(26, 10, 19, 96)
  val sort = new SortList()

  println(sort.isort(list))
}