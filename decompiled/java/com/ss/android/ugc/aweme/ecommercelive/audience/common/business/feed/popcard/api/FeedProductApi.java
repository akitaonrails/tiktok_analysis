package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.api;

import X.C0X52;
import X.C183J;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes33.dex */
public interface FeedProductApi {
    public static final C183J LIZ = C183J.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/live/product/preview")
    Object getProduct(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("traffic_source_list") String str2, @InterfaceC1501070pAH("recommend_info") String str3, @InterfaceC1501070pAH("use_new_promotion") int i, @InterfaceC1501070pAH("is_go_live_card_target_room") Boolean bool, @InterfaceC1501070pAH("go_live_card_fc_endtime") Long l, InterfaceC1364105Vn<? super C0X52<BaseResponse<FeedProductResp>>> interfaceC1364105Vn);
}
