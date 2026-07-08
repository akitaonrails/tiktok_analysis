package com.google.android.material.appbar;

import X.C16G0;
import X.C16GU;
import X.C419990GdR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.appbar.HeaderBehavior;

/* JADX INFO: loaded from: classes32.dex */
public abstract class HeaderBehavior<V extends View> extends C16GU<V> {
    public int activePointerId;
    public Runnable flingRunnable;
    public boolean isBeingDragged;
    public int lastMotionY;
    public OverScroller scroller;
    public int touchSlop;
    public VelocityTracker velocityTracker;

    public boolean canDragView(V v) {
        return false;
    }

    public void onFlingFinished(C16G0 c16g0, V v) {
    }

    private void ensureVelocityTracker() {
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
    }

    public HeaderBehavior() {
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset();
    }

    public int getMaxDragOffset(V v) {
        return -v.getHeight();
    }

    public int getScrollRangeForDragFling(V v) {
        return v.getHeight();
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.activePointerId = -1;
        this.touchSlop = -1;
    }

    @Override // X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        int iFindPointerIndex;
        if (this.touchSlop < 0) {
            this.touchSlop = ViewConfiguration.get(c16g0.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.isBeingDragged) {
            int i = this.activePointerId;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y - this.lastMotionY) > this.touchSlop) {
                this.lastMotionY = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.activePointerId = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (canDragView(v) && c16g0.LJIIJ(x, y2, v)) {
                z = true;
            } else {
                z = false;
            }
            this.isBeingDragged = z;
            if (z) {
                this.lastMotionY = y2;
                this.activePointerId = motionEvent.getPointerId(0);
                ensureVelocityTracker();
                OverScroller overScroller = this.scroller;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.scroller.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(X.C16G0 r18, V r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r3 = r20
            int r1 = r3.getActionMasked()
            r4 = -1
            r2 = 1
            r10 = 0
            r7 = r19
            r6 = r18
            r5 = r17
            if (r1 == r2) goto L5e
            r0 = 2
            if (r1 == r0) goto L43
            r0 = 3
            if (r1 == r0) goto L90
            r0 = 6
            if (r1 != r0) goto L31
            int r0 = r3.getActionIndex()
            if (r0 != 0) goto L41
            r1 = 1
        L21:
            int r0 = r3.getPointerId(r1)
            r5.activePointerId = r0
            float r1 = r3.getY(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r5.lastMotionY = r0
        L31:
            r1 = 0
        L32:
            android.view.VelocityTracker r0 = r5.velocityTracker
            if (r0 == 0) goto L39
            r0.addMovement(r3)
        L39:
            boolean r0 = r5.isBeingDragged
            if (r0 != 0) goto L40
            if (r1 != 0) goto L40
            r2 = 0
        L40:
            return r2
        L41:
            r1 = 0
            goto L21
        L43:
            int r0 = r5.activePointerId
            int r0 = r3.findPointerIndex(r0)
            if (r0 != r4) goto L4c
            return r10
        L4c:
            float r0 = r3.getY(r0)
            int r0 = (int) r0
            int r8 = r5.lastMotionY
            int r8 = r8 - r0
            r5.lastMotionY = r0
            int r9 = r5.getMaxDragOffset(r7)
            r5.scroll(r6, r7, r8, r9, r10)
            goto L31
        L5e:
            android.view.VelocityTracker r0 = r5.velocityTracker
            if (r0 == 0) goto L90
            r0.addMovement(r3)
            android.view.VelocityTracker r1 = r5.velocityTracker
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            android.view.VelocityTracker r1 = r5.velocityTracker
            int r0 = r5.activePointerId
            float r16 = r1.getYVelocity(r0)
            int r0 = r5.getScrollRangeForDragFling(r7)
            int r14 = -r0
            r11 = r5
            r12 = r6
            r13 = r7
            r15 = r10
            r11.fling(r12, r13, r14, r15, r16)
            r1 = 1
        L81:
            r5.isBeingDragged = r10
            r5.activePointerId = r4
            android.view.VelocityTracker r0 = r5.velocityTracker
            if (r0 == 0) goto L32
            r0.recycle()
            r0 = 0
            r5.velocityTracker = r0
            goto L32
        L90:
            r1 = 0
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    public int setHeaderTopBottomOffset(C16G0 c16g0, V v, int i) {
        return setHeaderTopBottomOffset(c16g0, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public final boolean fling(final C16G0 c16g0, final V v, int i, int i2, float f) {
        Runnable runnable = this.flingRunnable;
        if (runnable != null) {
            HandlerHook.viewRemoveCallbacks(v, runnable);
            this.flingRunnable = null;
        }
        if (this.scroller == null) {
            this.scroller = new OverScroller(v.getContext());
        }
        this.scroller.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.scroller.computeScrollOffset()) {
            Runnable runnable2 = new Runnable(c16g0, v) { // from class: X.16GO
                public final C16G0 LL;

                /* JADX INFO: Incorrect field signature: TV; */
                public final View LLILLJJLI;

                public final void LIZ() {
                    OverScroller overScroller;
                    if (this.LLILLJJLI == null || (overScroller = this.LLILLL.scroller) == null) {
                        return;
                    }
                    if (!overScroller.computeScrollOffset()) {
                        this.LLILLL.onFlingFinished(this.LL, this.LLILLJJLI);
                        return;
                    }
                    HeaderBehavior headerBehavior = this.LLILLL;
                    headerBehavior.setHeaderTopBottomOffset(this.LL, this.LLILLJJLI, headerBehavior.scroller.getCurrY());
                    this.LLILLJJLI.postOnAnimation(this);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("HeaderBehavior$FlingRunnable@17e8.run");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("HeaderBehavior$FlingRunnable@17e8.run");
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = c16g0;
                    this.LLILLJJLI = v;
                }
            };
            this.flingRunnable = runnable2;
            v.postOnAnimation(runnable2);
            return true;
        }
        onFlingFinished(c16g0, v);
        return false;
    }

    public final int scroll(C16G0 c16g0, V v, int i, int i2, int i3) {
        return setHeaderTopBottomOffset(c16g0, v, getTopBottomOffsetForScrollingSibling() - i, i2, i3);
    }

    public int setHeaderTopBottomOffset(C16G0 c16g0, V v, int i, int i2, int i3) {
        int iLIZIZ;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 != 0 && topAndBottomOffset >= i2 && topAndBottomOffset <= i3 && topAndBottomOffset != (iLIZIZ = C419990GdR.LIZIZ(i, i2, i3))) {
            setTopAndBottomOffset(iLIZIZ);
            return topAndBottomOffset - iLIZIZ;
        }
        return 0;
    }
}
