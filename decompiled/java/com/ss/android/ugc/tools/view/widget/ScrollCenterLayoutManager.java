package com.ss.android.ugc.tools.view.widget;

import X.C11VU;
import X.C1644960suM;
import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes26.dex */
public class ScrollCenterLayoutManager extends LinearLayoutManager {
    public C1644960suM LL;
    public final Context LLILLJJLI;

    public ScrollCenterLayoutManager(Context context) {
        super(context, 0, false);
        this.LLILLJJLI = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        scrollToPositionWithOffset(i, (int) ((getWidth() / 2) - C11VU.LIZIZ(45.0f, this.LLILLJJLI)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0suM] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        if (this.LL == null) {
            this.LL = new C21674119s3(context) { // from class: X.0suM
                @Override // X.C21674119s3
                public final float LJIIJJI(DisplayMetrics displayMetrics) {
                    return 200.0f / displayMetrics.densityDpi;
                }

                @Override // X.C21674119s3
                public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                    return (i4 + ((i5 - i4) / 2)) - (i2 + ((i3 - i2) / 2));
                }
            };
        }
        C1644960suM c1644960suM = this.LL;
        c1644960suM.LIZ = i;
        startSmoothScroll(c1644960suM);
    }

    public ScrollCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLILLJJLI = context;
    }
}
