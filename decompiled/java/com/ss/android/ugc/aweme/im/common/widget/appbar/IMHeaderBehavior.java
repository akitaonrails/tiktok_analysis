package com.ss.android.ugc.aweme.im.common.widget.appbar;

import X.C16G0;
import X.C16GN;
import X.C419990GdR;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes32.dex */
public abstract class IMHeaderBehavior<V extends View> extends IMViewOffsetBehavior<V> {
    public C16GN LIZJ;
    public OverScroller LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public VelocityTracker LJIIIIZZ;

    public boolean canDragView(V v) {
        return false;
    }

    public void onFlingFinished(C16G0 c16g0, V v) {
    }

    public IMHeaderBehavior() {
        this.LJFF = -1;
        this.LJII = -1;
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

    public IMHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJFF = -1;
        this.LJII = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.LJII
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.LJII = r0
        L12:
            int r0 = r9.getAction()
            r5 = 2
            r4 = 1
            if (r0 != r5) goto L1f
            boolean r0 = r6.LJ
            if (r0 == 0) goto L1f
            return r4
        L1f:
            int r2 = r9.getActionMasked()
            r3 = 0
            if (r2 == 0) goto L67
            r1 = -1
            if (r2 == r4) goto L58
            if (r2 == r5) goto L38
            r0 = 3
            if (r2 == r0) goto L58
        L2e:
            android.view.VelocityTracker r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L35
            r0.addMovement(r9)
        L35:
            boolean r0 = r6.LJ
            return r0
        L38:
            int r0 = r6.LJFF
            if (r0 == r1) goto L2e
            int r0 = r9.findPointerIndex(r0)
            if (r0 == r1) goto L2e
            float r0 = r9.getY(r0)
            int r2 = (int) r0
            int r0 = r6.LJI
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r6.LJII
            if (r1 <= r0) goto L2e
            r6.LJ = r4
            r6.LJI = r2
            goto L2e
        L58:
            r6.LJ = r3
            r6.LJFF = r1
            android.view.VelocityTracker r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L63
            r0.recycle()
        L63:
            r0 = 0
            r6.LJIIIIZZ = r0
            goto L2e
        L67:
            r6.LJ = r3
            float r0 = r9.getX()
            int r2 = (int) r0
            float r0 = r9.getY()
            int r1 = (int) r0
            boolean r0 = r6.canDragView(r8)
            if (r0 == 0) goto L2e
            boolean r0 = r7.LJIIJ(r2, r1, r8)
            if (r0 == 0) goto L2e
            r6.LJI = r1
            int r0 = r9.getPointerId(r3)
            r6.LJFF = r0
            android.view.VelocityTracker r0 = r6.LJIIIIZZ
            if (r0 != 0) goto L2e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.LJIIIIZZ = r0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.common.widget.appbar.IMHeaderBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.16GN, java.lang.Runnable] */
    @Override // X.C16BC
    public final boolean onTouchEvent(final C16G0 c16g0, final V v, MotionEvent motionEvent) {
        if (this.LJII < 0) {
            this.LJII = ViewConfiguration.get(c16g0.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.LJ = false;
                        this.LJFF = -1;
                        VelocityTracker velocityTracker = this.LJIIIIZZ;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        this.LJIIIIZZ = null;
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.LJFF);
                    if (iFindPointerIndex == -1) {
                        return false;
                    }
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i = this.LJI - y;
                    if (!this.LJ) {
                        int iAbs = Math.abs(i);
                        int i2 = this.LJII;
                        if (iAbs > i2) {
                            this.LJ = true;
                            i = i > 0 ? i - i2 : i + i2;
                        }
                    }
                    if (this.LJ) {
                        this.LJI = y;
                        setHeaderTopBottomOffset(c16g0, v, getTopBottomOffsetForScrollingSibling() - i, getMaxDragOffset(v), 0);
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.LJIIIIZZ;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                    velocityTracker2.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                    float yVelocity = velocityTracker2.getYVelocity(this.LJFF);
                    int i3 = -getScrollRangeForDragFling(v);
                    C16GN c16gn = this.LIZJ;
                    if (c16gn != null) {
                        HandlerHook.viewRemoveCallbacks(v, c16gn);
                        this.LIZJ = null;
                    }
                    if (this.LIZLLL == null) {
                        this.LIZLLL = new OverScroller(v.getContext());
                    }
                    OverScroller overScroller = this.LIZLLL;
                    if (overScroller != null) {
                        overScroller.fling(0, getTopAndBottomOffset(), 0, Math.round(yVelocity), 0, 0, i3, 0);
                        if (overScroller.computeScrollOffset()) {
                            ?? r0 = new Runnable(c16g0, v) { // from class: X.16GN
                                public final C16G0 LL;

                                /* JADX INFO: Incorrect field signature: TV; */
                                public final View LLILLJJLI;

                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                public final void LIZ() {
                                    OverScroller overScroller2 = this.LLILLL.LIZLLL;
                                    if (overScroller2 == null) {
                                        return;
                                    }
                                    if (!overScroller2.computeScrollOffset()) {
                                        this.LLILLL.onFlingFinished(this.LL, this.LLILLJJLI);
                                    } else {
                                        this.LLILLL.setHeaderTopBottomOffset(this.LL, this.LLILLJJLI, overScroller2.getCurrY());
                                        this.LLILLJJLI.postOnAnimation(this);
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("IMHeaderBehavior$FlingRunnable@1da1.run");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("IMHeaderBehavior$FlingRunnable@1da1.run");
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    this.LL = c16g0;
                                    this.LLILLJJLI = v;
                                }
                            };
                            this.LIZJ = r0;
                            v.postOnAnimation(r0);
                        } else {
                            onFlingFinished(c16g0, v);
                        }
                    }
                }
                this.LJ = false;
                this.LJFF = -1;
                VelocityTracker velocityTracker3 = this.LJIIIIZZ;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                }
                this.LJIIIIZZ = null;
            }
        } else {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!c16g0.LJIIJ(x, y2, v) || !canDragView(v)) {
                return false;
            }
            this.LJI = y2;
            this.LJFF = motionEvent.getPointerId(0);
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = VelocityTracker.obtain();
            }
        }
        VelocityTracker velocityTracker4 = this.LJIIIIZZ;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEvent);
        }
        return true;
    }

    public final int setHeaderTopBottomOffset(C16G0 c16g0, V v, int i) {
        return setHeaderTopBottomOffset(c16g0, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
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
