package com.ss.android.ugc.aweme.ecommerce.base.oneclickpay;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CombinationPaymentMethodInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("payment_card_num")
    public final String paymentCardNum;

    @C09CT("payment_card_url")
    public final String paymentCardUrl;

    @C09CT("payment_card_url_dark")
    public final String paymentCardUrlDark;

    @C09CT("pmid")
    public final String paymentId;

    @C09CT("payment_method_text")
    public final String paymentMethodText;

    @C09CT("payment_token")
    public final String paymentToken;

    public CombinationPaymentMethodInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.paymentId = str;
        this.paymentToken = str2;
        this.paymentCardUrl = str3;
        this.paymentCardUrlDark = str4;
        this.paymentMethodText = str5;
        this.paymentCardNum = str6;
    }
}
