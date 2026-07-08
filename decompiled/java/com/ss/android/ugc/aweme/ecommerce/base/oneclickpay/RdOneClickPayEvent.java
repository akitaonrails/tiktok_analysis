package com.ss.android.ugc.aweme.ecommerce.base.oneclickpay;

import X.C09CT;
import X.C1018703yb;
import X.C1741890vQh;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class RdOneClickPayEvent {

    @C09CT("error_code")
    public final Integer errorCode;

    @C09CT("error_message")
    public final String errorMessage;

    @C09CT("last_main_order_id")
    public final String lastMainOrderId;

    @C09CT("last_payment_method_id")
    public final String lastPaymentMethodId;

    @C09CT("main_order_id")
    public final String mainOrderId;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("pay_result")
    public final Integer payResult;

    @C09CT("payment_method_id")
    public final String paymentMethodId;

    @C09CT("previous_page")
    public final String previousPage;

    @C09CT("reason")
    public final String reason;

    @C09CT("request_id")
    public final String requestId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public RdOneClickPayEvent() {
        this("unknown", "unknown", "unknown", "unknown", null, null, null, null, null, null, null, null);
    }

    public final void LIZ() {
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C1741890vQh.LJIIIIZZ(this));
        if (mapLJIIJ != null) {
            C1018703yb.LIZIZ("rd_tiktokec_one_click_pay_event", mapLJIIJ);
        }
    }

    public RdOneClickPayEvent(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10) {
        this.status = str;
        this.payRequestId = str2;
        this.lastPaymentMethodId = str3;
        this.lastMainOrderId = str4;
        this.paymentMethodId = str5;
        this.mainOrderId = str6;
        this.payResult = num;
        this.requestId = str7;
        this.reason = str8;
        this.errorCode = num2;
        this.errorMessage = str9;
        this.previousPage = str10;
    }
}
