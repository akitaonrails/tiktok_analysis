package com.ss.android.ugc.aweme.ecommerce.base.pdp.ui;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes17.dex */
public final class PdpBottomSheetBehavior extends BottomSheetBehavior<View> {
    public float LIZ = -1.0f;
    public float LIZIZ = -1.0f;

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
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
            if (r0 == 0) goto L26
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 != r4) goto L26
            r0 = 1
        L1c:
            r2 = 3
            if (r0 == 0) goto L28
            int r0 = r7.getState()
            if (r0 != r2) goto L28
            return r1
        L26:
            r0 = 0
            goto L1c
        L28:
            int r1 = r10.getAction()
            if (r1 == 0) goto L81
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r4) goto L7c
            r0 = 2
            if (r1 == r0) goto L3c
            if (r1 == r2) goto L7c
        L37:
            boolean r0 = super.onInterceptTouchEvent(r8, r9, r10)
            return r0
        L3c:
            android.view.View r0 = r9.findViewById(r6)     // Catch: java.lang.Exception -> L4b
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0     // Catch: java.lang.Exception -> L4b
            if (r0 == 0) goto L4f
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 != r4) goto L4f
            goto L37
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            int r1 = r7.getState()
            r0 = 4
            if (r1 != r0) goto L37
            float r1 = r10.getY()
            float r0 = r7.LIZIZ
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r10.getX()
            float r0 = r7.LIZ
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L37
            int r0 = X.C958103op.LJ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L37
            r7.LIZ = r3
            r7.LIZIZ = r3
            return r4
        L7c:
            r7.LIZ = r3
            r7.LIZIZ = r3
            goto L37
        L81:
            float r0 = r10.getX()
            r7.LIZ = r0
            float r0 = r10.getY()
            r7.LIZIZ = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
