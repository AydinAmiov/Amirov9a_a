fun main()
{
    println("Нажмите 1 если хотите узнать про насекомых. 2 Чтобы узнать о машинах")
    var y= readLine()!!.toInt()
    when(y)
    {
        1-> try
        {
            var malish1:Nasekomiy=Nasekomiy(4,"Муравей обыкновеный",4,500,"Муравьи")
            malish1.GetInfo()
            var train2:Nasekomiy=Nasekomiy(6,"Гусеница зеленая",1,550,"Гусеницы")
            train2.GetInfo()
        }catch (e:Exception)
        {
            println("Некорректный ввод данных")
        }
        2 -> try
        {

            var Avto1:Avtomobili=Avtomobili(350, "Красный",1,5000000,"AUDI RS7")
            Avto1.GetInfo()


            var Avto2:Avtomobili=Avtomobili(300, "Белый",1,5500000,"MERCEDES E-CLASS")
            Avto2.GetInfo()

        }catch (e:Exception)
        {
            println("Некорректный ввод данных")
        }
    }
}

/*fun Avtomobili(num: Int, StartPoint: String): Avtomobili {

}

fun Nasekomiy(num: Int, StartPoint: String): Nasekomiy {

}*/


