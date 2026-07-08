package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import X.AbstractC20497215Ik;
import X.AbstractC21586119dr;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C20691215xu;
import X.C20732416Aw;
import X.C21586019dq;
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
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes32.dex */
public class ViewPagerBottomSheetBehavior<V extends View> extends C16BC<V> {
    public final float LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public final boolean LJII;
    public int LJIIIIZZ;
    public C21586019dq LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public WeakReference<V> LJIILJJIL;
    public WeakReference<View> LJIILL;
    public AbstractC20497215Ik LJIILLIIL;
    public VelocityTracker LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public final C20732416Aw LJIJJLI;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.16Aw] */
    public ViewPagerBottomSheetBehavior() {
        this.LJIIIIZZ = 4;
        this.LJIJJLI = new AbstractC21586119dr() { // from class: X.16Aw
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i;
                int i2;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.LJI) {
                    i = viewPagerBottomSheetBehavior.LJIILIIL;
                    i2 = viewPagerBottomSheetBehavior.LJ;
                } else {
                    i = viewPagerBottomSheetBehavior.LJFF;
                    i2 = viewPagerBottomSheetBehavior.LJ;
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
                int i2 = viewPagerBottomSheetBehavior.LJIIIIZZ;
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
                int i4 = viewPagerBottomSheetBehavior.LJ;
                if (viewPagerBottomSheetBehavior.LJI) {
                    i3 = viewPagerBottomSheetBehavior.LJIILIIL;
                } else {
                    i3 = viewPagerBottomSheetBehavior.LJFF;
                }
                return C419990GdR.LIZIZ(i, i4, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i;
                int i2 = 3;
                if (f2 < 0.0f) {
                    i = this.LIZ.LJ;
                } else {
                    ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                    if (viewPagerBottomSheetBehavior.LJI && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                        i = this.LIZ.LJIILIIL;
                        i2 = 5;
                    } else {
                        if (f2 == 0.0f) {
                            int top = view.getTop();
                            if (Math.abs(top - this.LIZ.LJ) < Math.abs(top - this.LIZ.LJFF)) {
                                i = this.LIZ.LJ;
                            } else {
                                i = this.LIZ.LJFF;
                            }
                        } else {
                            i = this.LIZ.LJFF;
                        }
                        i2 = 4;
                    }
                }
                if (this.LIZ.LJIIIZ.LJIJI(view.getLeft(), i)) {
                    this.LIZ.setStateInternal(2);
                    view.postOnAnimation(new RunnableC20732516Ax(this.LIZ, view, i2));
                } else {
                    this.LIZ.setStateInternal(i2);
                }
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
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

    public final void dispatchOnSlide(int i) {
        AbstractC20497215Ik abstractC20497215Ik;
        if (this.LJIILJJIL.get() != null && (abstractC20497215Ik = this.LJIILLIIL) != null) {
            if (i > this.LJFF) {
                abstractC20497215Ik.LIZ((r2 - i) / (this.LJIILIIL - r2));
            } else {
                abstractC20497215Ik.LIZ((r2 - i) / (r2 - this.LJ));
            }
        }
    }

    public final View findScrollingChild(View view) {
        if (view == null) {
            return null;
        }
        if (C14K9.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View viewFindScrollingChild = findScrollingChild(C20691215xu.LIZ((ViewPager) view));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewFindScrollingChild2 = findScrollingChild(viewGroup.getChildAt(i));
                    if (viewFindScrollingChild2 != null) {
                        return viewFindScrollingChild2;
                    }
                }
            }
        }
        return null;
    }

    public final void setPeekHeight(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.LIZJ) {
                this.LIZJ = true;
            } else {
                return;
            }
        } else {
            if (!this.LIZJ && this.LIZIZ == i) {
                return;
            }
            this.LIZJ = false;
            this.LIZIZ = Math.max(0, i);
            this.LJFF = this.LJIILIIL - i;
        }
        if (this.LJIIIIZZ == 4 && (weakReference = this.LJIILJJIL) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public final void setStateInternal(int i) {
        AbstractC20497215Ik abstractC20497215Ik;
        if (this.LJIIIIZZ == i) {
            return;
        }
        this.LJIIIIZZ = i;
        if (this.LJIILJJIL.get() != null && (abstractC20497215Ik = this.LJIILLIIL) != null) {
            abstractC20497215Ik.LIZIZ(i);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16Az
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

    /* JADX WARN: Type inference failed for: r0v1, types: [X.16Aw] */
    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.LJIIIIZZ = 4;
        this.LJIJJLI = new AbstractC21586119dr() { // from class: X.16Aw
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i2;
                int i22;
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                if (viewPagerBottomSheetBehavior.LJI) {
                    i2 = viewPagerBottomSheetBehavior.LJIILIIL;
                    i22 = viewPagerBottomSheetBehavior.LJ;
                } else {
                    i2 = viewPagerBottomSheetBehavior.LJFF;
                    i22 = viewPagerBottomSheetBehavior.LJ;
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
                int i22 = viewPagerBottomSheetBehavior.LJIIIIZZ;
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
                int i4 = viewPagerBottomSheetBehavior.LJ;
                if (viewPagerBottomSheetBehavior.LJI) {
                    i3 = viewPagerBottomSheetBehavior.LJIILIIL;
                } else {
                    i3 = viewPagerBottomSheetBehavior.LJFF;
                }
                return C419990GdR.LIZIZ(i2, i4, i3);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                int i2;
                int i22 = 3;
                if (f2 < 0.0f) {
                    i2 = this.LIZ.LJ;
                } else {
                    ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.LIZ;
                    if (viewPagerBottomSheetBehavior.LJI && viewPagerBottomSheetBehavior.shouldHide(view, f2)) {
                        i2 = this.LIZ.LJIILIIL;
                        i22 = 5;
                    } else {
                        if (f2 == 0.0f) {
                            int top = view.getTop();
                            if (Math.abs(top - this.LIZ.LJ) < Math.abs(top - this.LIZ.LJFF)) {
                                i2 = this.LIZ.LJ;
                            } else {
                                i2 = this.LIZ.LJFF;
                            }
                        } else {
                            i2 = this.LIZ.LJFF;
                        }
                        i22 = 4;
                    }
                }
                if (this.LIZ.LJIIIZ.LJIJI(view.getLeft(), i2)) {
                    this.LIZ.setStateInternal(2);
                    view.postOnAnimation(new RunnableC20732516Ax(this.LIZ, view, i22));
                } else {
                    this.LIZ.setStateInternal(i22);
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
        this.LJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        this.LJII = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        typedArrayObtainStyledAttributes.recycle();
        this.LIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), this.LJIIIIZZ);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJII) {
            return true;
        }
        if (view.getTop() >= this.LJFF && Math.abs((view.getTop() + (f * 0.1f)) - this.LJFF) / this.LIZIZ > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        if (!v.isShown()) {
            this.LJIIJ = true;
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
                if (this.LJIIJ) {
                    this.LJIIJ = false;
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
            this.LJIIJ = z;
        }
        if (!this.LJIIJ && this.LJIIIZ.LJIJJ(motionEvent)) {
            return true;
        }
        View view2 = this.LJIILL.get();
        if (actionMasked != 2 || view2 == null || this.LJIIJ || this.LJIIIIZZ == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || Math.abs(this.LJIJI - motionEvent.getY()) <= this.LJIIIZ.LIZIZ) {
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
        if (this.LIZJ) {
            if (this.LIZLLL == 0) {
                this.LIZLLL = c16g0.getResources().getDimensionPixelSize(R.dimen.qk);
            }
            iMax = Math.max(this.LIZLLL, this.LJIILIIL - ((c16g0.getWidth() * 9) / 16));
        } else {
            iMax = this.LIZIZ;
        }
        int iMax2 = Math.max(0, this.LJIILIIL - v.getHeight());
        this.LJ = iMax2;
        int iMax3 = Math.max(this.LJIILIIL - iMax, iMax2);
        this.LJFF = iMax3;
        int i2 = this.LJIIIIZZ;
        if (i2 == 3) {
            v.offsetTopAndBottom(this.LJ);
        } else if (this.LJI && i2 == 5) {
            v.offsetTopAndBottom(this.LJIILIIL);
        } else if (i2 == 4) {
            v.offsetTopAndBottom(iMax3);
        } else if (i2 == 1 || i2 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = C21586019dq.LJIIIZ(c16g0, this.LJIJJLI);
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
            this.LJIIIIZZ = i;
        } else {
            this.LJIIIIZZ = 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r5, V r6, android.view.View r7) {
        /*
            r4 = this;
            int r1 = r6.getTop()
            int r0 = r4.LJ
            r3 = 3
            if (r1 != r0) goto Ld
            r4.setStateInternal(r3)
            return
        Ld:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.LJIILL
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r0.get()
            if (r7 != r0) goto L3c
            boolean r0 = r4.LJIIL
            if (r0 == 0) goto L3c
            int r0 = r4.LJIIJJI
            if (r0 <= 0) goto L41
            int r2 = r4.LJ
        L21:
            X.19dq r1 = r4.LJIIIZ
            int r0 = r6.getLeft()
            boolean r0 = r1.LJIJJLI(r0, r2, r6)
            if (r0 == 0) goto L3d
            r0 = 2
            r4.setStateInternal(r0)
            X.16Ax r0 = new X.16Ax
            r0.<init>(r4, r6, r3)
            r6.postOnAnimation(r0)
        L39:
            r0 = 0
            r4.LJIIL = r0
        L3c:
            return
        L3d:
            r4.setStateInternal(r3)
            goto L39
        L41:
            boolean r0 = r4.LJI
            if (r0 == 0) goto L60
            android.view.VelocityTracker r2 = r4.LJIIZILJ
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r4.LIZ
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r4.LJIIZILJ
            int r0 = r4.LJIJ
            float r0 = r1.getYVelocity(r0)
            boolean r0 = r4.shouldHide(r6, r0)
            if (r0 == 0) goto L60
            int r2 = r4.LJIILIIL
            r3 = 5
            goto L21
        L60:
            int r0 = r4.LJIIJJI
            if (r0 != 0) goto L7f
            int r2 = r6.getTop()
            int r0 = r4.LJ
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r4.LJFF
            int r2 = r2 - r0
            int r0 = java.lang.Math.abs(r2)
            if (r1 >= r0) goto L7c
            int r2 = r4.LJ
            goto L21
        L7c:
            int r2 = r4.LJFF
            goto L81
        L7f:
            int r2 = r4.LJFF
        L81:
            r3 = 4
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            boolean r0 = r8.isShown()
            r5 = 0
            if (r0 != 0) goto L8
            return r5
        L8:
            int r3 = r9.getActionMasked()
            int r0 = r6.LJIIIIZZ
            r4 = 1
            if (r0 != r4) goto L14
            if (r3 != 0) goto L14
            return r4
        L14:
            int r0 = r9.getAction()
            r2 = 2
            if (r0 == r2) goto L22
            int r1 = r9.getAction()
            r0 = 6
            if (r1 != r0) goto L86
        L22:
            X.19dq r0 = r6.LJIIIZ
            int r0 = r0.LIZJ
            int r1 = r9.findPointerIndex(r0)
            X.19dq r0 = r6.LJIIIZ
            if (r0 == 0) goto L86
            int r0 = r0.LIZ
            if (r0 != r4) goto L86
            if (r1 >= 0) goto L86
        L34:
            X.19dq r0 = r6.LJIIIZ
            if (r0 == 0) goto L3d
            if (r5 == 0) goto L3d
            r0.LJIILIIL(r9)
        L3d:
            if (r3 != 0) goto L4c
            r0 = -1
            r6.LJIJ = r0
            android.view.VelocityTracker r0 = r6.LJIIZILJ
            if (r0 == 0) goto L4c
            r0.recycle()
            r0 = 0
            r6.LJIIZILJ = r0
        L4c:
            android.view.VelocityTracker r0 = r6.LJIIZILJ
            if (r0 != 0) goto L56
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.LJIIZILJ = r0
        L56:
            android.view.VelocityTracker r0 = r6.LJIIZILJ
            r0.addMovement(r9)
            if (r3 != r2) goto L81
            boolean r0 = r6.LJIIJ
            if (r0 != 0) goto L81
            int r0 = r6.LJIJI
            float r1 = (float) r0
            float r0 = r9.getY()
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            X.19dq r1 = r6.LJIIIZ
            int r0 = r1.LIZIZ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L81
            int r0 = r9.getActionIndex()
            int r0 = r9.getPointerId(r0)
            r1.LIZJ(r0, r8)
        L81:
            boolean r0 = r6.LJIIJ
            r0 = r0 ^ 1
            return r0
        L86:
            r5 = 1
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        if (view == this.LJIILL.get()) {
            if (this.LJIIIIZZ != 3 || super.onNestedPreFling(c16g0, v, view, f, f2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i) {
        this.LJIIJJI = 0;
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
            int i4 = this.LJ;
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
            int i6 = this.LJFF;
            if (i3 > i6 && !this.LJI) {
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
        this.LJIIJJI = i2;
        this.LJIIL = true;
    }
}
