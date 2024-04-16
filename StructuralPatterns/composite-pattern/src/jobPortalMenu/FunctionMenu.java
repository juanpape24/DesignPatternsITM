package jobPortalMenu;

public class FunctionMenu extends Menu {
	
	String function;
	
	public FunctionMenu(String function) {
		this.function = function;
	}

	@Override
	public void add(Menu componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Menu componente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showMenu(int level) {
		String ident = getIdent(level);
		System.out.println(ident + "Función: " + function );		
	}
	
	private String getIdent(int level) {
		String space = "";
		for (int i = 0; i <= level; i++) {
			space += "	";			
		}
		return space;
	}

}
