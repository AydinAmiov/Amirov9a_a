import Avtoinfo.*
class Avtomobili(var num: Int, var StartPoint:String, count: Int, PriceForCar: Int, NasekoClass: String, )
    :AvtoInfo(count, PriceForCar, NasekoClass)
{
    override fun GetInfo()
    {
        println("Введите количество лошадиных сил")
        num= readLine()!!.toInt()
        println("Введите цвет машины")
        StartPoint= readLine()!!.toString()

        println("Информация про машину: \n Количество лошадиных сил - $num; \n Цвет машины - $StartPoint;" )
        super.GetInfo()
    }
}