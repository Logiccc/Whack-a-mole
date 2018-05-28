import java.awt.*;
import java.util.Random;

public class Mole implements Runnable{
    public static Rectangle moleModel;
    private static Color c3;
    int arrayX[] = new int[]{150, 275, 400}; //En array med X värdena från spel planen.
    int arrayY[] = new int[]{150, 275, 400};// En array med Y värdena från spel planen.
    public Mole(){
        moleModel = new Rectangle(getRandomX(),getRandomY(),50,50);
        c3 = new Color(0xCC87AA);
    }

    public int getRandomX(){
        int rnd = (int)(Math.random()*arrayX.length);
        return arrayX[rnd];
    }

    public int getRandomY(){
        int rnd2 = (int)(Math.random()*arrayY.length);
        return arrayY[rnd2];
    }






    @Override
    public void run() {
        try {
            Thread.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g){//ritar ut Mole
        g.setColor(c3);
        g.fillOval(moleModel.x, moleModel.y, (int) moleModel.getWidth(),(int) moleModel.getHeight());

    }

}
