package com.ss.android.ugc.aweme.giftcard.checkout;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GiftcardNotifyInputInfo {

    @C09CT("input_type")
    public final String inputType;

    @C09CT("input_value")
    public final String inputValue;

    public GiftcardNotifyInputInfo() {
        this(null, null);
    }

    public GiftcardNotifyInputInfo(String str, String str2) {
        this.inputType = str;
        this.inputValue = str2;
    }
}
