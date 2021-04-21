package oop.inheritance.core;

import oop.inheritance.ingenico.IngenicoPrinter;

     public class TPVFactory {
    public TPVDisplay getDisplayInstance(){
        return new IngenicoPrinter();

    }
}
