package com.ss.android.ugc.aweme.poi.osp;

import X.C844470XAv;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class TuxOspSheetBehavior extends TuxSheetBehavior<View> {
    public float LJJIJLIJ = -1.0f;
    public float LJJIL = -1.0f;
    public final int LJJIZ;

    public TuxOspSheetBehavior() {
        C844470XAv.LIZ.getClass();
        this.LJJIZ = ViewConfiguration.get(C844470XAv.LIZ()).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (X.C520840Kbi.LIZ(r1).LJIJJ == 3) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            r6 = 3
            r4 = 1
            r3 = 0
            r0 = 2131393027(0x7f0a7a03, float:1.8406698E38)
            android.view.View r2 = r9.findViewById(r0)     // Catch: java.lang.Exception -> L26
            r0 = 2131374879(0x7f0a331f, float:1.836989E38)
            android.view.View r1 = r9.findViewById(r0)     // Catch: java.lang.Exception -> L26
            if (r2 == 0) goto L1b
            com.bytedance.tux.sheet.sheet.TuxSheetBehavior r0 = X.C520840Kbi.LIZ(r2)     // Catch: java.lang.Exception -> L26
            int r0 = r0.LJIJJ     // Catch: java.lang.Exception -> L26
            if (r0 == r6) goto L25
        L1b:
            if (r1 == 0) goto L2a
            com.bytedance.tux.sheet.sheet.TuxSheetBehavior r0 = X.C520840Kbi.LIZ(r1)     // Catch: java.lang.Exception -> L26
            int r0 = r0.LJIJJ     // Catch: java.lang.Exception -> L26
            if (r0 != r6) goto L2a
        L25:
            return r3
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2a:
            r1 = 0
            r5 = 2131391442(0x7f0a73d2, float:1.8403484E38)
            android.view.View r0 = r9.findViewById(r5)     // Catch: java.lang.Exception -> L35
            X.18Z9 r0 = (X.C18Z9) r0     // Catch: java.lang.Exception -> L35
            goto L3a
        L35:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r1
        L3a:
            r2 = -1
            if (r0 == 0) goto L48
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != r4) goto L48
            int r0 = r7.LJIJJ
            if (r0 != r6) goto L48
            return r3
        L48:
            int r1 = r10.getAction()
            if (r1 == 0) goto L9f
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r4) goto L9a
            r0 = 2
            if (r1 == r0) goto L5c
            if (r1 == r6) goto L9a
        L57:
            boolean r0 = super.onInterceptTouchEvent(r8, r9, r10)
            return r0
        L5c:
            android.view.View r0 = r9.findViewById(r5)     // Catch: java.lang.Exception -> L6b
            X.18Z9 r0 = (X.C18Z9) r0     // Catch: java.lang.Exception -> L6b
            if (r0 == 0) goto L6f
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != r4) goto L6f
            goto L57
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6f:
            int r1 = r7.LJIJJ
            r0 = 4
            if (r1 != r0) goto L57
            float r1 = r10.getY()
            float r0 = r7.LJJIL
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r10.getX()
            float r0 = r7.LJJIJLIJ
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L57
            int r0 = r7.LJJIZ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L57
            r7.LJJIJLIJ = r3
            r7.LJJIL = r3
            return r4
        L9a:
            r7.LJJIJLIJ = r3
            r7.LJJIL = r3
            goto L57
        L9f:
            float r0 = r10.getX()
            r7.LJJIJLIJ = r0
            float r0 = r10.getY()
            r7.LJJIL = r0
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.TuxOspSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
