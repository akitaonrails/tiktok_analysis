package com.ss.android.ugc.aweme.search.arch.v2.services;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public final class CommonAbilityImpl implements SearchServiceCenter$RecyclerViewAbility {
    public final RecyclerView LL;
    public final RecyclerView.LayoutManager LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$RecyclerViewAbility
    public final RecyclerView LLII() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$RecyclerViewAbility
    public final RecyclerView.LayoutManager xj0() {
        return this.LLILLJJLI;
    }

    public CommonAbilityImpl(RecyclerView recyclerView, RecyclerView.LayoutManager layoutManager) {
        this.LL = recyclerView;
        this.LLILLJJLI = layoutManager;
    }
}
