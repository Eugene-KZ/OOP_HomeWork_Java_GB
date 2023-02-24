using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CoffeeMachine
{
    internal class Cappuccino: Coffee
    {
        Cappuccino():base(taste: 6, cookingSpeed: 15) { }
    }
}
