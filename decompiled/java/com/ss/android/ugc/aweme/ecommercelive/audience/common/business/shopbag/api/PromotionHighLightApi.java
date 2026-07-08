package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.api;

import X.C612980O2m;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.HighlightData;

/* JADX INFO: loaded from: classes10.dex */
public interface PromotionHighLightApi {
    public static final C612980O2m LIZ = C612980O2m.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/live/promotion_highlight")
    Object getPromotionHighlightData(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("traffic_source_list") String str3, @InterfaceC1501070pAH("need_new_user_voucher") boolean z, @InterfaceC1501070pAH("request_for_voucher_bubble") boolean z2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, InterfaceC1364105Vn<? super BaseResponse<HighlightData>> interfaceC1364105Vn);
}
