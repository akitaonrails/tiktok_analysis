package com.ss.android.socialbase.downloader.exception;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadHttpException extends BaseException {
    public final int httpStatusCode;

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DownloadHttpException(int i, int i2, String str) {
        super(i, str);
        this.httpStatusCode = i2;
    }
}
