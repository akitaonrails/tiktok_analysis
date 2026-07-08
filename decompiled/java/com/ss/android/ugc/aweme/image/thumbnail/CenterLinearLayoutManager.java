package com.ss.android.ugc.aweme.image.thumbnail;

import X.C21673919s1;
import X.C21674119s3;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes30.dex */
public final class CenterLinearLayoutManager extends LinearLayoutManager {
    public CenterLinearLayoutManager(Context context) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.12GY
            public View LJIILL;

            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                return 0.5f;
            }

            @Override // X.C21674119s3
            public final int LJIIIZ(int i2, View view) {
                this.LJIILL = view;
                return super.LJIIIZ(i2, view);
            }

            @Override // X.C21674119s3
            public final int LJIIIIZZ(int i2, int i3, int i4, int i5, int i6) {
                int[] iArr = new int[2];
                View view = this.LJIILL;
                int i7 = 0;
                if (view == null) {
                    return 0;
                }
                view.getLocationOnScreen(iArr);
                int width = iArr[0] + (view.getWidth() / 2);
                WindowManager windowManager = (WindowManager) C786410Ut5.H2(view.getContext(), "window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlYpjLkiZADsP2qbi+VcOnfUJen2ygPOFHLzFN21CxwuDNlzwmU3yt", null)).getRealMetrics(displayMetrics);
                int i8 = displayMetrics.widthPixels / 2;
                int width2 = view.getWidth();
                int i9 = C12GK.LLJILLL;
                if (width2 != i9) {
                    i7 = (i9 - C12GK.LLJJ) / 2;
                }
                int i10 = i8 - width;
                if (i10 < 0) {
                    return i10 + i7;
                }
                return i10 - i7;
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }
}
