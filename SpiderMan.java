import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SpiderMan extends JFrame{
    
    ImageIcon iconParede = new ImageIcon(getClass().getResource("wall.jpg"));
    ImageIcon iconMovendo = new ImageIcon(getClass().getResource("spiderMovendo.gif"));
    ImageIcon iconParado = new ImageIcon(getClass().getResource("spiderParado.png"));
    
    JLabel lParede = new JLabel(iconParede);
    JLabel lSpider = new JLabel(iconParado);
    
    int posX = 220, posY = 180;
    
    public SpiderMan(){
        setWindow();
        setComponents();
        addMoviments();
    }
    
    public void addMoviments(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
               //To change body of generated methods, choose Tools | Templates.
            }

            public void keyPressed(KeyEvent ke) {
                
                lSpider.setIcon(iconMovendo);
                
                //tecla precionada: KEY_LEFT
                if(ke.getKeyCode() == 37){
                    posX-=20;
                }
                //tecla precionada: KEY_UP    
                if(ke.getKeyCode() == 38){
                    posY-=20;
                }
                //tecla precionada: KEY_RIGHT
                if(ke.getKeyCode() == 39){
                    posX+=20;
                }
                //tecla precionada: KEY_DOWN    
                if(ke.getKeyCode() == 40){
                    posY+=20;
                }
                lSpider.setBounds(posX,posY,103,202);
                
            }

            public void keyReleased(KeyEvent ke) {
               lSpider.setIcon(iconParado);
            }
                        
        });
    }
    
    public void setComponents(){
        lParede.setBounds(0,0,636,617);
        lSpider.setBounds(posX, posY,103,202);
    }
    
    public void setWindow(){
        setTitle("Spider Man");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(636, 617);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(null);
        add(lSpider);
        add(lParede);
    }    
    
    public static void main(String[] args) {
        new SpiderMan();
    }    
}