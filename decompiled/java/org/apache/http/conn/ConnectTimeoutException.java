package org.apache.http.conn;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes24.dex */
public class ConnectTimeoutException extends InterruptedIOException {
    public static final long serialVersionUID = -4816682903149535989L;

    public ConnectTimeoutException() {
    }

    public ConnectTimeoutException(String str) {
        super(str);
    }
}
