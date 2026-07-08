package com.ss.android.ugc.aweme.feed.flexible.ui;

import X.AbstractC1177930gl5;
import X.C01GW;
import X.C16G0;
import X.C20270214Tc;
import X.C269370Ah5;
import X.C426750GoL;
import X.C452501pT;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.flexible.ui.FlexibleBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FlexibleBottomSheetBehavior extends BottomSheetBehavior<View> {
    public boolean canXSwipeClose;
    public Function0<Unit> clockTimer;
    public boolean clockTrigger;
    public GestureDetector detector;
    public float downX;
    public float downY;
    public boolean enableDragExpand;
    public boolean handlingDragExit;
    public boolean ignoreThisGesture;
    public View insetScrollRoot;
    public Function1<? super String, Unit> invocationWithReasonWhenDragHide;
    public boolean isFullyExpand;
    public float lastMappedY;
    public float lastX;
    public float lastY;
    public boolean maybeSwipeBackGesture;
    public float sheetScrollOffset;
    public int timer;
    public final C01GW touchSlop$delegate;
    public final C01GW viewConfiguration$delegate;
    public static final C20270214Tc Companion = new Object() { // from class: X.14Tc
    };
    public static final int $stable = 8;

    private final int getTouchSlop() {
        return ((Number) this.touchSlop$delegate.getValue()).intValue();
    }

    public final ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) this.viewConfiguration$delegate.getValue();
    }

    public FlexibleBottomSheetBehavior() {
        this.viewConfiguration$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(303));
        this.touchSlop$delegate = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2187));
        this.canXSwipeClose = true;
        this.maybeSwipeBackGesture = true;
        this.enableDragExpand = true;
        this.clockTimer = new AwS577S0100000_33(this, 2186);
        this.timer = 500;
        addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.19eF
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                String str;
                if (i == 5) {
                    FlexibleBottomSheetBehavior flexibleBottomSheetBehavior = this.LIZ;
                    if (flexibleBottomSheetBehavior.clockTrigger) {
                        Function1<? super String, Unit> function1 = flexibleBottomSheetBehavior.invocationWithReasonWhenDragHide;
                        if (function1 != null) {
                            if (flexibleBottomSheetBehavior.handlingDragExit) {
                                str = "close_swipe_sideways";
                            } else {
                                str = "close_pull_down";
                            }
                            function1.invoke(str);
                        }
                        HandlerHook.viewRemoveCallbacks(view, new ARunnableS113S0100000_13(this.LIZ.clockTimer, (Function0<Unit>) 102));
                        this.LIZ.clockTrigger = false;
                    }
                }
            }
        });
    }

    public final boolean getCanXSwipeClose$common_feed_release() {
        return this.canXSwipeClose;
    }

    public final boolean getEnableDragExpand$common_feed_release() {
        return this.enableDragExpand;
    }

    public final View getInsetScrollRoot$common_feed_release() {
        return this.insetScrollRoot;
    }

    public final float getSheetScrollOffset$common_feed_release() {
        return this.sheetScrollOffset;
    }

    public final boolean isFullyExpand$common_feed_release() {
        return this.isFullyExpand;
    }

    public final void bind$common_feed_release(GestureDetector gestureDetector) {
        this.detector = gestureDetector;
    }

    public final void bindInvocationWithReasonWhenDragHide$common_feed_release(Function1<? super String, Unit> function1) {
        this.invocationWithReasonWhenDragHide = function1;
    }

    public final void setCanXSwipeClose$common_feed_release(boolean z) {
        this.canXSwipeClose = z;
    }

    public final void setEnableDragExpand$common_feed_release(boolean z) {
        this.enableDragExpand = z;
    }

    public final void setFullyExpand$common_feed_release(boolean z) {
        this.isFullyExpand = z;
    }

    public final void setInsetScrollRoot$common_feed_release(View view) {
        this.insetScrollRoot = view;
    }

    public final void setSheetScrollOffset$common_feed_release(float f) {
        this.sheetScrollOffset = f;
    }

    public FlexibleBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewConfiguration$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(303));
        this.touchSlop$delegate = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2187));
        this.canXSwipeClose = true;
        this.maybeSwipeBackGesture = true;
        this.enableDragExpand = true;
        this.clockTimer = new AwS577S0100000_33(this, 2186);
        this.timer = 500;
        addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.19eF
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view) {
                String str;
                if (i == 5) {
                    FlexibleBottomSheetBehavior flexibleBottomSheetBehavior = this.LIZ;
                    if (flexibleBottomSheetBehavior.clockTrigger) {
                        Function1<? super String, Unit> function1 = flexibleBottomSheetBehavior.invocationWithReasonWhenDragHide;
                        if (function1 != null) {
                            if (flexibleBottomSheetBehavior.handlingDragExit) {
                                str = "close_swipe_sideways";
                            } else {
                                str = "close_pull_down";
                            }
                            function1.invoke(str);
                        }
                        HandlerHook.viewRemoveCallbacks(view, new ARunnableS113S0100000_13(this.LIZ.clockTimer, (Function0<Unit>) 102));
                        this.LIZ.clockTrigger = false;
                    }
                }
            }
        });
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        float x;
        float x2;
        float x3;
        float x4;
        if (motionEvent.getAction() == 0) {
            this.handlingDragExit = false;
            this.ignoreThisGesture = false;
            this.maybeSwipeBackGesture = true;
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
            this.lastX = motionEvent.getX();
            this.lastY = motionEvent.getY();
        }
        if (this.ignoreThisGesture) {
            return false;
        }
        if (this.isFullyExpand) {
            if (motionEvent.getAction() == 2) {
                if (this.canXSwipeClose) {
                    float x5 = motionEvent.getX() - this.downX;
                    if (C426750GoL.LIZLLL(view.getContext())) {
                        x3 = this.downX;
                        x4 = motionEvent.getX();
                    } else {
                        x3 = motionEvent.getX();
                        x4 = this.downX;
                    }
                    float f = x3 - x4;
                    float y = motionEvent.getY() - this.downY;
                    float fAbs = Math.abs(x5);
                    if (fAbs > 2 * Math.abs(y) && fAbs > getTouchSlop() && f > 0.0f) {
                        if (canScrollH(c16g0, (int) x5, (int) motionEvent.getX(), (int) motionEvent.getY(), false)) {
                            return false;
                        }
                        if (this.maybeSwipeBackGesture) {
                            this.lastMappedY = this.downY;
                            this.handlingDragExit = true;
                            return true;
                        }
                        this.maybeSwipeBackGesture = false;
                    }
                }
                float y2 = this.lastY - motionEvent.getY();
                if (Math.abs(y2) < getTouchSlop()) {
                    return false;
                }
                View view2 = this.insetScrollRoot;
                if (view2 != null && view2.canScrollVertically((int) y2)) {
                    this.ignoreThisGesture = true;
                    return false;
                }
                return !canScrollV(c16g0, (int) y2, (int) motionEvent.getX(), (int) motionEvent.getY(), false);
            }
        } else {
            if (motionEvent.getActionMasked() == 5) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    float x6 = motionEvent.getX() - this.downX;
                    if (C426750GoL.LIZLLL(view.getContext())) {
                        x = this.downX;
                        x2 = motionEvent.getX();
                    } else {
                        x = motionEvent.getX();
                        x2 = this.downX;
                    }
                    float f2 = x - x2;
                    float y3 = motionEvent.getY() - this.downY;
                    float fAbs2 = Math.abs(x6);
                    float fAbs3 = Math.abs(y3);
                    if (fAbs2 > getTouchSlop()) {
                        if (canScrollH(c16g0, (int) x6, (int) motionEvent.getX(), (int) motionEvent.getY(), false)) {
                            return false;
                        }
                        if (this.maybeSwipeBackGesture && f2 > 0.0f && fAbs2 > 2 * fAbs3) {
                            this.lastMappedY = this.downY;
                            this.handlingDragExit = true;
                            return true;
                        }
                        this.maybeSwipeBackGesture = false;
                    }
                    if (fAbs3 > getTouchSlop()) {
                        return true;
                    }
                    this.lastX = motionEvent.getX();
                }
            } else if (!c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view)) {
                this.ignoreThisGesture = true;
            }
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public boolean onTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        float x;
        float x2;
        float measuredHeight;
        float fMax;
        GestureDetector gestureDetector = this.detector;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (this.handlingDragExit && motionEvent.getAction() == 2) {
            if (C426750GoL.LIZLLL(view.getContext())) {
                x = this.lastX;
                x2 = motionEvent.getX();
            } else {
                x = motionEvent.getX();
                x2 = this.lastX;
            }
            float f = x - x2;
            if (view.getMeasuredWidth() > 0) {
                measuredHeight = view.getMeasuredHeight() / view.getMeasuredWidth();
            } else {
                measuredHeight = 2.0f;
            }
            this.lastX = motionEvent.getX();
            if (f < 0.0f && this.sheetScrollOffset >= 0.73f) {
                fMax = this.lastMappedY;
            } else {
                fMax = Math.max(this.lastMappedY + (f * measuredHeight), this.downY);
            }
            this.lastMappedY = fMax;
            boolean zOnTouchEvent = super.onTouchEvent(c16g0, view, MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 2, this.downX, fMax, motionEvent.getMetaState()));
            if (motionEvent.getAction() == 1) {
                this.clockTrigger = true;
                HandlerHook.viewPostDelay(view, new ARunnableS113S0100000_13(this.clockTimer, (Function0<Unit>) 102), this.timer);
            }
            return zOnTouchEvent;
        }
        boolean zOnTouchEvent2 = super.onTouchEvent(c16g0, view, motionEvent);
        if (motionEvent.getAction() == 1) {
            this.clockTrigger = true;
            HandlerHook.viewPostDelay(view, new ARunnableS113S0100000_13(this.clockTimer, (Function0<Unit>) 102), this.timer);
        }
        return zOnTouchEvent2;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public void onStopNestedScroll(C16G0 c16g0, View view, View view2, int i) {
        if (((Boolean) C269370Ah5.LIZ.getValue()).booleanValue()) {
            return;
        }
        super.onStopNestedScroll(c16g0, view, view2, i);
    }

    private final boolean canScrollH(View view, int i, int i2, int i3, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = viewGroup.getScrollX() + i2;
            int scrollY = viewGroup.getScrollY() + i3;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (scrollX >= childAt.getLeft() && scrollX < childAt.getRight() && scrollY >= childAt.getTop() && scrollY < childAt.getBottom() && canScrollH(childAt, i, scrollX - childAt.getLeft(), scrollY - childAt.getTop(), true)) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    private final boolean canScrollV(View view, int i, int i2, int i3, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = viewGroup.getScrollX();
            int scrollY = viewGroup.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = scrollX + i2;
                int i5 = scrollY + i3;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && i4 >= childAt.getLeft() && i4 < childAt.getRight() && canScrollV(childAt, i, i4 - childAt.getLeft(), i5 - childAt.getTop(), true)) {
                    return true;
                }
            }
        }
        if (z && view.canScrollVertically(i)) {
            return true;
        }
        return false;
    }
}
