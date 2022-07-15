package LearnMethod

object CallByNameOrValue {

  var a = 10

  def main(args: Array[String]): Unit = {
    call_by_value(argument_fun(1, 1))
    //call_by_name(argument_fun(1,1))
  }

  def argument_fun(m: Int, n: Int): Int = {
    a -= (m + n)
    a
  }

  def call_by_value(fun: Int): Unit = {
    for (i <- 1 to 3) {
      println("第" + i + "次调用")
      println(fun)
    }
  }

  //注意，这里没有声明参数列表的类型，这是和高阶函数语法的区别
  def call_by_name(fun: => Int): Unit = {
    for (i <- 1 to 3) {
      println("第" + i + "次调用")
      println(fun)
    }
  }
}
