using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
namespace Laba2_WF
{
    public partial class Form1 : Form
    {
        Rectangle3D rect;
        public Form1()
        {
            InitializeComponent();
            pictureBox1.Image = new Bitmap(pictureBox1.Width, pictureBox1.Height);
            rect = new Rectangle3D() { X = 70, Y = 400, W = 200, H = 200, L = 100, Color = Color.Red };

        }
        
        private void button2_Click(object sender, EventArgs e)
        {
            using (var g = Graphics.FromImage(pictureBox1.Image))
            {
                rect.ChangeColor();
                Draw(g, rect);
                pictureBox1.Refresh();
            }
        }
        //private void Draw(int x, int y, int h, int w, int l, Color color, Graphics g)
        private void Draw(Graphics g, Rectangle3D rect)
        {
            Pen pen = new Pen(rect.Color);
            int x = rect.X;
            int y = rect.Y;
            int h = rect.H;
            int w = rect.W;
            int l = rect.L;
            g.DrawLine(pen, x, y, x + w, y);
            g.DrawLine(pen, x + w, y, x + w, y - h);
            g.DrawLine(pen, x, y, x, y - h);
            g.DrawLine(pen, x, y - h, x + w, y - h);
            int t = (int)Math.Sqrt(l * l / 2);
            g.DrawLine(pen, x + w + t, y - t, x + w + t, y - h - t);
            g.DrawLine(pen, x + t, y - h - t, x + w + t, y - h - t);

            g.DrawLine(pen, x + w, y, x + w + t, y - t);
            g.DrawLine(pen, x + w, y - h, x + w + t, y - h - t);
            g.DrawLine(pen, x, y - h, x + t, y - h - t);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            pictureBox1.Image = new Bitmap(pictureBox1.Width, pictureBox1.Height);
            using (var g = Graphics.FromImage(pictureBox1.Image))
            {
                int l = Int32.Parse(textBox1.Text);
                rect.ChangeLength(l);
                Draw(g, rect);
                pictureBox1.Refresh();
            }
        }
    }
}
