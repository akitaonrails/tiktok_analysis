package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;
import X.C1707770uXf;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class PayRequestPaymentDetails {

    @C09CT("commute_type")
    public final Integer commuteType;

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("marketing_info_list")
    public final List<CBIPricingPlanMarketingTool> marketingInfoList;

    @C09CT("payment_consult")
    public final String paymentConsult;

    @C09CT("payment_details")
    public final List<PayRequestPaymentDetailItem> paymentDetailItems;

    @C09CT("return_link")
    public final String returnLink;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("store_payment_method")
    public final boolean storePM;

    public PayRequestPaymentDetails(List<PayRequestPaymentDetailItem> list, Configuration configuration, String str, String str2, boolean z, Integer num, String str3, List<CBIPricingPlanMarketingTool> list2, String str4) {
        this.paymentDetailItems = list;
        this.configuration = configuration;
        this.riskInfo = str;
        this.returnLink = str2;
        this.storePM = z;
        this.commuteType = num;
        this.marketingInfoList = list2;
        this.paymentConsult = str4;
    }

    public PayRequestPaymentDetails(List list, Configuration configuration, String str, String str2, boolean z, Integer num, String str3, List list2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        Configuration configuration2 = configuration;
        list = (i & 1) != 0 ? null : list;
        if ((i & 2) != 0) {
            if (C1707770uXf.LIZ()) {
                str5 = "true";
            } else {
                str5 = "false";
            }
            configuration2 = new Configuration(null, null, null, null, null, null, null, null, str5, Boolean.valueOf(C1707770uXf.LIZ()), 255, null);
        }
        this(list, configuration2, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : list2, (i & 256) == 0 ? str4 : null);
    }
}
