package com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui;

import X.C16G0;
import X.C2188811AlT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class TuxCommerceAiPdpSheetBehavior<V extends View> extends TuxSheetBehavior<V> {
    public float LJJIJLIJ;
    public float LJJIL;

    public TuxCommerceAiPdpSheetBehavior() {
        this.LJJIJLIJ = -1.0f;
        this.LJJIL = -1.0f;
    }

    public final RecyclerView LJI(View view) {
        try {
            return (RecyclerView) view.findViewById(R.id.auv);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public TuxCommerceAiPdpSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJJIJLIJ = -1.0f;
        this.LJJIL = -1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
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
            int r0 = r6.LJIJJ
            r1.append(r0)
            java.lang.String r0 = ", canScrollUp="
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.LJI(r8)
            r3 = -1
            if (r0 == 0) goto L4d
            boolean r0 = r0.canScrollVertically(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2e:
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r6.LJI(r8)
            r1 = 0
            r5 = 1
            if (r0 == 0) goto L4b
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != r5) goto L4b
            r0 = 1
        L43:
            r2 = 3
            if (r0 == 0) goto L4f
            int r0 = r6.LJIJJ
            if (r0 != r2) goto L4f
            return r1
        L4b:
            r0 = 0
            goto L43
        L4d:
            r0 = 0
            goto L2e
        L4f:
            int r1 = r9.getAction()
            if (r1 == 0) goto Laa
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r5) goto La5
            r0 = 2
            if (r1 == r0) goto L63
            if (r1 == r2) goto La5
        L5e:
            boolean r0 = super.onInterceptTouchEvent(r7, r8, r9)
            return r0
        L63:
            androidx.recyclerview.widget.RecyclerView r0 = r6.LJI(r8)
            if (r0 == 0) goto L70
            boolean r0 = r0.canScrollVertically(r3)
            if (r0 != r5) goto L70
            goto L5e
        L70:
            int r1 = r6.LJIJJ
            r0 = 4
            if (r1 != r0) goto L5e
            float r1 = r9.getY()
            float r0 = r6.LJJIL
            float r1 = r1 - r0
            float r3 = java.lang.Math.abs(r1)
            float r1 = r9.getX()
            float r0 = r6.LJJIJLIJ
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5e
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5e
            r6.LJJIJLIJ = r4
            r6.LJJIL = r4
            return r5
        La5:
            r6.LJJIJLIJ = r4
            r6.LJJIL = r4
            goto L5e
        Laa:
            float r0 = r9.getX()
            r6.LJJIJLIJ = r0
            float r0 = r9.getY()
            r6.LJJIL = r0
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.TuxCommerceAiPdpSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
        super.onStopNestedScroll(c16g0, v, view, i);
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAiPdp onNestedPreScroll dy=");
        sbLIZ.append(i2);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(", canScrollUp=");
        RecyclerView recyclerViewLJI = LJI(v);
        if (recyclerViewLJI != null) {
            boolValueOf = Boolean.valueOf(recyclerViewLJI.canScrollVertically(-1));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        super.onNestedPreScroll(c16g0, v, view, i, i2, iArr, i3);
    }
}
