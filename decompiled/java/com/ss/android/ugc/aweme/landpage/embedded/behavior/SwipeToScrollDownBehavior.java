package com.ss.android.ugc.aweme.landpage.embedded.behavior;

import X.AbstractC21586119dr;
import X.C16BC;
import X.C16BL;
import X.C16BM;
import X.C16G0;
import X.C16G1;
import X.C21586019dq;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class SwipeToScrollDownBehavior<T extends View> extends C16BC<T> {
    public C21586019dq LIZ;
    public WeakReference<View> LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public boolean LJI;
    public final List<C16BM> LJII = new ArrayList();
    public int LJIIIIZZ = 1;
    public final C16BL LJIIIZ = new AbstractC21586119dr(this) { // from class: X.16BL
        public final /* synthetic */ SwipeToScrollDownBehavior<T> LIZ;

        @Override // X.AbstractC21586119dr
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            return i;
        }

        {
            this.LIZ = this;
        }

        @Override // X.AbstractC21586119dr
        public final int getViewHorizontalDragRange(View view) {
            return this.LIZ.LIZJ;
        }

        @Override // X.AbstractC21586119dr
        public final void onViewDragStateChanged(int i) {
            if (i == 1) {
                this.LIZ.setStateInternal(2);
            }
        }

        @Override // X.AbstractC21586119dr
        public final boolean tryCaptureView(View view, int i) {
            View view2;
            WeakReference<View> weakReference = this.LIZ.LIZIZ;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            return Intrinsics.LJFF(view, view2);
        }

        @Override // X.AbstractC21586119dr
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
        @Override // X.AbstractC21586119dr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onViewReleased(android.view.View r7, float r8, float r9) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior<T> r0 = r6.LIZ
                X.19dq r4 = r0.LIZ
                if (r4 != 0) goto L7
                return
            L7:
                float r1 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r8)
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                r3 = 1
                r5 = 0
                if (r0 > 0) goto L6d
                com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior<T> r0 = r6.LIZ
                r0.getClass()
                int r0 = r7.getLayoutDirection()
                if (r0 != r3) goto L6b
                r1 = 1
            L21:
                r0 = 0
                if (r1 == 0) goto L66
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 >= 0) goto L6d
            L28:
                float r1 = java.lang.Math.abs(r8)
                r0 = 1140457472(0x43fa0000, float:500.0)
                int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r0 >= 0) goto L43
                int r0 = r7.getTop()
                float r2 = (float) r0
                com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior<T> r0 = r6.LIZ
                int r0 = r0.LIZJ
                float r1 = (float) r0
                r0 = 1056964608(0x3f000000, float:0.5)
                float r1 = r1 * r0
                int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                if (r0 < 0) goto L6d
            L43:
                r2 = 1
                com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior<T> r0 = r6.LIZ
                int r5 = r0.LIZLLL
            L48:
                r7.getTop()
                int r0 = r7.getLeft()
                boolean r0 = r4.LJIJI(r0, r5)
                if (r0 == 0) goto L6f
                com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior<T> r1 = r6.LIZ
                r0 = 3
                r1.setStateInternal(r0)
                X.16BK r1 = new X.16BK
                com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior<T> r0 = r6.LIZ
                r1.<init>(r0, r7, r2)
                r7.postOnAnimation(r1)
                return
            L66:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 <= 0) goto L6d
                goto L28
            L6b:
                r1 = 0
                goto L21
            L6d:
                r2 = 0
                goto L48
            L6f:
                com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior<T> r0 = r6.LIZ
                r0.setStateInternal(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C16BL.onViewReleased(android.view.View, float, float):void");
        }

        @Override // X.AbstractC21586119dr
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int i5;
            view.offsetLeftAndRight(-i);
            int top = view.getTop();
            this.LIZ.getClass();
            if (view.getLayoutDirection() == 1) {
                i5 = top - i3;
            } else {
                i5 = top + i3;
            }
            int iMax = Math.max(i5, 0);
            if (Math.abs(i4) > Math.abs(i3)) {
                iMax = top;
            }
            view.offsetTopAndBottom(iMax - top);
            float f = 1 - (iMax / r1.LIZLLL);
            Iterator it2 = ((ArrayList) this.LIZ.LJII).iterator();
            while (it2.hasNext()) {
                ((C16BM) it2.next()).LIZ(f);
            }
        }
    };

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LIZIZ = null;
        this.LIZ = null;
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        super.onAttachedToLayoutParams(c16g1);
        this.LIZIZ = null;
        this.LIZ = null;
    }

    public final void setStateInternal(int i) {
        this.LJIIIIZZ = i;
        WeakReference<View> weakReference = this.LIZIZ;
        if (weakReference != null && weakReference.get() != null) {
            Iterator it2 = ((ArrayList) this.LJII).iterator();
            while (it2.hasNext()) {
                ((C16BM) it2.next()).LIZIZ(i);
            }
        }
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, T t, MotionEvent motionEvent) {
        C21586019dq c21586019dq = this.LIZ;
        if (c21586019dq == null) {
            return super.onInterceptTouchEvent(c16g0, t, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked == 0) {
                this.LJ = (int) motionEvent.getX();
                this.LJI = false;
                if (c21586019dq.LIZ == 1) {
                    c21586019dq.LIZ();
                }
            }
            if (this.LJI && c21586019dq.LJIJJ(motionEvent)) {
                return true;
            }
            if (actionMasked == 2 && Math.abs(motionEvent.getX() - this.LJ) > c21586019dq.LIZIZ) {
                if (this.LJI) {
                    return true;
                }
                this.LJI = true;
                return false;
            }
            return false;
        }
        this.LJI = false;
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, T t, int i) {
        this.LIZJ = c16g0.getWidth();
        this.LIZLLL = c16g0.getHeight();
        if (this.LIZIZ == null) {
            this.LIZIZ = new WeakReference<>(c16g0.getChildAt(0));
        }
        if (this.LIZ == null) {
            this.LIZ = C21586019dq.LJIIIZ(c16g0, this.LJIIIZ);
        }
        int top = t.getTop();
        c16g0.LJIIL(i, t);
        int i2 = this.LJIIIIZZ;
        if (i2 == 3 || i2 == 2) {
            t.offsetTopAndBottom(top - t.getTop());
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r6, T r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            X.19dq r4 = r5.LIZ
            if (r4 != 0) goto L9
            boolean r0 = super.onTouchEvent(r6, r7, r8)
            return r0
        L9:
            int r3 = r8.getActionMasked()
            r2 = 0
            r1 = 1
            if (r3 == 0) goto L36
            if (r3 == r1) goto L31
            r0 = 2
            if (r3 == r0) goto L1d
            r0 = 3
            if (r3 == r0) goto L31
        L19:
            r4.LJIILIIL(r8)
            return r1
        L1d:
            boolean r0 = r5.LJFF
            if (r0 != 0) goto L19
            r5.LJFF = r1
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r8)
            r0.setAction(r2)
            r4.LJIILIIL(r0)
            r0.recycle()
            goto L19
        L31:
            r5.LJFF = r2
            r5.LJI = r2
            goto L19
        L36:
            r5.LJFF = r1
            r5.LJI = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.landpage.embedded.behavior.SwipeToScrollDownBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }
}
