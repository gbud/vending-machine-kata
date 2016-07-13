package tdd.vendingMachine;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SelectingShelveTest {

    @Test
    public void shouldDisplayProductPriceOnShelveSelection() {
        // given
        ShelveNumber shelveNumber = ShelveNumber.A2;
        Display display = new Display();
        VendingMachine machine = buildSampleMachine(shelveNumber, display);

        // when
        Shelve shelve = machine.selectShelve(shelveNumber);

        // then
        Assertions.assertThat(display.getMessage()).isEqualTo(shelve.getProduct().getPrice().toString());
    }

    @Test
    public void shouldDisplayEMPTYOnEmptyShelveSelection() {
        // given
        ShelveNumber shelveNumber = ShelveNumber.A2;
        Display display = new Display();
        VendingMachine machine = buildSampleMachine(shelveNumber, display);

        // when
        Shelve shelve = machine.selectShelve(ShelveNumber.A1);

        // then
        Assertions.assertThat(display.getMessage()).isEqualTo(Display.EMPTY_SHELVE_MSG);
    }

    // FIXME builder ?
    private VendingMachine buildSampleMachine(ShelveNumber shelveNumber, Display display) {
        VendingMachine machine = new VendingMachine(display);
        machine.load(shelveNumber, Product.COLA_025L, 10);
        return machine;
    }
}
