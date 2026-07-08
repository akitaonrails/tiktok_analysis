package com.ss.android.ugc.aweme.ecommerce.arch;

import X.C15WR;
import X.C15WS;
import X.C20748216Gy;
import X.C21673319rv;
import X.C21673919s1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes32.dex */
public final class MixStickyLayoutManager extends StaggeredGridLayoutManager {
    public final C15WS LLJJJJLIIL;

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        try {
            super.onScrollStateChanged(i);
            this.LLJJJJLIIL.LIZ(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public MixStickyLayoutManager(int i, C15WR c15wr) {
        super(i, 1);
        this.LLJJJJLIIL = c15wr;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            LJJIJ(c21673319rv, c21673919s1, true);
            this.LLJJJJLIIL.LIZJ(c21673319rv, c21673919s1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            int iScrollBy = scrollBy(i, c21673319rv, c21673919s1);
            this.LLJJJJLIIL.LIZIZ(i, c21673319rv, c21673919s1);
            return iScrollBy;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C20748216Gy c20748216Gy = new C20748216Gy(this, recyclerView.getContext(), 2);
        c20748216Gy.LIZ = i;
        startSmoothScroll(c20748216Gy);
    }
}
