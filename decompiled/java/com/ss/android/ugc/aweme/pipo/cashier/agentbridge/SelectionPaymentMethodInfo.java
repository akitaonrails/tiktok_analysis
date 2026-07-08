package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SelectionPaymentMethodInfo {

    @C09CT("bank_card_detail_v2")
    public final SelectionBankCardDetail bankCardDetailV2;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("display_raw_name")
    public final String displayRawName;

    @C09CT("masked_identity")
    public final String maskedIdentity;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("payment_method_token")
    public final String paymentMethodToken;

    public SelectionPaymentMethodInfo() {
        this(null, null, null, null, null, null);
    }

    public SelectionPaymentMethodInfo(String str, String str2, String str3, String str4, String str5, SelectionBankCardDetail selectionBankCardDetail) {
        this.paymentMethodId = str;
        this.paymentMethodToken = str2;
        this.displayName = str3;
        this.displayRawName = str4;
        this.maskedIdentity = str5;
        this.bankCardDetailV2 = selectionBankCardDetail;
    }
}
