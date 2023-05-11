interface Monkey{
	public void jump();
	public void bite();
}

class Human implements Monkey{
	public void jump(){System.out.println("Sleeping");}
	public void bite(){System.out.println("Eating");}
}
class basic{
public static void main(String[] args){
	Human m=new Human();
	m.jump();
	m.bite();
}
}

	


	