package com.wbw.spark.streaming.realtime

import scala.collection.mutable.ListBuffer
import scala.util.Random

case class RanOpt[T](value: T, weight:Int)

object RandomOptions {
  def apply[T](opts: RanOpt[T]*):RandomOptions[T] = {
    val randomOptions = new RandomOptions[T]()
    for (opt <- opts) {
      randomOptions.totalWeight += opt.weight
      for (_ <- 1 to opt.weight) {
        randomOptions.optsBuffer += opt.value
      }
    }
    randomOptions
  }
}

class RandomOptions[T] () {
  var totalWeight = 0
  var optsBuffer = new ListBuffer[T]
  def getRandomOpt:T = {
    val randomNum = new Random().nextInt(totalWeight)
    optsBuffer(randomNum)
  }
}
