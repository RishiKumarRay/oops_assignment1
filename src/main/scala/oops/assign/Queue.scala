package oops.assign

import scala.collection.mutable.ListBuffer
//define a trait queue
trait Queue {

  def enqueue(item: Int)

  def dequeue(queue: ListBuffer[Int]): Int = {

    val removedElement = queue(0)
    queue.remove(0)
    removedElement
  }

}

//Here we are squaring the element
class SquareQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(item: Int): Unit = {

    queue += (item * item)
  }

}

//Here the element is being doubled
class DoubleQueue(queue: ListBuffer[Int]) extends Queue {

  override def enqueue(item: Int): Unit = {

    queue += (item * 2)
  }
}
