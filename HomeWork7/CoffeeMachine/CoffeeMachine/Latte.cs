using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CoffeeMachine
{
    internal class Latte: Coffee
    {
        Latte():base(taste: 5, cookingSpeed: 10) {}
    }
}
