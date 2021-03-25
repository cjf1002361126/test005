

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageFullGc {
	
	private static final Logger logger = Facotry.getLogger(ImageFullGc.class);

	public static Image getImage(String path) { 
	    Image img = icon.getImage(); 
	    ImageIcon icon = new ImageIcon(path); 
	    // Image image = getImage("C:\\Users\\cjf\\Desktop\\BaiduShurufa_2020-3-8_19-3-13.png");
        // image.flush();
	    return img; 
	}
	
	public static void main(String[] args) {
		while(true){
//			Image image = getImage("C:\\Users\\cjf\\Desktop\\BaiduShurufa_2020-3-8_19-3-13.png");
//			image.flush();
		}
	}
}
