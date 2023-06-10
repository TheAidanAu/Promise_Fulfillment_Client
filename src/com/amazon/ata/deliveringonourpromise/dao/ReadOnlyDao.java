package com.amazon.ata.deliveringonourpromise.dao;

/**
 * @param <I> tag
 * @param <O> tag
 */

public interface ReadOnlyDao<I, O> {

    /**
     * Get object method to be implemented.
     * @param orderId Order Id
     * @return Object abstracted object
     */
    O get(I orderId);
}
