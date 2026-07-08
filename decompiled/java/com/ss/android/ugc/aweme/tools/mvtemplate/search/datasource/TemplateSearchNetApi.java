package com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;

/* JADX INFO: loaded from: classes23.dex */
public interface TemplateSearchNetApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/search/asset_trending_list/")
    Object fetchTemplateSearchTrendingList(@InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("asset_search_type") int i2, @InterfaceC1501050pAF("access_key") String str, @InterfaceC1501050pAF("feature_list") String str2, @InterfaceC1501050pAF("feature_codes") String str3, @InterfaceC1501050pAF("protocol_version") String str4, InterfaceC1364105Vn<? super TemplateSearchTrendingListResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/search/asset/")
    Object searchTemplates(@InterfaceC1501050pAF("keyword") String str, @InterfaceC1501050pAF("offset") int i, @InterfaceC1501050pAF("count") int i2, @InterfaceC1501050pAF("search_source") String str2, @InterfaceC1501050pAF("asset_search_type") int i3, @InterfaceC1501050pAF("access_key") String str3, @InterfaceC1501050pAF("feature_list") String str4, @InterfaceC1501050pAF("feature_codes") String str5, @InterfaceC1501050pAF("protocol_version") String str6, @InterfaceC1501050pAF("search_id") String str7, InterfaceC1364105Vn<? super TemplateSearchResultResponse> interfaceC1364105Vn);
}
