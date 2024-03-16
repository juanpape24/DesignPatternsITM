 import java.lang.Cloneable;
 
public interface ICertificado extends Cloneable  {
	
	ICertificado clonar();
	void SetJornadaVotacion(String nombreJornada);
	void SetMesaVotacion(String mesa);
	void GetCertificado();
}
