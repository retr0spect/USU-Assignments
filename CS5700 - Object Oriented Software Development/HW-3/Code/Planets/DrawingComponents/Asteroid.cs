﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Planets.DrawingComponents;

namespace Planets.DrawingComponents
{
    [Serializable]
    public class Asteroid : Planet
    {
        public Asteroid() : base("a1") { }
    }
}
