package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui;

import X.C0BH4;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;

/* JADX INFO: loaded from: classes11.dex */
public class SearchGridLayoutManager extends WrapGridLayoutManager {
    public Boolean LLJI;
    public RecyclerView LLJIJIL;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        Boolean bool = this.LLJI;
        return bool != null ? bool.booleanValue() : super.supportsPredictiveItemAnimations();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLJIJIL = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        Integer numValueOf;
        RecyclerView recyclerView = this.LLJIJIL;
        if (recyclerView != null) {
            numValueOf = Integer.valueOf(recyclerView.getPaddingTop());
        } else {
            numValueOf = null;
        }
        if (C0BH4.LIZ() && numValueOf != null && numValueOf.intValue() > 0 && i != 0) {
            scrollToPositionWithOffset(i, -1);
        } else {
            super.scrollToPosition(i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void scrollToPositionWithOffset(int i, int i2) {
        Integer numValueOf;
        RecyclerView recyclerView = this.LLJIJIL;
        if (recyclerView != null) {
            numValueOf = Integer.valueOf(recyclerView.getPaddingTop());
        } else {
            numValueOf = null;
        }
        if (C0BH4.LIZ() && numValueOf != null && i2 == 0 && numValueOf.intValue() > 0 && i != 0) {
            scrollToPositionWithOffset(i, -1);
        } else {
            super.scrollToPositionWithOffset(i, i2);
        }
    }

    public SearchGridLayoutManager(int i, int i2, Context context, boolean z) {
        super(i, i2, context, z);
    }
}
