package invoicecompany.translators;

import invoicecompany.Document;
import invoicecompany.Translator;

public class XMLDIANTranslator implements Translator {

	private Translator nextTranslator;

	@Override
	public void setNextTranslator(Translator translator) {
		this.nextTranslator = translator;
	}

	@Override
	public void translate(Document document) {
		if (document.equals(Document.XMLDIAN)) {
			System.out.println("Does not require translation since it is already a DIAN XML document.");
		} else {
			nextTranslator.translate(document);
		}

	}

}
