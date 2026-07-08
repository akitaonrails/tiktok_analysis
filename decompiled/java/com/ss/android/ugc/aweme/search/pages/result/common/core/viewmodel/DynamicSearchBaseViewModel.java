package com.ss.android.ugc.aweme.search.pages.result.common.core.viewmodel;

import X.C0PEM;
import X.C23250099c;
import X.C644440PPm;
import X.InterfaceC644450PPn;
import X.InterfaceC736910SvR;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DynamicSearchBaseViewModel extends AbstractSearchDynamicTabViewModel<n> {
    public abstract InterfaceC736910SvR<InterfaceC644450PPn> wQ2();

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel.AbstractSearchDynamicTabViewModel
    public void vQ2(SearchRequestParam searchRequestParam) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C644440PPm(this, searchRequestParam, null), 2);
    }
}
