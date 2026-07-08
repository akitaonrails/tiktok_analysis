package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.api;

import X.C1744040vUA;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.data.ECLivePlaybackPageResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface ECLivePlaybackApi {
    public static final C1744040vUA LIZ = C1744040vUA.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/content/customer/live_highlight_replay")
    Object getLiveHighlightReplay(@InterfaceC1501070pAH("product_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("room_id") String str3, @InterfaceC1501070pAH("enter_from_live_author_id") String str4, @InterfaceC1501070pAH("enter_from_live_room_id") String str5, @InterfaceC1501070pAH("need_latest_product_live_highlight") boolean z, @InterfaceC1501070pAH("enter_from_btm_code") String str6, @InterfaceC1501070pAH("enter_from_enter_from_btm_code") String str7, InterfaceC1364105Vn<? super BaseResponse<ECLivePlaybackPageResponse>> interfaceC1364105Vn);
}
