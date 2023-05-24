import javax.swing.JFrame;
public class frame extends  JFrame {
    frame() {
        //set the title frame class
        this.setTitle("snake");
        this.add(new panel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }



}