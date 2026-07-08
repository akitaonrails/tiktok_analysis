package com.ss.android.ugc.aweme.search.widget.core.repo;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.search.widget.core.model.SearchWidgetModel;

/* JADX INFO: loaded from: classes3.dex */
public interface ISearchWidgetApi {
    @InterfaceC1501160pAQ("/aweme/v1/search/widget/suggest/guide/")
    C0X9S<SearchWidgetModel> getSearchWidget(@InterfaceC1501070pAH("req_source") String str, @InterfaceC1501070pAH("is_non_personalized_search") Integer num);
}
