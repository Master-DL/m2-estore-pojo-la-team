package core.service;

import estorePojo.exceptions.UnknownItemException;

public interface IProvider {
    double getPrice(Object item) throws UnknownItemException;

    int order(Store store, Object item, int quantity) throws UnknownItemException;
}
