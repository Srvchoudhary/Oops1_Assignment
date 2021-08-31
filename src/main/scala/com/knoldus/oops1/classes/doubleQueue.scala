package com.knoldus.oops1.classes

import com.knoldus.oops1.Trait.Queue

class doubleQueue extends Queue{
  override def enqueue(key: Int): Unit ={
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1
      queue = queue ::: List(key*2) //add element to end/rear position of the queue
      return
    }
    queue = queue ::: List(key*2) //add element to end/rear position of the queue
    this.rear = queue.length - 1
  }
}
