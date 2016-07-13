package tdd.vendingMachine;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private Display display;

    private List<Shelve> shelves = new ArrayList<>(ShelveNumber.values().length);
    private Shelve selectedShelve;

    public VendingMachine(Display display) {
        this.display = display;
        for (int i = 0; i < ShelveNumber.values().length; i++) {
            shelves.add(new Shelve());
        }
    }

    public Shelve selectShelve(ShelveNumber shelveNumber) {
        selectedShelve = shelves.get(shelveNumber.ordinal());

        String msg = Display.EMPTY_SHELVE_MSG;
        if (!selectedShelve.isEmpty()) {
            msg = selectedShelve.getProduct().getPrice().toString();
        }

        display.display(msg);
        return selectedShelve;
    }

    public void load(ShelveNumber shelveNumber, Product product, int count) {
        Shelve shelve = shelves.get(shelveNumber.ordinal());
        shelve.load(product, count);
    }
}
