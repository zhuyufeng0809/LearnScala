package LearnEnumeration

object WeekDay extends Enumeration {
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value

  def main(args: Array[String]): Unit = {
    println(WeekDay.Mon == WeekDay.Tue)
  }
}

object DayOfWeek extends Enumeration {
  type DayOfWeek = Value

  val SUNDAY: DayOfWeek = Value("Sunday")
  val MONDAY: DayOfWeek = Value("Monday")
  val TUESDAY: DayOfWeek = Value("Tuesday")
  val WEDNESDAY: DayOfWeek = Value("Wednesday")
  val THURSDAY: DayOfWeek = Value("Thursday")
  val FRIDAY: DayOfWeek = Value("Friday")
  val SATURDAY: DayOfWeek = Value("Saturday")
}

object MysqlInstance extends Enumeration {
  type MysqlInstance = Instance

  protected case class Instance(url: String, username: String, password: String)
      extends super.Val {
    println(url)
    println(username)
    println(password)
  }

  val POLAR: MysqlInstance = Instance(
    "bi-test-polardb.rwlb.rds.aliyuncs.com",
    "calebtest",
    "8GcfaZCxNULVRoUs"
  )

  val ADB: MysqlInstance = Instance(
    "am-bp1px7ie0441h353m167320o.ads.aliyuncs.com",
    "calebtest",
    "EdotfQ%UjEX@"
  )
}
