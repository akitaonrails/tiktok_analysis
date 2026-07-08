package com.ss.android.ugc.aweme.views;

import X.AbstractC21673619ry;
import X.C20748216Gy;
import X.C21673319rv;
import X.C21673919s1;
import X.InterfaceC627000OiY;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;

/* JADX INFO: loaded from: classes32.dex */
public class WrapGridLayoutManager extends GridLayoutManager implements InterfaceC627000OiY {
    public AbstractC21673619ry LLJ;

    public WrapGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        super.onAdapterChanged(abstractC21673619ry, abstractC21673619ry2);
        this.LLJ = abstractC21673619ry2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.LLJ != null) {
                CrashlyticsWrapperService.LIZLLL().LIZIZ(this.LLJ.getClass().getName(), e2);
                WrapLinearLayoutManager.LJIIL(this.LLJ);
            }
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (this.LLJ != null) {
                CrashlyticsWrapperService.LIZLLL().LIZIZ(this.LLJ.getClass().getName(), e2);
                WrapLinearLayoutManager.LJIIL(this.LLJ);
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C20748216Gy c20748216Gy = new C20748216Gy(this, recyclerView.getContext(), 3);
        c20748216Gy.LIZ = i;
        startSmoothScroll(c20748216Gy);
    }

    public WrapGridLayoutManager(int i, int i2, Context context, boolean z) {
        super(i, i2, context, z);
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
