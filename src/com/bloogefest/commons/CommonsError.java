package com.bloogefest.commons;

/**
 * Abstract error class of the dev framework.
 *
 * @author Bloogefest
 * @since 1.0
 */
public abstract class CommonsError extends Error {
    protected CommonsError(final String msg,
                           final Throwable cause,
                           final boolean suppression,
                           final boolean writable) {
        super(msg, cause, suppression, writable);
    }

    protected CommonsError(final String msg,
                           final Throwable cause) {
        super(msg, cause);
    }

    protected CommonsError(final Throwable cause) {
        super(cause);
    }

    protected CommonsError(final String msg) {
        super(msg);
    }

    protected CommonsError() {}
}
