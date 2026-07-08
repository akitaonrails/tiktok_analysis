package com.ss.android.ugc.aweme.editeffect.search.middleware.result;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public interface EffectSearchResultNetApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/search/asset/")
    Object searchEffects(@InterfaceC1501050pAF("keyword") String str, @InterfaceC1501050pAF("offset") int i, @InterfaceC1501050pAF("count") int i2, @InterfaceC1501050pAF("search_source") String str2, @InterfaceC1501050pAF("search_id") String str3, @InterfaceC1501050pAF("asset_search_type") int i3, @InterfaceC1501050pAF("access_key") String str4, @InterfaceC1501050pAF("sdk_version") String str5, @InterfaceC1501050pAF("panel") String str6, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super EffectSearchResultResponse> interfaceC1364105Vn);
}
