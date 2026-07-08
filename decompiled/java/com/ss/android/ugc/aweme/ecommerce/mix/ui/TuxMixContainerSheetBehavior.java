package com.ss.android.ugc.aweme.ecommerce.mix.ui;

import X.C20746416Gg;
import X.C958103op;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;

/* JADX INFO: loaded from: classes27.dex */
public final class TuxMixContainerSheetBehavior extends TuxSheetBehavior<View> {
    public C20746416Gg LJJIL;
    public float LJJIJLIJ = -1.0f;
    public final int LJJIZ = C958103op.LJ;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            int r1 = r8.getAction()
            if (r1 == 0) goto L37
            r2 = 1
            if (r1 == r2) goto L32
            r0 = 2
            r4 = 3
            if (r1 == r0) goto L14
            if (r1 == r4) goto L32
        Lf:
            boolean r0 = super.onInterceptTouchEvent(r6, r7, r8)
            return r0
        L14:
            float r3 = r8.getY()
            float r0 = r5.LJJIJLIJ
            float r3 = r3 - r0
            float r1 = java.lang.Math.abs(r3)
            int r0 = r5.LJJIZ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lf
            float r0 = r8.getY()
            r5.LJJIJLIJ = r0
            int r1 = r5.LJIJJ
            r0 = 4
            if (r1 != r0) goto L3e
            return r2
        L32:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.LJJIJLIJ = r0
            goto Lf
        L37:
            float r0 = r8.getY()
            r5.LJJIJLIJ = r0
            goto Lf
        L3e:
            if (r1 != r4) goto L6a
            X.16Gg r0 = r5.LJJIL
            if (r0 != 0) goto L4f
            r0 = 2131363574(0x7f0a06f6, float:1.834696E38)
            android.view.View r0 = r6.findViewById(r0)
            X.16Gg r0 = (X.C20746416Gg) r0
            r5.LJJIL = r0
        L4f:
            X.16Gg r0 = r5.LJJIL
            if (r0 == 0) goto L67
            java.lang.String r1 = r0.getStatus()
        L57:
            java.lang.String r0 = "expanded"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = 0
            if (r1 == 0) goto L69
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L66
            r2 = 0
        L66:
            return r2
        L67:
            r1 = 0
            goto L57
        L69:
            return r0
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.mix.ui.TuxMixContainerSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
