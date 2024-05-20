package invoicecompany;

import invoicecompany.translators.CsvTranslator;
import invoicecompany.translators.DefaultTranslator;
import invoicecompany.translators.JsonTranslator;
import invoicecompany.translators.PlainTranslator;
import invoicecompany.translators.XMLDIANTranslator;
import invoicecompany.translators.XMLTranslator;

public class Main {

	public static void main(String[] args) {
		Translator csvTranslator = new CsvTranslator();
		Translator jsonTranslator = new JsonTranslator();
		Translator plainTranslator = new PlainTranslator();
		Translator xmlTranslator = new XMLTranslator();
		Translator xmldianTranslator = new XMLDIANTranslator();
		Translator defaultTranslator = new DefaultTranslator();
		
		
		csvTranslator.setNextTranslator(jsonTranslator);
		jsonTranslator.setNextTranslator(plainTranslator);
		plainTranslator.setNextTranslator(xmlTranslator);
		xmlTranslator.setNextTranslator(xmldianTranslator);
		xmldianTranslator.setNextTranslator(defaultTranslator);
		
		Document csv = Document.CSV;
		Document json = Document.JSON;
		Document plain = Document.PLAIN;
		Document xml = Document.XML;
		Document xmldian = Document.XMLDIAN;
		Document notfound = Document.NOTFOUND;
		
		
		System.out.println("Arhivo a procesar: " + csv);
		csvTranslator.translate(csv);
		
		System.out.println("Arhivo a procesar: " + json);
		csvTranslator.translate(json);
		
		System.out.println("Arhivo a procesar: " + plain);
		csvTranslator.translate(plain);
		
		System.out.println("Arhivo a procesar: " + xml);
		csvTranslator.translate(xml);
		
		System.out.println("Arhivo a procesar: " + xmldian);
		csvTranslator.translate(xmldian);
		
		System.out.println("Arhivo a procesar: " + notfound);
		csvTranslator.translate(notfound);
	}

}
