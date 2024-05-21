
public class ProcessDocFile extends AbstractProcessFile 
{

	public void Initialization(String FileName, String Email) 
	{
		OpenFile(FileName); 
		ReadFileData(FileName); 
		EXtractFile(); 
		ParseFileData(); 
		ValidateData();
		ProccessData();
		CreateInvoice();
		SendInvoice(Email);
		CloseFile(); 
		
	}
	
	public void OpenFile(String FileName) {
		 System.out.println("Abrir Archivo :" + FileName);
	}
	
	
	public void ReadFileData(String FileName) {
		 System.out.println("Leemos la data del archivo :" + FileName);
	}
	
	
	public void EXtractFile() {
		 System.out.println("¡Extraemos la data!");
	}
	
	
	public void ParseFileData() {
		 System.out.println("¡Formateamos la data!");
	}
	
	
	public void CloseFile() {
		 System.out.println("¡Archivo Cerrado!");
	}
	
}
