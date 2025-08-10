package javalab.ch09;

public class ComputerTest {

	public static void main(String[] args) {
		NoteBook notebook = new NoteBook();
		DeskTop desktop = new DeskTop();
		
		notebook.display();
		notebook.typing();
		
		desktop.display();
		desktop.typing();
		
		display(notebook);
		display(desktop);
	}
	
	// Up Casting 사용
	public static void display(Computer computer) {
		computer.display();
		computer.typing();
	}

}
