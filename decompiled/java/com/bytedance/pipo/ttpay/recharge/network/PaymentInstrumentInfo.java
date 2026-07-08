package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class PaymentInstrumentInfo implements Serializable {

    @C09CT("card_bin6")
    public final String cardBin6;

    @C09CT("card_bin8")
    public final String cardBin8;

    @C09CT("detail_id")
    public final String detailId;

    @C09CT("detail_type")
    public final Integer detailType;

    @C09CT("display_raw_name")
    public final String displayRawName;

    @C09CT("element_info")
    public final String elementInfo;

    @C09CT("instrument_id")
    public final String instrumentId;

    @C09CT("integration_method")
    public final String integrationMethod;

    @C09CT("mask_identity")
    public final String maskIdentity;

    public PaymentInstrumentInfo() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public PaymentInstrumentInfo(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.detailId = str;
        this.detailType = num;
        this.instrumentId = str2;
        this.elementInfo = str3;
        this.maskIdentity = str4;
        this.cardBin6 = str5;
        this.cardBin8 = str6;
        this.integrationMethod = str7;
        this.displayRawName = str8;
    }
}
