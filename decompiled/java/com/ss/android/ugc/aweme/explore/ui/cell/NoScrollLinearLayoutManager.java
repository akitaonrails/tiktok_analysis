package com.ss.android.ugc.aweme.explore.ui.cell;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes32.dex */
public final class NoScrollLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    public NoScrollLinearLayoutManager(Context context) {
        super(context);
    }
}
