package invoicecompany.translators;

import invoicecompany.Document;
import invoicecompany.Translator;

public class CsvTranslator implements Translator {

	private Translator nextTranslator;

	@Override
	public void setNextTranslator(Translator translator) {
		this.nextTranslator = translator;
	}

	@Override
	public void translate(Document document) {
		if (document.equals(Document.CSV)) {
			System.out.println("Translate CSV Document to XML DIAN finished.");
		} else {
			nextTranslator.setNextTranslator(nextTranslator);
		}

	}

}
