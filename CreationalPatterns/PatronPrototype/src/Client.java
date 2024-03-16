
public class Client {

	public static void main(String[] args) {
		 
		//CERTIFICADO
		CertificadoPrototype certificado = new CertificadoPrototype();
		certificado.SetJornadaVotacion("Elecciones de Personero");
		certificado.SetMesaVotacion("12");
		certificado.GetCertificado();
		
		//CERTIFICADO CLONADO
		CertificadoPrototype certificadoClon = (CertificadoPrototype) certificado.clonar();				
		if(certificadoClon != null) {
			 System.out.println("¡***Certificado Clonado!***");
			 certificadoClon.SetMesaVotacion("18");
			 certificadoClon.GetCertificado();
		}  
		 
	}

}
