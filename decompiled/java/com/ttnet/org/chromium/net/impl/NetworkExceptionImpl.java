package com.ttnet.org.chromium.net.impl;

import X.AbstractC1497710p4r;

/* JADX INFO: loaded from: classes24.dex */
public class NetworkExceptionImpl extends AbstractC1497710p4r {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final int mCronetInternalErrorCode;
    public final int mErrorCode;

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.mErrorCode);
        if (this.mCronetInternalErrorCode != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(this.mCronetInternalErrorCode);
        }
        sb.append(", Retryable=");
        sb.append(immediatelyRetryable());
        return sb.toString();
    }

    @Override // X.AbstractC1497710p4r
    public boolean immediatelyRetryable() {
        int i = this.mErrorCode;
        return i == 3 || i == 4 || i == 5 || i == 6 || i == 8;
    }

    @Override // X.AbstractC1497710p4r
    public int getCronetInternalErrorCode() {
        return this.mCronetInternalErrorCode;
    }

    @Override // X.AbstractC1497710p4r
    public int getErrorCode() {
        return this.mErrorCode;
    }

    public NetworkExceptionImpl(String str, int i, int i2) {
        super(str, null);
        this.mErrorCode = i;
        this.mCronetInternalErrorCode = i2;
    }
}
