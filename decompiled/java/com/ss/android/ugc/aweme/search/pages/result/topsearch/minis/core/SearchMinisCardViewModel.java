package com.ss.android.ugc.aweme.search.pages.result.topsearch.minis.core;

import X.C682740QqG;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchMinisItem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMinisCardViewModel extends AssemViewModel<C682740QqG> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        final int i = 0;
        return new InterfaceC0148002o(i) { // from class: X.0QqG
            public final List<SearchMinisItem> LL = C13BV.INSTANCE;
        };
    }
}
