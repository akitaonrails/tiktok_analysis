package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.rv;

import X.C1697810uHb;
import X.C21673319rv;
import X.C21673919s1;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ScaleAndAlphaLinearLayoutManager extends LinearLayoutManager {
    public final void LJIIL() {
        float width = getWidth() / 2.0f;
        float f = 0.9f * width;
        int childCount = getChildCount();
        int i = -1;
        float fAbs = Float.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2) != null) {
                float decoratedLeft = width - ((getDecoratedLeft(r0) + getDecoratedRight(r0)) / 2.0f);
                if (Math.abs(decoratedLeft) < fAbs) {
                    fAbs = Math.abs(decoratedLeft);
                    i = i2;
                }
            }
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(i - 1), Integer.valueOf(i), Integer.valueOf(i + 1));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue >= 0 && iIntValue < getChildCount()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View childAt = getChildAt(((Number) it2.next()).intValue());
            if (childAt != null) {
                float fMin = Math.min(f, Math.abs(width - ((childAt.getLeft() + childAt.getRight()) / 2.0f))) - 0.0f;
                float f2 = f - 0.0f;
                float f3 = (((-0.100000024f) * fMin) / f2) + 1.0f;
                C786410Ut5.Ob(childAt, f3);
                C786410Ut5.pc(childAt, f3);
                C786410Ut5.T4(childAt, 1.0f + (((-0.5f) * fMin) / f2));
            }
        }
    }

    public ScaleAndAlphaLinearLayoutManager(Context context) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        super.onLayoutChildren(c21673319rv, c21673919s1);
        LJIIL();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int iScrollHorizontallyBy = super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
        LJIIL();
        return iScrollHorizontallyBy;
    }
}
