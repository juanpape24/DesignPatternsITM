package invoicecompany.translators;

import invoicecompany.Document;
import invoicecompany.Translator;

public class JsonTranslator implements Translator {

	private Translator nextTranslator;

	@Override
	public void setNextTranslator(Translator translator) {
		this.nextTranslator = translator;
	}

	@Override
	public void translate(Document document) {
		if (document.equals(Document.JSON)) {
			System.out.println("Translate JSON Document to XML DIAN finished.");
		} else {
			nextTranslator.translate(document);
		}

	}

}
