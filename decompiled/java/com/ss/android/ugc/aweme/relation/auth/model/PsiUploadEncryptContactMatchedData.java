package com.ss.android.ugc.aweme.relation.auth.model;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class PsiUploadEncryptContactMatchedData {

    @C09CT("phone_bits")
    public final String bloomFilterBitsBase64;

    @C09CT("email_bits")
    public final String bloomFilterBitsBase64Email;

    @C09CT("phone_k")
    public final long bloomFilterK;

    @C09CT("email_k")
    public final long bloomFilterKEmail;

    @C09CT("phone_m")
    public final long bloomFilterM;

    @C09CT("email_m")
    public final long bloomFilterMEmail;

    public PsiUploadEncryptContactMatchedData(String str, long j, long j2, String str2, long j3, long j4) {
        this.bloomFilterBitsBase64 = str;
        this.bloomFilterM = j;
        this.bloomFilterK = j2;
        this.bloomFilterBitsBase64Email = str2;
        this.bloomFilterMEmail = j3;
        this.bloomFilterKEmail = j4;
    }
}
