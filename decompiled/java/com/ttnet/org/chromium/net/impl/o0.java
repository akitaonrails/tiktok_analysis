package com.ttnet.org.chromium.net.impl;

import X.AbstractC1497710p4r;
import X.AbstractC1497750p4v;

/* JADX INFO: loaded from: classes24.dex */
public final class o0 extends AbstractC1497750p4v {
    public final int LL;
    public final NetworkExceptionImpl LLILLJJLI;

    @Override // X.AbstractC1497710p4r
    public int getCronetInternalErrorCode() {
        return this.LLILLJJLI.getCronetInternalErrorCode();
    }

    @Override // X.AbstractC1497710p4r
    public int getErrorCode() {
        return this.LLILLJJLI.getErrorCode();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI.getMessage() + ", QuicDetailedErrorCode=" + this.LL;
    }

    @Override // X.AbstractC1497710p4r
    public boolean immediatelyRetryable() {
        return this.LLILLJJLI.immediatelyRetryable();
    }

    @Override // X.AbstractC1497750p4v
    public int getQuicDetailedErrorCode() {
        return this.LL;
    }

    public o0(final String str, int i, int i2, int i3) {
        new AbstractC1497710p4r(str) { // from class: X.0p4v
            public abstract int getQuicDetailedErrorCode();
        };
        this.LLILLJJLI = new NetworkExceptionImpl(str, i, i2);
        this.LL = i3;
    }
}
