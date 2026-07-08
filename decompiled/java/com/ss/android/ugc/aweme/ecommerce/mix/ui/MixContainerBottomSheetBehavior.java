package com.ss.android.ugc.aweme.ecommerce.mix.ui;

import X.C20746416Gg;
import X.C958103op;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes27.dex */
public final class MixContainerBottomSheetBehavior extends BottomSheetBehavior<View> {
    public C20746416Gg LIZIZ;
    public float LIZ = -1.0f;
    public final int LIZJ = C958103op.LJ;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            int r1 = r8.getAction()
            if (r1 == 0) goto L39
            r2 = 1
            if (r1 == r2) goto L34
            r0 = 2
            r4 = 3
            if (r1 == r0) goto L14
            if (r1 == r4) goto L34
        Lf:
            boolean r0 = super.onInterceptTouchEvent(r6, r7, r8)
            return r0
        L14:
            float r3 = r8.getY()
            float r0 = r5.LIZ
            float r3 = r3 - r0
            float r1 = java.lang.Math.abs(r3)
            int r0 = r5.LIZJ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf
            float r0 = r8.getY()
            r5.LIZ = r0
            int r1 = r5.getState()
            r0 = 4
            if (r1 != r0) goto L40
            return r2
        L34:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.LIZ = r0
            goto Lf
        L39:
            float r0 = r8.getY()
            r5.LIZ = r0
            goto Lf
        L40:
            int r0 = r5.getState()
            if (r0 != r4) goto L70
            X.16Gg r0 = r5.LIZIZ
            if (r0 != 0) goto L55
            r0 = 2131363574(0x7f0a06f6, float:1.834696E38)
            android.view.View r0 = r6.findViewById(r0)
            X.16Gg r0 = (X.C20746416Gg) r0
            r5.LIZIZ = r0
        L55:
            X.16Gg r0 = r5.LIZIZ
            if (r0 == 0) goto L6d
            java.lang.String r1 = r0.getStatus()
        L5d:
            java.lang.String r0 = "expanded"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = 0
            if (r1 == 0) goto L6f
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L6c
            r2 = 0
        L6c:
            return r2
        L6d:
            r1 = 0
            goto L5d
        L6f:
            return r0
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mix.ui.MixContainerBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
