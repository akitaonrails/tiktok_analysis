package com.ss.android.ugc.aweme.autofill;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public class AdPaymentModel implements Serializable {

    @C09CT("cardNumber")
    public String cardNumber = "";

    @C09CT("expiryTime")
    public String expiryTime = "";

    @C09CT("cardType")
    public String cardType = "";

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getExpiryTime() {
        return this.expiryTime;
    }

    public final void setCardNumber(String str) {
        this.cardNumber = str;
    }

    public final void setCardType(String str) {
        this.cardType = str;
    }

    public final void setExpiryTime(String str) {
        this.expiryTime = str;
    }
}
