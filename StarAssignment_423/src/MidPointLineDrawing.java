import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jogamp.opengl.util.FPSAnimator;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Component;
import java.awt.event.KeyEvent;

import javax.swing.Box;

@SuppressWarnings("serial")
public class MidPointLineDrawing extends JPanel implements AnimationTrigger {

    private MidPointLineDrawingAlgorithm	algorithm	= new MidPointLineDrawingAlgorithm();

    private FPSAnimator						animator	= null;

    private JSlider							sliderX1;

    private JSlider							sliderY1;

    private JSlider							sliderX2;

    private JSlider							sliderY2;

    public MidPointLineDrawing() {
        setPreferredSize(new Dimension(Settings.WIDTH + 16,
                Settings.HEIGHT + 132));
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setName("buttonPanel");
        buttonPanel.setPreferredSize(new Dimension(getWidth(), 60));
        this.add(buttonPanel, BorderLayout.SOUTH);

        Component horizontalStrut_2 = Box.createHorizontalStrut(20);
        horizontalStrut_2.setName("horizontalStrut_2");
        buttonPanel.add(horizontalStrut_2);

        JLabel lblX = new JLabel("x1 :");
        lblX.setName("lblX");
        buttonPanel.add(lblX);

        sliderX1 = new JSlider();
        sliderX1.setValue(-150);
        sliderX1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                do_sliderX1_stateChanged(e);
            }
        });

        sliderX1.setName("sliderX1");
        sliderX1.setMinimum(-200);
        sliderX1.setMaximum(200);
        buttonPanel.add(sliderX1);

        Component horizontalStrut = Box.createHorizontalStrut(20);
        horizontalStrut.setName("horizontalStrut");
        buttonPanel.add(horizontalStrut);

        JLabel lblY = new JLabel("y1:");
        lblY.setName("lblY");
        buttonPanel.add(lblY);

        sliderY1 = new JSlider();
        sliderY1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                do_sliderY1_stateChanged(e);
            }
        });
        sliderY1.setValue(-100);
        sliderY1.setMaximum(200);
        sliderY1.setMinimum(-200);
        sliderY1.setName("sliderY1");
        buttonPanel.add(sliderY1);

        Component horizontalStrut_3 = Box.createHorizontalStrut(20);
        horizontalStrut_3.setName("horizontalStrut_3");
        buttonPanel.add(horizontalStrut_3);

        JLabel lblX_1 = new JLabel("x2:");
        lblX_1.setName("lblX_1");
        buttonPanel.add(lblX_1);

        sliderX2 = new JSlider();
        sliderX2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                do_sliderX2_stateChanged(e);
            }
        });
        sliderX2.setValue(150);
        sliderX2.setMinimum(-200);
        sliderX2.setMaximum(200);
        sliderX2.setName("sliderX2");
        buttonPanel.add(sliderX2);

        Component horizontalStrut_1 = Box.createHorizontalStrut(20);
        horizontalStrut_1.setName("horizontalStrut_1");
        buttonPanel.add(horizontalStrut_1);

        JLabel lblY_1 = new JLabel("y2 :");
        lblY_1.setName("lblY_1");
        buttonPanel.add(lblY_1);

        sliderY2 = new JSlider();
        sliderY2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                do_sliderY2_stateChanged(e);
            }
        });
        sliderY2.setName("sliderY2");
        sliderY2.setValue(150);
        sliderY2.setMinimum(-200);
        sliderY2.setMaximum(200);
        sliderX2.setName("sliderY2");
        buttonPanel.add(sliderY2);

        JPanel graphPanel = new JPanel();
        graphPanel.setName("graphPanel");
        this.add(graphPanel, BorderLayout.CENTER);

        JPanel namePanel = new JPanel();
        namePanel.setName("namePanel");
        this.add(namePanel, BorderLayout.NORTH);

        JLabel lblMidPointAlgorithm = new JLabel(
                "Mid Point Line Drawing Algorithm");
        lblMidPointAlgorithm.setFont(new Font("Verdana", Font.BOLD, 12));
        lblMidPointAlgorithm.setName("lblMidPointAlgorithm");
        namePanel.add(lblMidPointAlgorithm);

        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);

        GLCanvas glcanvas = new GLCanvas(capabilities);

        glcanvas.addGLEventListener(algorithm);
        glcanvas.setSize(Settings.WIDTH, Settings.HEIGHT);
        glcanvas.addKeyListener(this);
        animator = new FPSAnimator(glcanvas, 60);

        graphPanel.add(glcanvas);

    }

    @Override
    public void stopAnimation() {
        animator.stop();
    }

    @Override
    public void startAnimation() {
        animator.start();
    }

    protected void do_sliderX1_stateChanged(ChangeEvent e) {
        algorithm.setX0(sliderX1.getValue());
    }

    protected void do_sliderY1_stateChanged(ChangeEvent e) {
        algorithm.setY0(sliderY1.getValue());
    }

    protected void do_sliderX2_stateChanged(ChangeEvent e) {
        algorithm.setXn(sliderX2.getValue());
    }

    protected void do_sliderY2_stateChanged(ChangeEvent e) {
        algorithm.setYn(sliderY2.getValue());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("asdjflajfd");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}