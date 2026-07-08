package com.ss.android.ugc.aweme.editeffect.search.middleware.trending;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes23.dex */
public interface EditEffectTrendingSearchApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/search/asset_trending_list/")
    Object fetchEditEffectSearchTrendingList(@InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("asset_search_type") int i2, @InterfaceC1501050pAF("access_key") String str, InterfaceC1364105Vn<? super EditEffectSearchTrendingListResponse> interfaceC1364105Vn);
}
