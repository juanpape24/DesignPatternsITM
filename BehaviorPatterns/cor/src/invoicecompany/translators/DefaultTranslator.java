package invoicecompany.translators;

import invoicecompany.Document;
import invoicecompany.Translator;

public class DefaultTranslator implements Translator {

	private Translator nextTranslator;

	@Override
	public void setNextTranslator(Translator translator) {
		this.nextTranslator = translator;
	}

	@Override
	public void translate(Document document) {
		if (document.equals(Document.NOTFOUND)) {
			System.out.println("No translator found for the delivered document");
		} else {
			nextTranslator.translate(document);
		}

	}

}
