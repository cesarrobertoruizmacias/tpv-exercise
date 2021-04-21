package oop.inheritance.data;

import oop.inheritance.ingenico.IngenicoDisplay;
import oop.inheritance.verifone.v240m.VerifoneV240mDisplay;

public class FabricaDisplay {
    public InterfaceDisplay getDisplay(SupportedTerminal supportedT){
        if(supportedT == SupportedTerminal.INGENICO){
            return IngenicoDisplay.getInstance();
        }
        if(supportedT == SupportedTerminal.VERIFONE){
            return VerifoneV240mDisplay.getInstance();
        }
        else{
            return null;
        }
    }

}
