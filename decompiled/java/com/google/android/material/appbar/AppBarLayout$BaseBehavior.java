package com.google.android.material.appbar;

import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C16GK;
import X.C16GX;
import X.C16GZ;
import X.C194V;
import X.C20092413jW;
import X.C419990GdR;
import X.InterfaceC1338650kwJ;
import X.InterfaceC20092813ja;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.customview.view.AbsSavedState;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public class AppBarLayout$BaseBehavior<T extends C16GX> extends HeaderBehavior<T> {
    public WeakReference<View> lastNestedScrollingChildRef;
    public int lastStartedType;
    public ValueAnimator offsetAnimator;
    public int offsetDelta;
    public int offsetToChildIndexOnLayout;
    public boolean offsetToChildIndexOnLayoutIsMinHeight;
    public float offsetToChildIndexOnLayoutPerc;
    public C16GK onDragCallback;

    public static boolean checkFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public boolean isOffsetAnimatorRunning() {
        ValueAnimator valueAnimator = this.offsetAnimator;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public AppBarLayout$BaseBehavior() {
        this.offsetToChildIndexOnLayout = -1;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int getTopBottomOffsetForScrollingSibling() {
        return getTopAndBottomOffset() + this.offsetDelta;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16GJ
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new AppBarLayout$BaseBehavior.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppBarLayout$BaseBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final AppBarLayout$BaseBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new AppBarLayout$BaseBehavior.SavedState(parcel, classLoader);
            }
        };
        public int LL;
        public float LLILLJJLI;
        public boolean LLILLL;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            super(parcel, classLoader);
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readFloat();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LLILLL = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
            parcel.writeFloat(this.LLILLJJLI);
            parcel.writeByte(this.LLILLL ? (byte) 1 : (byte) 0);
        }
    }

    private View findFirstScrollingChild(C16G0 c16g0) {
        int childCount = c16g0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c16g0.getChildAt(i);
            if ((childAt instanceof InterfaceC1338650kwJ) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public boolean canDragView(T t) {
        View view;
        C16GK c16gk = this.onDragCallback;
        if (c16gk != null) {
            return c16gk.LIZ(t);
        }
        WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
        if (weakReference == null || ((view = weakReference.get()) != null && view.isShown() && !view.canScrollVertically(-1))) {
            return true;
        }
        return false;
    }

    public void setDragCallback(C16GK c16gk) {
        this.onDragCallback = c16gk;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int getMaxDragOffset(T t) {
        return -t.getDownNestedScrollRange();
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int getScrollRangeForDragFling(T t) {
        return t.getTotalScrollRange();
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.offsetToChildIndexOnLayout = -1;
    }

    public static View getAppBarChildOnOffset(C16GX c16gx, int i) {
        int iAbs = Math.abs(i);
        int childCount = c16gx.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = c16gx.getChildAt(i2);
            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private int getChildIndexOnOffset(T t, int i) {
        int childCount = t.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = t.getChildAt(i2);
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            C16GZ c16gz = (C16GZ) childAt.getLayoutParams();
            if (checkFlag(c16gz.LIZ, 32)) {
                top -= ((LinearLayout.LayoutParams) c16gz).topMargin;
                bottom += ((LinearLayout.LayoutParams) c16gz).bottomMargin;
            }
            int i3 = -i;
            if (top <= i3 && bottom >= i3) {
                return i2;
            }
        }
        return -1;
    }

    private int interpolateOffset(T t, int i) {
        int iAbs = Math.abs(i);
        int childCount = t.getChildCount();
        int topInset = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = t.getChildAt(i2);
            C16GZ c16gz = (C16GZ) childAt.getLayoutParams();
            Interpolator interpolator = c16gz.LIZIZ;
            if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                if (interpolator != null) {
                    int i3 = c16gz.LIZ;
                    if ((i3 & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c16gz).topMargin + ((LinearLayout.LayoutParams) c16gz).bottomMargin;
                        if ((i3 & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= t.getTopInset();
                    }
                    if (topInset > 0) {
                        float f = topInset;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((iAbs - childAt.getTop()) / f)));
                    }
                }
            } else {
                i2++;
            }
        }
        return i;
    }

    private boolean shouldJumpElevationState(C16G0 c16g0, T t) {
        ArrayList arrayList = (ArrayList) c16g0.LJI(t);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C16BC c16bc = ((C16G1) ((View) ListProtector.get(arrayList, i)).getLayoutParams()).LIZ;
            if (c16bc instanceof AppBarLayout$ScrollingViewBehavior) {
                if (((HeaderScrollingViewBehavior) c16bc).LIZLLL == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private void snapToChildIfNeeded(C16G0 c16g0, T t) {
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        int childIndexOnOffset = getChildIndexOnOffset(t, topBottomOffsetForScrollingSibling);
        if (childIndexOnOffset >= 0) {
            View childAt = t.getChildAt(childIndexOnOffset);
            C16GZ c16gz = (C16GZ) childAt.getLayoutParams();
            int i = c16gz.LIZ;
            if ((i & 17) == 17) {
                int i2 = -childAt.getTop();
                int minimumHeight = -childAt.getBottom();
                if (childIndexOnOffset == t.getChildCount() - 1) {
                    minimumHeight += t.getTopInset();
                }
                if (checkFlag(i, 2)) {
                    minimumHeight += childAt.getMinimumHeight();
                } else if (checkFlag(i, 5)) {
                    int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                    if (topBottomOffsetForScrollingSibling < minimumHeight2) {
                        i2 = minimumHeight2;
                    } else {
                        minimumHeight = minimumHeight2;
                    }
                }
                if (checkFlag(i, 32)) {
                    i2 += ((LinearLayout.LayoutParams) c16gz).topMargin;
                    minimumHeight -= ((LinearLayout.LayoutParams) c16gz).bottomMargin;
                }
                if (topBottomOffsetForScrollingSibling < (minimumHeight + i2) / 2) {
                    i2 = minimumHeight;
                }
                animateOffsetTo(c16g0, t, C419990GdR.LIZIZ(i2, -t.getTotalScrollRange(), 0), 0.0f);
            }
        }
    }

    private void updateAccessibilityActions(C16G0 c16g0, T t) {
        q0.LJIILJJIL(C20092413jW.LJIILJJIL.LIZ(), c16g0);
        q0.LJIIJJI(0, c16g0);
        q0.LJIILJJIL(C20092413jW.LJIILL.LIZ(), c16g0);
        q0.LJIIJJI(0, c16g0);
        View viewFindFirstScrollingChild = findFirstScrollingChild(c16g0);
        if (viewFindFirstScrollingChild == null || t.getTotalScrollRange() == 0 || !(((C16G1) viewFindFirstScrollingChild.getLayoutParams()).LIZ instanceof AppBarLayout$ScrollingViewBehavior)) {
            return;
        }
        addAccessibilityScrollActions(c16g0, t, viewFindFirstScrollingChild);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public void onFlingFinished(C16G0 c16g0, T t) {
        snapToChildIfNeeded(c16g0, t);
        if (t.LLJIJIL) {
            t.LJFF(t.LJI(findFirstScrollingChild(c16g0)));
        }
    }

    @Override // X.C16BC
    public Parcelable onSaveInstanceState(C16G0 c16g0, T t) {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(c16g0, t);
        int topAndBottomOffset = getTopAndBottomOffset();
        int childCount = t.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = t.getChildAt(i);
            int bottom = childAt.getBottom() + topAndBottomOffset;
            if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                SavedState savedState = new SavedState(parcelableOnSaveInstanceState);
                savedState.LL = i;
                if (bottom == childAt.getMinimumHeight() + t.getTopInset()) {
                    z = true;
                }
                savedState.LLILLL = z;
                savedState.LLILLJJLI = bottom / childAt.getHeight();
                return savedState;
            }
        }
        return parcelableOnSaveInstanceState;
    }

    private void addAccessibilityScrollActions(final C16G0 c16g0, final T t, final View view) {
        if (getTopBottomOffsetForScrollingSibling() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
            addActionToExpand(c16g0, t, C20092413jW.LJIILJJIL, false);
        }
        if (getTopBottomOffsetForScrollingSibling() != 0) {
            if (view.canScrollVertically(-1)) {
                final int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    q0.LJIILL(c16g0, C20092413jW.LJIILL, null, new InterfaceC20092813ja() { // from class: X.16GL
                        @Override // X.InterfaceC20092813ja
                        public final boolean LIZ(View view2) {
                            this.LJ.onNestedPreScroll(c16g0, t, view, 0, i, new int[]{0, 0}, 1);
                            return true;
                        }
                    });
                    return;
                }
                return;
            }
            addActionToExpand(c16g0, t, C20092413jW.LJIILL, true);
        }
    }

    private boolean canScrollChildren(C16G0 c16g0, T t, View view) {
        if (t.getTotalScrollRange() != 0 && c16g0.getHeight() - view.getHeight() <= t.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // X.C16GU, X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, T t, int i) {
        boolean z;
        int iRound;
        boolean zOnLayoutChild = super.onLayoutChild(c16g0, t, i);
        int pendingAction = t.getPendingAction();
        int i2 = this.offsetToChildIndexOnLayout;
        if (i2 >= 0 && (pendingAction & 8) == 0) {
            View childAt = t.getChildAt(i2);
            int i3 = -childAt.getBottom();
            if (this.offsetToChildIndexOnLayoutIsMinHeight) {
                iRound = childAt.getMinimumHeight() + t.getTopInset();
            } else {
                iRound = Math.round(childAt.getHeight() * this.offsetToChildIndexOnLayoutPerc);
            }
            setHeaderTopBottomOffset(c16g0, t, i3 + iRound);
        } else if (pendingAction != 0) {
            if ((pendingAction & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((pendingAction & 2) != 0) {
                int i4 = -t.getUpNestedPreScrollRange();
                if (z) {
                    animateOffsetTo(c16g0, t, i4, 0.0f);
                } else {
                    setHeaderTopBottomOffset(c16g0, t, i4);
                }
            } else if ((pendingAction & 1) != 0) {
                if (z) {
                    animateOffsetTo(c16g0, t, 0, 0.0f);
                } else {
                    setHeaderTopBottomOffset(c16g0, t, 0);
                }
            }
        }
        t.LLILZLL = 0;
        this.offsetToChildIndexOnLayout = -1;
        setTopAndBottomOffset(C419990GdR.LIZIZ(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
        updateAppBarLayoutDrawableState(c16g0, t, getTopAndBottomOffset(), 0, true);
        t.LIZJ(getTopAndBottomOffset());
        updateAccessibilityActions(c16g0, t);
        return zOnLayoutChild;
    }

    @Override // X.C16BC
    public void onRestoreInstanceState(C16G0 c16g0, T t, Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(c16g0, t, savedState.mSuperState);
            this.offsetToChildIndexOnLayout = savedState.LL;
            this.offsetToChildIndexOnLayoutPerc = savedState.LLILLJJLI;
            this.offsetToChildIndexOnLayoutIsMinHeight = savedState.LLILLL;
            return;
        }
        super.onRestoreInstanceState(c16g0, t, parcelable);
        this.offsetToChildIndexOnLayout = -1;
    }

    private void addActionToExpand(C16G0 c16g0, final T t, C20092413jW c20092413jW, final boolean z) {
        q0.LJIILL(c16g0, c20092413jW, null, new InterfaceC20092813ja() { // from class: X.16GM
            @Override // X.InterfaceC20092813ja
            public final boolean LIZ(View view) {
                t.setExpanded(z);
                return true;
            }
        });
    }

    private void animateOffsetTo(C16G0 c16g0, T t, int i, float f) {
        int height;
        int iAbs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
        float fAbs = Math.abs(f);
        if (fAbs > 0.0f) {
            height = Math.round((iAbs / fAbs) * 1000.0f) * 3;
        } else {
            height = (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f);
        }
        animateOffsetWithDuration(c16g0, t, i, height);
    }

    private void animateOffsetWithDuration(final C16G0 c16g0, final T t, int i, int i2) {
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        if (topBottomOffsetForScrollingSibling == i) {
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.offsetAnimator.cancel();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.offsetAnimator;
        if (valueAnimator2 == null) {
            ValueAnimator valueAnimator3 = new ValueAnimator();
            this.offsetAnimator = valueAnimator3;
            valueAnimator3.setInterpolator(C194V.LJ);
            this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.16GI
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    this.LLILLL.setHeaderTopBottomOffset(c16g0, t, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                }
            });
        } else {
            valueAnimator2.cancel();
        }
        this.offsetAnimator.setDuration(Math.min(i2, 600));
        this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
        this.offsetAnimator.start();
    }

    @Override // X.C16BC
    public void onStopNestedScroll(C16G0 c16g0, T t, View view, int i) {
        if (this.lastStartedType == 0 || i == 1) {
            snapToChildIfNeeded(c16g0, t);
            if (t.LLJIJIL) {
                t.LJFF(t.LJI(view));
            }
        }
        this.lastNestedScrollingChildRef = new WeakReference<>(view);
    }

    private void updateAppBarLayoutDrawableState(C16G0 c16g0, T t, int i, int i2, boolean z) {
        View appBarChildOnOffset = getAppBarChildOnOffset(t, i);
        if (appBarChildOnOffset != null) {
            int i3 = ((C16GZ) appBarChildOnOffset.getLayoutParams()).LIZ;
            boolean zLJI = false;
            if ((i3 & 1) != 0) {
                int minimumHeight = appBarChildOnOffset.getMinimumHeight();
                if (i2 <= 0 || (i3 & 12) == 0 ? !((i3 & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - minimumHeight) - t.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - minimumHeight) - t.getTopInset()) {
                    zLJI = true;
                }
            }
            if (t.LLJIJIL) {
                zLJI = t.LJI(findFirstScrollingChild(c16g0));
            }
            boolean zLJFF = t.LJFF(zLJI);
            if (z || (zLJFF && shouldJumpElevationState(c16g0, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }
    }

    @Override // com.google.android.material.appbar.HeaderBehavior
    public int setHeaderTopBottomOffset(C16G0 c16g0, T t, int i, int i2, int i3) {
        int iInterpolateOffset;
        int i4;
        int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
        int i5 = 0;
        if (i2 != 0 && topBottomOffsetForScrollingSibling >= i2 && topBottomOffsetForScrollingSibling <= i3) {
            int iLIZIZ = C419990GdR.LIZIZ(i, i2, i3);
            if (topBottomOffsetForScrollingSibling != iLIZIZ) {
                if (t.LLILZIL) {
                    iInterpolateOffset = interpolateOffset(t, iLIZIZ);
                } else {
                    iInterpolateOffset = iLIZIZ;
                }
                boolean topAndBottomOffset = setTopAndBottomOffset(iInterpolateOffset);
                i5 = topBottomOffsetForScrollingSibling - iLIZIZ;
                this.offsetDelta = iLIZIZ - iInterpolateOffset;
                if (!topAndBottomOffset && t.LLILZIL) {
                    c16g0.LIZLLL(t);
                }
                t.LIZJ(getTopAndBottomOffset());
                if (iLIZIZ < topBottomOffsetForScrollingSibling) {
                    i4 = -1;
                } else {
                    i4 = 1;
                }
                updateAppBarLayoutDrawableState(c16g0, t, iLIZIZ, i4, false);
            }
        } else {
            this.offsetDelta = 0;
        }
        updateAccessibilityActions(c16g0, t);
        return i5;
    }

    @Override // X.C16BC
    public boolean onMeasureChild(C16G0 c16g0, T t, int i, int i2, int i3, int i4) {
        if (((ViewGroup.MarginLayoutParams) t.getLayoutParams()).height == -2) {
            c16g0.LJIILIIL(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }
        return super.onMeasureChild(c16g0, t, i, i2, i3, i4);
    }

    @Override // X.C16BC
    public boolean onStartNestedScroll(C16G0 c16g0, T t, View view, View view2, int i, int i2) {
        boolean z;
        if ((i & 2) != 0 && (t.LLJIJIL || canScrollChildren(c16g0, t, view))) {
            z = true;
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            z = false;
        }
        this.lastNestedScrollingChildRef = null;
        this.lastStartedType = i2;
        return z;
    }

    @Override // X.C16BC
    public void onNestedPreScroll(C16G0 c16g0, T t, View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int downNestedPreScrollRange;
        if (i2 != 0) {
            if (i2 < 0) {
                i4 = -t.getTotalScrollRange();
                downNestedPreScrollRange = t.getDownNestedPreScrollRange() + i4;
            } else {
                i4 = -t.getUpNestedPreScrollRange();
                downNestedPreScrollRange = 0;
            }
            if (i4 != downNestedPreScrollRange) {
                iArr[1] = scroll(c16g0, t, i2, i4, downNestedPreScrollRange);
            }
        }
        if (t.LLJIJIL) {
            t.LJFF(t.LJI(view));
        }
    }

    @Override // X.C16BC
    public void onNestedScroll(C16G0 c16g0, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            iArr[1] = scroll(c16g0, t, i4, -t.getDownNestedScrollRange(), 0);
        } else {
            if (i4 != 0) {
                return;
            }
            updateAccessibilityActions(c16g0, t);
        }
    }
}
