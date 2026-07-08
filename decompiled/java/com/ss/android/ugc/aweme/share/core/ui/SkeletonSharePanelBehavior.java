package com.ss.android.ugc.aweme.share.core.ui;

import X.C1370370llT;
import X.C14K9;
import X.C16G0;
import X.EnumC1355240lN4;
import X.InterfaceC1370850lmF;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes22.dex */
public final class SkeletonSharePanelBehavior<V extends View> extends BottomSheetBehavior<V> {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public EnumC1355240lN4 LIZLLL;
    public WeakReference<View> LJ;
    public boolean LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public VelocityTracker LJIIJ;
    public int LJIIJJI;
    public WeakReference<View> LJIIL;
    public WeakReference<View> LJIILIIL;
    public WeakReference<View> LJIILJJIL;
    public boolean LJIILL;
    public ViewConfiguration LJIILLIIL;
    public final Rect LJIIZILJ = new Rect();
    public float LJIJ = 0.5f;
    public float LJIJI = 1000.0f;

    public static View LIZ(View view) {
        if (view == null) {
            return null;
        }
        if (C14K9.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewLIZ = LIZ(viewGroup.getChildAt(i));
                if (viewLIZ != null) {
                    return viewLIZ;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x010f  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r8, V r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        if (this.LIZJ) {
            this.LJIIL = new WeakReference<>(LIZ(v));
        }
        if (this.LIZ) {
            this.LJIILIIL = new WeakReference<>(c16g0.findViewById(R.id.dv2));
            this.LJIILJJIL = new WeakReference<>(c16g0.findViewById(R.id.yc));
        }
        if (this.LIZLLL != null) {
            this.LJ = new WeakReference<>(c16g0.findViewById(R.id.i8y));
        }
        return super.onLayoutChild(c16g0, v, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            boolean r0 = r4.LIZJ
            if (r0 == 0) goto L25
            android.view.VelocityTracker r0 = r4.LJIIJ
            if (r0 != 0) goto Le
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.LJIIJ = r0
        Le:
            android.view.VelocityTracker r0 = r4.LJIIJ
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
            float r0 = r4.LJI
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L37
            r2 = 0
        L37:
            r4.LJIIIIZZ = r2
            goto L25
        L3a:
            r4.LJIIIIZZ = r1
            r0 = -1
            r4.LJIIJJI = r0
            r4.LJIILL = r1
            java.lang.ref.WeakReference<android.view.View> r0 = r4.LJIIL
            if (r0 == 0) goto L25
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L25
            r4.onStopNestedScroll(r5, r6, r0, r1)
            goto L25
        L51:
            float r0 = r7.getY()
            r4.LJI = r0
            int r0 = r7.getActionIndex()
            int r0 = r7.getPointerId(r0)
            r4.LJIIJJI = r0
            r4.LJIILL = r2
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
        float yVelocity;
        if (!this.LIZJ) {
            super.onStopNestedScroll(c16g0, v, view, i);
        }
        if (this.LJIIIZ && !this.LJIILL) {
            int top = v.getTop();
            VelocityTracker velocityTracker = this.LJIIJ;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                yVelocity = velocityTracker.getYVelocity(this.LJIIJJI);
            } else {
                yVelocity = 0.0f;
            }
            float f = this.LJIJI;
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
            if (f2 < (c16g0.getHeight() - getPeekHeight()) * this.LJIJ) {
                i2 = 3;
            } else if (f2 <= c16g0.getHeight() - (getPeekHeight() * (1 - this.LJIJ))) {
                i2 = 4;
            }
            setState(i2);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        if (this.LIZJ) {
            if (!this.LJIIIIZZ) {
                return false;
            }
            if ((view instanceof RecyclerView) && view != null && view.canScrollVertically(-1)) {
                return false;
            }
        }
        return super.onNestedPreFling(c16g0, v, view, f, f2);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (this.LIZJ) {
            return;
        }
        boolean z = true;
        if (getState() == 4 && this.LIZIZ) {
            iArr[0] = 0;
            iArr[1] = i2;
        } else {
            super.onNestedPreScroll(c16g0, v, view, i, i2, iArr, i3);
            if (i2 == 0) {
                z = false;
            }
            this.LJIIIZ = z;
        }
    }
}
