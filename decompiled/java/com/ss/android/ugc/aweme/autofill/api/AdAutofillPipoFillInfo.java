package com.ss.android.ugc.aweme.autofill.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdAutofillPipoFillInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("cardNumber")
    public final String cardNumber;

    @C09CT("firstName")
    public String firstName;

    @C09CT("holderName")
    public String holderName;

    @C09CT("lastName")
    public String lastName;

    public AdAutofillPipoFillInfo() {
        this(null, null, null, null);
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setHolderName(String str) {
        this.holderName = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public AdAutofillPipoFillInfo(String str, String str2, String str3, String str4) {
        this.cardNumber = str;
        this.holderName = str2;
        this.firstName = str3;
        this.lastName = str4;
    }
}
