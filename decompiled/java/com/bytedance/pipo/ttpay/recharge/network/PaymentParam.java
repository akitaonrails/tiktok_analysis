package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class PaymentParam implements Serializable {

    @C09CT("ParamName")
    public final String paramName;

    @C09CT("ParamValue")
    public final String paramValue;

    @C09CT("PaymentParamType")
    public final Integer paymentParamType;

    public PaymentParam() {
        this(null, null, null);
    }

    public PaymentParam(String str, String str2, Integer num) {
        this.paramName = str;
        this.paramValue = str2;
        this.paymentParamType = num;
    }
}
