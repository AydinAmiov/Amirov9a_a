fun main()
{
 try {
     val avto1:Avto=Avto("Audi rs7", 355, 3500000)
     avto1.GetAvto()
     avto1.PrintAvto()

     val avto2:Avto=Avto("BMW M5", 350, 5000000)
     avto2.GetAvto()
     avto2.PrintAvto()

     val avto3:Avto=Avto("Kia Rio", 170, 1000000)
     avto3.GetAvto()
     avto3.PrintAvto()

     val avto4:Avto=Avto("Kia K5", 250, 1500000)
     avto4.GetAvto()
     avto4.PrintAvto()

 }catch (e:Exception){
     println("Некоректный ввод данных")
 }
}