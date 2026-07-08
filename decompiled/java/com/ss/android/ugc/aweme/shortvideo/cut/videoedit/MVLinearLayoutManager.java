package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public class MVLinearLayoutManager extends LinearLayoutManager {
    public final float LL;

    public MVLinearLayoutManager(Context context) {
        super(context, 0, false);
        this.LL = 5.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.12Ub
            @Override // X.AbstractC21674019s2
            public final PointF LIZ(int i2) {
                return this.LJIILL.computeScrollVectorForPosition(i2);
            }

            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return this.LJIILL.LL / displayMetrics.densityDpi;
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }

    public MVLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LL = 5.0f;
    }
}
