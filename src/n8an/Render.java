package n8an;

public class Render {
	public final int width;
	public final int height;
	public final int[] pixels;
	
	public Render (int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int [width * height];
		
	}
	
	public void draw (Render render, int xoffs, int yoffs) {
		for (int y = 0; y < render.height; y++) {
			int ypix = y + yoffs;
			for (int x = 0; x < render.width; x++) {
				int xpix = x + xoffs;
				
				pixels[xpix * ypix * width] = render.pixels[x + y * render.width];
				System.out.println("x:" + x +"y:" + y);
				
			}
			
		}
		
	}
	
}
