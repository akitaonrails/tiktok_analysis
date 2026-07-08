package com.ss.android.ugc.aweme.account.model;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class VerificationDetails {

    @C09CT("account_id")
    public final String accountId;

    @C09CT("masked_account")
    public final String maskedAccount;

    public VerificationDetails(String str, String str2) {
        this.accountId = str;
        this.maskedAccount = str2;
    }
}
