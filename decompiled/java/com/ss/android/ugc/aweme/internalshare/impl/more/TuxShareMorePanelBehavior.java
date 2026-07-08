package com.ss.android.ugc.aweme.internalshare.impl.more;

import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class TuxShareMorePanelBehavior<V extends View> extends TuxSheetBehavior<V> {
    public float LJJIJLIJ;
    public ViewConfiguration LJJIL;
    public boolean LJJIZ;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r6, V r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            android.view.ViewConfiguration r0 = r5.LJJIL
            if (r0 != 0) goto Le
            android.content.Context r0 = r6.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            r5.LJJIL = r0
        Le:
            int r1 = r8.getAction()
            r4 = 2
            r3 = 1
            if (r1 == 0) goto L53
            r2 = -1
            if (r1 == r3) goto L50
            if (r1 == r4) goto L23
            r0 = 3
            if (r1 == r0) goto L50
        L1e:
            boolean r0 = super.onInterceptTouchEvent(r6, r7, r8)
            return r0
        L23:
            float r1 = r8.getY()
            float r0 = r5.LJJIJLIJ
            float r1 = r1 - r0
            android.view.ViewConfiguration r0 = r5.LJJIL
            if (r0 == 0) goto L4e
            int r0 = r0.getScaledTouchSlop()
        L32:
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            java.lang.ref.WeakReference<android.view.View> r0 = r5.LJJIII
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1e
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != 0) goto L1e
            boolean r0 = r5.LJJIZ
            if (r0 != 0) goto L1e
            return r3
        L4e:
            r0 = 0
            goto L32
        L50:
            r5.LJJIIZ = r2
            goto L1e
        L53:
            float r0 = r8.getY()
            r5.LJJIJLIJ = r0
            int r0 = r8.getActionIndex()
            int r0 = r8.getPointerId(r0)
            r5.LJJIIZ = r0
            java.lang.ref.WeakReference<android.view.View> r0 = r5.LJJIII
            r1 = 0
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
        L6e:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L1e
            int r0 = r1.getScrollState()
            if (r0 != r4) goto L1e
            r1.stopScroll()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.internalshare.impl.more.TuxShareMorePanelBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
