package oop.inheritance.core2;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;


public class TPVFactory2 {
    private TPVDisplay2 tpvDisplay2;

    public TPVDisplay2 getDisplayInstance(SupportedTerminal supportedTerminal) {
        {
            if (supportedTerminal == SupportedTerminal.INGENICO) {
                return new IngenicoDisplay();
            } else {
                return new VerifoneV240mDisplay();


            }
        }
    }
}
