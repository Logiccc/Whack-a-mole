import java.awt.*;

public class MulvadN implements Runnable{
    public static Rectangle mullvadModell;
    private static Color c3;
    int arrayXY[] = {150, 275, 400};


    public MulvadN(){
        mullvadModell = new Rectangle(randomXY(),randomXY(),50,50);
        c3 = new Color(0xCC87AA);
    }
    public int randomXY(){
        for (int i = 0; i < arrayXY.length; i++){
            int index = (int)(Math.random() * arrayXY.length);

            int temp = arrayXY[i];
            arrayXY[i] = arrayXY[index];
            arrayXY[index] = temp;

        }//End of loop
        int i = 0;
        return i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g){
        g.setColor(c3);
        g.fillOval(mullvadModell.x, mullvadModell.y, (int) mullvadModell.getWidth(),(int) mullvadModell.getHeight());

    }

}
