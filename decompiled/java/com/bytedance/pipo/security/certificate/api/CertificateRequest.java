package com.bytedance.pipo.security.certificate.api;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CertificateRequest {

    @C09CT("csr")
    public final String csrPem;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("muid")
    public final String merchantUserId;

    @C09CT("nonce")
    public final String nonce;

    public CertificateRequest() {
        this("", null, "", "");
    }

    public CertificateRequest(String str, String str2, String str3, String str4) {
        this.csrPem = str;
        this.nonce = str2;
        this.merchantUserId = str3;
        this.merchantId = str4;
    }
}
