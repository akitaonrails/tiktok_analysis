package com.bytedance.apm.agent.instrumentation;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpInstrumentation {
    public static URLConnection openConnection(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpsURLConnection) {
            return new HttpsURLConnectionExtension((HttpsURLConnection) uRLConnection);
        }
        if (uRLConnection instanceof HttpURLConnection) {
            return new HttpURLConnectionExtension((HttpURLConnection) uRLConnection);
        }
        return uRLConnection;
    }

    public static URLConnection openConnectionWithProxy(URLConnection uRLConnection) {
        if (uRLConnection instanceof HttpsURLConnection) {
            return new HttpsURLConnectionExtension((HttpsURLConnection) uRLConnection);
        }
        if (uRLConnection instanceof HttpURLConnection) {
            return new HttpURLConnectionExtension((HttpURLConnection) uRLConnection);
        }
        return uRLConnection;
    }
}
