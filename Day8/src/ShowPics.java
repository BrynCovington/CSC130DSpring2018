
public class ShowPics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Picture giraffe = new Picture("giraffe.jpg"); 
giraffe.draw();

Picture giraffe2 = new Picture("giraffe.jpg");
giraffe2.translate(605, 690);
giraffe2.draw(); 

Picture coon = new Picture("download.jpg"); 
coon.translate(0, 674); 
coon.draw(); 

Picture coon2 = new Picture("download.jpg"); 
coon2.translate(620, 0);
coon2.draw(); 

Picture puppy = new Picture("images.jpg"); 
puppy.translate(310, 335);
puppy.draw();

Picture kitty = new Picture("kitty.jpg"); 
kitty.translate(0, 350); 
kitty.draw(); 

Picture kitty2 = new Picture("kitty.jpg"); 
kitty2.translate(600, 350);
kitty2.draw();

Picture lion = new Picture("lion.jpg"); 
lion.translate(320, 0);
lion.draw();

Picture lion2 = new Picture("lion.jpg"); 
lion2.translate(320, 643);
lion2.draw();

	}

}
