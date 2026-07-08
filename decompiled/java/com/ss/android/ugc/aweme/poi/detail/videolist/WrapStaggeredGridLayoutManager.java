package com.ss.android.ugc.aweme.poi.detail.videolist;

import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.router.util.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public WrapStaggeredGridLayoutManager(int i) {
        super(i, 1);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        try {
            super.onScrollStateChanged(i);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.e("WrapStaggeredGridLayoutManager", "meet a IndexOutOfBoundsException in onScrollStateChanged");
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            LJJIJ(c21673319rv, c21673919s1, true);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.e("WrapStaggeredGridLayoutManager", "meet a IndexOutOfBoundsException in onLayoutChildren");
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return scrollBy(i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.e("WrapStaggeredGridLayoutManager", "meet a IndexOutOfBoundsException in scrollVerticallyBy");
            return 0;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Logger.e("WrapStaggeredGridLayoutManager", "meet a NullPointerException in scrollVerticallyBy");
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
