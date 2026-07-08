package com.ss.android.ugc.effectmanager.common.download;

/* JADX INFO: loaded from: classes4.dex */
public final class DownloadException extends Exception {
    public static final Companion Companion = new Companion();
    public final int errorCode;

    public static final class Companion {
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public DownloadException(int i) {
        this.errorCode = i;
    }
}
