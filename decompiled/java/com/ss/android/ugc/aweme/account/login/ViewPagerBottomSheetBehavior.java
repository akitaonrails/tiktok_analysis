package com.ss.android.ugc.aweme.account.login;

import X.AbstractC21586119dr;
import X.C14K9;
import X.C16B0;
import X.C16B1;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C19312210gy;
import X.C19313510hB;
import X.C20691215xu;
import X.C21586019dq;
import X.C2188811AlT;
import Y.ARunnableS33S0201000_28;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes32.dex */
public class ViewPagerBottomSheetBehavior<V extends View> extends C16BC<V> {
    public final float LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public int LJIIIZ;
    public C21586019dq LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public WeakReference<V> LJIILJJIL;
    public WeakReference<View> LJIILL;
    public C19312210gy LJIILLIIL;
    public VelocityTracker LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public C19313510hB LJIJJLI;
    public final C16B0 LJIL;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.16B0] */
    public ViewPagerBottomSheetBehavior() {
        this.LJIIIZ = 4;
        this.LJIL = new AbstractC21586119dr() { // from class: X.16B0
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i;
                int i2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.LJII) {
                    i = viewPagerBottomSheetBehavior.LJIILIIL;
                    i2 = viewPagerBottomSheetBehavior.LJFF;
                } else {
                    i = viewPagerBottomSheetBehavior.LJI;
                    i2 = viewPagerBottomSheetBehavior.LJFF;
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
                View view2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i2 = viewPagerBottomSheetBehavior.LJIIIZ;
                if (i2 == 1 || viewPagerBottomSheetBehavior.LJIJJ) {
                    return false;
                }
                if ((i2 == 3 && viewPagerBottomSheetBehavior.LJIJ == i && (view2 = viewPagerBottomSheetBehavior.LJIILL.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIILJJIL) == null || reference.get() != view) {
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
                int i4 = viewPagerBottomSheetBehavior.LJFF;
                if (viewPagerBottomSheetBehavior.LJII) {
                    i3 = viewPagerBottomSheetBehavior.LJIILIIL;
                } else {
                    i3 = viewPagerBottomSheetBehavior.LJI;
                }
                return C419990GdR.LIZIZ(i, i4, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i;
                int i2 = 3;
                if (f2 < 0.0f && Math.abs(f2) > this.LIZ.LIZ && Math.abs(f2) > Math.abs(f)) {
                    i = this.LIZ.LJFF;
                } else {
                    ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                    if (viewPagerBottomSheetBehavior.LJII && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                        i = this.LIZ.LJIILIIL;
                        i2 = 5;
                    } else {
                        if (f2 > 0.0f && Math.abs(f2) > this.LIZ.LIZ && Math.abs(f2) > Math.abs(f)) {
                            i = this.LIZ.LJI;
                        } else {
                            int top = view.getTop();
                            if (Math.abs(top - this.LIZ.LJFF) < Math.abs(top - this.LIZ.LJI)) {
                                i = this.LIZ.LJFF;
                            } else {
                                i = this.LIZ.LJI;
                            }
                        }
                        i2 = 4;
                    }
                }
                if (this.LIZ.LJIIJ.LJIJI(view.getLeft(), i)) {
                    this.LIZ.setStateInternal(2);
                    view.postOnAnimation(new C16B1(this.LIZ, view, i2));
                } else {
                    this.LIZ.setStateInternal(i2);
                }
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.LJIILJJIL.get();
            }
        };
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> LIZ(V v) {
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

    public final View findScrollingChild(View view) {
        View viewFindScrollingChild;
        if (C14K9.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View viewLIZ = C20691215xu.LIZ((ViewPager) view);
            if (viewLIZ != null && (viewFindScrollingChild = findScrollingChild(viewLIZ)) != null) {
                return viewFindScrollingChild;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewFindScrollingChild2 = findScrollingChild(viewGroup.getChildAt(i));
                if (viewFindScrollingChild2 != null) {
                    return viewFindScrollingChild2;
                }
            }
        }
        return null;
    }

    public final void setPeekHeight(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
            } else {
                return;
            }
        } else {
            if (!this.LIZLLL && this.LIZJ == i) {
                return;
            }
            this.LIZLLL = false;
            this.LIZJ = Math.max(0, i);
            this.LJI = this.LJIILIIL - i;
        }
        if (this.LJIIIZ == 4 && (weakReference = this.LJIILJJIL) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public final void setState(int i) {
        if (i == this.LJIIIZ) {
            return;
        }
        WeakReference<V> weakReference = this.LJIILJJIL;
        if (weakReference == null) {
            if (i == 4 || i == 3 || (this.LJII && i == 5)) {
                this.LJIIIZ = i;
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
            HandlerHook.viewPost(v, new ARunnableS33S0201000_28(v, this, i, 0));
        } else {
            startSettlingAnimation(v, i);
        }
    }

    public final void setStateInternal(int i) {
        C19312210gy c19312210gy;
        if (this.LJIIIZ == i) {
            return;
        }
        this.LJIIIZ = i;
        V v = this.LJIILJJIL.get();
        if (v != null && (c19312210gy = this.LJIILLIIL) != null) {
            c19312210gy.LIZ(i, v);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16B2
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

    /* JADX WARN: Type inference failed for: r0v1, types: [X.16B0] */
    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.LJIIIZ = 4;
        this.LJIL = new AbstractC21586119dr() { // from class: X.16B0
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i2;
                int i22;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.LJII) {
                    i2 = viewPagerBottomSheetBehavior.LJIILIIL;
                    i22 = viewPagerBottomSheetBehavior.LJFF;
                } else {
                    i2 = viewPagerBottomSheetBehavior.LJI;
                    i22 = viewPagerBottomSheetBehavior.LJFF;
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
                View view2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                int i22 = viewPagerBottomSheetBehavior.LJIIIZ;
                if (i22 == 1 || viewPagerBottomSheetBehavior.LJIJJ) {
                    return false;
                }
                if ((i22 == 3 && viewPagerBottomSheetBehavior.LJIJ == i2 && (view2 = viewPagerBottomSheetBehavior.LJIILL.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIILJJIL) == null || reference.get() != view) {
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
                int i4 = viewPagerBottomSheetBehavior.LJFF;
                if (viewPagerBottomSheetBehavior.LJII) {
                    i3 = viewPagerBottomSheetBehavior.LJIILIIL;
                } else {
                    i3 = viewPagerBottomSheetBehavior.LJI;
                }
                return C419990GdR.LIZIZ(i2, i4, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i2;
                int i22 = 3;
                if (f2 < 0.0f && Math.abs(f2) > this.LIZ.LIZ && Math.abs(f2) > Math.abs(f)) {
                    i2 = this.LIZ.LJFF;
                } else {
                    ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                    if (viewPagerBottomSheetBehavior.LJII && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                        i2 = this.LIZ.LJIILIIL;
                        i22 = 5;
                    } else {
                        if (f2 > 0.0f && Math.abs(f2) > this.LIZ.LIZ && Math.abs(f2) > Math.abs(f)) {
                            i2 = this.LIZ.LJI;
                        } else {
                            int top = view.getTop();
                            if (Math.abs(top - this.LIZ.LJFF) < Math.abs(top - this.LIZ.LJI)) {
                                i2 = this.LIZ.LJFF;
                            } else {
                                i2 = this.LIZ.LJI;
                            }
                        }
                        i22 = 4;
                    }
                }
                if (this.LIZ.LJIIJ.LJIJI(view.getLeft(), i2)) {
                    this.LIZ.setStateInternal(2);
                    view.postOnAnimation(new C16B1(this.LIZ, view, i22));
                } else {
                    this.LIZ.setStateInternal(i22);
                }
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                this.LIZ.LJIILJJIL.get();
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        this.LJII = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        this.LJIIIIZZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LIZIZ = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LIZ = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), this.LJIIIZ);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJIIIIZZ) {
            return true;
        }
        if (view.getTop() >= this.LJI && Math.abs((view.getTop() + (f * 0.1f)) - this.LJI) / this.LIZJ > 0.5f) {
            return true;
        }
        return false;
    }

    public final void startSettlingAnimation(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.LJI;
        } else if (i == 3) {
            i2 = this.LJFF;
        } else if (this.LJII && i == 5) {
            i2 = this.LJIILIIL;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJIIJ.LJIJJLI(view.getLeft(), i2, view)) {
            setStateInternal(2);
            view.postOnAnimation(new C16B1(this, view, i));
        } else {
            setStateInternal(i);
        }
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        if (!v.isShown()) {
            this.LJIIJJI = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.LJIJ = -1;
            VelocityTracker velocityTracker = this.LJIIZILJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJIIZILJ = null;
            }
        }
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = VelocityTracker.obtain();
        }
        this.LJIIZILJ.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJIJJ = false;
                this.LJIJ = -1;
                if (this.LJIIJJI) {
                    this.LJIIJJI = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.LJIJI = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.LJIILL;
            if (weakReference != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.LJIJI, view)) {
                this.LJIJ = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.LJIJJ = true;
            }
            if (this.LJIJ == -1 && !c16g0.LJIIJ(x, this.LJIJI, v)) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJJI = z;
        }
        if (!this.LJIIJJI && this.LJIIJ.LJIJJ(motionEvent)) {
            return true;
        }
        View view2 = this.LJIILL.get();
        if (actionMasked != 2 || view2 == null || this.LJIIJJI || this.LJIIIZ == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || Math.abs(this.LJIJI - motionEvent.getY()) <= this.LJIIJ.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        int iMax;
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.LJIILIIL = c16g0.getHeight();
        if (this.LIZLLL) {
            if (this.LJ == 0) {
                this.LJ = c16g0.getResources().getDimensionPixelSize(R.dimen.qk);
            }
            iMax = Math.max(this.LJ, this.LJIILIIL - ((c16g0.getWidth() * 9) / 16));
        } else {
            iMax = this.LIZJ;
        }
        int iMax2 = Math.max(0, this.LJIILIIL - v.getHeight());
        this.LJFF = iMax2;
        int iMax3 = Math.max(this.LJIILIIL - iMax, iMax2);
        this.LJI = iMax3;
        int i2 = this.LJIIIZ;
        if (i2 == 3) {
            v.offsetTopAndBottom(this.LJFF);
        } else if (this.LJII && i2 == 5) {
            v.offsetTopAndBottom(this.LJIILIIL);
        } else if (i2 == 4) {
            v.offsetTopAndBottom(iMax3);
        } else if (i2 == 1 || i2 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = C21586019dq.LJIIIZ(c16g0, this.LJIL);
        }
        this.LJIILJJIL = new WeakReference<>(v);
        this.LJIILL = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c16g0, v, savedState.mSuperState);
        int i = savedState.LL;
        if (i != 1 && i != 2) {
            this.LJIIIZ = i;
        } else {
            this.LJIIIZ = 4;
        }
    }

    @Override // X.C16BC
    public final void onStopNestedScroll(C16G0 c16g0, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.LJFF) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.LJIILL;
        if (weakReference != null && view == weakReference.get() && this.LJIIL) {
            this.LJIIZILJ.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LIZIZ);
            float xVelocity = this.LJIIZILJ.getXVelocity(this.LJIJ);
            float yVelocity = this.LJIIZILJ.getYVelocity(this.LJIJ);
            if (yVelocity < 0.0f && Math.abs(yVelocity) > this.LIZ && Math.abs(yVelocity) > Math.abs(xVelocity)) {
                i = this.LJFF;
            } else if (this.LJII && shouldHide(v, yVelocity)) {
                i = this.LJIILIIL;
                i2 = 5;
            } else {
                if (yVelocity > 0.0f && Math.abs(yVelocity) > this.LIZ && Math.abs(yVelocity) > Math.abs(xVelocity)) {
                    i = this.LJI;
                } else {
                    int top = v.getTop();
                    if (Math.abs(top - this.LJFF) < Math.abs(top - this.LJI)) {
                        i = this.LJFF;
                    } else {
                        i = this.LJI;
                    }
                }
                i2 = 4;
            }
            if (this.LJIIJ.LJIJJLI(v.getLeft(), i, v)) {
                setStateInternal(2);
                v.postOnAnimation(new C16B1(this, v, i2));
            } else {
                setStateInternal(i2);
            }
            this.LJIIL = false;
        }
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        int i;
        C19313510hB c19313510hB;
        try {
            if (!v.isShown()) {
                return false;
            }
            if (motionEvent.getAction() == 0 && ((i = this.LJIIIZ) == 3 || i == 4)) {
                Rect rect = new Rect();
                v.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (c19313510hB = this.LJIJJLI) != null) {
                    c19313510hB.LIZ.setState(5);
                    c19313510hB.LIZIZ.getWindow().setDimAmount(0.0f);
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (this.LJIIIZ == 1 && actionMasked == 0) {
                return true;
            }
            C21586019dq c21586019dq = this.LJIIJ;
            if (c21586019dq != null) {
                c21586019dq.LJIILIIL(motionEvent);
            }
            if (actionMasked == 0) {
                this.LJIJ = -1;
                VelocityTracker velocityTracker = this.LJIIZILJ;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.LJIIZILJ = null;
                }
            }
            if (this.LJIIZILJ == null) {
                this.LJIIZILJ = VelocityTracker.obtain();
            }
            this.LJIIZILJ.addMovement(motionEvent);
            if (actionMasked == 2 && !this.LJIIJJI) {
                float fAbs = Math.abs(this.LJIJI - motionEvent.getY());
                C21586019dq c21586019dq2 = this.LJIIJ;
                if (fAbs > c21586019dq2.LIZIZ) {
                    c21586019dq2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
                }
            }
            return !this.LJIIJJI;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!TextUtils.isEmpty(e.getMessage()) && e.getMessage().contains("pointerIndex out of range")) {
                return false;
            }
            throw e;
        }
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        if (view == this.LJIILL.get()) {
            if (this.LJIIIZ != 3 || super.onNestedPreFling(c16g0, v, view, f, f2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i) {
        this.LJIIL = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.LJIILL.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            int i4 = this.LJFF;
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
            int i6 = this.LJI;
            if (i3 > i6 && !this.LJII) {
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
        v.getTop();
        this.LJIILJJIL.get();
        this.LJIIL = true;
    }
}
