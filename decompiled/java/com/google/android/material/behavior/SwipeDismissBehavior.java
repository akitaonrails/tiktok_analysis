package com.google.android.material.behavior;

import X.AbstractC21586119dr;
import X.C16BC;
import X.C16BY;
import X.C16G0;
import X.C20092413jW;
import X.C21586019dq;
import X.InterfaceC20092813ja;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public class SwipeDismissBehavior<V extends View> extends C16BC<V> {
    public C21586019dq LIZ;
    public boolean LIZIZ;
    public float LJ;
    public int LIZJ = 2;
    public final float LIZLLL = 0.5f;
    public float LJFF = 0.5f;
    public final C16BY LJI = new AbstractC21586119dr() { // from class: X.16BY
        public int LIZ;
        public int LIZIZ = -1;

        @Override // X.AbstractC21586119dr
        public final int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // X.AbstractC21586119dr
        public final void onViewDragStateChanged(int i) {
            this.LIZJ.getClass();
        }

        @Override // X.AbstractC21586119dr
        public final void onViewCaptured(View view, int i) {
            this.LIZIZ = i;
            this.LIZ = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // X.AbstractC21586119dr
        public final boolean tryCaptureView(View view, int i) {
            int i2 = this.LIZIZ;
            if ((i2 == -1 || i2 == i) && this.LIZJ.LIZ(view)) {
                return true;
            }
            return false;
        }

        @Override // X.AbstractC21586119dr
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            boolean z;
            int width;
            int width2;
            int width3;
            if (view.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = this.LIZJ.LIZJ;
            if (i3 == 0) {
                if (z) {
                    width = this.LIZ - view.getWidth();
                    width2 = this.LIZ;
                } else {
                    width = this.LIZ;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.LIZ;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.LIZ - view.getWidth();
                    width2 = this.LIZ;
                }
            } else {
                width = this.LIZ - view.getWidth();
                width2 = view.getWidth() + this.LIZ;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // X.AbstractC21586119dr
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // X.AbstractC21586119dr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onViewReleased(final android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = -1
                r7.LIZIZ = r0
                int r6 = r8.getWidth()
                r5 = 0
                int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                r3 = 1
                if (r4 == 0) goto L60
                int r0 = r8.getLayoutDirection()
                if (r0 != r3) goto L5e
                r2 = 1
            L14:
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
                int r1 = r0.LIZJ
                r0 = 2
                if (r1 == r0) goto L23
                if (r1 != 0) goto L52
                if (r2 == 0) goto L4f
                int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r0 >= 0) goto L7c
            L23:
                int r0 = r8.getLeft()
                int r2 = r7.LIZ
                if (r0 >= r2) goto L4d
                int r2 = r2 - r6
            L2c:
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
                X.19dq r1 = r0.LIZ
                int r0 = r8.getTop()
                boolean r0 = r1.LJIJI(r2, r0)
                if (r0 == 0) goto L45
                X.16BZ r1 = new X.16BZ
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
                r1.<init>(r8, r3)
                r8.postOnAnimation(r1)
            L44:
                return
            L45:
                if (r3 == 0) goto L44
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
                r0.getClass()
                return
            L4d:
                int r2 = r2 + r6
                goto L2c
            L4f:
                if (r4 <= 0) goto L7c
                goto L23
            L52:
                if (r1 != r3) goto L7c
                if (r2 == 0) goto L59
                if (r4 <= 0) goto L7c
                goto L23
            L59:
                int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r0 >= 0) goto L7c
                goto L23
            L5e:
                r2 = 0
                goto L14
            L60:
                int r2 = r8.getLeft()
                int r0 = r7.LIZ
                int r2 = r2 - r0
                int r0 = r8.getWidth()
                float r1 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r0 = r7.LIZJ
                float r0 = r0.LIZLLL
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                int r0 = java.lang.Math.abs(r2)
                if (r0 < r1) goto L7c
                goto L23
            L7c:
                int r2 = r7.LIZ
                r3 = 0
                goto L2c
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C16BY.onViewReleased(android.view.View, float, float):void");
        }

        @Override // X.AbstractC21586119dr
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = this.LIZ + (view.getWidth() * this.LIZJ.LJ);
            float width2 = this.LIZ + (view.getWidth() * this.LIZJ.LJFF);
            float f = i;
            if (f <= width) {
                C786410Ut5.T4(view, 1.0f);
            } else if (f >= width2) {
                C786410Ut5.T4(view, 0.0f);
            } else {
                C786410Ut5.T4(view, Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }
    };

    public boolean LIZ(View view) {
        return true;
    }

    @Override // X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean zLJIIJ = this.LIZIZ;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LIZIZ = false;
            }
        } else {
            zLJIIJ = c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), v);
            this.LIZIZ = zLJIIJ;
        }
        if (!zLJIIJ) {
            return false;
        }
        if (this.LIZ == null) {
            this.LIZ = C21586019dq.LJIIIZ(c16g0, this.LJI);
        }
        return this.LIZ.LJIJJ(motionEvent);
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        boolean zOnLayoutChild = super.onLayoutChild(c16g0, v, i);
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            q0.LJIILJJIL(1048576, v);
            q0.LJIIJJI(0, v);
            if (LIZ(v)) {
                q0.LJIILL(v, C20092413jW.LJIL, null, new InterfaceC20092813ja() { // from class: X.16Ba
                    @Override // X.InterfaceC20092813ja
                    public final boolean LIZ(View view) {
                        boolean z;
                        boolean z2 = false;
                        if (!this.LIZ.LIZ(view)) {
                            return false;
                        }
                        if (view.getLayoutDirection() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        int i2 = this.LIZ.LIZJ;
                        if (i2 != 0 ? !(i2 != 1 || z) : z) {
                            z2 = true;
                        }
                        int width = view.getWidth();
                        if (z2) {
                            width = -width;
                        }
                        view.offsetLeftAndRight(width);
                        C786410Ut5.T4(view, 0.0f);
                        this.LIZ.getClass();
                        return true;
                    }
                });
            }
        }
        return zOnLayoutChild;
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        C21586019dq c21586019dq = this.LIZ;
        if (c21586019dq != null) {
            c21586019dq.LJIILIIL(motionEvent);
            return true;
        }
        return false;
    }
}
