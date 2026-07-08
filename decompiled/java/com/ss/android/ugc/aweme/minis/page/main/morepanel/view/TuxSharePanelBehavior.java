package com.ss.android.ugc.aweme.minis.page.main.morepanel.view;

import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class TuxSharePanelBehavior<V extends View> extends TuxSheetBehavior<V> {
    public float LJJIJLIJ;
    public ViewConfiguration LJJIL;

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            android.view.ViewConfiguration r0 = r4.LJJIL
            if (r0 != 0) goto Le
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            r4.LJJIL = r0
        Le:
            int r1 = r7.getAction()
            if (r1 == 0) goto L4f
            r3 = -1
            r2 = 1
            if (r1 == r2) goto L4c
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 3
            if (r1 == r0) goto L4c
        L1e:
            boolean r0 = super.onInterceptTouchEvent(r5, r6, r7)
            return r0
        L23:
            float r1 = r7.getY()
            float r0 = r4.LJJIJLIJ
            float r1 = r1 - r0
            android.view.ViewConfiguration r0 = r4.LJJIL
            if (r0 == 0) goto L4a
            int r0 = r0.getScaledTouchSlop()
        L32:
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            java.lang.ref.WeakReference<android.view.View> r0 = r4.LJJIII
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1e
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != 0) goto L1e
            return r2
        L4a:
            r0 = 0
            goto L32
        L4c:
            r4.LJJIIZ = r3
            goto L1e
        L4f:
            float r0 = r7.getY()
            r4.LJJIJLIJ = r0
            int r0 = r7.getActionIndex()
            int r0 = r7.getPointerId(r0)
            r4.LJJIIZ = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.minis.page.main.morepanel.view.TuxSharePanelBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
