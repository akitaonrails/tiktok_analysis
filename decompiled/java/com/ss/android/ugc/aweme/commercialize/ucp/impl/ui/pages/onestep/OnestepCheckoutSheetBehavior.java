package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep;

import X.C16G0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class OnestepCheckoutSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public float LIZ;
    public float LIZIZ;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
    }

    public OnestepCheckoutSheetBehavior() {
        this.LIZ = -1.0f;
        this.LIZIZ = -1.0f;
    }

    public OnestepCheckoutSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = -1.0f;
        this.LIZIZ = -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r9, V r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            r0 = 2131368584(0x7f0a1a88, float:1.8357122E38)
            android.view.View r1 = r10.findViewById(r0)
            int r4 = r11.getAction()
            if (r4 == 0) goto L6c
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1
            if (r4 == r2) goto L67
            r0 = 2
            if (r4 == r0) goto L1d
            r0 = 3
            if (r4 == r0) goto L67
        L18:
            boolean r0 = super.onInterceptTouchEvent(r9, r10, r11)
            return r0
        L1d:
            float r7 = r11.getY()
            float r0 = r8.LIZIZ
            float r7 = r7 - r0
            float r6 = r11.getX()
            float r0 = r8.LIZ
            float r6 = r6 - r0
            android.content.Context r0 = r10.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r4 = r0.getScaledTouchSlop()
            r5 = 0
            if (r1 == 0) goto L42
            r0 = -1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 != r2) goto L42
            goto L18
        L42:
            int r1 = r8.getState()
            r0 = 4
            if (r1 != r0) goto L18
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4f
            r5 = 1
        L4f:
            float r1 = java.lang.Math.abs(r7)
            float r0 = java.lang.Math.abs(r6)
            if (r5 == 0) goto L18
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
            float r0 = (float) r4
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L18
            r8.LIZ = r3
            r8.LIZIZ = r3
            return r2
        L67:
            r8.LIZ = r3
            r8.LIZIZ = r3
            goto L18
        L6c:
            float r0 = r11.getX()
            r8.LIZ = r0
            float r0 = r11.getY()
            r8.LIZIZ = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.onestep.OnestepCheckoutSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
