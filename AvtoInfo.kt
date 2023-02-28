package Avtoinfo
open class AvtoInfo(var count:Int, var PriceForCar: Int, var CarClass:String)
{
    open fun GetInfo()
    {
        println("Выберите машину : 1 - BMW M5 2 - AUDI RS7 3 - MERCEDES E-CLASS")
        var y= readLine()!!.toInt()
        when(y)
        {
            1-> CarClass= "BMW M5";
            2-> CarClass= "AUDI RS7";
            3-> CarClass= "MERCEDES E-CLASS";
        }
        PriceForCar=5000000
        when(CarClass)
        {
            "BMW M5" -> println("Стоимость: " + {PriceForCar=PriceForCar+1000000})
            "AUDI RS7" ->println ("Стоимость: " + {PriceForCar});
            "MERCEDES E-CLASS" -> println ("Стоимость: " + {PriceForCar=PriceForCar+500000})
        }
        if(count<0)
        {
            println("В наличии ${count} автомобилей")
        }
        else
        {
            println("Кол-во машин не может принимать отрицательные значения")
        }
        println("Информация о машинах : \n Количество машин- $count; \n Название машины - $CarClass; \n Стоимость $PriceForCar ")
    }
}