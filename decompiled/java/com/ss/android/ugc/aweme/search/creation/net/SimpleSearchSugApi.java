package com.ss.android.ugc.aweme.search.creation.net;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;

/* JADX INFO: loaded from: classes23.dex */
public interface SimpleSearchSugApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/search/sug/")
    Object fetchSug(@InterfaceC1501050pAF("keyword") String str, @InterfaceC1501050pAF("source") String str2, @InterfaceC1501050pAF("count") Integer num, @InterfaceC1501050pAF("request_order") Long l, @InterfaceC1501050pAF("new_sug_session_id") String str3, InterfaceC1364105Vn<? super SearchSugResponse> interfaceC1364105Vn);
}
