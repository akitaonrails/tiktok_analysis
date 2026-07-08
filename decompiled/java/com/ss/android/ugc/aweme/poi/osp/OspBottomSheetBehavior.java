package com.ss.android.ugc.aweme.poi.osp;

import X.C844470XAv;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.bottomsheet.BottomSheetBehaviorEt;

/* JADX INFO: loaded from: classes17.dex */
public final class OspBottomSheetBehavior extends BottomSheetBehaviorEt<View> {
    public float LIZ = -1.0f;
    public float LIZIZ = -1.0f;
    public final int LIZJ;

    public OspBottomSheetBehavior() {
        C844470XAv.LIZ.getClass();
        this.LIZJ = ViewConfiguration.get(C844470XAv.LIZ()).getScaledTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (com.google.android.material.bottomsheet.BottomSheetBehavior.from(r1).getState() == 3) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
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
            android.view.View r2 = r9.findViewById(r0)     // Catch: java.lang.Exception -> L2a
            r0 = 2131374879(0x7f0a331f, float:1.836989E38)
            android.view.View r1 = r9.findViewById(r0)     // Catch: java.lang.Exception -> L2a
            if (r2 == 0) goto L1d
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r2)     // Catch: java.lang.Exception -> L2a
            int r0 = r0.getState()     // Catch: java.lang.Exception -> L2a
            if (r0 == r6) goto L29
        L1d:
            if (r1 == 0) goto L2e
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.from(r1)     // Catch: java.lang.Exception -> L2a
            int r0 = r0.getState()     // Catch: java.lang.Exception -> L2a
            if (r0 != r6) goto L2e
        L29:
            return r3
        L2a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2e:
            r1 = 0
            r5 = 2131391442(0x7f0a73d2, float:1.8403484E38)
            android.view.View r0 = r9.findViewById(r5)     // Catch: java.lang.Exception -> L39
            X.18Z9 r0 = (X.C18Z9) r0     // Catch: java.lang.Exception -> L39
            goto L3e
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = r1
        L3e:
            r2 = -1
            if (r0 == 0) goto L4e
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != r4) goto L4e
            int r0 = r7.getState()
            if (r0 != r6) goto L4e
            return r3
        L4e:
            int r1 = r10.getAction()
            if (r1 == 0) goto La7
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r4) goto La2
            r0 = 2
            if (r1 == r0) goto L62
            if (r1 == r6) goto La2
        L5d:
            boolean r0 = super.onInterceptTouchEvent(r8, r9, r10)
            return r0
        L62:
            android.view.View r0 = r9.findViewById(r5)     // Catch: java.lang.Exception -> L71
            X.18Z9 r0 = (X.C18Z9) r0     // Catch: java.lang.Exception -> L71
            if (r0 == 0) goto L75
            boolean r0 = r0.canScrollVertically(r2)
            if (r0 != r4) goto L75
            goto L5d
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L75:
            int r1 = r7.getState()
            r0 = 4
            if (r1 != r0) goto L5d
            float r1 = r10.getY()
            float r0 = r7.LIZIZ
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            float r1 = r10.getX()
            float r0 = r7.LIZ
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5d
            int r0 = r7.LIZJ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5d
            r7.LIZ = r3
            r7.LIZIZ = r3
            return r4
        La2:
            r7.LIZ = r3
            r7.LIZIZ = r3
            goto L5d
        La7:
            float r0 = r10.getX()
            r7.LIZ = r0
            float r0 = r10.getY()
            r7.LIZIZ = r0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.osp.OspBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
