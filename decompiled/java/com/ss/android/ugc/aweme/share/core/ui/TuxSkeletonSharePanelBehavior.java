package com.ss.android.ugc.aweme.share.core.ui;

import X.C1370370llT;
import X.C16G0;
import X.EnumC1355240lN4;
import X.InterfaceC1370850lmF;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxSkeletonSharePanelBehavior<V extends View> extends TuxSheetBehavior<V> {
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public EnumC1355240lN4 LJJJ;
    public WeakReference<View> LJJJI;
    public boolean LJJJIL;
    public float LJJJJ;
    public float LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public VelocityTracker LJJJJJL;
    public WeakReference<View> LJJJJL;
    public WeakReference<View> LJJJJLI;
    public WeakReference<View> LJJJJLL;
    public boolean LJJJJZ;
    public ViewConfiguration LJJJJZI;
    public final Rect LJJJLIIL = new Rect();
    public float LJJJLL = 0.5f;
    public float LJJJLZIJ = 1000.0f;

    /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r8, V r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.TuxSkeletonSharePanelBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        if (this.LJJIZ) {
            this.LJJJJL = new WeakReference<>(findScrollingChild(v));
        }
        if (this.LJJIJLIJ) {
            this.LJJJJLI = new WeakReference<>(c16g0.findViewById(R.id.dv2));
            this.LJJJJLL = new WeakReference<>(c16g0.findViewById(R.id.yc));
        }
        if (this.LJJJ != null) {
            this.LJJJI = new WeakReference<>(c16g0.findViewById(R.id.i8y));
        }
        super.onLayoutChild(c16g0, v, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            boolean r0 = r4.LJJIZ
            if (r0 == 0) goto L25
            android.view.VelocityTracker r0 = r4.LJJJJJL
            if (r0 != 0) goto Le
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.LJJJJJL = r0
        Le:
            android.view.VelocityTracker r0 = r4.LJJJJJL
            if (r0 == 0) goto L15
            r0.addMovement(r7)
        L15:
            int r3 = r7.getAction()
            r2 = 1
            if (r3 == 0) goto L51
            r1 = 0
            if (r3 == r2) goto L3a
            r0 = 2
            if (r3 == r0) goto L2a
            r0 = 3
            if (r3 == r0) goto L3a
        L25:
            boolean r0 = super.onTouchEvent(r5, r6, r7)
            return r0
        L2a:
            float r1 = r7.getY()
            float r0 = r4.LJJJJ
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L37
            r2 = 0
        L37:
            r4.LJJJJIZL = r2
            goto L25
        L3a:
            r4.LJJJJIZL = r1
            r0 = -1
            r4.LJJIIZ = r0
            r4.LJJJJZ = r1
            java.lang.ref.WeakReference<android.view.View> r0 = r4.LJJJJL
            if (r0 == 0) goto L25
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L25
            r4.onStopNestedScroll(r5, r6, r0, r1)
            goto L25
        L51:
            float r0 = r7.getY()
            r4.LJJJJ = r0
            int r0 = r7.getActionIndex()
            int r0 = r7.getPointerId(r0)
            r4.LJJIIZ = r0
            r4.LJJJJZ = r2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.TuxSkeletonSharePanelBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
        float yVelocity;
        if (!this.LJJIZ) {
            super.onStopNestedScroll(c16g0, v, view, i);
        }
        if (this.LJJJJJ && !this.LJJJJZ) {
            int top = v.getTop();
            VelocityTracker velocityTracker = this.LJJJJJL;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                yVelocity = velocityTracker.getYVelocity(this.LJJIIZ);
            } else {
                yVelocity = 0.0f;
            }
            float f = this.LJJJLZIJ;
            int i2 = 5;
            if (yVelocity > f) {
                setState(5);
                return;
            }
            if (yVelocity < (-f)) {
                setState(3);
                return;
            }
            InterfaceC1370850lmF interfaceC1370850lmF = C1370370llT.LJIIJJI;
            if (interfaceC1370850lmF != null && interfaceC1370850lmF.LIZ(top, this)) {
                setState(3);
                return;
            }
            float f2 = top;
            if (f2 < (c16g0.getHeight() - getPeekHeight()) * this.LJJJLL) {
                i2 = 3;
            } else if (f2 <= c16g0.getHeight() - (getPeekHeight() * (1 - this.LJJJLL))) {
                i2 = 4;
            }
            setState(i2);
        }
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        if (this.LJJIZ) {
            if (!this.LJJJJIZL) {
                return false;
            }
            if ((view instanceof RecyclerView) && view != null && view.canScrollVertically(-1)) {
                return false;
            }
        }
        return super.onNestedPreFling(c16g0, v, view, f, f2);
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (this.LJJIZ) {
            return;
        }
        boolean z = true;
        if (this.LJIJJ == 4 && this.LJJIL) {
            iArr[0] = 0;
            iArr[1] = i2;
        } else {
            super.onNestedPreScroll(c16g0, v, view, i, i2, iArr, i3);
            if (i2 == 0) {
                z = false;
            }
            this.LJJJJJ = z;
        }
    }
}
