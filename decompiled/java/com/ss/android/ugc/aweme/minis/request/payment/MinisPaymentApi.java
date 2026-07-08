package com.ss.android.ugc.aweme.minis.request.payment;

import X.C11NZ;
import X.C13LQ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.ss.android.ugc.aweme.minis.model.payment.MinisCreateOrderResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisGetBeanBalanceResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisGetRecommendTierInfoResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisGetTierInfoResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisPayResponse;
import com.ss.android.ugc.aweme.minis.model.payment.MinisQueryOrderResponse;
import java.util.Set;

/* JADX INFO: loaded from: classes35.dex */
public final class MinisPaymentApi {
    public static PaymentApi LIZ;
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"minis_drama_collection_id", "minis_short_drama_inner_feed_episode_num_uid", "video_id", "gip_task_id", "gip_task_name", "video_creator_id"});

    public interface PaymentApi {
        @InterfaceC1501170pAR("/tiktok/minis/trade_order/create/")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C11NZ<MinisCreateOrderResponse> createOrder(@InterfaceC1485405rg MinisCreateOrderRequest minisCreateOrderRequest);

        @InterfaceC1501160pAQ("/tiktok/minis/utility/get_beans_balance/")
        C11NZ<MinisGetBeanBalanceResponse> getBeanBalance(@InterfaceC1501070pAH("client_key") String str, @InterfaceC1501070pAH("token_type") String str2, @InterfaceC1501070pAH("flow_id") String str3, @InterfaceC1501070pAH("tracking_id") String str4, @InterfaceC1501070pAH("minis_stage") int i, @InterfaceC1501070pAH("is_debug_mode") boolean z);

        @InterfaceC1501160pAQ("/tiktok/minis/utility/get_recommended_tiers/")
        C11NZ<MinisGetRecommendTierInfoResponse> getRecommendTiers(@InterfaceC1501070pAH("trade_order_id") String str, @InterfaceC1501070pAH("client_key") String str2, @InterfaceC1501070pAH("flow_id") String str3, @InterfaceC1501070pAH("tracking_id") String str4, @InterfaceC1501070pAH("need_web_price") boolean z);

        @InterfaceC1501160pAQ("/tiktok/minis/utility/get_tier_infos/")
        C11NZ<MinisGetTierInfoResponse> getTierInfo(@InterfaceC1501070pAH("token_type") String str, @InterfaceC1501070pAH("tier_ids") String str2, @InterfaceC1501070pAH("flow_id") String str3, @InterfaceC1501070pAH("tracking_id") String str4, @InterfaceC1501070pAH("need_web_price") boolean z);

        @InterfaceC1501170pAR("/tiktok/minis/pay/")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C11NZ<MinisPayResponse> payBeans(@InterfaceC1485405rg MinisPayBeansRequest minisPayBeansRequest);

        @InterfaceC1501160pAQ("/tiktok/minis/trade_order/query/")
        C11NZ<MinisQueryOrderResponse> queryOrder(@InterfaceC1501070pAH("trade_order_id") String str, @InterfaceC1501070pAH("flow_id") String str2, @InterfaceC1501070pAH("tracking_id") String str3);
    }
}
