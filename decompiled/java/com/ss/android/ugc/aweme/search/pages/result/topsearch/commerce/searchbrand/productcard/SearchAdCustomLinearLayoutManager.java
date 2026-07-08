package com.ss.android.ugc.aweme.search.pages.result.topsearch.commerce.searchbrand.productcard;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdCustomLinearLayoutManager extends LinearLayoutManager {
    public boolean LL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.LL && super.canScrollHorizontally();
    }

    public SearchAdCustomLinearLayoutManager(Context context) {
        super(context, 0, false);
        this.LL = true;
    }
}
