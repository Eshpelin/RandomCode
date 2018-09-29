import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

import javax.swing.*;

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

        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glViewport(-250, -150, 250, 150);
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
    }

    /**
     * Take care of drawing here.
     */
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2();

        gl.glClear(GL2.GL_COLOR_BUFFER_BIT);

        drawLine(gl, 5, 20, 10, 25);
        drawLine(gl, 10, 25, 15, 20);
        drawLine(gl, 15, 30, 20, 25);
        drawLine(gl, 20, 25, 10, 15);
        drawLine(gl, 15, 20, 20, 15);
        drawLine(gl, 20, 15, 25, 20);
        drawLine(gl, 10, 15, 15, 10);


    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    private void drawLine(GL2 gl, int x1, int y1, int x2, int y2) {
        int x = x1, y = y1; // initial value
        float dx = x2 - x1;
        float dy = y2 - y1;
        float higherDistance;
        float xInc, yInc;

        if (Math.abs(dx) > Math.abs(dy))
            higherDistance = Math.abs(dx);
        else
            higherDistance = Math.abs(dy);

        xInc = dx / higherDistance; // increment of dx
        yInc = dy / higherDistance; // increment of dy

        gl.glPointSize(1f);
        gl.glBegin(GL2.GL_POINTS);
        for (int i = 0; i < higherDistance; i++) {
            gl.glVertex2f(x, y);
            x += xInc;
            y += yInc;
        }
        gl.glEnd();
    }

    public void dispose(GLAutoDrawable arg0) {

    }
}

public class DDA {
    public static void main(String args[]) {
        //getting the capabilities object of GL2 profile
        final GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        // The canvas
        final GLCanvas glcanvas = new GLCanvas(capabilities);
        ThirdGLEventListener b = new ThirdGLEventListener();
        glcanvas.addGLEventListener(b);
        glcanvas.setSize(1600, 1300);
        //creating frame
        final JFrame frame = new JFrame("Swastika");
        //adding canvas to frame
        frame.add(glcanvas);
        frame.setSize(1600, 1300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}