package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class UcpPdpBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public float LIZ;
    public float LIZIZ;

    public UcpPdpBottomSheetBehavior() {
        this.LIZ = -1.0f;
        this.LIZIZ = -1.0f;
    }

    public UcpPdpBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = -1.0f;
        this.LIZIZ = -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r11, V r12, android.view.MotionEvent r13) {
        /*
            r10 = this;
            r0 = 2131368584(0x7f0a1a88, float:1.8357122E38)
            android.view.View r6 = r12.findViewById(r0)
            int r4 = r13.getAction()
            if (r4 == 0) goto La3
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1
            if (r4 == r2) goto L9d
            r0 = 2
            r1 = 3
            if (r4 == r0) goto L1d
            if (r4 == r1) goto L9d
        L18:
            boolean r0 = super.onInterceptTouchEvent(r11, r12, r13)
            return r0
        L1d:
            float r9 = r13.getY()
            float r0 = r10.LIZIZ
            float r9 = r9 - r0
            float r8 = r13.getX()
            float r0 = r10.LIZ
            float r8 = r8 - r0
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r4 = r0.getScaledTouchSlop()
            int r0 = r10.getState()
            r5 = -1
            r7 = 0
            if (r0 != r1) goto L77
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r8)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L75
            float r1 = java.lang.Math.abs(r9)
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L75
            r4 = 1
        L55:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L73
            r1 = 1
        L5b:
            if (r6 == 0) goto L71
            boolean r0 = r6.canScrollVertically(r5)
            if (r0 != r2) goto L71
            r0 = 1
        L64:
            r0 = r0 ^ 1
            if (r4 == 0) goto Lb1
            if (r1 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            r10.LIZ = r3
            r10.LIZIZ = r3
            return r2
        L71:
            r0 = 0
            goto L64
        L73:
            r1 = 0
            goto L5b
        L75:
            r4 = 0
            goto L55
        L77:
            if (r6 == 0) goto L80
            boolean r0 = r6.canScrollVertically(r5)
            if (r0 != r2) goto L80
            goto L18
        L80:
            int r1 = r10.getState()
            r0 = 4
            if (r1 != r0) goto L18
            float r1 = java.lang.Math.abs(r9)
            float r0 = java.lang.Math.abs(r8)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
            r10.LIZ = r3
            r10.LIZIZ = r3
            return r2
        L9d:
            r10.LIZ = r3
            r10.LIZIZ = r3
            goto L18
        La3:
            float r0 = r13.getX()
            r10.LIZ = r0
            float r0 = r13.getY()
            r10.LIZIZ = r0
            goto L18
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.UcpPdpBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
