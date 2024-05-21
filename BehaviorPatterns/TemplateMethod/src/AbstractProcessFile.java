 
public abstract class AbstractProcessFile 
{
	public void ValidateData() {
		 System.out.println("¡Datos de la cuenta de cobro validados corectamente!");
	}
	
	public void ProccessData() {
		 System.out.println("¡Se procesan los datos!");
	}
	
	public void CreateInvoice() {
		 System.out.println("¡Factura creada!");
	}
	
	public void SendInvoice(String email) {
		 System.out.println("Email:"+email +"¡Factura enviada con exito!");
	}
}
