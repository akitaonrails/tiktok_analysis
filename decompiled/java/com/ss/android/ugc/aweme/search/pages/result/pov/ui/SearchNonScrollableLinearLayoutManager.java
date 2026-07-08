package com.ss.android.ugc.aweme.search.pages.result.pov.ui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNonScrollableLinearLayoutManager extends LinearLayoutManager {
    public SearchNonScrollableLinearLayoutManager() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    public SearchNonScrollableLinearLayoutManager(Context context) {
        super(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        super.scrollToPosition(0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void scrollToPositionWithOffset(int i, int i2) {
        super.scrollToPositionWithOffset(0, 0);
    }
}
