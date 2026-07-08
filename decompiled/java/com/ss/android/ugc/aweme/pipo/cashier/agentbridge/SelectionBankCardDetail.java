package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SelectionBankCardDetail {

    @C09CT("card_brand")
    public final String cardBrand;

    @C09CT("card_organization")
    public final String cardOrganization;

    @C09CT("last_four")
    public final String lastFour;

    public SelectionBankCardDetail() {
        this(null, null, null);
    }

    public SelectionBankCardDetail(String str, String str2, String str3) {
        this.lastFour = str;
        this.cardBrand = str2;
        this.cardOrganization = str3;
    }
}
