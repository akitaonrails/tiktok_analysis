package com.ss.android.ugc.aweme.feed.survey.layoutmanager;

import X.C21673319rv;
import X.C21673919s1;
import X.C339190DRl;
import X.C786410Ut5;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class CoverLayoutManager extends RecyclerView.LayoutManager {
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i;
        detachAndScrapAttachedViews(c21673319rv);
        int itemCount = getItemCount();
        if (itemCount < 3) {
            i = 0;
        } else {
            i = itemCount - 3;
        }
        int i2 = (itemCount + i) / 2;
        while (i < i2) {
            LJIIL(c21673319rv, i, i2);
            i++;
        }
        int i3 = itemCount - 1;
        int i4 = i2 + 1;
        if (i4 <= i3) {
            while (true) {
                LJIIL(c21673319rv, i3, i2);
                if (i3 == i4) {
                    break;
                } else {
                    i3--;
                }
            }
        }
        LJIIL(c21673319rv, i2, i2);
    }

    public final void LJIIL(C21673319rv c21673319rv, int i, int i2) {
        View viewLJI = c21673319rv.LJI(i);
        addView(viewLJI);
        measureChildWithMargins(viewLJI, 0, 0);
        int width = (getWidth() - getDecoratedMeasuredWidth(viewLJI)) / 2;
        int height = (getHeight() - getDecoratedMeasuredHeight(viewLJI)) / 2;
        layoutDecorated(viewLJI, width, height, width + getDecoratedMeasuredWidth(viewLJI), height + getDecoratedMeasuredHeight(viewLJI));
        viewLJI.setPivotX(viewLJI.getWidth() / 2.0f);
        viewLJI.setPivotY(viewLJI.getHeight() / 2.0f);
        int i3 = i - i2;
        C786410Ut5.Ab(viewLJI, i3 * 16);
        C786410Ut5.Jc(viewLJI, (viewLJI.getWidth() / 2) * i3);
        if (i != i2) {
            C786410Ut5.ed(viewLJI, C339190DRl.LIZ(3) + (viewLJI.getHeight() / 14));
        }
    }
}
