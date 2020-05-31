import java.io.File;
import java.io.IOException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {
		int w = 251;
		int h = 200;
		BufferedImage image = null;

		try {
			File input_file = new File("M:\\JavaHelpI.jpg");
			image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
			image = ImageIO.read(input_file);
			System.out.println("Cteni souboru hotovo");
		} catch (IOException e) {
			System.out.println(e);
		}

		try {
			File output_file = new File("M:/Steam/JavaHelpO.jpg");
			ImageIO.write(image, "jpg", output_file);
			System.out.println("Zaspis hotov");
		} catch (IOException e) {
			System.out.println(e);
		}
		/////////////////////////////////////////////////////////////////////////////////////
		BufferedImage img = null;
		File f = null;
		try {
			f = new File("M:/Steam/JavaHelpO.jpg");
			img = ImageIO.read(f);
		} catch (IOException e) {
			System.out.println(e);
		}
		int wh = img.getWidth();
		int he = img.getHeight();
		int p = img.getRGB(100, 200);
		int a = (p >> 24) & 0xff;
		int r = (p >> 16) & 0xff;
		int g = (p >> 8) & 0xff;
		int b = p & 0xff;
		a = 0;
		r = 0;
		g = 0;
		b = 0;
		p = (a << 24) | (r << 16) | (g << 8) | b;
		img.setRGB(0, 0, p);
		try {
			f = new File("M:\\Out.jpg");
			ImageIO.write(img, "jpg", f);
		} catch (IOException e) {
			System.out.println(e);
		}
		/////////////////////////////////////////////////////////////////////////////////
		BufferedImage imgg = null;
		File ff = null;
		try {
			ff = new File("M:/Steam/JavaHelpO.jpg");
			imgg = ImageIO.read(ff);
		} catch (IOException e) {
			System.out.println(e);
		}
		int whh = imgg.getWidth();
		int hee = imgg.getHeight();
		for (int y = 0; y < hee; y++) {
			for (int x = 0; x < whh; x++) {
				int pp = imgg.getRGB(x, y);
				int aa = (pp >> 24) & 0xff;
				int rr = (pp >> 16) & 0xff;
				int gg = (pp >> 8) & 0xff;
				int bb = pp & 0xff;
				int AVG = (rr + gg + bb) / 3;
				pp = (aa << 24) | (AVG << 16) | (AVG << 8) | AVG;
				imgg.setRGB(x, y, pp);
			}
		}
		try {
			ff = new File("M:\\OOut.jpg");
			ImageIO.write(imgg, "jpg", ff);
		} catch (IOException e) {
			System.out.println(e);
		}
		////////////////////////////////////////////////////////////////////////////
		BufferedImage Img = null;
		File F = null;
		try {
			F = new File("M:/Steam/JavaHelpO.jpg");
			Img = ImageIO.read(F);
		} catch (IOException e) {
			System.out.println(e);
		}

		int WIDTH = Img.getWidth();
		int HEIGHT = Img.getHeight();
		for (int t = 0; t < HEIGHT; t++) {

			for (int k = 0; k < WIDTH; k++) {

				int Pp = Img.getRGB(k, t);
				int Aa = (Pp >> 24) & 0xff;
				int Rr = (Pp >> 16) & 0xff;
				int Gg = (Pp >> 8) & 0xff;
				int Bb = Pp & 0xff;
				Rr = 255 - Rr;
				Gg = 255 - Gg;
				Bb = 255 - Bb;
				Pp = (Aa << 24) | (Rr << 16) | (Gg << 8) | Bb;
				Img.setRGB(k, t, Pp);
			}
		}

		try {
			F = new File("M:\\Yout.jpg");
			ImageIO.write(Img, "jpg", F);
		} catch (IOException e) {
			System.out.println(e);
		}
		////// Green//////////
		for (int y = 0; y < HEIGHT; y++) {

			for (int x = 0; x < WIDTH; x++) {

				int P = Img.getRGB(x, y);
				int A = (P >> 24) & 0xff;
				int G = (P >> 8) & 0xff;
				P = (A << 24) | (0 << 16) | (G << 8) | 0;
				Img.setRGB(x, y, P);
			}
		}

		try {
			F = new File("M:\\IKOut.jpg");
			ImageIO.write(Img, "jpg", F);
		} catch (IOException e) {
			System.out.println(e);
		}
		///////////////////////////////////////////////////
		int WI = 640;

		int HI = 320;

		BufferedImage IMGA = null;
		IMGA = new BufferedImage(WI, HI, BufferedImage.TYPE_INT_ARGB);

		File FILE = null;
		for (int y = 0; y < HI; y++) {

			for (int x = 0; x < WI; x++) {
				int AA = (int) (Math.random() * 256);
				int RR = (int) (Math.random() * 256);
				int GG = (int) (Math.random() * 256);
				int BB = (int) (Math.random() * 256);

				int PP = (AA << 24) | (RR << 16) | (GG << 8) | BB;
				IMGA.setRGB(x, y, PP);
			}
		}
		try {
			FILE = new File("M:/Steam/asas.jpg");
			ImageIO.write(IMGA, "jpg", FILE);
		} catch (IOException e) {
			System.out.println(e);
		}
////////////////////////////////////////////////////////////////////////
		File fiilee = null;
		BufferedImage simg = null;
		try {
			fiilee = new File("M:\\JavaHelpI.jpg");
			simg = ImageIO.read(fiilee);
		}
		catch(IOException e) {
			System.out.println("Error: " + e );
		}
	int WII =simg.getWidth();
	int HEE =simg.getHeight(); 
	BufferedImage mimg = new BufferedImage(WII, HEE, BufferedImage.TYPE_INT_ARGB);
	for(int i = 0; i<HEE; i++) {
		for (int lx = 0, rx= WII -1; lx< WII; lx++, rx--) {
			int po = simg.getRGB(lx, i);
			mimg.setRGB(rx,i,po);
		}
	}
	try    { 
        fiilee = new File("M:/Steam/oOOut.jpg"); 
        ImageIO.write(mimg, "jpg", fiilee); 
    } 
    catch(IOException e) 
    { 
        System.out.println("Error: " + e); 
    }
	/////////////////////////////////////////////////////////
	File fiole = null;   
    BufferedImage imagoe = null;   
    try  { 
        fiole = new File("M:\\JavaHelpI.jpg"); 
        imagoe = ImageIO.read(fiole); 
    } 
    catch(IOException e)    { 
        System.out.println(e); 
    }      
    BufferedImage tempikk = new BufferedImage(imagoe.getWidth(), 
                imagoe.getHeight(), BufferedImage.TYPE_INT_RGB);        
    Graphics graphics = tempikk.getGraphics(); 
    graphics.drawImage(imagoe, 0, 0, null);     
    graphics.setFont(new Font("Arial", Font.PLAIN, 80)); 
    graphics.setColor(new Color(255, 0, 0, 40));      
    String watermark = "Dobrej watermak :>";    
    graphics.drawString(watermark, imagoe.getWidth()/5, 
                               imagoe.getHeight()/3);  
    graphics.dispose(); 
    fiole = new File("M:\\outik.jpg"); 
    try    { 
        ImageIO.write(tempikk, "png", fiole); 
    } 
    catch (IOException e)     { 
        System.out.println(e); 
    }
    ////////////////////////////////////////////////////// 
  BufferedImage imgB = null; 
	 BufferedImage imgA = null;  
     try { 
    File fileB = new File("M:\\JavaHelpI.jpg"); 
         File fileA = new File("M:\\outik.jpg"); 
        
         imgA = ImageIO.read(fileA); 
         imgB = ImageIO.read(fileB); 
     } 
     catch (IOException e) { 
         System.out.println(e); 
         }    
    int height1 = imgA.getHeight(); 
     int height2 = imgB.getHeight(); 
     int width1 = imgA.getWidth(); 
     int width2 = imgB.getWidth(); 
     if ((width1 != width2) || (height1 != height2)) {
         System.out.println("Error: Images dimensions"+"mismatch");
         } 
     else  { 
         long difference = 0; 
         for (int y = 0; y < height1; y++) { 
             for (int x = 0; x < width1; x++) { 
                 int rgbA = imgA.getRGB(x, y); 
                 int rgbB = imgB.getRGB(x, y); 
                 int redA = (rgbA >> 16) & 0xff; 
                 int greenA = (rgbA >> 8) & 0xff; 
                 int blueA = (rgbA) & 0xff; 
                 int redB = (rgbB >> 16) & 0xff; 
                 int greenB = (rgbB >> 8) & 0xff; 
                 int blueB = (rgbB) & 0xff; 
                 difference += Math.abs(redA - redB); 
                 difference += Math.abs(greenA - greenB); 
                 difference += Math.abs(blueA - blueB); 
             } 
         } 	  	        
         double total_pixels = width1 * height1 * 3; 	  	      
         double avg_different_pixels = difference /total_pixels; 
         double percentage = (avg_different_pixels /255) * 100; 
         System.out.println("ROZDILNOST obrazku " + percentage); 
     }     
}	
}
