package com.ss.android.ugc.aweme.emoji.common.emojipagev2;

import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public WrapStaggeredGridLayoutManager() {
        super(3, 1);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            LJJIJ(c21673319rv, c21673919s1, true);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return scrollBy(i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
