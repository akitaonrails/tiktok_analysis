package com.ss.android.ugc.aweme.minis.request.payment;

import X.C11NZ;
import X.C1232800iBa;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCancelResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionChangeResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionCreateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionListResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionQueryResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisSubscriptionReactivateResponse;
import com.ss.android.ugc.aweme.minis.model.payment.subscription.TiktokMinisUtilityGetSubscriptionTierInfoResponse;

/* JADX INFO: loaded from: classes20.dex */
public interface IMinisSubscriptionApi {
    public static final C1232800iBa LIZ = C1232800iBa.LIZ;

    @InterfaceC1501170pAR("/tiktok/minis/subscription/cancel/")
    C11NZ<TiktokMinisSubscriptionCancelResponse> cancelSubscription(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("subscription_id") String str2, @InterfaceC1501070pAH("flow_id") String str3, @InterfaceC1501070pAH("tracking_id") String str4);

    @InterfaceC1501170pAR("/tiktok/minis/subscription/change/")
    C11NZ<TiktokMinisSubscriptionChangeResponse> changeSubscription(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("trade_order_id") String str2, @InterfaceC1501070pAH("pay_region") String str3, @InterfaceC1501070pAH("client_param") String str4, @InterfaceC1501070pAH("enter_from") String str5, @InterfaceC1501070pAH("flow_id") String str6, @InterfaceC1501070pAH("tracking_id") String str7, @InterfaceC1501070pAH("pay_type") String str8);

    @InterfaceC1501170pAR("/tiktok/minis/subscription/create/")
    C11NZ<TiktokMinisSubscriptionCreateResponse> createSubscription(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("trade_order_id") String str2, @InterfaceC1501070pAH("pay_region") String str3, @InterfaceC1501070pAH("client_param") String str4, @InterfaceC1501070pAH("enter_from") String str5, @InterfaceC1501070pAH("flow_id") String str6, @InterfaceC1501070pAH("tracking_id") String str7, @InterfaceC1501070pAH("req_id") String str8, @InterfaceC1501070pAH("creative_id") String str9, @InterfaceC1501070pAH("discount_rate") String str10, @InterfaceC1501070pAH("coupon_quote_token") String str11, @InterfaceC1501070pAH("pay_type") String str12, @InterfaceC1501070pAH("is_debug_mode") boolean z);

    @InterfaceC1501160pAQ("/tiktok/minis/subscription/list/")
    C11NZ<TiktokMinisSubscriptionListResponse> getSubscriptionList(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("flow_id") String str2, @InterfaceC1501070pAH("tracking_id") String str3);

    @InterfaceC1501160pAQ("/tiktok/minis/utility/get_subscription_tier_info/")
    C11NZ<TiktokMinisUtilityGetSubscriptionTierInfoResponse> getSubscriptionTierInfo(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("trade_order_id") String str2, @InterfaceC1501070pAH("flow_id") String str3, @InterfaceC1501070pAH("tracking_id") String str4, @InterfaceC1501070pAH("req_id") String str5, @InterfaceC1501070pAH("creative_id") String str6, @InterfaceC1501070pAH("discount_rate") String str7, @InterfaceC1501070pAH("is_debug_mode") boolean z);

    @InterfaceC1501160pAQ("/tiktok/minis/subscription/query/")
    C11NZ<TiktokMinisSubscriptionQueryResponse> querySubscriptionPayResult(@InterfaceC1501070pAH("trade_order_id") String str, @InterfaceC1501070pAH("flow_id") String str2, @InterfaceC1501070pAH("tracking_id") String str3);

    @InterfaceC1501170pAR("/tiktok/minis/subscription/reactivate/")
    C11NZ<TiktokMinisSubscriptionReactivateResponse> reactiveSubscription(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("trade_order_id") String str2, @InterfaceC1501070pAH("pay_region") String str3, @InterfaceC1501070pAH("client_param") String str4, @InterfaceC1501070pAH("enter_from") String str5, @InterfaceC1501070pAH("flow_id") String str6, @InterfaceC1501070pAH("tracking_id") String str7, @InterfaceC1501070pAH("pay_type") String str8, @InterfaceC1501070pAH("is_debug_mode") boolean z);
}
