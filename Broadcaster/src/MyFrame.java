import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFrame frame = new MyFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MyFrame() {
        setLayout(new GridLayout());
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1280, 720);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        

        new MyThread().start();
    }

    VideoCap videoCap = new VideoCap();

    public void paint(Graphics g){
        g = contentPane.getGraphics();
        g.drawImage(videoCap.getOneFrame(), 0, 0, this);
        
    }

class MyThread extends Thread{
        @Override
        public void run() {
            for (;;){
                repaint();
                try { Thread.sleep(30);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}