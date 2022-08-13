package com.wbw.spark.utils

import java.io.InputStreamReader
import java.util.Properties

object PropertiesUtil {
  def load(propertiesName:String): Properties = {
    val prop = new Properties();
    prop.load(new InputStreamReader(Thread.currentThread().getContextClassLoader
      .getResourceAsStream(propertiesName), "utf-8"))
    prop
  }

}
