package patronAdapter;

public class cliente {

	public static void main(String[] args) {
		 
		classNFS  classNFS = new classNFS();
		ClassSendDataCompany classSendDataCompany = new ClassSendDataCompany(classNFS);
		classSendDataCompany.SendFiles();
		
		AdaptadorFTP adaptadorFTP = new AdaptadorFTP();
		ObjEnviarArchivos objEnviarArchivos = new ObjEnviarArchivos(adaptadorFTP);
		objEnviarArchivos.GetFiles();
		objEnviarArchivos.SendFiles();

	}

}
