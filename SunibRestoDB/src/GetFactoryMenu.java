//Factory Method disini
//digunakan untuk membuat object yang reference ke superclass
public class GetFactoryMenu{
	public Menu orderMenu(String cat, String id, String name, int pri, int quan, String type) {
		
		if(cat == null || cat.isEmpty()) return null;
		if(cat.equals("Appetizer")) {
			return new Appetizer(id, name, pri, quan, type);
		}else if(cat.equals("MainCourse")) {
			return new MainCourse(id, name, pri, quan, type);
		}else if(cat.equals("Drink")) {
			return new Drink(id, name, pri, quan, type);
		}else if(cat.equals("Dessert")) {
			return new Dessert(id, name, pri, quan, type);
		}
		return null;
	}
	
}
