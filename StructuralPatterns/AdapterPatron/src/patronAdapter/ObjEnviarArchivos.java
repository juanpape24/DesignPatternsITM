package patronAdapter;

public class ObjEnviarArchivos extends AdaptadorFTP {
	AdaptadorFTP  adaptadorFTP;
	
	public ObjEnviarArchivos(AdaptadorFTP adaptadorFTP) 
	{		
		this.adaptadorFTP = adaptadorFTP;
	}
	
	 public void SendFiles() {
		 adaptadorFTP.SendFiles();
	 }
	 
	 public void GetFiles() {
		 adaptadorFTP.GetFiles();
	 }
}
