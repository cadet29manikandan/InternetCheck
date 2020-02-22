package com.krm.internetcheck.observing.error;

import android.util.Log;

import com.jakewharton.nopen.annotation.Open;

import static com.krm.internetcheck.ConnectivityCheck.LOG_TAG;

@Open
public class DefaultErrorHandler implements ErrorHandler {
    @Override
    public void handleError(final Exception exception, final String message) {
        Log.e(LOG_TAG, message, exception);
    }
}
