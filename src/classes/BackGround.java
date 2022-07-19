
package classes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
/**
 *
 * @author AndersoNMN
 */
public class BackGround extends JDesktopPane{
    private Image imagem;
    
    public BackGround() {
    
    }
    
    public BackGround(String img) {
        if(img!= null) {
            imagem = new ImageIcon(getClass().getResource(img)).getImage();
        }
    }
    
    public BackGround(Image imageInicial) {
        if (imageInicial != null) {
            imagem = imageInicial;
        }
    }
    
    public void setImage(String img) {
        if (img!= null) {
            imagem = new ImageIcon(getClass().getResource(img)).getImage();
        } else {
            imagem = null;
        }
        repaint();
    }
    
    
     public void setImage(Image novaImage) {
         imagem = novaImage;
         
         repaint();
     }
    
    
    @Override
    public void paint (Graphics g) {
        if (imagem != null) {
            g.drawImage(imagem, 0, 0,getWidth(), getHeight(),this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        
        super.paint(g);
    }
}
