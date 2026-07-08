package com.bytedance.pipo.ttpay.recharge.network;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class CashierBasicInfoRequest implements Serializable {

    @C09CT("cashier_payment_info")
    public final CashierPaymentInfo cashierPaymentInfo;

    @C09CT("cashier_type")
    public final String cashierType;

    @C09CT("configuration")
    public final Configuration configuration;

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

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("product_code")
    public final String productCode;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("unified_pd_code")
    public final String unifiedPdCode;

    @C09CT("user_type")
    public final String userType;

    public CashierBasicInfoRequest() {
        this(null, null, null, null, null, null, null, null, new Configuration(null, null, null, null, null, null, null, null, null, null, 1023, null), null, null, null, null, null);
    }

    public final void setPipoErrorCodeParams(String str) {
        this.pipoErrorCodeParams = str;
    }

    public CashierBasicInfoRequest(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, CashierPaymentInfo cashierPaymentInfo, Configuration configuration, String str7, String str8, String str9, String str10, String str11) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.cashierType = str3;
        this.modules = list;
        this.countryOrRegion = str4;
        this.riskInfo = str5;
        this.pcProductCode = str6;
        this.cashierPaymentInfo = cashierPaymentInfo;
        this.configuration = configuration;
        this.userType = str7;
        this.pipoErrorCodeParams = str8;
        this.unifiedPdCode = str9;
        this.productCode = str10;
        this.scene = str11;
    }
}
