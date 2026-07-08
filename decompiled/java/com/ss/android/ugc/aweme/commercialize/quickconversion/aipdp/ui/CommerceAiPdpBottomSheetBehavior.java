package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui;

import X.C16G0;
import X.C2188811AlT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class CommerceAiPdpBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public float LIZ;
    public float LIZIZ;

    public CommerceAiPdpBottomSheetBehavior() {
        this.LIZ = -1.0f;
        this.LIZIZ = -1.0f;
    }

    public final RecyclerView LIZ(View view) {
        try {
            return (RecyclerView) view.findViewById(R.id.auv);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public CommerceAiPdpBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = -1.0f;
        this.LIZIZ = -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "CommerceAiPdp onInterceptTouchEvent action="
            r1.append(r0)
            int r0 = r9.getAction()
            r1.append(r0)
            java.lang.String r0 = ", state="
            r1.append(r0)
            int r0 = r6.getState()
            r1.append(r0)
            java.lang.String r0 = ", canScrollUp="
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.LIZ(r8)
            r3 = -1
            if (r0 == 0) goto L51
            boolean r0 = r0.canScrollVertically(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L30:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r6.LIZ(r8)
            r1 = 0
            r5 = 1
            if (r0 == 0) goto L4f
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != r5) goto L4f
            r0 = 1
        L45:
            r2 = 3
            if (r0 == 0) goto L53
            int r0 = r6.getState()
            if (r0 != r2) goto L53
            return r1
        L4f:
            r0 = 0
            goto L45
        L51:
            r0 = 0
            goto L30
        L53:
            int r1 = r9.getAction()
            if (r1 == 0) goto Lb0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r5) goto Lab
            r0 = 2
            if (r1 == r0) goto L67
            if (r1 == r2) goto Lab
        L62:
            boolean r0 = super.onInterceptTouchEvent(r7, r8, r9)
            return r0
        L67:
            androidx.recyclerview.widget.RecyclerView r0 = r6.LIZ(r8)
            if (r0 == 0) goto L74
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != r5) goto L74
            goto L62
        L74:
            int r1 = r6.getState()
            r0 = 4
            if (r1 != r0) goto L62
            float r1 = r9.getY()
            float r0 = r6.LIZIZ
            float r1 = r1 - r0
            float r3 = java.lang.Math.abs(r1)
            float r1 = r9.getX()
            float r0 = r6.LIZ
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L62
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L62
            r6.LIZ = r4
            r6.LIZIZ = r4
            return r5
        Lab:
            r6.LIZ = r4
            r6.LIZIZ = r4
            goto L62
        Lb0:
            float r0 = r9.getX()
            r6.LIZ = r0
            float r0 = r9.getY()
            r6.LIZIZ = r0
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.CommerceAiPdpBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
        super.onStopNestedScroll(c16g0, v, view, i);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAiPdp onNestedPreScroll dy=");
        sbLIZ.append(i2);
        sbLIZ.append(", state=");
        sbLIZ.append(getState());
        sbLIZ.append(", canScrollUp=");
        RecyclerView recyclerViewLIZ = LIZ(v);
        if (recyclerViewLIZ != null) {
            boolValueOf = Boolean.valueOf(recyclerViewLIZ.canScrollVertically(-1));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        super.onNestedPreScroll(c16g0, v, view, i, i2, iArr, i3);
    }
}
