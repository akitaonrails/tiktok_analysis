package com.ss.android.ugc.aweme.ecommerce.base.pdp.ui;

import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes17.dex */
public final class TuxPdpSheetBehavior extends TuxSheetBehavior<View> {
    public float LJJIJLIJ = -1.0f;
    public float LJJIL = -1.0f;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            r1 = 0
            r6 = 2131387980(0x7f0a664c, float:1.8396462E38)
            android.view.View r0 = r9.findViewById(r6)     // Catch: java.lang.Exception -> Lb
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0     // Catch: java.lang.Exception -> Lb
            goto L10
        Lb:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r1
        L10:
            r5 = -1
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L24
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 != r4) goto L24
            r0 = 1
        L1c:
            r2 = 3
            if (r0 == 0) goto L26
            int r0 = r7.LJIJJ
            if (r0 != r2) goto L26
            return r1
        L24:
            r0 = 0
            goto L1c
        L26:
            int r1 = r10.getAction()
            if (r1 == 0) goto L7d
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r4) goto L78
            r0 = 2
            if (r1 == r0) goto L3a
            if (r1 == r2) goto L78
        L35:
            boolean r0 = super.onInterceptTouchEvent(r8, r9, r10)
            return r0
        L3a:
            android.view.View r0 = r9.findViewById(r6)     // Catch: java.lang.Exception -> L49
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L4d
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 != r4) goto L4d
            goto L35
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4d:
            int r1 = r7.LJIJJ
            r0 = 4
            if (r1 != r0) goto L35
            float r1 = r10.getY()
            float r0 = r7.LJJIL
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r10.getX()
            float r0 = r7.LJJIJLIJ
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            int r0 = X.C958103op.LJ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L35
            r7.LJJIJLIJ = r3
            r7.LJJIL = r3
            return r4
        L78:
            r7.LJJIJLIJ = r3
            r7.LJJIL = r3
            goto L35
        L7d:
            float r0 = r10.getX()
            r7.LJJIJLIJ = r0
            float r0 = r10.getY()
            r7.LJJIL = r0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.TuxPdpSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
