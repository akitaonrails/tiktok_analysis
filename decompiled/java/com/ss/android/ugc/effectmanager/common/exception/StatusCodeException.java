package com.ss.android.ugc.effectmanager.common.exception;

/* JADX INFO: loaded from: classes26.dex */
public class StatusCodeException extends Exception {
    public int mStatusCode;

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }

    public StatusCodeException(int i, String str) {
        super(str);
        this.mStatusCode = i;
    }
}
