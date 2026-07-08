package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class AccountInfo implements Serializable {

    @C09CT("account_id")
    public final String accountId;

    @C09CT("account_type")
    public final String accountType;

    @C09CT("balance_amount")
    public final Amount balanceAmount;

    @C09CT("currency")
    public final String currency;

    @C09CT("entity_code")
    public final String entityCode;

    @C09CT("freeze_amount")
    public final Amount freezeAmount;

    public AccountInfo() {
        this(null, null, null, null, null, null);
    }

    public AccountInfo(String str, String str2, String str3, String str4, Amount amount, Amount amount2) {
        this.accountId = str;
        this.accountType = str2;
        this.currency = str3;
        this.entityCode = str4;
        this.balanceAmount = amount;
        this.freezeAmount = amount2;
    }
}
