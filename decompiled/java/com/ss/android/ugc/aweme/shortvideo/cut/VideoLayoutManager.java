package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C12WA;
import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public final class VideoLayoutManager extends LinearLayoutManager {
    public final C12WA LL;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.12WA] */
    public VideoLayoutManager(final Context context) {
        super(context, 0, false);
        this.LL = new C21674119s3(context) { // from class: X.12WA
            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return 200.0f / displayMetrics.densityDpi;
            }

            @Override // X.C21674119s3
            public final int LJIILIIL(int i) {
                if (i > 2000) {
                    i = 2000;
                }
                return super.LJIILIIL(i);
            }
        };
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C12WA c12wa = this.LL;
        c12wa.LIZ = i;
        startSmoothScroll(c12wa);
    }
}
