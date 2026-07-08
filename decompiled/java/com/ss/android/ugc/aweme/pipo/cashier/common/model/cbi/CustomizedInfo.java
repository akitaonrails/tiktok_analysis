package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes27.dex */
public final class CustomizedInfo {

    @C09CT("ccdc_bind_type")
    public final Integer ccdcBindType;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("encode_key")
    public final String encodeKey;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_card_rules")
    public final ArrayList<CCDCBankCardRule> paymentCardRules;

    @C09CT("pipo_host")
    public final String pipoHost;

    @C09CT("recommend_info")
    public final RecInfo recInfo;

    @C09CT("session_id")
    public final String sessionId;

    public CustomizedInfo() {
        this(null, null, null, null, null, null, null, null, 0);
    }

    public CustomizedInfo(RecInfo recInfo, String str, String str2, String str3, String str4, ArrayList<CCDCBankCardRule> arrayList, String str5, String str6, Integer num) {
        this.recInfo = recInfo;
        this.pipoHost = str;
        this.merchantId = str2;
        this.merchantUserId = str3;
        this.encodeKey = str4;
        this.paymentCardRules = arrayList;
        this.sessionId = str5;
        this.countryOrRegion = str6;
        this.ccdcBindType = num;
    }
}
