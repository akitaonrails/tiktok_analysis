package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class BankCardDetail {

    @C09CT("card_organization")
    public final String cardOrganization;

    @C09CT("last_four")
    public final String lastFour;

    public BankCardDetail() {
        this(null, null);
    }

    public BankCardDetail(String str, String str2) {
        this.lastFour = str;
        this.cardOrganization = str2;
    }
}
