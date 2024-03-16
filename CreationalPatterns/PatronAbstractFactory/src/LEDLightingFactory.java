
public class LEDLightingFactory implements AbstractLightingFactory {

	BombillaLED bombillaLED = new BombillaLED();
	PanelLED panelLED = new PanelLED();
	
	public void CreateBombilla() {
		bombillaLED.GetBombilla(); 
	}
	
	public void CreatePanel() {
		panelLED.GetPanel();
	} 
}
