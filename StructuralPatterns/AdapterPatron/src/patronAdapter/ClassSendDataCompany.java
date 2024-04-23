package patronAdapter;

public class ClassSendDataCompany {
	classNFS classNFS;
	
	public ClassSendDataCompany(classNFS classNFS) 
	{		
		this.classNFS = classNFS;
	}
	 
	 public void SendFiles() {
		 classNFS.SendFiles();
	 }
	 
	 public void GetFiles() {
		 classNFS.GetFiles();
	 }
}
