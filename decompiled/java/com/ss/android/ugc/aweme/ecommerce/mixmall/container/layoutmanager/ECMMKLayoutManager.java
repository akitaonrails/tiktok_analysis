package com.ss.android.ugc.aweme.ecommerce.mixmall.container.layoutmanager;

import X.C1326250kcJ;
import X.C1326580kcq;
import X.C1773640wFu;
import X.C21673319rv;
import X.C21673919s1;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class ECMMKLayoutManager extends StaggeredGridLayoutManager {
    public final C1773640wFu LLJJJJLIIL;
    public final float LLJJL;

    public ECMMKLayoutManager(C1773640wFu c1773640wFu) {
        super(2, 1);
        this.LLJJJJLIIL = c1773640wFu;
        this.LLJJL = 25.0f;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        if (C1326580kcq.LIZ()) {
            C1326250kcJ.LIZIZ().LIZJ("layout_completed", "ECMMKLayoutManager onLayoutCompleted");
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (C1326580kcq.LIZ()) {
            C1326250kcJ.LIZIZ().LIZJ("layout_children", "ECMMKLayoutManager before onLayoutChildren");
        }
        LJJIJ(c21673319rv, c21673919s1, true);
        if (C1326580kcq.LIZ()) {
            C1326250kcJ.LIZIZ().LIZJ("layout_children", "ECMMKLayoutManager after onLayoutChildren");
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        Float fValueOf;
        int iComputeScrollOffset = computeScrollOffset(c21673919s1);
        int iComputeScrollRange = computeScrollRange(c21673919s1) - computeScrollExtent(c21673919s1);
        if (iComputeScrollOffset + i > iComputeScrollRange) {
            i = iComputeScrollRange - iComputeScrollOffset;
            if (this.LLJJJJLIIL.getStickyView() != null) {
                View stickyView = this.LLJJJJLIIL.getStickyView();
                if (stickyView != null) {
                    fValueOf = Float.valueOf(stickyView.getTranslationY());
                } else {
                    fValueOf = null;
                }
                if (Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                    i--;
                }
            }
        }
        return scrollBy(i, c21673319rv, c21673919s1);
    }
}
