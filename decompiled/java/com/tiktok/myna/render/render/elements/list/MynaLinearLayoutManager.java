package com.tiktok.myna.render.render.elements.list;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public final class MynaLinearLayoutManager extends LinearLayoutManager {
    public final int LL;
    public final boolean LLILLJJLI;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.LLILLJJLI ? this.LL == 0 ? new RecyclerView.LayoutParams(-2, -1) : new RecyclerView.LayoutParams(-1, -2) : super.generateDefaultLayoutParams();
    }

    public MynaLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, false);
        this.LL = i;
        this.LLILLJJLI = z;
    }
}
