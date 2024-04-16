package jobPortalMenu;

public abstract class Menu {
	abstract public void add(Menu componente);
	abstract public void delete(Menu componente);
	abstract public void showMenu(int level); 
}
