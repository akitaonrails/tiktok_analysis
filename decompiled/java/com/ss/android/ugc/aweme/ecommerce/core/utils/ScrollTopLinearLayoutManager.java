package com.ss.android.ugc.aweme.ecommerce.core.utils;

import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes27.dex */
public final class ScrollTopLinearLayoutManager extends LinearLayoutManager {
    public int LL;
    public final boolean LLILLJJLI;
    public final float LLILLL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LLILLJJLI && super.canScrollVertically();
    }

    public ScrollTopLinearLayoutManager(Context context) {
        super(context);
        this.LLILLJJLI = true;
        this.LLILLL = 50.0f;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.0wHk
            @Override // X.C21674119s3
            public final int LJIILJJIL() {
                return -1;
            }

            @Override // X.C21674119s3
            public final int LJIILL() {
                return -1;
            }

            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return this.LJIILL.LLILLL / displayMetrics.densityDpi;
            }

            @Override // X.C21674119s3, X.AbstractC21674019s2
            public final void LJI(View view, C21673919s1 c21673919s12, C21675319sF c21675319sF) {
                int iLJIIIZ = LJIIIZ(-1, view);
                int iLJIIJ = LJIIJ(-1, view) + this.LJIILL.LL;
                int iLJIIL = LJIIL((int) Math.sqrt((iLJIIIZ * iLJIIIZ) + (iLJIIJ * iLJIIJ)));
                if (iLJIIL > 0) {
                    c21675319sF.LIZIZ(-iLJIIIZ, -iLJIIJ, this.LJIIIIZZ, iLJIIL);
                }
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }
}
