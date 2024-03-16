
public class Client {

	public static void main(String[] args) {
		 
		//LED Factory
		LEDLightingFactory ledLightingFactory = new LEDLightingFactory();
		ledLightingFactory.CreateBombilla();
		ledLightingFactory.CreatePanel();
		
		//HALOGENO Factory
		HalogenoLightingFactory HalogenoLightingFactory = new HalogenoLightingFactory();
		HalogenoLightingFactory.CreateBombilla();
		HalogenoLightingFactory.CreatePanel();

	}

}
