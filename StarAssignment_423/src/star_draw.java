
import java.util.ArrayList;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import java.lang.Math;
import java.util.Scanner;

import javax.swing.JFrame;

class ThirdGLEventListener implements GLEventListener {
    /**
     * Interface to the GLU library.
     */
    private GLU glu;

    /**
     * Take care of initialization here.
     */
    public void init(GLAutoDrawable gld) {
        GL2 gl = gld.getGL().getGL2();
        glu = new GLU();

        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); //background color
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }


    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
        /*
         * put your code here
         */

        Scanner work=new Scanner(System.in);
        int r=work.nextInt();
        ArrayList<Integer> x_list = new ArrayList<>();
        ArrayList<Integer> y_list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
        {
            double theta = Math.toRadians(i * 72);
            int _x = (int) (100 * Math.cos(theta));
            int _y = (int) (100 * Math.sin(theta));
            x_list.add(_x);
            y_list.add(_y);

        }

        gl.glColor3d(0, 1, 0);

        for (int i = 0; i < 5; i++)
        {
            int j = i + 2;
            if (j >= 5)
                j = j % 5;
            //System.out.println(i + "---i-------j---" + j);
            drawLinechecker(gl,  x_list.get(i), y_list.get(i), x_list.get(j), y_list.get(j),0,1,0);

        }
    }

    private void drawLinechecker( GL2 gl, int x1, int y1, int x2, int y2, int r, int g, int b) {
        // TODO Auto-generated method stub

        int zone=10;
        int dx=x2-x1;
        int dy=y2-y1;

        if(Math.abs(dx)>Math.abs(dy))
        {
            if(dx>=0 && dy>=0)
            {
                zone =0;
            }
            else if(dx>=0 && dy<0)
            {
                zone = 7;
            }
            else if(dx<0 && dy>=0)
            {
                zone = 3;
            }
            else if(dx<0 && dy<0)
            {
                zone = 4;
            }

        }

        else
        {
            if(dx>=0 && dy>=0)
            {
                zone =1;

            }
            else if(dx>=0 && dy<0)
            {
                zone =6;//zone 6
            }
            else if(dx<0 && dy>=0)
            {
                zone =2;//zone 2
            }
            else if(dx<0 && dy<0)
            {
                zone =5;//zone 5
            }
        }





        if(zone ==0 )
        {
            drawLine0(zone,gl,  x1,y1,  x2,y2);//origin green
        }
        if(zone ==1 )
        {
            drawLine1(zone,gl,  x1,y1,  x2,y2);//origin green
        }
        if(zone ==2 )
        {
            drawLine2(zone,gl,  x1,y1,  x2,y2);//origin green
        }
        if(zone ==3 )
        {
            drawLine3(zone,gl,  x1,y1,  x2,y2);//origin green
        }
        if(zone ==4 )
        {
            drawLine4(zone,gl,  x1,y1,  x2,y2);//origin green
        }if(zone ==5 )
        {
            drawLine5(zone,gl,  x1,y1,  x2,y2);//origin green
        }
        if(zone ==6 )
        {
            drawLine6(zone,gl,  x1,y1,  x2,y2);//origin green
        }
        if(zone ==7 )
        {
            drawLine7(zone,gl,  x1,y1,  x2,y2);//origin green
        }
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
                        int height) {
    }

    public void displayChanged(GLAutoDrawable drawable,
                               boolean modeChanged, boolean deviceChanged) {
    }

    private void drawLine0(int zone,GL2 gl, int x1, int y1, int x2, int y2) {
        gl.glPointSize(5.0f); //size of the point
        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;
        int dE=2*dy;
        int dNE=2*(dy-dx);
        int d=2*dy-dx;

        gl.glVertex2i(x , y );

        while(x<x2)
        {
            if(d<0)
            {
                x++;
                d=d+dE;
            }
            else
            {
                x++;
                y++;
                d=d+dNE;
            }

            gl.glVertex2i(x , y );

        }
        gl.glEnd();//end drawing of points

    }



    private void drawLine1(int zone,GL2 gl, int x1, int y1, int x2, int y2 ) {
        gl.glPointSize(5.0f); //size of the point


        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;


        int dN=-2*dx;
        int dNE=2*(dy-dx);
        int d=dy-2*dx;


        gl.glVertex2i(x , y );

        while(y<y2)
        {
            if(d<0)
            {
                x++;
                y++;
                d=d+dNE;
            }
            else
            {


                y++;
                d=d+dN;
            }

            gl.glVertex2i(x , y );


        }
        gl.glEnd();//end drawing of points

    }


    private void drawLine2(int zone,GL2 gl, int x1, int y1, int x2, int y2 ) {
        gl.glPointSize(5.0f); //size of the point

        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;


        int dN=-2*dx;
        int dNW=-2*dy-2*dx;
        int d=-dy-2*dx;


        gl.glVertex2i(x , y );

        while(y<y2)
        {
            if(d<0)
            {

                y++;
                d=d+dN;
            }
            else
            {

                x--;
                y++;
                d=d+dNW;
            }



            gl.glVertex2i(x , y );


        }
        gl.glEnd();//end drawing of points

    }



    private void drawLine3(int zone,GL2 gl, int x1, int y1, int x2, int y2 ) {
        gl.glPointSize(5.0f); //size of the point


        //System.out.println("hello");





        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;


        int dW=-2*dy;
        int dNW=-2*dy-2*dx;
        int d=-2*dy-dx;

        gl.glVertex2i(x , y );
        while(x2<x)
        {
            if(d<0)
            {

                x--;
                y++;
                d=d+dNW;
            }
            else
            {

                x--;

                d=d+dW;
            }

            gl.glVertex2i(x , y );


        }
        gl.glEnd();//end drawing of points

    }



    private void drawLine5(int zone,GL2 gl, int x1, int y1, int x2, int y2 ) {
        gl.glPointSize(5.0f); //size of the point
        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;


        int dS=2*dx;
        int dSW=-2*dy+2*dx;
        int d=2*dx-dy;


        gl.glVertex2i(x , y );

        while(y2<y)
        {
            if(d<0)
            {

                x--;
                y--;
                d=d+dSW;
            }
            else
            {


                y--;
                d=d+dS;
            }



            gl.glVertex2i(x , y );


        }
        gl.glEnd();//end drawing of points

    }



    private void drawLine4(int zone,GL2 gl, int x1, int y1, int x2, int y2 ) {
        gl.glPointSize(5.0f); //size of the point

        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;


        int dW=-2*dy;
        int dSW=-2*dy+2*dx;
        int d=dx-2*dy;
        gl.glVertex2i(x , y );

        while(x2<x)
        {
            if(d<0)
            {

                x--;

                d=d+dW;

            }
            else
            {

                x--;
                y--;
                d=d+dSW;

            }


            gl.glVertex2i(x , y );


        }
        gl.glEnd();//end drawing of points

    }





    private void drawLine6(int zone,GL2 gl, int x1, int y1, int x2, int y2 ) {
        gl.glPointSize(5.0f); //size of the point

        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;


        int dS=2*dx;
        int dSE=2*dy+2*dx;
        int d=2*dx+dy;


        gl.glVertex2i(x , y );

        while(y2<y)
        {
            if(d<0)
            {


                y--;
                d=d+dS;
            }
            else
            {

                x++;
                y--;
                d=d+dSE;
            }



            gl.glVertex2i(x , y );


        }
        gl.glEnd();//end drawing of points

    }



    private void drawLine7(int zone,GL2 gl, int x1, int y1, int x2, int y2 ) {
        gl.glPointSize(5.0f); //size of the point

        gl.glBegin(GL2.GL_POINTS);// begin plotting points
        int dx = (x2 - x1),dy = (y2 - y1);
        int x=x1,y=y1;

        int dE=2*dy;
        int dSE=2*dy+2*dx;
        int d=dx+2*dy;


        gl.glVertex2i(x , y );

        while(x<x2)
        {
            if(d<0)
            {

                x++;
                y--;
                d=d+dSE;
            }
            else
            {

                x++;

                d=d+dE;
            }


            gl.glVertex2i(x , y );


        }
        gl.glEnd();//end drawing of points

    }
    public void dispose(GLAutoDrawable arg0)
    {

    }
}
public class star_draw
{
    public static void main(String args[])
    {
        //getting the capabilities object of GL2 profile
        final GLProfile profile=GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities=new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas=new GLCanvas(capabilities);
        ThirdGLEventListener b=new ThirdGLEventListener();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(400, 400);
        //creating frame
        final JFrame frame=new JFrame("Basic frame");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(640,480);
        frame.setVisible(true);
    }
}
