
public class CertificadoPrototype implements ICertificado {

	private String JornadaVotacion;
	private String Mesa;
	private String Fecha;
	
	public CertificadoPrototype() {
		Fecha = "2024"; 
	}
	
	@Override
	public ICertificado clonar() {
		CertificadoPrototype certificado = null;
		
		try 
		{
			certificado = (CertificadoPrototype) clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}  
		 
		return certificado;
	}
	
	
	public void SetJornadaVotacion(String nombreJornada) {
		this.JornadaVotacion = nombreJornada;
	}
	
	public void SetMesaVotacion(String mesa) {
		this.Mesa = mesa;
	}
	
	public void GetCertificado() {
		System.out.println("Certificado Jornada de Votación");
		System.out.println("Jornada: " + this.JornadaVotacion  );
		System.out.println("Fecha:" + this.Fecha  );
		System.out.println("Mesa de votacion:" + this.Mesa  );
	}
}
