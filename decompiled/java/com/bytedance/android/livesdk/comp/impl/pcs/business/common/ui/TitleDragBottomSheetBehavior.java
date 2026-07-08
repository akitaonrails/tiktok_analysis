package com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui;

import X.C16G0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes8.dex */
public final class TitleDragBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public int LIZ;
    public boolean LIZIZ;

    public TitleDragBottomSheetBehavior() {
        this.LIZ = -1;
    }

    public TitleDragBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r9, V r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            int r1 = r11.getActionMasked()
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L19
            if (r1 == r3) goto L16
            r0 = 3
            if (r1 == r0) goto L16
        Ld:
            boolean r0 = r8.LIZIZ
            if (r0 == 0) goto L15
            boolean r2 = super.onInterceptTouchEvent(r9, r10, r11)
        L15:
            return r2
        L16:
            r8.LIZIZ = r2
            goto Ld
        L19:
            int r1 = r8.LIZ
            r0 = -1
            if (r1 == r0) goto L5a
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5d
            if (r10 == 0) goto L5d
            android.view.View r4 = r10.findViewById(r1)
            if (r4 == 0) goto L5d
            r0 = 2
            int[] r7 = new int[r0]
            r4.getLocationOnScreen(r7)
            float r6 = r11.getRawX()
            float r5 = r11.getRawY()
            r1 = r7[r2]
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L5d
            int r0 = r4.getWidth()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L5d
            r1 = r7[r3]
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L5d
            int r0 = r4.getHeight()
            int r1 = r1 + r0
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L5d
        L5a:
            r8.LIZIZ = r3
            goto Ld
        L5d:
            r3 = 0
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.common.ui.TitleDragBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (this.LIZIZ) {
            return super.onTouchEvent(c16g0, v, motionEvent);
        }
        return false;
    }
}
