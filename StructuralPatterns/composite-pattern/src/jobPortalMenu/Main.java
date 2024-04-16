package jobPortalMenu;

public class Main {

	public static void main(String[] args) {
		
		Menu menu = new MenuOption("Menu del Portal de Empleo TrabajaYa!");
		
		//Company Menu
		
		Menu companyMenu = new MenuOption("Menu Empresa");
		
		Menu companyOffersOption= new MenuOption("Ofertas");		
		
		Menu companyOffersFunction = new FunctionMenu("Subir Oferta de Trabajo");
		Menu companyOffersFunction2 = new FunctionMenu("Eliminar Oferta de Trabajo");
		Menu companyOffersFunction3 = new FunctionMenu("Ver ofertas");
		
		Menu companyDataOption = new MenuOption("Datos de la Empresa");
		
		Menu companyDataFunction = new FunctionMenu("Modificar nombre");
		Menu companyDataFunction2 = new FunctionMenu("Cambiar foto");
		
		Menu userMenu = new MenuOption("Menu usuario");
		
		Menu userOffer = new MenuOption("Ofertas");
		
		Menu userOfferFunction = new FunctionMenu("Buscar oferta");
		Menu userOfferFunction2 = new FunctionMenu("Aplicar a la oferta");
		Menu userOfferFunction3 = new FunctionMenu("Eliminar candidatura");
		
		Menu userData = new MenuOption("Datos del usuario");
		
		Menu userDataFunction = new FunctionMenu("Actualizar información básica");
		Menu userDataFunction2 = new FunctionMenu("Actualizar Hoja de Vida");
		Menu userDataFunction3 = new FunctionMenu("Descargar Hoja de Vida");
		
		menu.add(companyMenu);
		menu.add(userMenu);
		
		companyMenu.add(companyOffersOption);
		companyMenu.add(companyDataOption);
		
		userMenu.add(userOffer);
		userMenu.add(userData);
		
		companyOffersOption.add(companyOffersFunction);
		companyOffersOption.add(companyOffersFunction2);
		companyOffersOption.add(companyOffersFunction3);
		
		companyDataOption.add(companyDataFunction);
		companyDataOption.add(companyDataFunction2);
		
		userOffer.add(userOfferFunction);
		userOffer.add(userOfferFunction2);
		userOffer.add(userOfferFunction3);
		
		userData.add(userDataFunction);
		userData.add(userDataFunction2);
		userData.add(userDataFunction3);
		
		menu.showMenu(0);

	}

}
