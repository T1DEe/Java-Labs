package belstu.markovsky;

import belstu.markovsky.car.*;

import belstu.markovsky.enums.WheelDrive;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class SaxParser  {

    public static ArrayList<Car> cars = new ArrayList<>();


    public static class AdvancedXMLHandler extends DefaultHandler {
        private String lastElementName;

        private String manufacturer;
        private int length;
        private int weight;
        private WheelDrive wheelDrive;
        private int fuelConsum;
        private int maxSpeed;
        private int price;

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            lastElementName = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String information = new String(ch, start, length);

            information = information.replace("\n", "").trim();

            if (!information.isEmpty()) {
                if (lastElementName.equals("manufacturer"))
                    manufacturer = information;
                if (lastElementName.equals("length"))
                    this.length = Integer.parseInt(information);
                if (lastElementName.equals("weight"))
                    weight = Integer.parseInt(information);
                if (lastElementName.equals("wheelDrive"))
                    wheelDrive = WheelDrive.values()[Integer.parseInt(information)];
                if (lastElementName.equals("fuelConsum"))
                    fuelConsum = Integer.parseInt(information);
                if (lastElementName.equals("maxSpeed"))
                    maxSpeed = Integer.parseInt(information);
                if (lastElementName.equals("price"))
                    price = Integer.parseInt(information);
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if ( manufacturer != null && length != 0 && weight != 0 && wheelDrive != null && fuelConsum != 0 && maxSpeed != 0 && price != 0) {
                try {
                    cars.add(new CarLite(manufacturer, length, weight, wheelDrive, maxSpeed, fuelConsum, price, 35000));
                }
                catch (Exception exc) {
                    System.out.println(exc.getMessage());
                }
                manufacturer = null;
                length = 0;
                weight = 0;
                wheelDrive = null;
                fuelConsum = 0;
                maxSpeed = 0;
                price = 0;
            }
        }
    }
}
