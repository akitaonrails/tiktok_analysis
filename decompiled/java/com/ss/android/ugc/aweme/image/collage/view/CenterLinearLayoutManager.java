package com.ss.android.ugc.aweme.image.collage.view;

import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes23.dex */
public final class CenterLinearLayoutManager extends LinearLayoutManager {
    public CenterLinearLayoutManager(Context context) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0nwn
            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return 0.5f;
            }

            @Override // X.C21674119s3
            public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }
}
