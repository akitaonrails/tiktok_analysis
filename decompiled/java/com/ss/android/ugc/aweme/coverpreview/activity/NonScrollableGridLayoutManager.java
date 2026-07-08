package com.ss.android.ugc.aweme.coverpreview.activity;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes5.dex */
public final class NonScrollableGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    public NonScrollableGridLayoutManager(Context context) {
        super(context, 3);
    }
}
