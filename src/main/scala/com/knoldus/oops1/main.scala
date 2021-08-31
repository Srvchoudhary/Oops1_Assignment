package com.knoldus.oops1

import com.knoldus.oops1.classes.{doubleQueue, squareQueue}

object main {
  def main(args: Array[String]): Unit = {
    //Initialization the DoubleQueue class's methods
    val DoubleQueue = new doubleQueue
    println("The double queue is:-")
    DoubleQueue.enqueue(25)
    DoubleQueue.enqueue(95)
    DoubleQueue.enqueue(89)
    DoubleQueue.enqueue(78)
    DoubleQueue.enqueue(45)
    DoubleQueue.enqueue(69)

    for (value <- DoubleQueue.queue) print(value + "=>")
    println()

    DoubleQueue.dequeue()
    for (value <- DoubleQueue.queue) print(value + "=>")
    println()



    //Initializing the SquareQueue class's methods
    val SquareQueue = new squareQueue
    println("The squared queue is:-")
    SquareQueue.enqueue(1)
    SquareQueue.enqueue(2)
    SquareQueue.enqueue(3)
    SquareQueue.enqueue(4)
    SquareQueue.enqueue(5)
    SquareQueue.enqueue(6)
    SquareQueue.enqueue(7)
    SquareQueue.enqueue(8)
    SquareQueue.enqueue(9)

    for (value <- SquareQueue.queue) print(value + "=>")
    println()

    SquareQueue.dequeue()



    for (value <- SquareQueue.queue) print(value + "=>")
    println()
    println(SquareQueue.front)
    println(SquareQueue.rear)
  }
}
