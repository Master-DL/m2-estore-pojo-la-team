package core.service;

import core.data.ItemInStock;
import core.data.Order;
import estorePojo.exceptions.InsufficientBalanceException;
import estorePojo.exceptions.UnknownAccountException;
import estorePojo.exceptions.UnknownItemException;

public interface IGestionInt {
    boolean isAvailable(Object item, int qty)
            throws UnknownItemException;

    void treatOrder(Order order, Object item, int qty)
            throws UnknownItemException;
}
