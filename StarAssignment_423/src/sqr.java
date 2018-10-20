//
//import java.util.Scanner;
//import com.jogamp.opengl.GL2;
//import com.jogamp.opengl.GLAutoDrawable;
//import com.jogamp.opengl.GLCapabilities;
//import com.jogamp.opengl.GLEventListener;
//import com.jogamp.opengl.GLProfile;
//import com.jogamp.opengl.awt.GLCanvas;
//import com.jogamp.opengl.glu.GLU;
//import java.lang.Math;
//import javax.swing.JFrame;
//
//class ThirdGLEventListener implements GLEventListener {
//    /**
//     * Interface to the GLU library.
//     */
//    private GLU glu;
//
//    /**
//     * Take care of initialization here.
//     */
//    public void init(GLAutoDrawable gld) {
//        GL2 gl = gld.getGL().getGL2();
//        glu = new GLU();
//
//        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
//        gl.glViewport(-250, -150, 250, 150);
//        gl.glMatrixMode(GL2.GL_PROJECTION);
//        gl.glLoadIdentity();
//        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
//    }
//
//    /**
//     * Take care of drawing here.
//     */
//    public void display(GLAutoDrawable drawable) {
//        GL2 gl = drawable.getGL().getGL2();
//        Scanner work= new Scanner(System.in);
//        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
//        /*
//         * put your code here
//         */
//
//
////Line input
//        System.out.println("Enter value of x0");
//        float x0 = work.nextFloat();
//        System.out.println("Enter value of y0");
//        float y0 = work.nextFloat();
//        System.out.println("Enter value of x1");
//        float x1 = work.nextFloat();
//        System.out.println("Enter value of y1");
//        float y1 = work.nextFloat();
//
//        double c=Math.sqrt(Math.pow(x1-x0, 2)+Math.pow(y1-y0, 2));
//        float d=(float)c;  //ektu kaj ase
//        float dx=x1-x0;
//        float dy=y1-y0;
//        float m=dy/dx;
//        float theta=(float) (Math.atan(m)*180/Math.PI);
//        gl.glTranslatef( x1,  y1,  0.0f);
//        gl.glRotatef( theta,   0.0f,   0.0f,   1.0f);
//
//        gl.glPushMatrix();
//        drawLine(gl, 0, 0, d, 0);
//        gl.glRotatef( 90.0f,   0.0f,   0.0f,   1.0f);
//        drawLine(gl, 0, 0, d, 0);
//
//        gl.glRotatef( -90.0f,   0.0f,   0.0f,   1.0f);
//        gl.glTranslatef( 1.0f,  d,  0.0f);
//        drawLine(gl, 0, 0, d, 0);
//
//        gl.glRotatef( -90.0f,   0.0f,   0.0f,   1.0f);
//        gl.glTranslatef( 1.0f,  d,  0.0f);
//        drawLine(gl, 0, 0, d, 0);
//        gl.glPopMatrix();
//
//
//
//    }
//
//    public void reshape(GLAutoDrawable drawable, int x, int y, int width,
//                        int height) {
//    }
//
//    public void displayChanged(GLAutoDrawable drawable,
//                               boolean modeChanged, boolean deviceChanged) {
//    }
//
//    //find Zone
//    private void drawLine(GL2 gl, float x0, float y0, float x1, float y1) {
//        float dx = (x1 - x0),dy = (y1 - y0);
//        if(Math.abs(dx)>=Math.abs(dy)) {//zone 0,3,4,7
//            gl.glColor3f(0, 0, 1);
//            if(dx>= 0 && dy>=0)   drawLine_0(gl,x0, y0, x1, y1);
//            else if(dx>=0 && dy<0)  drawLine_7(gl,x0, y0, x1, y1);
//            else if(dx<0 && dy<0)  drawLine_4(gl,x0, y0, x1, y1);
//            else   drawLine_3(gl,x0, y0, x1, y1);
//        }
//        else {//zone 1,2,5,6
//            gl.glColor3f(0, 0, 1);
//            if(dx>= 0 && dy>=0)   drawLine_1(gl,x0, y0, x1, y1);
//            else if(dx>=0 && dy<0)  drawLine_6(gl,x0, y0, x1, y1);
//            else if(dx<0 && dy<0)  drawLine_5(gl,x0, y0, x1, y1);
//            else   drawLine_2(gl,x0, y0, x1, y1);
//        }
//    }
//
////drawing Lines
//
//    //ZONE 0
//    private void drawLine_0(GL2 gl, float x0, float y0, float x1, float y1) {
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0),x=x0,y=y0;
//        float dE=2*dy;   //east
//        float dNE=2*dy - 2*dx; //north-east
//        float d = 2*dy -dx;
//        gl.glVertex2f(x , y );
//        while(x<x1){
//            if(d<0) {//east
//                x++;d+=dE;
//            }
//            else {//north-east
//                x++;y++;d+=dNE;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//
//    }
//    //ZONE 1
//    private void drawLine_1(GL2 gl, float x0, float y0, float x1, float y1) {
//
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0),x=x0,y=y0;
//        float dN= 2*(-dx);   //north
//        float dNE=2*dy - 2*dx; //north-east
//        float d = dy - 2*dx;
//        gl.glVertex2f(x , y );
//        while(y<y1){
//            if(d<0) {//north-east
//                x++; y++;  d+=dNE;
//            }
//            else {//north
//                y++ ; d+=dN;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//    }
//    //ZONE 2
//    private void drawLine_2(GL2 gl, float x0, float y0, float x1, float y1) {
//
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0),x=x0,y=y0;
//        float dN= -2*dx;   //north
//        float dNW=-2*dy - 2*dx; //north-west
//        float d = -2*dx-dy;
//        gl.glVertex2f(x , y );
//        while(y1<y){
//            if(d<0) {//north
//                y++;  d+=dN;
//            }
//            else {//north-west
//                y++ ; x--; d+=dNW;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//    }
//    //ZONE 3
//    private void drawLine_3(GL2 gl, float x0, float y0, float x1, float y1) {
//
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0);
//        float x=x0,y=y0;
//        float dW= -2*dy;   //west
//        float dNW=-2*dy - 2*dx; //north-west
//        float d = -dx-2*dy;
//        gl.glVertex2f(x , y );
//        while(x1<x){
//            if(d<0) {//north-west
//                x--;y++ ; d+=dNW;
//            }
//            else {//west
//                x--; d+=dW;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//    }
//
//    //zone 4
//    private void drawLine_4(GL2 gl, float x0, float y0, float x1, float y1) {
//
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0),x=x0,y=y0;
//        float dW= -2*dy;   //west
//        float dSW=2*(dx)- 2*(dy); //south-west
//        float d = dx-2*(dy);
//        gl.glVertex2f(x , y );
//        while(x1<x){
//            if(d<0) {//west
//                x--; d+=dW;
//            }
//            else {//south-west
//                x--; y--; d+=dSW;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//    }
//    //ZONE 5
//    private void drawLine_5(GL2 gl, float x0, float y0, float x1, float y1) {
//
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0),x=x0,y=y0;
//        float dS= 2*dx;   //south
//        float dSW= 2*dx-2*dy; //south-west
//        float d = 2*dx-dy;
//        gl.glVertex2f(x , y );
//        while(y1<y){
//            if(d<0) {//south-west
//                x--;y--;  d+=dSW;
//            }
//            else {//south
//                y-- ; d+=dS;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//    }
//    //ZONE 6
//    private void drawLine_6(GL2 gl, float x0, float y0, float x1, float y1) {
//
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0),x=x0,y=y0;
//        float dS= 2*dx;   //south
//        float dSE= 2*dx+2*dy; //south-east
//        float d = 2*dx+dy;
//        gl.glVertex2f(x , y );
//        while(y<y1){
//            if(d<0) {//south
//                y--;  d+=dS;
//            }
//            else {//south-east
//                x++; y-- ; d+=dSE;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//    }
//    //ZONE 7
//    private void drawLine_7(GL2 gl, float x0, float y0, float x1, float y1) {
//
//
//        gl.glPointSize(2.0f);
//        gl.glBegin(GL2.GL_POINTS);// begin plotting points
//
//        float dx = (x1 - x0),dy = (y1 - y0),x=x0,y=y0;
//        float dE= 2*dy;   //east
//        float dSE= 2*dx+2*dy; //south-east
//        float d = 2*dy+dx;
//        gl.glVertex2f(x , y );
//        while(x<x1){
//            if(d<0) {//south-east
//                x++;y--;  d+=dSE;
//            }
//            else {//east
//                x++ ; d+=dE;
//            }
//            gl.glVertex2f(x , y );
//        }// while loop end
//        gl.glEnd();//end drawing of points
//    }
//
//    public void dispose(GLAutoDrawable arg0)
//    {
//
//    }
//}
//public class sqr
//{
//    public static void main(String args[])
//    {
//        //getting the capabilities object of GL2 profile
//        final GLProfile profile=GLProfile.get(GLProfile.GL2);
//        GLCapabilities capabilities=new GLCapabilities(profile);
//        // The canvas
//        final GLCanvas glcanvas=new GLCanvas(capabilities);
//        ThirdGLEventListener b=new ThirdGLEventListener();
//        glcanvas.addGLEventListener(b);
//        glcanvas.setSize(400, 400);
//        //creating frame
//        final JFrame frame=new JFrame("Basic frame");
//        //adding canvas to frame
//        frame.add(glcanvas);
//        frame.setSize(640,480); //framing a kaj ase
//        frame.setVisible(true);
//    }
//}
