import java.awt.*;
import javax.swing.*;

/*
David Persson
2018-05-27
Ett spel där du ska träffa av en figur som dyker upp i banan innan den försvinner igen
 */

public class WhackaMole extends Canvas {
            public Mole mole;
        public WhackaMole() {
            JFrame frame = new JFrame("SpelPlan");
            this.setSize(new Dimension(600, 600));

            frame.add(this);
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            mole = new Mole();
            Thread MulvadN = new Thread(this.mole);
            MulvadN.start();

            int fps = 60;
            long dt = 1000000000 / fps;

            long lastUpdate = System.nanoTime();

            while (true){
                if (System.nanoTime() - lastUpdate > dt){
                    lastUpdate = System.nanoTime();
                    draw();
                }
            }


        }

    private void draw() {
            Image dbImage = createImage(getWidth(), getHeight());
            Graphics dbg = dbImage.getGraphics();
            draw();
            mole.draw(dbg);
            getGraphics().drawImage(dbImage, 0, 0, this);
    }


    public void paint(Graphics g) { //Detta är spelplanen till spelet
            g.setColor(Color.BLACK);
            g.fillRect(125, 125, 100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(250,125,100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(375,125,100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(125,250,100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(250,250,100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(375,250,100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(125,375,100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(250,375,100, 100);

            g.setColor(Color.BLACK);
            g.fillRect(375,375,100, 100);

    }
    public static void main(String[] args) {
    new WhackaMole();

    }

}


