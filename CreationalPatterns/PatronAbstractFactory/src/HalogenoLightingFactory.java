
public class HalogenoLightingFactory implements AbstractLightingFactory {

	BombillaHalogeno bombillaHalogeno = new BombillaHalogeno();
	PanelHalogeno panelHalogeno = new PanelHalogeno();
	
	public void CreateBombilla() {
		bombillaHalogeno.GetBombilla(); 
	}
	
	public void CreatePanel() {
		panelHalogeno.GetPanel();
	} 
}
