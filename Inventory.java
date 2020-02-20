import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    /**
     * @param guitars
     */
    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) { //
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList(); //
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //GuitarSpec  guitarSpec=guitar.getSpec();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }

        }
        return matchingGuitars;
    }
}
