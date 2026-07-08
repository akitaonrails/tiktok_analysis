package com.ss.android.ugc.tools.view.widget;

import X.AbstractC21586119dr;
import X.C1488590oq9;
import X.C14K9;
import X.C16BC;
import X.C16BS;
import X.C16BT;
import X.C16BV;
import X.C16G0;
import X.C16G1;
import X.C21586019dq;
import X.C2188811AlT;
import Y.ARunnableS15S0201000_8;
import android.content.Context;
import android.content.res.TypedArray;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes32.dex */
public class ViewPagerBottomSheetBehavior<V extends View> extends C16BC<V> {
    public double clampFraction;
    public boolean draggable;
    public float hideThreshold;
    public int mActivePointerId;
    public C16BV mCallback;
    public boolean mCustomScrollingChild;
    public final AbstractC21586119dr mDragCallback;
    public boolean mHideable;
    public boolean mIgnoreEvents;
    public int mInitialY;
    public int mLastNestedScrollDy;
    public int mMaxOffset;
    public float mMaximumVelocity;
    public int mMinOffset;
    public boolean mNestedScrolled;
    public WeakReference<View> mNestedScrollingChildRef;
    public int mParentHeight;
    public int mPeekHeight;
    public boolean mPeekHeightAuto;
    public int mPeekHeightMin;
    public boolean mSkipCollapsed;
    public int mState;
    public boolean mTouchingScrollingChild;
    public VelocityTracker mVelocityTracker;
    public C21586019dq mViewDragHelper;
    public WeakReference<V> mViewRef;
    public boolean useDMAlbumLogic;

    private void reset() {
        this.mActivePointerId = -1;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private float getYVelocity() {
        this.mVelocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.mMaximumVelocity);
        return this.mVelocityTracker.getYVelocity(this.mActivePointerId);
    }

    public final int getPeekHeight() {
        if (this.mPeekHeightAuto) {
            return -1;
        }
        return this.mPeekHeight;
    }

    public void invalidateScrollingChild() {
        WeakReference<V> weakReference = this.mViewRef;
        if (weakReference == null) {
            return;
        }
        this.mNestedScrollingChildRef = new WeakReference<>(findScrollingChild(weakReference.get()));
    }

