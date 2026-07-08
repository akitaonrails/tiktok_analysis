package com.ss.android.ugc.aweme.upvote.detail.repostshare;

import X.C14K9;
import X.C16G0;
import X.EnumC1355240lN4;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class RepostSharePanelBehavior<V extends View> extends BottomSheetBehavior<V> {
    public float LIZ;
    public float LIZIZ;
    public EnumC1355240lN4 LIZJ;
    public WeakReference<View> LIZLLL;
    public boolean LJ;
    public ViewConfiguration LJFF;
    public WeakReference<View> LJI;

    public static View LIZ(View view) {
        if (view == null) {
            return null;
        }
        if (C14K9.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewLIZ = LIZ(viewGroup.getChildAt(i));
                if (viewLIZ != null) {
                    return viewLIZ;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r8, V r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostSharePanelBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        this.LJI = new WeakReference<>(LIZ(v));
        return super.onLayoutChild(c16g0, v, i);
    }
}
