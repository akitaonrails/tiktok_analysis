package com.google.android.material.bottomsheet;

import X.AbstractC1177930gl5;
import X.AbstractC21586119dr;
import X.C1019103yf;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C19RN;
import X.C19RX;
import X.C19W0;
import X.C1C7U;
import X.C20092413jW;
import X.C21538919Rb;
import X.C21551419Vw;
import X.C21586019dq;
import X.C2188811AlT;
import X.EnumC1014603xw;
import X.InterfaceC20092813ja;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public class BottomSheetBehavior<V extends View> extends C16BC<V> {
    public static final int DEF_STYLE_RES = 2131887116;
    public int activePointerId;
    public final ArrayList<AbstractC1177930gl5> callbacks;
    public int childHeight;
    public int collapsedOffset;
    public final AbstractC21586119dr dragCallback;
    public boolean draggable;
    public float elevation;
    public int expandHalfwayActionId;
    public int expandedOffset;
    public boolean fitToContents;
    public int fitToContentsOffset;
    public int gestureInsetBottom;
    public boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio;
    public boolean hideable;
    public boolean ignoreEvents;
    public Map<View, Integer> importantForAccessibilityMap;
    public int initialY;
    public ValueAnimator interpolatorAnimator;
    public boolean isShapeExpanded;
    public int lastNestedScrollDy;
    public C21538919Rb materialShapeDrawable;
    public float maximumVelocity;
    public boolean nestedScrolled;
    public WeakReference<View> nestedScrollingChildRef;
    public int parentHeight;
    public int parentWidth;
    public int peekHeight;
    public boolean peekHeightAuto;
    public int peekHeightGestureInsetBuffer;
    public int peekHeightMin;
    public int saveFlags;
    public BottomSheetBehavior<V>.g settleRunnable;
    public C19RX shapeAppearanceModelDefault;
    public boolean shapeThemingEnabled;
    public boolean skipCollapsed;
    public int state;
    public boolean touchingScrollingChild;
    public boolean updateImportantForAccessibilityOnSiblings;
    public VelocityTracker velocityTracker;
    public C21586019dq viewDragHelper;
    public WeakReference<V> viewRef;

    public class g implements Runnable {
        public final View LL;
        public boolean LLILLJJLI;
        public int LLILLL;

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("BottomSheetBehavior$SettleRunnable@2cbd.run");
            try {
                C21586019dq c21586019dq = BottomSheetBehavior.this.viewDragHelper;
                if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
                    BottomSheetBehavior.this.setStateInternal(this.LLILLL);
                } else {
                    this.LL.postOnAnimation(this);
                }
                this.LLILLJJLI = false;
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("BottomSheetBehavior$SettleRunnable@2cbd.run");
        }

        public g(View view, int i) {
            this.LL = view;
            this.LLILLL = i;
        }
    }

    private void createShapeValueAnimator() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19dT
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C21538919Rb c21538919Rb = this.LL.materialShapeDrawable;
                if (c21538919Rb != null) {
                    c21538919Rb.LJIIL(fFloatValue);
                }
            }
        });
    }

    private float getYVelocity() {
        return com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_getYVelocity(this);
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    @Override // X.C16BC
    public void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // X.C16BC
    public boolean onTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        return com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onTouchEvent(this, c16g0, view, motionEvent);
    }

    public void settleToState(View view, int i) {
        com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_ecommerce_base_utils_BottomSheetFixHook_settleToState(this, view, i);
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private int calculatePeekHeight() {
        int i;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) : (this.gestureInsetBottomIgnored || (i = this.gestureInsetBottom) <= 0) ? this.peekHeight : Math.max(this.peekHeight, i + this.peekHeightGestureInsetBuffer);
    }

    private void updateAccessibilityActions() {
        V v;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        q0.LJIILJJIL(524288, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(262144, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(1048576, v);
        q0.LJIIJJI(0, v);
        int i = this.expandHalfwayActionId;
        if (i != -1) {
            q0.LJIILJJIL(i, v);
            q0.LJIIJJI(0, v);
        }
        if (this.state != 6) {
            this.expandHalfwayActionId = addAccessibilityActionForState(v, 2131827880, 6);
        }
        if (this.hideable && this.state != 5) {
            replaceAccessibilityActionForState(v, C20092413jW.LJIL, 5);
        }
        int i2 = this.state;
        if (i2 == 3) {
            replaceAccessibilityActionForState(v, C20092413jW.LJIJJLI, this.fitToContents ? 4 : 6);
            return;
        }
        if (i2 == 4) {
            replaceAccessibilityActionForState(v, C20092413jW.LJIJJ, this.fitToContents ? 3 : 6);
        } else if (i2 == 6) {
            replaceAccessibilityActionForState(v, C20092413jW.LJIJJLI, 4);
            replaceAccessibilityActionForState(v, C20092413jW.LJIJJ, 3);
        }
    }

    public float com_google_android_material_bottomsheet_BottomSheetBehavior__getYVelocity$___twin___() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    public int getExpandedOffset() {
        return this.fitToContents ? this.fitToContentsOffset : this.expandedOffset;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public BottomSheetBehavior() {
        this.fitToContents = true;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new AbstractC21586119dr() { // from class: X.19dS
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                if (bottomSheetBehavior.hideable) {
                    return bottomSheetBehavior.parentHeight;
                }
                return bottomSheetBehavior.collapsedOffset;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                    if (bottomSheetBehavior.draggable) {
                        bottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                int i2 = bottomSheetBehavior.state;
                if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if ((i2 == 3 && bottomSheetBehavior.activePointerId == i && (weakReference = bottomSheetBehavior.nestedScrollingChildRef) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.viewRef) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i, int i2) {
                int i3;
                int expandedOffset = this.LIZ.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                if (bottomSheetBehavior.hideable) {
                    i3 = bottomSheetBehavior.parentHeight;
                } else {
                    i3 = bottomSheetBehavior.collapsedOffset;
                }
                return C419990GdR.LIZIZ(i, expandedOffset, i3);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
            @Override // X.AbstractC21586119dr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewReleased(android.view.View r6, float r7, float r8) {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21583619dS.onViewReleased(android.view.View, float, float):void");
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
            }
        };
    }

    private void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - iCalculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - iCalculatePeekHeight;
        }
    }

    @Override // X.C16BC
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public static float com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_getYVelocity(BottomSheetBehavior bottomSheetBehavior) {
        try {
            return bottomSheetBehavior.com_google_android_material_bottomsheet_BottomSheetBehavior__getYVelocity$___twin___();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0.0f;
        }
    }

    private InterfaceC20092813ja createAccessibilityViewCommandForState(final int i) {
        return new InterfaceC20092813ja() { // from class: X.19dW
            @Override // X.InterfaceC20092813ja
            public final boolean LIZ(View view) {
                this.LIZIZ.setState(i);
                return true;
            }
        };
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C16G1) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (c16bc instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) c16bc;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void restoreOptionalState(SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.LLILLJJLI;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.LLILLL;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.LLILZ;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.LLILZIL;
        }
    }

    private void setSystemGestureInsets(View view) {
        if (Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto) {
            C21551419Vw.LIZ(view, new C19W0() { // from class: X.19dR
                @Override // X.C19W0
                public final C20246014Ju LIZ(View view2, C20246014Ju c20246014Ju, C21551719Vz c21551719Vz) {
                    this.LIZ.gestureInsetBottom = c20246014Ju.LIZ.LJIIIIZZ().LIZLLL;
                    this.LIZ.updatePeekHeight(false);
                    return c20246014Ju;
                }
            });
        }
    }

    private void settleToStatePendingLayout(final int i) {
        final V v = this.viewRef.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            HandlerHook.viewPost(v, new Runnable() { // from class: X.0m2i
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BottomSheetBehavior@ff19.settleToStatePendingLayout$1");
                    try {
                        this.LLILLL.settleToState(v, i);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BottomSheetBehavior@ff19.settleToStatePendingLayout$1");
                }
            });
        } else {
            settleToState(v, i);
        }
    }

    private void updateDrawableForTargetState(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i == 2) {
            return;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.isShapeExpanded != z) {
            this.isShapeExpanded = z;
            if (this.materialShapeDrawable != null && (valueAnimator = this.interpolatorAnimator) != null) {
                if (valueAnimator.isRunning()) {
                    this.interpolatorAnimator.reverse();
                    return;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                this.interpolatorAnimator.setFloatValues(1.0f - f, f);
                this.interpolatorAnimator.start();
            }
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof C16G0)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        if (z) {
            if (this.importantForAccessibilityMap == null) {
                this.importantForAccessibilityMap = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.viewRef.get()) {
                if (z) {
                    this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.updateImportantForAccessibilityOnSiblings) {
                        childAt.setImportantForAccessibility(4);
                    }
                } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                    childAt.setImportantForAccessibility(this.importantForAccessibilityMap.get(childAt).intValue());
                }
            }
        }
        if (!z) {
            this.importantForAccessibilityMap = null;
        } else {
            if (!this.updateImportantForAccessibilityOnSiblings) {
                return;
            }
            this.viewRef.get().sendAccessibilityEvent(8);
        }
    }

    public void addBottomSheetCallback(AbstractC1177930gl5 abstractC1177930gl5) {
        if (!this.callbacks.contains(abstractC1177930gl5)) {
            this.callbacks.add(abstractC1177930gl5);
        }
    }

    public void dispatchOnSlide(int i) {
        float f;
        float expandedOffset;
        V v = this.viewRef.get();
        if (v != null && !this.callbacks.isEmpty()) {
            int i2 = this.collapsedOffset;
            if (i <= i2 && i2 != getExpandedOffset()) {
                int i3 = this.collapsedOffset;
                f = i3 - i;
                expandedOffset = i3 - getExpandedOffset();
            } else {
                int i4 = this.collapsedOffset;
                f = i4 - i;
                expandedOffset = this.parentHeight - i4;
            }
            float f2 = f / expandedOffset;
            for (int i5 = 0; i5 < this.callbacks.size(); i5++) {
                ((AbstractC1177930gl5) ListProtector.get(this.callbacks, i5)).LIZJ(v, f2);
            }
        }
    }

    public View findScrollingChild(View view) {
        if (C14K9.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (viewFindScrollingChild != null) {
                    return viewFindScrollingChild;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.C16BC
    public void onAttachedToLayoutParams(C16G1 c16g1) {
        super.onAttachedToLayoutParams(c16g1);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    public void removeBottomSheetCallback(AbstractC1177930gl5 abstractC1177930gl5) {
        this.callbacks.remove(abstractC1177930gl5);
    }

    public void setBottomSheetCallback(AbstractC1177930gl5 abstractC1177930gl5) {
        this.callbacks.clear();
        if (abstractC1177930gl5 != null) {
            this.callbacks.add(abstractC1177930gl5);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.expandedOffset = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z) {
        int i;
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        if (this.fitToContents && this.state == 6) {
            i = 3;
        } else {
            i = this.state;
        }
        setStateInternal(i);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.halfExpandedRatio = f;
            if (this.viewRef != null) {
                calculateHalfExpandedOffset();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == this.state) {
            return;
        }
        if (this.viewRef == null) {
            if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.state = i;
                return;
            }
            return;
        }
        settleToStatePendingLayout(i);
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            ((AbstractC1177930gl5) ListProtector.get(this.callbacks, i2)).LIZLLL(i, v);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (v = this.viewRef.get()) != null) {
                if (z) {
                    settleToStatePendingLayout(this.state);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19dU
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final BottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new BottomSheetBehavior.SavedState(parcel, classLoader);
            }
        };
        public final int LL;
        public final int LLILLJJLI;
        public final boolean LLILLL;
        public final boolean LLILZ;
        public final boolean LLILZIL;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            boolean z2;
            super(parcel, classLoader);
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLL = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLILZ = z2;
            this.LLILZIL = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
            parcel.writeInt(this.LLILLJJLI);
            parcel.writeInt(this.LLILLL ? 1 : 0);
            parcel.writeInt(this.LLILZ ? 1 : 0);
            parcel.writeInt(this.LLILZIL ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.LL = bottomSheetBehavior.state;
            this.LLILLJJLI = bottomSheetBehavior.peekHeight;
            this.LLILLL = bottomSheetBehavior.fitToContents;
            this.LLILZ = bottomSheetBehavior.hideable;
            this.LLILZIL = bottomSheetBehavior.skipCollapsed;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.fitToContents = true;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new AbstractC21586119dr() { // from class: X.19dS
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                if (bottomSheetBehavior.hideable) {
                    return bottomSheetBehavior.parentHeight;
                }
                return bottomSheetBehavior.collapsedOffset;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                    if (bottomSheetBehavior.draggable) {
                        bottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i2) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                int i22 = bottomSheetBehavior.state;
                if (i22 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if ((i22 == 3 && bottomSheetBehavior.activePointerId == i2 && (weakReference = bottomSheetBehavior.nestedScrollingChildRef) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.viewRef) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i2, int i22) {
                int i3;
                int expandedOffset = this.LIZ.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = this.LIZ;
                if (bottomSheetBehavior.hideable) {
                    i3 = bottomSheetBehavior.parentHeight;
                } else {
                    i3 = bottomSheetBehavior.collapsedOffset;
                }
                return C419990GdR.LIZIZ(i2, expandedOffset, i3);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
            @Override // X.AbstractC21586119dr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewReleased(android.view.View r6, float r7, float r8) {
                /*
                    Method dump skipped, instruction units count: 292
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21583619dS.onViewReleased(android.view.View, float, float):void");
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i22);
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.a_t);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        this.shapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            createMaterialShapeDrawable(context, attributeSet, zHasValue, C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            createMaterialShapeDrawable(context, attributeSet, zHasValue);
        }
        createShapeValueAnimator();
        this.elevation = typedArrayObtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public void com_google_android_material_bottomsheet_BottomSheetBehavior__settleToState$___twin___(View view, int i) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.collapsedOffset;
        } else if (i == 6) {
            expandedOffset = this.halfExpandedOffset;
            if (this.fitToContents && expandedOffset <= (i2 = this.fitToContentsOffset)) {
                i = 3;
                expandedOffset = i2;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else if (this.hideable && i == 5) {
            expandedOffset = this.parentHeight;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        startSettlingAnimation(view, i, expandedOffset, false);
    }

    @Override // X.C16BC
    public Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), (BottomSheetBehavior<?>) this);
    }

    public final void setPeekHeight(int i, boolean z) {
        if (i == -1) {
            if (!this.peekHeightAuto) {
                this.peekHeightAuto = true;
            } else {
                return;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    public boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * 0.1f)) - this.collapsedOffset) / calculatePeekHeight() > 0.5f) {
            return true;
        }
        return false;
    }

    private int addAccessibilityActionForState(V v, int i, int i2) {
        return q0.LIZ(v, v.getResources().getString(i), createAccessibilityViewCommandForState(i2));
    }

    public static void com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_ecommerce_base_utils_BottomSheetFixHook_settleToState(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ec_fix_bottom_sheet_config", true)) {
            bottomSheetBehavior.com_google_android_material_bottomsheet_BottomSheetBehavior__settleToState$___twin___(view, i);
            return;
        }
        try {
            bottomSheetBehavior.com_google_android_material_bottomsheet_BottomSheetBehavior__settleToState$___twin___(view, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.ERR48, new Exception("Caught BottomSheetBehavior wrong state issue.", th), null);
        }
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, null);
    }

    private void replaceAccessibilityActionForState(V v, C20092413jW c20092413jW, int i) {
        q0.LJIILL(v, c20092413jW, null, createAccessibilityViewCommandForState(i));
    }

    public boolean com_google_android_material_bottomsheet_BottomSheetBehavior__onTouchEvent$___twin___(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        C21586019dq c21586019dq = this.viewDragHelper;
        if (c21586019dq != null) {
            c21586019dq.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (this.viewDragHelper != null && actionMasked == 2 && !this.ignoreEvents) {
            float fAbs = Math.abs(this.initialY - motionEvent.getY());
            C21586019dq c21586019dq2 = this.viewDragHelper;
            if (fAbs > c21586019dq2.LIZIZ) {
                c21586019dq2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.ignoreEvents;
    }

    @Override // X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        C21586019dq c21586019dq;
        if (v.isShown() && this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.touchingScrollingChild = false;
                    this.activePointerId = -1;
                    if (this.ignoreEvents) {
                        this.ignoreEvents = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.initialY = (int) motionEvent.getY();
                if (this.state != 2 && (weakReference = this.nestedScrollingChildRef) != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.initialY, view)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
                if (this.activePointerId == -1 && !c16g0.LJIIJ(x, this.initialY, v)) {
                    z = true;
                } else {
                    z = false;
                }
                this.ignoreEvents = z;
            }
            if (!this.ignoreEvents && (c21586019dq = this.viewDragHelper) != null && c21586019dq.LJIJJ(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.viewDragHelper == null || Math.abs(this.initialY - motionEvent.getY()) <= this.viewDragHelper.LIZIZ) {
                return false;
            }
            return true;
        }
        this.ignoreEvents = true;
        return false;
    }

    @Override // X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        boolean z;
        float f;
        C21538919Rb c21538919Rb;
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = c16g0.getResources().getDimensionPixelSize(R.dimen.qk);
            setSystemGestureInsets(v);
            this.viewRef = new WeakReference<>(v);
            if (this.shapeThemingEnabled && (c21538919Rb = this.materialShapeDrawable) != null) {
                v.setBackground(c21538919Rb);
            }
            C21538919Rb c21538919Rb2 = this.materialShapeDrawable;
            if (c21538919Rb2 != null) {
                float fLJIIIIZZ = this.elevation;
                if (fLJIIIIZZ == -1.0f) {
                    fLJIIIIZZ = C14K9.LJIIIIZZ(v);
                }
                c21538919Rb2.LJIIJ(fLJIIIIZZ);
                if (this.state == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.isShapeExpanded = z;
                C21538919Rb c21538919Rb3 = this.materialShapeDrawable;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                c21538919Rb3.LJIIL(f);
            }
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = C21586019dq.LJIIIZ(c16g0, this.dragCallback);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.parentWidth = c16g0.getWidth();
        this.parentHeight = c16g0.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        this.fitToContentsOffset = Math.max(0, this.parentHeight - height);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i2 = this.state;
        if (i2 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i2 == 6) {
            v.offsetTopAndBottom(this.halfExpandedOffset);
        } else if (this.hideable && i2 == 5) {
            v.offsetTopAndBottom(this.parentHeight);
        } else if (i2 == 4) {
            v.offsetTopAndBottom(this.collapsedOffset);
        } else if (i2 == 1 || i2 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C16BC
    public void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c16g0, v, savedState.mSuperState);
        restoreOptionalState(savedState);
        int i = savedState.LL;
        if (i != 1 && i != 2) {
            this.state = i;
        } else {
            this.state = 4;
        }
    }

    public static boolean com_google_android_material_bottomsheet_BottomSheetBehavior_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onTouchEvent(BottomSheetBehavior bottomSheetBehavior, C16G0 c16g0, View view, MotionEvent motionEvent) {
        try {
            return bottomSheetBehavior.com_google_android_material_bottomsheet_BottomSheetBehavior__onTouchEvent$___twin___(c16g0, view, motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = C19RX.LIZIZ(context, attributeSet, R.attr.bd0, DEF_STYLE_RES).LIZ();
            C21538919Rb c21538919Rb = new C21538919Rb(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = c21538919Rb;
            c21538919Rb.LJIIIIZZ(context);
            if (z && colorStateList != null) {
                this.materialShapeDrawable.LJIIJJI(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    @Override // X.C16BC
    public void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
        int i2;
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null && view == weakReference.get() && this.nestedScrolled) {
            if (this.lastNestedScrollDy > 0) {
                if (this.fitToContents) {
                    i2 = this.fitToContentsOffset;
                } else {
                    int top = v.getTop();
                    i2 = this.halfExpandedOffset;
                    if (top > i2) {
                        i3 = 6;
                    } else {
                        i2 = this.expandedOffset;
                    }
                }
            } else if (this.hideable && shouldHide(v, getYVelocity())) {
                i2 = this.parentHeight;
                i3 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top2 = v.getTop();
                if (this.fitToContents) {
                    if (Math.abs(top2 - this.fitToContentsOffset) < Math.abs(top2 - this.collapsedOffset)) {
                        i2 = this.fitToContentsOffset;
                    } else {
                        i2 = this.collapsedOffset;
                        i3 = 4;
                    }
                } else {
                    int i4 = this.halfExpandedOffset;
                    if (top2 < i4) {
                        if (top2 < Math.abs(top2 - this.collapsedOffset)) {
                            i2 = this.expandedOffset;
                        } else {
                            i2 = this.halfExpandedOffset;
                        }
                    } else if (Math.abs(top2 - i4) < Math.abs(top2 - this.collapsedOffset)) {
                        i2 = this.halfExpandedOffset;
                    } else {
                        i2 = this.collapsedOffset;
                        i3 = 4;
                    }
                    i3 = 6;
                }
            } else {
                if (this.fitToContents) {
                    i2 = this.collapsedOffset;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.halfExpandedOffset) < Math.abs(top3 - this.collapsedOffset)) {
                        i2 = this.halfExpandedOffset;
                        i3 = 6;
                    } else {
                        i2 = this.collapsedOffset;
                    }
                }
                i3 = 4;
            }
            startSettlingAnimation(v, i3, i2, false);
            this.nestedScrolled = false;
        }
    }

    public void startSettlingAnimation(View view, int i, int i2, boolean z) {
        C21586019dq c21586019dq = this.viewDragHelper;
        if (c21586019dq != null && (!z ? c21586019dq.LJIJJLI(view.getLeft(), i2, view) : c21586019dq.LJIJI(view.getLeft(), i2))) {
            setStateInternal(2);
            updateDrawableForTargetState(i);
            if (this.settleRunnable == null) {
                this.settleRunnable = new g(view, i);
            }
            BottomSheetBehavior<V>.g gVar = this.settleRunnable;
            if (!gVar.LLILLJJLI) {
                gVar.LLILLL = i;
                view.postOnAnimation(gVar);
                this.settleRunnable.LLILLJJLI = true;
                return;
            }
            gVar.LLILLL = i;
            return;
        }
        setStateInternal(i);
    }

    @Override // X.C16BC
    public boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.state == 3 && !super.onNestedPreFling(c16g0, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                v.offsetTopAndBottom(-expandedOffset);
                setStateInternal(3);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.collapsedOffset;
            if (i4 > i5 && !this.hideable) {
                int i6 = top - i5;
                iArr[1] = i6;
                v.offsetTopAndBottom(-i6);
                setStateInternal(4);
            } else {
                if (!this.draggable) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.lastNestedScrollDy = i2;
        this.nestedScrolled = true;
    }
}
