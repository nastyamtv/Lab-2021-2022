using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Laba2_WF
{
    class Rectangle3D
    {
        public static Random rnd = new Random(DateTime.Now.Millisecond);

        public int X { get; set; }
        public int Y { get; set; }
        public int W { get; set; }
        public int H { get; set; }
        public int L { get; set; }
        public Color Color { get; set; }
        public void ChangeColor()
        {
            Color = Color.FromArgb(rnd.Next(256), rnd.Next(256), rnd.Next(256));
        }
        public void ChangeLength(int _L)
        {
            L = _L;
        }
    }
}
