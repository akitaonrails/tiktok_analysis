package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C09CT;
import X.C13BV;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PayinBasicInfoRequest {

    @C09CT("cashier_payment_info")
    public final PayinBasicInfoPaymentInfo cashierPaymentInfo;

    @C09CT("cashier_type")
    public final String cashierType;

    @C09CT("configuration")
    public final n configuration;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("modules")
    public final List<String> modules;

    @C09CT("risk_info")
    public final String riskInfo;

    public PayinBasicInfoRequest() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public PayinBasicInfoRequest(String str, String str2, String str3, List<String> list, String str4, String str5, n nVar, PayinBasicInfoPaymentInfo payinBasicInfoPaymentInfo) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.cashierType = str3;
        this.modules = list;
        this.countryOrRegion = str4;
        this.riskInfo = str5;
        this.configuration = nVar;
        this.cashierPaymentInfo = payinBasicInfoPaymentInfo;
    }

    public PayinBasicInfoRequest(String str, String str2, String str3, List list, String str4, String str5, n nVar, PayinBasicInfoPaymentInfo payinBasicInfoPaymentInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : nVar, (i & 128) != 0 ? new PayinBasicInfoPaymentInfo(null, null) : payinBasicInfoPaymentInfo);
    }
}
