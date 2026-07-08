package com.bytedance.pipo.security.certificate.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CertificateResponse {

    @C09CT("cert")
    public final String certPem;

    @C09CT("error_code")
    public final String errorCode;

    @C09CT("error_msg")
    public final String errorMessage;

    @C09CT("expiry_time")
    public final long expiryTime;

    public CertificateResponse() {
        this("", 1L, null, null);
    }

    public CertificateResponse(String str, long j, String str2, String str3) {
        this.certPem = str;
        this.expiryTime = j;
        this.errorCode = str2;
        this.errorMessage = str3;
    }
}
