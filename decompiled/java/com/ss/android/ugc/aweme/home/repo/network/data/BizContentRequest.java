package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BizContentRequest {

    @C09CT("cashier_type")
    public final String cashierType;

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("merchant_control_info")
    public final MerchantControlInfo controlInfo;

    @C09CT("country_or_region")
    public final String countryOrRegion;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("modules")
    public final List<String> modules;

    @C09CT("pc_product_code")
    public final String pcProductCode;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("user_type")
    public final String userType;

    public BizContentRequest() {
        this(null, null, null, null, null, null, null, null, null, new Configuration(null, null, null, null, null, null, null, 127, null));
    }

    public BizContentRequest(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, MerchantControlInfo merchantControlInfo, String str7, Configuration configuration) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.countryOrRegion = str3;
        this.cashierType = str4;
        this.modules = list;
        this.userType = str5;
        this.pcProductCode = str6;
        this.controlInfo = merchantControlInfo;
        this.riskInfo = str7;
        this.configuration = configuration;
    }
}
