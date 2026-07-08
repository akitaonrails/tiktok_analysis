package com.bytedance.android.livesdk.feed.drawerfeed.search.api;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174708fZ;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface ILiveSearchApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C11NZ<LiveSearchSugResponse> getSugList(@InterfaceC2174708fZ String str, @InterfaceC1501050pAF("keyword") String str2, @InterfaceC1501050pAF("source") String str3, @InterfaceC1501050pAF("history_list") String str4, @InterfaceC1501050pAF("count") Integer num);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR
    C11NZ<LiveSearchResponse> searchLiveList(@InterfaceC2174708fZ String str, @InterfaceC1501050pAF("offset") long j, @InterfaceC1501050pAF("keyword") String str2, @InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("search_source") String str3, @InterfaceC1501050pAF("enter_from") String str4, @InterfaceC1501050pAF("search_id") String str5, @InterfaceC1501050pAF("source") String str6);
}
