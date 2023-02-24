using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CoffeeMachine
{
    abstract class CoffeeMachine
    {
        public abstract Coffee MakeCoffee(Coffee coffee);
    }
}
