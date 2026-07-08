package com.ss.android.ugc.aweme.filter;

import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class CenterLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0mPS
            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return 200.0f / displayMetrics.densityDpi;
            }

            @Override // X.C21674119s3
            public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
