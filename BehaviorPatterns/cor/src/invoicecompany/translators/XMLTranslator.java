package invoicecompany.translators;

import invoicecompany.Document;
import invoicecompany.Translator;

public class XMLTranslator implements Translator {

	private Translator nextTranslator;

	@Override
	public void setNextTranslator(Translator translator) {
		this.nextTranslator = translator;
	}

	@Override
	public void translate(Document document) {
		if (document.equals(Document.XML)) {
			System.out.println("Translate XML Document to XML DIAN finished.");
		} else {
			nextTranslator.translate(document);
		}

	}

}
