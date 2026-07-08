package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.photo;

import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes34.dex */
public final class CustomPageLimitLinearLayoutManager extends LinearLayoutManager {
    public float LL;

    public CustomPageLimitLinearLayoutManager(float f, Context context) {
        super(context, 0, false);
        this.LL = f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(C21673919s1 c21673919s1, int[] iArr) {
        int height;
        int paddingBottom;
        if (this.LL == -1.0f) {
            super.calculateExtraLayoutSpace(c21673919s1, iArr);
            return;
        }
        if (getOrientation() == 0) {
            height = getWidth() - getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            height = getHeight() - getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = (int) ((height - paddingBottom) * this.LL);
        iArr[0] = i;
        iArr[1] = i;
    }
}
