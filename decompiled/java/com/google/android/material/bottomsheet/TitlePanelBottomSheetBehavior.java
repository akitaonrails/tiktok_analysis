package com.google.android.material.bottomsheet;

import X.AbstractC1354300lLY;
import X.C01GW;
import X.C1318590kPx;
import X.C1318600kPy;
import X.C1354330lLb;
import X.C1370830lmD;
import X.C1370840lmE;
import X.C16G0;
import X.C2548009yg;
import X.C2549009yq;
import X.C426750GoL;
import X.C452501pT;
import X.InterfaceC1354320lLa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.lang.ref.Reference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TitlePanelBottomSheetBehavior extends BottomSheetBehavior<View> {
    public InterfaceC1354320lLa beginHideCallback;
    public float downX;
    public float downY;
    public boolean handlingHorizontalDragExit;
    public float lastMappedY;
    public float lastX;
    public float lastY;
    public boolean maybeSwipeBackGesture;
    public AbstractC1354300lLY optBottomSheetCallback;
    public Runnable pendingStateSetter;
    public Integer targetState;
    public final C01GW touchSlop$delegate;
    public final C01GW viewConfiguration$delegate;
    public static final C1354330lLb Companion = new Object() { // from class: X.0lLb
    };
    public static final int $stable = 8;

    private final int getTouchSlop() {
        return ((Number) this.touchSlop$delegate.getValue()).intValue();
    }

    public final ViewConfiguration getViewConfiguration() {
        return (ViewConfiguration) this.viewConfiguration$delegate.getValue();
    }

    public TitlePanelBottomSheetBehavior() {
        this.viewConfiguration$delegate = C452501pT.LIZIZ(new C1370830lmD());
        this.touchSlop$delegate = C452501pT.LIZIZ(new C1370840lmE(this));
        this.maybeSwipeBackGesture = true;
    }

    public final InterfaceC1354320lLa getBeginHideCallback$common_feed_release() {
        return this.beginHideCallback;
    }

    public final AbstractC1354300lLY getOptBottomSheetCallback() {
        return this.optBottomSheetCallback;
    }

    public final Integer getTargetState$common_feed_release() {
        return this.targetState;
    }

    private final void settleToStatePendingLayout(final int i) {
        final View view;
        Reference reference = this.viewRef;
        if (reference != null && (view = (View) reference.get()) != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                this.pendingStateSetter = new Runnable() { // from class: X.0lmB
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TitlePanelBottomSheetBehavior@8293.settleToStatePendingLayout$1");
                        try {
                            this.LL.settleToState(view, i);
                            this.LL.pendingStateSetter = null;
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TitlePanelBottomSheetBehavior@8293.settleToStatePendingLayout$1");
                    }
                };
                HandlerHook.viewPost(view, this.pendingStateSetter);
            } else {
                settleToState(view, i);
            }
        }
    }

    public final void setBeginHideCallback$common_feed_release(InterfaceC1354320lLa interfaceC1354320lLa) {
        this.beginHideCallback = interfaceC1354320lLa;
    }

    public final void setOptBottomSheetCallback(AbstractC1354300lLY abstractC1354300lLY) {
        if (Intrinsics.LJFF(this.optBottomSheetCallback, abstractC1354300lLY)) {
            return;
        }
        AbstractC1354300lLY abstractC1354300lLY2 = this.optBottomSheetCallback;
        if (abstractC1354300lLY2 != null) {
            removeBottomSheetCallback(abstractC1354300lLY2);
        }
        if (abstractC1354300lLY != null) {
            addBottomSheetCallback(abstractC1354300lLY);
        }
        this.optBottomSheetCallback = abstractC1354300lLY;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public void setState(int i) {
        Reference reference;
        View view;
        if (i == this.state) {
            return;
        }
        Runnable runnable = this.pendingStateSetter;
        if (runnable != null && (reference = this.viewRef) != null && (view = (View) reference.get()) != null) {
            HandlerHook.viewRemoveCallbacks(view, runnable);
        }
        if (this.viewRef == null) {
            if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.state = i;
                AbstractC1354300lLY abstractC1354300lLY = this.optBottomSheetCallback;
                if (abstractC1354300lLY != null) {
                    abstractC1354300lLY.LJ(i);
                    return;
                }
                return;
            }
            return;
        }
        settleToStatePendingLayout(i);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public void setStateInternal(int i) {
        AbstractC1354300lLY abstractC1354300lLY;
        super.setStateInternal(i);
        Integer num = this.targetState;
        if (num != null) {
            num.intValue();
        }
        if (this.viewRef == null && (abstractC1354300lLY = this.optBottomSheetCallback) != null) {
            abstractC1354300lLY.LJ(i);
        }
    }

    public TitlePanelBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewConfiguration$delegate = C452501pT.LIZIZ(new C1370830lmD());
        this.touchSlop$delegate = C452501pT.LIZIZ(new C1370840lmE(this));
        this.maybeSwipeBackGesture = true;
    }

    private final boolean isAdScrollView(C16G0 c16g0, int i, int i2) {
        ViewGroup viewGroupFindScrollView;
        int i3;
        boolean z = C2549009yq.LIZ;
        if (!C2549009yq.LIZ || (viewGroupFindScrollView = findScrollView(c16g0, c16g0, i, i2)) == null) {
            return false;
        }
        if (C426750GoL.LIZLLL(c16g0.getContext())) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        if (!viewGroupFindScrollView.canScrollHorizontally(i3)) {
            return false;
        }
        return true;
    }

    private final boolean isPointInCanScrollChildPowerList(C16G0 c16g0, int i, int i2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvFindPowerList;
        int i3;
        boolean z = C2548009yg.LIZ;
        if (!C2548009yg.LIZ || (viewOnAttachStateChangeListenerC20604515jvFindPowerList = findPowerList(c16g0, c16g0, i, i2)) == null) {
            return false;
        }
        if (C426750GoL.LIZLLL(c16g0.getContext())) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        if (!viewOnAttachStateChangeListenerC20604515jvFindPowerList.canScrollHorizontally(i3)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        float x;
        float x2;
        if (motionEvent.getAction() == 0) {
            this.handlingHorizontalDragExit = false;
            this.maybeSwipeBackGesture = true;
            this.downX = motionEvent.getX();
            this.downY = motionEvent.getY();
            this.lastX = motionEvent.getX();
            this.lastY = motionEvent.getY();
            this.lastMappedY = 0.0f;
            if (!c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view) || isPointInCanScrollChildPowerList(c16g0, (int) motionEvent.getX(), (int) motionEvent.getY()) || isAdScrollView(c16g0, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.maybeSwipeBackGesture = false;
            }
        }
        if (this.maybeSwipeBackGesture && motionEvent.getAction() == 2) {
            float x3 = motionEvent.getX() - this.downX;
            if (C426750GoL.LIZLLL(view.getContext())) {
                x = this.downX;
                x2 = motionEvent.getX();
            } else {
                x = motionEvent.getX();
                x2 = this.downX;
            }
            float f = x - x2;
            float y = motionEvent.getY() - this.downY;
            float fAbs = Math.abs(x3);
            float fAbs2 = Math.abs(y);
            if (fAbs > getTouchSlop() || fAbs2 > getTouchSlop()) {
                if (f > 0.0f && fAbs > 2 * fAbs2) {
                    this.handlingHorizontalDragExit = true;
                    return true;
                }
                this.maybeSwipeBackGesture = false;
            }
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        Integer num;
        int height = view.getHeight();
        boolean zOnLayoutChild = super.onLayoutChild(c16g0, view, i);
        if (view.getLayoutParams().height == -2 && view.getHeight() != height && this.state == 2 && (num = this.targetState) != null && num.intValue() == 3) {
            startSettlingAnimation(view, 3, getExpandedOffset(), false);
        }
        return zOnLayoutChild;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.C16BC
    public boolean onTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        float x;
        float x2;
        float measuredHeight;
        if (this.handlingHorizontalDragExit && motionEvent.getAction() == 2) {
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
            float fMax = Math.max(this.lastMappedY + (f * measuredHeight), this.downY);
            this.lastMappedY = fMax;
            return super.onTouchEvent(c16g0, view, MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 2, this.downX, fMax, motionEvent.getMetaState()));
        }
        return super.onTouchEvent(c16g0, view, motionEvent);
    }

    private final ViewOnAttachStateChangeListenerC20604515jv findPowerList(C16G0 c16g0, View view, int i, int i2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        LinearLayoutManager linearLayoutManager;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvFindPowerList = findPowerList(c16g0, viewGroup.getChildAt(childCount), i, i2);
                if (viewOnAttachStateChangeListenerC20604515jvFindPowerList != null) {
                    return viewOnAttachStateChangeListenerC20604515jvFindPowerList;
                }
            }
        }
        if ((view instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view) != null) {
            RecyclerView.LayoutManager layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.getOrientation() == 0 && viewOnAttachStateChangeListenerC20604515jv.getVisibility() == 0 && c16g0.LJIIJ(i, i2, viewOnAttachStateChangeListenerC20604515jv)) {
                return viewOnAttachStateChangeListenerC20604515jv;
            }
        }
        return null;
    }

    private final ViewGroup findScrollView(C16G0 c16g0, View view, int i, int i2) {
        C1318590kPx c1318590kPx;
        C1318600kPy hScrollView;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                ViewGroup viewGroupFindScrollView = findScrollView(c16g0, viewGroup.getChildAt(childCount), i, i2);
                if (viewGroupFindScrollView != null) {
                    return viewGroupFindScrollView;
                }
            }
        }
        if (!(view instanceof C1318590kPx) || (c1318590kPx = (C1318590kPx) view) == null || (hScrollView = c1318590kPx.getHScrollView()) == null || hScrollView.getVisibility() != 0 || !c16g0.LJIIJ(i, i2, hScrollView)) {
            return null;
        }
        return hScrollView;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public void startSettlingAnimation(View view, int i, int i2, boolean z) {
        if (this.state == 1 && i == 5) {
            if (this.handlingHorizontalDragExit) {
                InterfaceC1354320lLa interfaceC1354320lLa = this.beginHideCallback;
                if (interfaceC1354320lLa != null) {
                    interfaceC1354320lLa.LIZ(0);
                }
            } else {
                InterfaceC1354320lLa interfaceC1354320lLa2 = this.beginHideCallback;
                if (interfaceC1354320lLa2 != null) {
                    interfaceC1354320lLa2.LIZ(1);
                }
            }
        }
        this.targetState = Integer.valueOf(i);
        super.startSettlingAnimation(view, i, i2, z);
    }
}
