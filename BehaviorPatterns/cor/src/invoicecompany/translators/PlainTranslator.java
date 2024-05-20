package invoicecompany.translators;

import invoicecompany.Document;
import invoicecompany.Translator;

public class PlainTranslator implements Translator {

	private Translator nextTranslator;

	@Override
	public void setNextTranslator(Translator translator) {
		this.nextTranslator = translator;
	}

	@Override
	public void translate(Document document) {
		if (document.equals(Document.PLAIN)) {
			System.out.println("Translate PLAIN Document to XML DIAN finished.");
		} else {
			nextTranslator.translate(document);
		}

	}

}
