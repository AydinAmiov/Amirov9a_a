import Nasekiinfo.*
class Nasekomiy(var num: Int, var StartPoint: String, count: Int, PriceForJourney: Int, NasekoClass: String)
    :NasekiInfo(count, PriceForJourney, NasekoClass)
{
    override fun GetInfo()
    {
        println("Введите количество лап")
        num= readLine()!!.toInt()
        println("Введите его полное название")
        StartPoint= readLine()!!.toString()

        println("Информация о насекомом: \n Количество насекомых - $num; \n Полное название - $StartPoint;")
        super.GetInfo()
    }
}