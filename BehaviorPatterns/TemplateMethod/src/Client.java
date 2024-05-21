
public class Client {

	public static void main(String[] args) {
		 
		System.out.println("---------------- Ejemplo Archivo DOC ------------");		
		ProcessDocFile DocFile = new ProcessDocFile();
		DocFile.Initialization("FileRemittance.Docx", "cliente@gmail.com");
		
		System.out.println("---------------- Ejemplo Archivo PDF ------------");
		ProcessDocFile PDFFile = new ProcessDocFile();
		PDFFile.Initialization("FileRemittance.pdf", "clienteGeneral@gmail.com");
		
		
		System.out.println("---------------- Ejemplo Archivo SVC ------------");
		ProcessDocFile CSVFile = new ProcessDocFile();
		CSVFile.Initialization("FileRemittance.csv", "Soportecliente@gmail.com");
	}

}
