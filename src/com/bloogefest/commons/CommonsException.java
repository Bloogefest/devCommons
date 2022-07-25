package com.bloogefest.commons;

/**
 * Abstract exception class of the dev framework.
 *
 * @author Bloogefest
 * @since 1.0
 */
public abstract class CommonsException extends RuntimeException {
    protected CommonsException(final String msg,
                               final Throwable cause,
                               final boolean suppression,
                               final boolean writable) {
        super(msg, cause, suppression, writable);
    }

    protected CommonsException(final String msg,
                               final Throwable cause) {
        super(msg, cause);
    }

    protected CommonsException(final Throwable cause) {
        super(cause);
    }

    protected CommonsException(final String msg) {
        super(msg);
    }

    protected CommonsException() {}
}
