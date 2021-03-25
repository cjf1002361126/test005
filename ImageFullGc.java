

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageFullGc {

	public static Image getImage(String path) { 
	    ImageIcon icon = new ImageIcon(path); 
	    Image img = icon.getImage(); 
	    return img; 
	}
	
	public static void main(String[] args) {
		while(true){
//			Image image = getImage("C:\\Users\\cjf\\Desktop\\BaiduShurufa_2020-3-8_19-3-13.png");
//			image.flush();
		}
	}
}
