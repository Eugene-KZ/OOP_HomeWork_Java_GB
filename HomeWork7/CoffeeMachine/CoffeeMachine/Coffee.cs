using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CoffeeMachine
{
    abstract class Coffee
    {
        public double taste;
        public double cookingSpeed;

        public Coffee(int taste, int cookingSpeed)
        {
            this.taste = taste;
            this.cookingSpeed = cookingSpeed;
        }

        public override string ToString()
        {
            return $"Вкус: {this.taste} \nСкорость: {this.cookingSpeed} ";
        }
    }
}
