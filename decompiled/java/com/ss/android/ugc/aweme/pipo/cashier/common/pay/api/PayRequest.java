package com.ss.android.ugc.aweme.pipo.cashier.common.pay.api;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.CBIPricingPlanMarketingTool;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.PayRequestPaymentDetailItem;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class PayRequest {

    @C09CT("amount")
    public final String amount;

    @C09CT("charge_id")
    public final String chargeId;

    @C09CT("commute_type")
    public final Integer commuteType;

    @C09CT("configuration")
    public final Configuration configuration;

    @C09CT("currency")
    public final String currency;

    @C09CT("marketing_info_list")
    public final List<CBIPricingPlanMarketingTool> marketingInfoList;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("merchant_user_id")
    public final String merchantUserId;

    @C09CT("payment_consult")
    public final String paymentConsult;

    @C09CT("payment_details")
    public final List<PayRequestPaymentDetailItem> paymentDetailItems;

    @C09CT("payment_reference")
    public final String paymentReference;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("return_link")
    public final String returnLink;

    @C09CT("risk_info")
    public final String riskInfo;

    @C09CT("store_payment_method")
    public final boolean storePaymentMethod;

    public PayRequest(String str, String str2, String str3, String str4, String str5, String str6, List<PayRequestPaymentDetailItem> list, boolean z, String str7, String str8, Integer num, Configuration configuration, List<CBIPricingPlanMarketingTool> list2, String str9, String str10) {
        this.merchantId = str;
        this.merchantUserId = str2;
        this.chargeId = str3;
        this.paymentReference = str4;
        this.amount = str5;
        this.currency = str6;
        this.paymentDetailItems = list;
        this.storePaymentMethod = z;
        this.returnLink = str7;
        this.riskInfo = str8;
        this.commuteType = num;
        this.configuration = configuration;
        this.marketingInfoList = list2;
        this.paymentConsult = str9;
        this.pipoErrorCodeParams = str10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PayRequest(String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, String str7, String str8, Integer num, Configuration configuration, List list2, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String strSubstring = str3;
        String str11 = str9;
        List list3 = list;
        List list4 = list2;
        if ((i & 4) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append(UUID.randomUUID());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strSubstring = strLIZIZ.substring(0, Math.min(50, strLIZIZ.length()));
        }
        this(str, str2, strSubstring, str4, str5, str6, (i & 64) != 0 ? null : list3, z, str7, str8, num, configuration, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list4, (i & 8192) != 0 ? null : str11, (i & 16384) == 0 ? str10 : null);
    }
}
