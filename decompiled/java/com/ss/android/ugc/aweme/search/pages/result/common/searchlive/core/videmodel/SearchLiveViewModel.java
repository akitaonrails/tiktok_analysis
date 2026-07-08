package com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.videmodel;

import X.C09YA;
import X.C0PEM;
import X.C23250099c;
import X.C647270Pa9;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLiveViewModel extends AbstractSearchDynamicTabViewModel<SearchLiveList> {
    public final C09YA LL = new C09YA(this, AFwS196S0000000_10.get$arr$(288));

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel
    public final void vQ2(SearchRequestParam searchRequestParam) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C647270Pa9(this, searchRequestParam, null), 2);
    }
}
