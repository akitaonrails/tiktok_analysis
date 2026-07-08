package com.ss.android.ugc.aweme.widgetcompat;

import X.AbstractC21673619ry;
import X.C201955140j;
import X.C20748216Gy;
import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes32.dex */
public class WrapGridLayoutManager extends GridLayoutManager {
    public AbstractC21673619ry LLJ;

    public WrapGridLayoutManager(int i, Context context) {
        super(i, 1, context, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        super.onAdapterChanged(abstractC21673619ry, abstractC21673619ry2);
        this.LLJ = abstractC21673619ry2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.LLJ != null) {
                C201955140j.LJI("WrapGridLayoutManager.onLayoutChildren", e2);
                WrapLinearLayoutManager.LJIIL(this.LLJ);
            }
        }
    }

    public WrapGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.LLJ != null) {
                C201955140j.LJI(this.LLJ.getClass().getName(), e2);
                WrapLinearLayoutManager.LJIIL(this.LLJ);
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C20748216Gy c20748216Gy = new C20748216Gy(this, recyclerView.getContext(), 4);
        c20748216Gy.LIZ = i;
        startSmoothScroll(c20748216Gy);
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
