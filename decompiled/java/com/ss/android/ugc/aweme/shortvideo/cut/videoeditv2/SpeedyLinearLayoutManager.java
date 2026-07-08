package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import X.C12XQ;
import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public final class SpeedyLinearLayoutManager extends LinearLayoutManager {
    public C12XQ LL;

    public SpeedyLinearLayoutManager(Context context) {
        super(context, 0, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.12XQ] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        if (this.LL == null) {
            final Context context = recyclerView.getContext();
            this.LL = new C21674119s3(context) { // from class: X.12XQ
                @Override // X.C21674119s3
                public final int LJIILJJIL() {
                    return -1;
                }

                @Override // X.C21674119s3
                public final float LJIIJJI(DisplayMetrics displayMetrics) {
                    return 440.0f / displayMetrics.densityDpi;
                }

                @Override // X.C21674119s3, X.AbstractC21674019s2
                public final void LJI(View view, C21673919s1 c21673919s12, C21675319sF c21675319sF) {
                    int iLJIIIZ = LJIIIZ(-1, view);
                    int iLJIILIIL = LJIILIIL(iLJIIIZ);
                    if (iLJIILIIL > 0) {
                        c21675319sF.LIZIZ(-iLJIIIZ, 0, this.LJII, iLJIILIIL);
                    }
                }
            };
        }
        C12XQ c12xq = this.LL;
        c12xq.LIZ = i;
        startSmoothScroll(c12xq);
    }
}
