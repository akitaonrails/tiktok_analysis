package com.ss.android.ugc.effectmanager.common.exception;

/* JADX INFO: loaded from: classes26.dex */
public class NetException extends Exception {
    public int status_code;

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public NetException(int i, String str) {
        super(str);
        this.status_code = i;
    }
}
