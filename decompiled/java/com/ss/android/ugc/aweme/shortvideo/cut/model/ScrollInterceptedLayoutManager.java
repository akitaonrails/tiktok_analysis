package com.ss.android.ugc.aweme.shortvideo.cut.model;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes30.dex */
public final class ScrollInterceptedLayoutManager extends LinearLayoutManager {
    public boolean LL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return super.canScrollHorizontally() && this.LL;
    }

    public ScrollInterceptedLayoutManager(Context context) {
        super(context, 0, false);
        this.LL = true;
    }

    public ScrollInterceptedLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LL = true;
    }
}
