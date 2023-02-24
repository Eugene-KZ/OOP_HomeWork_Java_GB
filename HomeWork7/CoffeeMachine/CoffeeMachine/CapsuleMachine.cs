using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CoffeeMachine
{
    internal class CapsuleMachine:CoffeeMachine
    {
        private double coefficentTaste = 0.7;
        private double coefficentCookingSpeed = 0.5;
        public override Coffee MakeCoffee(Coffee coffee)
        {
            coffee.taste = coffee.taste * coefficentTaste;
            coffee.cookingSpeed = coffee.cookingSpeed * coefficentCookingSpeed;


            return coffee;
            
        }
    }
}
