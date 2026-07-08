package com.ss.android.ugc.aweme.minis.request.payment;

import X.C1232820iBc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckEnablementListResponse;
import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface IMinisCouponApi {
    public static final C1232820iBc LIZ = C1232820iBc.LIZ;

    @InterfaceC1501170pAR("/tiktok/minis/monetization/check_enablement_list")
    Object checkEnablementList(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("req_id") String str2, @InterfaceC1501070pAH("creative_id") String str3, @InterfaceC1501070pAH("discount_rate") String str4, @InterfaceC1501070pAH("is_debug_mode") boolean z, InterfaceC1364105Vn<? super TiktokMinisMonetizationCheckEnablementListResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/minis/monetization/check_qcpx")
    Object checkQCPX(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("ttoclid") String str2, @InterfaceC1501070pAH("req_id") String str3, @InterfaceC1501070pAH("creative_id") String str4, @InterfaceC1501070pAH("discount_rate") String str5, @InterfaceC1501070pAH("is_debug_mode") boolean z, InterfaceC1364105Vn<? super TiktokMinisMonetizationCheckQcpxResponse> interfaceC1364105Vn);
}
