package Nasekiinfo
open class NasekiInfo(
    var count:Int, var PriceForJourney: Int, var NasekoClass:String)
{
    open fun GetInfo()
    {
        println("Выберите насекомое : 1 - Муравьи 2 - Жук носорог 3 - Гусеница")
        var y= readLine()!!.toInt()
        when(y)
        {

            1-> NasekoClass= "Муравьи";
            2-> NasekoClass= "Жук носорог";
            3-> NasekoClass= "Гусеница";
        }
        PriceForJourney=500
        when(NasekoClass)
        {
                "Муравьи" -> println("Стоимость: " + { PriceForJourney -= 400 })
                "Жук носорог" ->println ("Стоимость: " + {PriceForJourney});
                "Гусеница" -> println ("Стоимость: " + { PriceForJourney += 200 })
        }
        if(count<0)
        {
            println("В наличии ${count} насекомых")
        }
        else
        {
            println("Кол-во насекомых не может принимать отрицательные значения")
        }
        println("Информация о насекомых : \n Количество насекомых- $count; \n Название насекомого - $NasekoClass; \n Стоимость $PriceForJourney ")
    }
}