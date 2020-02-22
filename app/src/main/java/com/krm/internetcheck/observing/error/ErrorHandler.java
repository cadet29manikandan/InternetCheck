package com.krm.internetcheck.observing.error;

public interface ErrorHandler {
    void handleError(final Exception exception, final String message);
}
