package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class Amount implements Serializable {

    @C09CT("currency")
    public final String currency;

    @C09CT("showAmount")
    public final String showAmount;

    @C09CT("value")
    public final String value;

    public Amount(String str, String str2, String str3) {
        this.value = str;
        this.showAmount = str2;
        this.currency = str3;
    }
}
