package com.ss.android.ugc.aweme.account.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class VerificationMethod {

    @C09CT("type")
    public final VerificationMethodType type;

    @C09CT("verification_details")
    public final VerificationDetails verificationDetails;

    public VerificationMethod(VerificationMethodType verificationMethodType, VerificationDetails verificationDetails) {
        this.type = verificationMethodType;
        this.verificationDetails = verificationDetails;
    }
}
