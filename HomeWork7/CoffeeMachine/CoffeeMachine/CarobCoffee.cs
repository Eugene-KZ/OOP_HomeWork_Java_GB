using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace CoffeeMachine
{
    internal class CarobCoffee: CoffeeMachine
    {
        private double coefficentTaste = 1.3;
        private double coefficentCookingSpeed = 1.2;
        public override Coffee MakeCoffee(Coffee coffee)
        {

            coffee.taste = coffee.taste * coefficentTaste;
            coffee.cookingSpeed = coffee.cookingSpeed * coefficentCookingSpeed;

            return coffee;
        }
    }
}
