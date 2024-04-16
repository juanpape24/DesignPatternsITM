package jobPortalMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuOption extends Menu {
	
	String name;
	List<Menu> child;

	public MenuOption(String name) {
		this.name = name;
		this.child = new ArrayList<>();
	}

	@Override
	public void add(Menu componente) {
		child.add(componente);		
	}

	@Override
	public void delete(Menu componente) {
		child.remove(componente);		
	}

	@Override
	public void showMenu(int level) {
		String ident = getIdent(level);
		System.out.println(ident + "Opción de menú: " + name);
		System.out.println(ident + "Opciones hijas: ");
		
		for (Menu menu : child) {
			menu.showMenu(level + 1);
		}		
	}
	
	private String getIdent(int level) {
		String space = "";
		for (int i = 0; i < level; i++) {
			space += "	";			
		}
		return space;
	}

}
