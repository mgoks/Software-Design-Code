package ca.mcgill.cs.swdesign.m8;

public class Driver
{
	public static void main(String[] args)
	{
		PrintVisitor v = new PrintVisitor();
		
		File read 	   = new File("readfromstdin.py");
		SymLink symLink = new SymLink(read, "read");
		
		Directory chat  = new Directory("chat-OH.io");
		chat.addChild(new Directory("node_modules"));
		chat.addChild(new Directory("public"));
		chat.addChild(new File("index.js"));
		
		Directory desktop = new Directory("Desktop");
		desktop.addChild(read);
		desktop.addChild(symLink);
		desktop.addChild(chat);
		desktop.addChild(new File("The C Programming Language.pdf"));
		
		Directory home = new Directory("home");
		home.addChild(desktop);
		
		// Using the HiddenDirectory subclass
		HiddenDirectory hidden = new HiddenDirectory("hidden");
		hidden.addChild(new Directory("system files"));
		hidden.addChild(new File("a.out"));
		home.addChild(hidden);
		home.accept(v);
		
		// Using the Decorator Design Pattern with VisibilityDecorator class
//		Directory dir = new Directory("hidden");
//		VisibilityDecorator hidden = new VisibilityDecorator(dir);
//		hidden.accept(v);
//		Directory dir = new Directory("hidden");
//		dir.addChild(new Directory("system files"));
//		dir.addChild(new File("a.out"));
//		VisibilityDecorator hidden = new VisibilityDecorator(dir);
//		home.addChild(hidden);
//		home.accept(v);
		
	}
}
