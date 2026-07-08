package com.bytedance.android.livesdk.survey.layoutmanager;

import X.C426750GoL;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveSecondSurveyFlexLayoutManager extends RecyclerView.LayoutManager {
    public final Context LL;
    public final Paint LLILLJJLI = new Paint();

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getLayoutDirection() {
        return C426750GoL.LIZLLL(this.LL) ? 1 : 0;
    }

    public LiveSecondSurveyFlexLayoutManager(Context context) {
        this.LL = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f7  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(X.C21673319rv r19, X.C21673919s1 r20) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.survey.layoutmanager.LiveSecondSurveyFlexLayoutManager.onLayoutChildren(X.19rv, X.19s1):void");
    }

    public final void LJIIL(View view, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            layoutDecoratedWithMargins(view, getWidth() - i3, i2, getWidth() - i, i4);
        } else {
            layoutDecoratedWithMargins(view, i, i2, i3, i4);
        }
    }
}
