package inheriteance;

public class HumanUse extends Human{
	
	public static void main(String[] args) {
		
		Human p = new Human();
		
		p.gender = "Male";
		p.name = "Clark";
		System.out.println(p);
		
		Man m = new Man();
		m.gender = "Male";
		m.name = "David";
		m.size = 100;
		System.out.println(m);
		
		SuperMan s = new SuperMan();
		s.name = "William";
		s.gender = "Male";
		s.size = 200;
		System.out.print(s);
		s.fly();
		
		SpiderMan sm = new SpiderMan();
		sm.name = "Petter Parker";
		sm.gender = "Male";
		sm.size = 200;
		System.out.print(sm);
		sm.webSwing();
		
		WonderWoman ww = new WonderWoman();
		ww.name = "Diana";
		ww.gender = "Female";
		ww.size = 200;
		System.out.print(ww);
		ww.att();
	}
	
}
