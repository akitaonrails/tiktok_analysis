package com.ss.android.ugc.aweme.pipo.cashier.lynx;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class LynxCashierData {

    @C09CT("cashier_str")
    public final String cashierStr;

    @C09CT("event_biz_params")
    public final String eventBizParamsStr;

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("theme")
    public final Integer theme;

    public LynxCashierData(String str, String str2, String str3, String str4, Integer num) {
        this.payRequestId = str;
        this.notificationId = str2;
        this.cashierStr = str3;
        this.eventBizParamsStr = str4;
        this.theme = num;
    }
}
