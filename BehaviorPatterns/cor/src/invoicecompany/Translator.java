package invoicecompany;
public interface Translator {
	
	void setNextTranslator(Translator translator);
	void translate(Document document);

}
