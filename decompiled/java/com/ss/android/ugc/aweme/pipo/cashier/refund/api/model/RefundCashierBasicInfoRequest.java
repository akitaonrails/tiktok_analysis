package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundCashierBasicInfoRequest {

    @C09CT("cashier_refund_info")
    public final RefundCashierOrderInfo cashierRefundInfo;

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

    @C09CT("user_type")
    public final String userType;

    public RefundCashierBasicInfoRequest(String str, String str2, String str3, String str4, List<String> list, String str5, Configuration configuration, RefundCashierOrderInfo refundCashierOrderInfo) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.userType = str3;
        this.cashierType = str4;
        this.modules = list;
        this.countryOrRegion = str5;
        this.configuration = configuration;
        this.cashierRefundInfo = refundCashierOrderInfo;
    }
}
