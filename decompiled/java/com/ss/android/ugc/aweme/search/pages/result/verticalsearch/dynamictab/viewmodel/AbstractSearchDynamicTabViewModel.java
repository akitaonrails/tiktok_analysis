package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.viewmodel;

import X.C647210Pa3;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractSearchDynamicTabViewModel<T> extends AssemViewModel<C647210Pa3<T>> {
    public abstract void vQ2(SearchRequestParam searchRequestParam);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C647210Pa3(0);
    }
}
