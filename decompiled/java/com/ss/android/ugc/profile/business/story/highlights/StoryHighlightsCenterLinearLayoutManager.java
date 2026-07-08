package com.ss.android.ugc.profile.business.story.highlights;

import X.C21673319rv;
import X.C21673919s1;
import X.C426750GoL;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryHighlightsCenterLinearLayoutManager extends LinearLayoutManager {
    public final Context LL;
    public int LLILLJJLI;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i;
        super.onLayoutChildren(c21673319rv, c21673919s1);
        if (getOrientation() == 0 && getChildCount() > 0) {
            int width = getWidth();
            int childCount = getChildCount();
            int i2 = 0;
            int decoratedMeasuredWidth = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    decoratedMeasuredWidth += getDecoratedMeasuredWidth(childAt) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
            }
            if (decoratedMeasuredWidth < width) {
                i2 = (width - decoratedMeasuredWidth) / 2;
            }
            this.LLILLJJLI = i2;
            if (C426750GoL.LIZLLL(this.LL)) {
                i = -this.LLILLJJLI;
            } else {
                i = this.LLILLJJLI;
            }
            offsetChildrenHorizontal(i);
        }
    }

    public StoryHighlightsCenterLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        this.LL = context;
    }
}
