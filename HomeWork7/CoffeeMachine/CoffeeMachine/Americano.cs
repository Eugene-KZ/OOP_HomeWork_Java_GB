﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CoffeeMachine
{
    internal class Americano: Coffee
    {
        public Americano():base(taste: 7, cookingSpeed: 8) { }
    }
}
