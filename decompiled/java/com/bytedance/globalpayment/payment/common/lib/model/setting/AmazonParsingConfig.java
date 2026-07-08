package com.bytedance.globalpayment.payment.common.lib.model.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public class AmazonParsingConfig {

    @C09CT("currencyCode")
    public String currencyCode;

    @C09CT("decimalSeparator")
    public String decimalSeparator;

    @C09CT("expectedSymbol")
    public String expectedSymbol;

    public AmazonParsingConfig(String str, String str2, String str3) {
        this.currencyCode = str;
        this.decimalSeparator = str2;
        this.expectedSymbol = str3;
    }
}
