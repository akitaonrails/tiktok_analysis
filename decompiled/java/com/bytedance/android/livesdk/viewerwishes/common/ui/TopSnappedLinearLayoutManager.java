package com.bytedance.android.livesdk.viewerwishes.common.ui;

import X.C21673919s1;
import X.C21674119s3;
import X.C817403Hg;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes28.dex */
public final class TopSnappedLinearLayoutManager extends LinearLayoutManager {
    public boolean LL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.LL && super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LL && super.canScrollVertically();
    }

    public TopSnappedLinearLayoutManager(Context context) {
        super(context, 1, false);
        this.LL = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        int itemCount;
        final C817403Hg c817403Hg = new C817403Hg();
        c817403Hg.element = 120.0f;
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0yGU
            @Override // X.C21674119s3
            public final int LJIILL() {
                return -1;
            }

            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return c817403Hg.element / displayMetrics.densityDpi;
            }
        };
        if (recyclerView.getAdapter() != null && r0.getItemCount() - 1 >= 0) {
            c21674119s3.LIZ = Math.min(i, itemCount);
            startSmoothScroll(c21674119s3);
        }
    }
}
