package core.service;

import estorePojo.exceptions.UnknownItemException;

public interface IGestionExt {
    double getPrice(Object item) throws UnknownItemException;
}
