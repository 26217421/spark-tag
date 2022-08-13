package com.wbw.spark.streaming.realtime

/**
 * 城市信息表
 *
 * @param cityId    城市ID
 * @param cityName  城市名称
 * @param area      城市所在大区
 */
case class CityInfo(cityId:Long,
                    cityName:String,
                    area:String)
