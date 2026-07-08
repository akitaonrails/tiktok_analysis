package com.ss.android.ugc.aweme.search.pages.result.photosearch.viewmodel;

import X.C23250099c;
import X.C644410PPj;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMix;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPhotoDynamicViewModel extends AbstractSearchDynamicTabViewModel<SearchMix> {
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel
    public final void vQ2(SearchRequestParam searchRequestParam) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C644410PPj(searchRequestParam, this, null), 3);
    }
}
