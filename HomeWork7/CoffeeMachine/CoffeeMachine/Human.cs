using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CoffeeMachine
{
    internal class Human
    {
        public void CookCoffee(CoffeeMachine coffeeMachine)
        {
            Console.WriteLine("1) Американо");
            Console.WriteLine("2) Латте");
            Console.WriteLine("3) Капучино");
            Console.WriteLine("Выберите тип кофе: ");
            int type = Convert.ToInt32(Console.ReadLine());
            Coffee result;
            switch (type)
            {
                case 1:
                    result = coffeeMachine.MakeCoffee(new Americano());
                    Console.WriteLine(result.ToString());

                    break;
                case 2:
                    result = coffeeMachine.MakeCoffee(new Latte());
                    Console.WriteLine(result.ToString());
                    break;
                case 3:
                    result = coffeeMachine.MakeCoffee(new Cappuccino());
                    Console.WriteLine(result.ToString());
                    break;
                default: Console.WriteLine("Неверная команда!!");
                    break;

            }



        
        }
    }
}
