package n2exercise1;


import n2exercise1.Italy.ItalyAddress;

import n2exercise1.Italy.ItalyNumber;
import n2exercise1.Spain.SpainAddress;
import n2exercise1.Spain.SpainNumber;

import java.util.Arrays;
import java.util.List;


public class n2Main {
    public static void main(String[] args) {
        AbstractFactory spainFactory = FactoryProvider.getFactory("Spain");
        AbstractFactory italyFactory = FactoryProvider.getFactory("Italy");

        SpainAddress spainAdress = (SpainAddress) spainFactory.create("Address");
        SpainNumber spainNumber = (SpainNumber) spainFactory.create("Phone");

        ItalyAddress italyAddress = (ItalyAddress) italyFactory.create("Address");
        ItalyNumber italyNumber = (ItalyNumber) italyFactory.create("Phone");

        List<String> agenda = Arrays.asList(
          spainAdress.getAdress("Enric prat", 312, "08310"),
                italyNumber.getNumber(65839048)
        );

        System.out.println(agenda);





    }
}
