package oops.assign

import java.util.Scanner
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks.{break, breakable}

object MainObject {
  def main(args: Array[String]): Unit = {


    val queue = new ListBuffer[Int]
    breakable {
      while (true) {
        println("Press 1 to Double the element")
        println("Press 2 for squaring the element")
        println("Press 3 to delete an element")
        println("Press 4 to Display the elements")
        println("Press 5 to exit")
        val sc = new Scanner(System.in)
        val choice = sc.nextInt()
        choice match {
          case 1 =>
            println("\nInsert a number to be pushed")
            val item = sc.nextInt()
            val queueObj = new DoubleQueue(queue)
            queueObj.enqueue(item)

          case 2 =>
            println("\nInsert a number to be pushed")
            val item = sc.nextInt()
            val queueObj = new SquareQueue(queue)
            queueObj.enqueue(item)
          case 3 =>

            if (queue.size == 0) println("\nThis is Empty")
            else {
              val obj = new DoubleQueue(queue)
              val poppedElement = obj.dequeue(queue)
              println("Deleted Element is : " + poppedElement)
            }
          case 4 => 1
            if (queue.size == 0) println("\nThis is Empty")
            else {
              println("\n The Output is ")
              for (loopVariable <- queue)
                print(loopVariable + " ")
              println()

            }
          case 5 =>
            println("Exiting")
            break
          case _ =>
            println("Wrong Choice. Enter again")
        }
      }
    }
  }
}

