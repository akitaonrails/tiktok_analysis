package com.ss.android.ugc.aweme.search.pages.result.nimble.repo;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.search.pages.result.nimble.model.GetSearchSettingsResponse;

/* JADX INFO: loaded from: classes11.dex */
public interface SearchNimbleCardApi {
    @InterfaceC1501200pAU("/aweme/v1/search/settings/")
    Object getSearchSettings(@InterfaceC1501070pAH("keys") String str, @InterfaceC1501070pAH("layout_conf_attr") String str2, InterfaceC1364105Vn<? super GetSearchSettingsResponse> interfaceC1364105Vn);
}
