import javax.swing.JFrame;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class ghuruntiFlower implements GLEventListener {
    static GLProfile profile = GLProfile.get(GLProfile.GL2);
    static GLCapabilities capabilities = new GLCapabilities(profile);
    static GLCanvas canvas = new GLCanvas(capabilities);

    public static void main(String[] args) {
        GLEventListener circle = new ghuruntiFlower();
        canvas.addGLEventListener(circle);
        canvas.setSize(500,500);

        JFrame frame = new JFrame("MCA to Draw Flower Thingy");

        frame.getContentPane().add(canvas);
        frame.setSize(frame.getContentPane().getPreferredSize());
        frame.setVisible(true);
    }

    @Override
    public void display(GLAutoDrawable arg0) {
        drawZoneLines(arg0);

        float radius = 200, xc = 0, yc = 0;
        drawCircle(arg0, radius, xc, yc);

        radius = radius / 2;

        for (float angle = 0; angle < 360; angle += 45) {
            double x = radius * Math.cos(Math.toRadians(angle));
            double y = radius * Math.sin(Math.toRadians(angle));
            drawCircle(arg0, radius, (float) x, (float) y);
        }
    }

    @Override
    public void dispose(GLAutoDrawable arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void init(GLAutoDrawable arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3,
                        int arg4) {
        // TODO Auto-generated method stub

    }

    private void drawZoneLines(GLAutoDrawable arg0) {
        final GL2 gl = arg0.getGL().getGL2();
        gl.glPointSize(1);
        gl.glBegin(GL2.GL_POINTS);

        for (double i = 0; i <= 1; i += 0.1) {
            gl.glVertex2d(i, 0);
            gl.glVertex2d(0, i);
            gl.glVertex2d(-i, 0);
            gl.glVertex2d(0, -i);
            gl.glVertex2d(i, i);
            gl.glVertex2d(-i, i);
            gl.glVertex2d(i, -i);
            gl.glVertex2d(-i, -i);
        }

        gl.glEnd();
    }

    private void drawCircle(GLAutoDrawable arg0, float radius, float xc, float yc) {
        float d = 1 - radius;
        float x = radius, y = 0;

        final GL2 gl = arg0.getGL().getGL2();
        gl.glPointSize(1);
        gl.glBegin(GL2.GL_POINTS);

        while (x >= y) {
            drawEightWay(gl, x, y, xc, yc);

            if (d <= 0) {
                d = d + (2 * y) + 3;
                y++;
            } else {
                d = d - 2 * x + 2 * y + 5;
                x--;
                y++;
            }
        }

        gl.glEnd();
    }

    private void drawEightWay(GL2 gl, float x, float y, float xc, float yc) {
        gl.glVertex2d((x + xc) / 250, (y + yc) / 250);
        gl.glVertex2d((y + xc) / 250, (x + yc) / 250);
        gl.glVertex2d(-(y - xc) / 250, (x + yc) / 250);
        gl.glVertex2d(-(x - xc) / 250, (y + yc) / 250);

        gl.glVertex2d(-(x - xc) / 250, -(y - yc) / 250);
        gl.glVertex2d(-(y - xc) / 250, -(x - yc) / 250);
        gl.glVertex2d((y + xc) / 250, -(x - yc) / 250);
        gl.glVertex2d((x + xc) / 250, -(y - yc) / 250);
    }

}