    public ViewPagerBottomSheetBehavior() {
        this.hideThreshold = 0.5f;
        this.draggable = true;
        this.mState = 4;
        this.clampFraction = 1.0d;
        this.mDragCallback = new AbstractC21586119dr() { // from class: X.16BR
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i;
                int i2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.mHideable) {
                    i = viewPagerBottomSheetBehavior.mParentHeight;
                    i2 = viewPagerBottomSheetBehavior.mMinOffset;
                } else {
                    i = viewPagerBottomSheetBehavior.mMaxOffset;
                    i2 = viewPagerBottomSheetBehavior.mMinOffset;
                }
                return i - i2;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    this.LIZ.setStateInternal(1);
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i2 = viewPagerBottomSheetBehavior.mState;
                if (i2 == 1 || viewPagerBottomSheetBehavior.mTouchingScrollingChild) {
                    return false;
                }
                if ((i2 == 3 && viewPagerBottomSheetBehavior.mActivePointerId == i && (weakReference = viewPagerBottomSheetBehavior.mNestedScrollingChildRef) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.mViewRef) == null || reference.get() != view) {
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
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i4 = i - ((int) (((double) i2) * (1.0d - viewPagerBottomSheetBehavior.clampFraction)));
                int i5 = viewPagerBottomSheetBehavior.mMinOffset;
                if (viewPagerBottomSheetBehavior.mHideable) {
                    i3 = viewPagerBottomSheetBehavior.mParentHeight;
                } else {
                    i3 = viewPagerBottomSheetBehavior.mMaxOffset;
                }
                return C419990GdR.LIZIZ(i4, i5, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i;
                int i2;
                View view2;
                C16BV c16bv;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.useDMAlbumLogic) {
                    i = -1400;
                } else {
                    i = 0;
                }
                int i3 = 3;
                if (f2 < i) {
                    i2 = viewPagerBottomSheetBehavior.mMinOffset;
                } else if (viewPagerBottomSheetBehavior.mHideable && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                    i2 = this.LIZ.mParentHeight;
                    i3 = 5;
                    Reference reference = this.LIZ.mViewRef;
                    if (reference != null && (view2 = (View) reference.get()) != null && (c16bv = this.LIZ.mCallback) != null) {
                        c16bv.LIZ(view2);
                    }
                } else {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - this.LIZ.mMinOffset) < Math.abs(top - this.LIZ.mMaxOffset)) {
                            i2 = this.LIZ.mMinOffset;
                        } else {
                            i2 = this.LIZ.mMaxOffset;
                        }
                    } else {
                        i2 = this.LIZ.mMaxOffset;
                    }
                    i3 = 4;
                }
                if (this.LIZ.mViewDragHelper.LJIJI(view.getLeft(), i2)) {
                    this.LIZ.setStateInternal(2);
                    view.postOnAnimation(new C16BS(this.LIZ, view, i3));
                } else {
                    this.LIZ.setStateInternal(i3);
                }
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
            }
        };
    }

    public int getPeekHeightMin() {
        return this.mPeekHeightMin;
    }

    public boolean getSkipCollapsed() {
        return this.mSkipCollapsed;
    }

    public final int getState() {
        return this.mState;
    }

    public boolean isHideable() {
        return this.mHideable;
    }

    public ViewPagerBottomSheetBehavior(Context context) {
        super(context, null);
        this.hideThreshold = 0.5f;
        this.draggable = true;
        this.mState = 4;
        this.clampFraction = 1.0d;
        this.mDragCallback = new AbstractC21586119dr() { // from class: X.16BR
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i;
                int i2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.mHideable) {
                    i = viewPagerBottomSheetBehavior.mParentHeight;
                    i2 = viewPagerBottomSheetBehavior.mMinOffset;
                } else {
                    i = viewPagerBottomSheetBehavior.mMaxOffset;
                    i2 = viewPagerBottomSheetBehavior.mMinOffset;
                }
                return i - i2;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    this.LIZ.setStateInternal(1);
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i2 = viewPagerBottomSheetBehavior.mState;
                if (i2 == 1 || viewPagerBottomSheetBehavior.mTouchingScrollingChild) {
                    return false;
                }
                if ((i2 == 3 && viewPagerBottomSheetBehavior.mActivePointerId == i && (weakReference = viewPagerBottomSheetBehavior.mNestedScrollingChildRef) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.mViewRef) == null || reference.get() != view) {
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
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i4 = i - ((int) (((double) i2) * (1.0d - viewPagerBottomSheetBehavior.clampFraction)));
                int i5 = viewPagerBottomSheetBehavior.mMinOffset;
                if (viewPagerBottomSheetBehavior.mHideable) {
                    i3 = viewPagerBottomSheetBehavior.mParentHeight;
                } else {
                    i3 = viewPagerBottomSheetBehavior.mMaxOffset;
                }
                return C419990GdR.LIZIZ(i4, i5, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i;
                int i2;
                View view2;
                C16BV c16bv;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.useDMAlbumLogic) {
                    i = -1400;
                } else {
                    i = 0;
                }
                int i3 = 3;
                if (f2 < i) {
                    i2 = viewPagerBottomSheetBehavior.mMinOffset;
                } else if (viewPagerBottomSheetBehavior.mHideable && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                    i2 = this.LIZ.mParentHeight;
                    i3 = 5;
                    Reference reference = this.LIZ.mViewRef;
                    if (reference != null && (view2 = (View) reference.get()) != null && (c16bv = this.LIZ.mCallback) != null) {
                        c16bv.LIZ(view2);
                    }
                } else {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - this.LIZ.mMinOffset) < Math.abs(top - this.LIZ.mMaxOffset)) {
                            i2 = this.LIZ.mMinOffset;
                        } else {
                            i2 = this.LIZ.mMaxOffset;
                        }
                    } else {
                        i2 = this.LIZ.mMaxOffset;
                    }
                    i3 = 4;
                }
                if (this.LIZ.mViewDragHelper.LJIJI(view.getLeft(), i2)) {
                    this.LIZ.setStateInternal(2);
                    view.postOnAnimation(new C16BS(this.LIZ, view, i3));
                } else {
                    this.LIZ.setStateInternal(i3);
                }
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
            }
        };
        setPeekHeight(-1);
        this.mMaximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C16G1) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (c16bc instanceof ViewPagerBottomSheetBehavior) {
                return (ViewPagerBottomSheetBehavior) c16bc;
            }
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public void dispatchOnSlide(int i) {
        V v;
        C16BV c16bv;
        float f;
        float f2;
        float f3;
        WeakReference<V> weakReference = this.mViewRef;
        if (weakReference != null && (v = weakReference.get()) != null && (c16bv = this.mCallback) != null) {
            int i2 = this.mMaxOffset;
            int i3 = i2 - i;
            if (i3 == 0) {
                f3 = 0.0f;
            } else {
                if (i > i2) {
                    f = i3;
                    f2 = this.mParentHeight - i2;
                } else {
                    f = i3;
                    f2 = i2 - this.mMinOffset;
                }
                f3 = f / f2;
            }
            c16bv.LIZIZ(v, f3);
        }
    }

    public View findScrollingChild(View view) {
        View childAt;
        if (view == null) {
            return null;
        }
        if (this.mCustomScrollingChild) {
            WeakReference<View> weakReference = this.mNestedScrollingChildRef;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }
        if (C14K9.LJIILL(view)) {
            return view;
        }
        int i = 0;
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            Field field = C1488590oq9.LIZ;
            int currentItem = viewPager.getCurrentItem();
            while (true) {
                if (i < viewPager.getChildCount()) {
                    childAt = viewPager.getChildAt(i);
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                    try {
                        int iIntValue = ((Integer) C1488590oq9.LIZ.get(layoutParams)).intValue();
                        if (!layoutParams.LIZ && currentItem == iIntValue) {
                            break;
                        }
                        i++;
                    } catch (IllegalAccessException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                } else {
                    childAt = null;
                    break;
                }
            }
            View viewFindScrollingChild = findScrollingChild(childAt);
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                while (i < childCount) {
                    View viewFindScrollingChild2 = findScrollingChild(viewGroup.getChildAt(i));
                    if (viewFindScrollingChild2 != null) {
                        return viewFindScrollingChild2;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    public void setBottomSheetCallback(C16BV c16bv) {
        this.mCallback = c16bv;
    }

    public void setClampFraction(double d) {
        this.clampFraction = d;
    }

    public void setCustomScrollingChild(View view) {
        V v;
        WeakReference<V> weakReference = this.mViewRef;
        if (weakReference != null && (v = weakReference.get()) != null) {
            if (view != null) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == v) {
                        View viewFindScrollingChild = findScrollingChild(view);
                        if (viewFindScrollingChild != null) {
                            this.mNestedScrollingChildRef = new WeakReference<>(viewFindScrollingChild);
                            this.mCustomScrollingChild = true;
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("child is not a child of current View.");
            }
            if (!this.mCustomScrollingChild) {
                return;
            }
            this.mCustomScrollingChild = false;
            invalidateScrollingChild();
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setHideThreshold(float f) {
        this.hideThreshold = f;
    }

    public void setHideable(boolean z) {
        this.mHideable = z;
    }

    public final void setPeekHeight(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.mPeekHeightAuto) {
                this.mPeekHeightAuto = true;
            } else {
                return;
            }
        } else {
            if (!this.mPeekHeightAuto && this.mPeekHeight == i) {
                return;
            }
            this.mPeekHeightAuto = false;
            this.mPeekHeight = Math.max(0, i);
            this.mMaxOffset = this.mParentHeight - i;
        }
        if (this.mState == 4 && (weakReference = this.mViewRef) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public void setSkipCollapsed(boolean z) {
        this.mSkipCollapsed = z;
    }

    public final void setState(int i) {
        if (i == this.mState) {
            return;
        }
        WeakReference<V> weakReference = this.mViewRef;
        if (weakReference == null) {
            if (i == 4 || i == 3 || (this.mHideable && i == 5)) {
                this.mState = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            HandlerHook.viewPost(v, new ARunnableS15S0201000_8(v, this, i, 4));
        } else {
            startSettlingAnimation(v, i);
        }
    }

    public void setStateInternal(int i) {
        V v;
        C16BV c16bv;
        if (this.mState == i) {
            return;
        }
        this.mState = i;
        WeakReference<V> weakReference = this.mViewRef;
        if (weakReference != null && (v = weakReference.get()) != null && (c16bv = this.mCallback) != null) {
            c16bv.LIZJ(i, v);
        }
    }

    public void setUseDMAlbumLogic(boolean z) {
        this.useDMAlbumLogic = z;
    }

    public void setupViewPager(ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new C16BT(viewPager, this));
    }

    public float slideOffsetToViewTop(float f) {
        float f2;
        float f3;
        if (f == 0.0f) {
            return this.mMaxOffset;
        }
        if (f < 0.0f) {
            int i = this.mMaxOffset;
            f2 = i;
            f3 = this.mParentHeight - i;
        } else {
            int i2 = this.mMaxOffset;
            f2 = i2;
            f3 = i2 - this.mMinOffset;
        }
        return f2 - (f * f3);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16BU
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new ViewPagerBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewPagerBottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final ViewPagerBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ViewPagerBottomSheetBehavior.SavedState(parcel, classLoader);
            }
        };
        public final int LL;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LL = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.LL = i;
        }
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.hideThreshold = 0.5f;
        this.draggable = true;
        this.mState = 4;
        this.clampFraction = 1.0d;
        this.mDragCallback = new AbstractC21586119dr() { // from class: X.16BR
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i2;
                int i22;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.mHideable) {
                    i2 = viewPagerBottomSheetBehavior.mParentHeight;
                    i22 = viewPagerBottomSheetBehavior.mMinOffset;
                } else {
                    i2 = viewPagerBottomSheetBehavior.mMaxOffset;
                    i22 = viewPagerBottomSheetBehavior.mMinOffset;
                }
                return i2 - i22;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    this.LIZ.setStateInternal(1);
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i2) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i22 = viewPagerBottomSheetBehavior.mState;
                if (i22 == 1 || viewPagerBottomSheetBehavior.mTouchingScrollingChild) {
                    return false;
                }
                if ((i22 == 3 && viewPagerBottomSheetBehavior.mActivePointerId == i2 && (weakReference = viewPagerBottomSheetBehavior.mNestedScrollingChildRef) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.mViewRef) == null || reference.get() != view) {
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
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i4 = i2 - ((int) (((double) i22) * (1.0d - viewPagerBottomSheetBehavior.clampFraction)));
                int i5 = viewPagerBottomSheetBehavior.mMinOffset;
                if (viewPagerBottomSheetBehavior.mHideable) {
                    i3 = viewPagerBottomSheetBehavior.mParentHeight;
                } else {
                    i3 = viewPagerBottomSheetBehavior.mMaxOffset;
                }
                return C419990GdR.LIZIZ(i4, i5, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i2;
                int i22;
                View view2;
                C16BV c16bv;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.useDMAlbumLogic) {
                    i2 = -1400;
                } else {
                    i2 = 0;
                }
                int i3 = 3;
                if (f2 < i2) {
                    i22 = viewPagerBottomSheetBehavior.mMinOffset;
                } else if (viewPagerBottomSheetBehavior.mHideable && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                    i22 = this.LIZ.mParentHeight;
                    i3 = 5;
                    Reference reference = this.LIZ.mViewRef;
                    if (reference != null && (view2 = (View) reference.get()) != null && (c16bv = this.LIZ.mCallback) != null) {
                        c16bv.LIZ(view2);
                    }
                } else {
                    if (f2 == 0.0f) {
                        int top = view.getTop();
                        if (Math.abs(top - this.LIZ.mMinOffset) < Math.abs(top - this.LIZ.mMaxOffset)) {
                            i22 = this.LIZ.mMinOffset;
                        } else {
                            i22 = this.LIZ.mMaxOffset;
                        }
                    } else {
                        i22 = this.LIZ.mMaxOffset;
                    }
                    i3 = 4;
                }
                if (this.LIZ.mViewDragHelper.LJIJI(view.getLeft(), i22)) {
                    this.LIZ.setStateInternal(2);
                    view.postOnAnimation(new C16BS(this.LIZ, view, i3));
                } else {
                    this.LIZ.setStateInternal(i3);
                }
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i22);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        typedArrayObtainStyledAttributes.recycle();
        this.mMaximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.C16BC
    public Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), this.mState);
    }

    public boolean shouldHide(View view, float f) {
        if (this.mSkipCollapsed) {
            return true;
        }
        if (view.getTop() >= this.mMaxOffset && Math.abs((view.getTop() + (f * 0.1f)) - this.mMaxOffset) / this.mPeekHeight > this.hideThreshold) {
            return true;
        }
        return false;
    }

    public void startSettlingAnimation(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.mMaxOffset;
        } else if (i == 3) {
            i2 = this.mMinOffset;
        } else if (this.mHideable && i == 5) {
            i2 = this.mParentHeight;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C21586019dq c21586019dq = this.mViewDragHelper;
        if (c21586019dq != null && c21586019dq.LJIJJLI(view.getLeft(), i2, view)) {
            setStateInternal(2);
            view.postOnAnimation(new C16BS(this, view, i));
        } else {
            setStateInternal(i);
        }
    }

    @Override // X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        if (v.isShown() && this.draggable) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                reset();
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.mTouchingScrollingChild = false;
                    this.mActivePointerId = -1;
                    if (this.mIgnoreEvents) {
                        this.mIgnoreEvents = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.mInitialY = (int) motionEvent.getY();
                WeakReference<View> weakReference = this.mNestedScrollingChildRef;
                if (weakReference != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.mInitialY, view)) {
                    this.mActivePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.mTouchingScrollingChild = true;
                }
                if (this.mActivePointerId == -1 && !c16g0.LJIIJ(x, this.mInitialY, v)) {
                    z = true;
                } else {
                    z = false;
                }
                this.mIgnoreEvents = z;
            }
            if (this.mViewDragHelper == null) {
                this.mViewDragHelper = C21586019dq.LJIIIZ(c16g0, this.mDragCallback);
            }
            if (!this.mIgnoreEvents && this.mViewDragHelper.LJIJJ(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.mNestedScrollingChildRef;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.mIgnoreEvents || this.mState == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || Math.abs(this.mInitialY - motionEvent.getY()) <= this.mViewDragHelper.LIZIZ) {
                return false;
            }
            return true;
        }
        this.mIgnoreEvents = true;
        return false;
    }

    @Override // X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        int iMax;
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.mParentHeight = (c16g0.getHeight() - c16g0.getPaddingTop()) - c16g0.getPaddingBottom();
        if (this.mPeekHeightAuto) {
            if (this.mPeekHeightMin == 0) {
                this.mPeekHeightMin = c16g0.getResources().getDimensionPixelSize(R.dimen.qk);
            }
            iMax = Math.max(this.mPeekHeightMin, this.mParentHeight - ((c16g0.getWidth() * 9) / 16));
        } else {
            iMax = this.mPeekHeight;
        }
        int iMax2 = Math.max(0, this.mParentHeight - v.getHeight());
        this.mMinOffset = iMax2;
        int iMax3 = Math.max(this.mParentHeight - iMax, iMax2);
        this.mMaxOffset = iMax3;
        int i2 = this.mState;
        if (i2 == 3) {
            int top2 = v.getTop();
            int i3 = this.mMinOffset;
            if (top2 != i3) {
                v.offsetTopAndBottom(i3);
            }
        } else if (this.mHideable && i2 == 5) {
            v.offsetTopAndBottom(this.mParentHeight);
        } else if (i2 == 4) {
            v.offsetTopAndBottom(iMax3);
        } else if (i2 == 1 || i2 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        if (this.mViewDragHelper == null) {
            this.mViewDragHelper = C21586019dq.LJIIIZ(c16g0, this.mDragCallback);
        }
        this.mViewRef = new WeakReference<>(v);
        this.mNestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C16BC
    public void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c16g0, v, savedState.mSuperState);
        int i = savedState.LL;
        if (i != 1 && i != 2) {
            this.mState = i;
        } else {
            this.mState = 4;
        }
    }

    @Override // X.C16BC
    public void onStopNestedScroll(C16G0 c16g0, V v, View view) {
        WeakReference<View> weakReference;
        int i;
        V v2;
        C16BV c16bv;
        int i2 = 3;
        if (v.getTop() == this.mMinOffset) {
            setStateInternal(3);
            return;
        }
        if ((!this.useDMAlbumLogic || !(view instanceof RecyclerView)) && ((weakReference = this.mNestedScrollingChildRef) == null || view != weakReference.get() || !this.mNestedScrolled)) {
            return;
        }
        if (this.mLastNestedScrollDy > 0) {
            i = this.mMinOffset;
        } else if (this.mHideable && shouldHide(v, getYVelocity())) {
            i = this.mParentHeight;
            i2 = 5;
            WeakReference<V> weakReference2 = this.mViewRef;
            if (weakReference2 != null && (v2 = weakReference2.get()) != null && (c16bv = this.mCallback) != null) {
                c16bv.LIZ(v2);
            }
        } else {
            if (this.mLastNestedScrollDy == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.mMinOffset) < Math.abs(top - this.mMaxOffset)) {
                    i = this.mMinOffset;
                } else {
                    i = this.mMaxOffset;
                }
            } else {
                i = this.mMaxOffset;
            }
            i2 = 4;
        }
        C21586019dq c21586019dq = this.mViewDragHelper;
        if (c21586019dq != null && c21586019dq.LJIJJLI(v.getLeft(), i, v)) {
            setStateInternal(2);
            v.postOnAnimation(new C16BS(this, v, i2));
        } else {
            setStateInternal(i2);
        }
        this.mNestedScrolled = false;
    }

    @Override // X.C16BC
    public boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        C21586019dq c21586019dq;
        boolean z = false;
        if (!v.isShown() || !this.draggable) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.mState == 1 && actionMasked == 0) {
            return true;
        }
        if ((motionEvent.getAction() != 2 && motionEvent.getAction() != 6) || (c21586019dq = this.mViewDragHelper) == null || c21586019dq.LIZ != 1 || motionEvent.findPointerIndex(c21586019dq.LIZJ) >= 0) {
            z = true;
        }
        C21586019dq c21586019dq2 = this.mViewDragHelper;
        if (c21586019dq2 != null && z) {
            c21586019dq2.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (actionMasked == 2 && !this.mIgnoreEvents) {
            float fAbs = Math.abs(this.mInitialY - motionEvent.getY());
            C21586019dq c21586019dq3 = this.mViewDragHelper;
            if (fAbs > c21586019dq3.LIZIZ) {
                c21586019dq3.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.mIgnoreEvents;
    }

    @Override // X.C16BC
    public boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        View view2;
        WeakReference<View> weakReference = this.mNestedScrollingChildRef;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view == view2 || (this.useDMAlbumLogic && (view instanceof RecyclerView))) {
            if (this.mState != 3 || super.onNestedPreFling(c16g0, v, view, f, f2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C16BC
    public boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i) {
        this.mLastNestedScrollDy = 0;
        this.mNestedScrolled = false;
        if (!this.draggable || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr) {
        View view2;
        WeakReference<View> weakReference = this.mNestedScrollingChildRef;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if ((!this.useDMAlbumLogic || !(view instanceof RecyclerView)) && view != view2) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            int i4 = this.mMinOffset;
            if (i3 < i4) {
                int i5 = top - i4;
                iArr[1] = i5;
                v.offsetTopAndBottom(-i5);
                setStateInternal(3);
            } else {
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.mMaxOffset;
            if (i3 > i6 && !this.mHideable) {
                int i7 = top - i6;
                iArr[1] = i7;
                v.offsetTopAndBottom(-i7);
                setStateInternal(4);
            } else {
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.mLastNestedScrollDy = i2;
        this.mNestedScrolled = true;
    }
}
