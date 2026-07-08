package com.ss.android.ugc.aweme.shortvideo.sticker.poll;

import X.AbstractC21586119dr;
import X.C14K9;
import X.C16BC;
import X.C16BE;
import X.C16BF;
import X.C16BH;
import X.C16G0;
import X.C16G1;
import X.C21586019dq;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C785410UrT;
import android.app.Dialog;
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
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.shortvideo.sticker.poll.ViewPagerBottomSheetBehavior;
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
    public WeakReference<Dialog> LJIILLIIL;
    public C16BH LJIIZILJ;
    public VelocityTracker LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public final C16BE LJIL;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.16BE] */
    public ViewPagerBottomSheetBehavior() {
        this.LJIIIIZZ = 4;
        this.LJIL = new AbstractC21586119dr() { // from class: X.16BE
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
                if (i2 == 1 || viewPagerBottomSheetBehavior.LJIJJLI) {
                    return false;
                }
                if ((i2 == 3 && viewPagerBottomSheetBehavior.LJIJI == i && (view2 = viewPagerBottomSheetBehavior.LJIILL.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIILJJIL) == null || reference.get() != view) {
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
                    view.postOnAnimation(new C16BF(this.LIZ, view, i2));
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
            View focusedChild = ((ViewGroup) view).getFocusedChild();
            if (focusedChild != null && (viewFindScrollingChild = findScrollingChild(focusedChild)) != null) {
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
        C16BH c16bh;
        if (this.LJIIIIZZ == i) {
            return;
        }
        this.LJIIIIZZ = i;
        if (this.LJIILJJIL.get() != null && (c16bh = this.LJIIZILJ) != null && i == 5) {
            c16bh.LIZ.cancel();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16BG
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

    /* JADX WARN: Type inference failed for: r0v1, types: [X.16BE] */
    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.LJIIIIZZ = 4;
        this.LJIL = new AbstractC21586119dr() { // from class: X.16BE
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
                if (i22 == 1 || viewPagerBottomSheetBehavior.LJIJJLI) {
                    return false;
                }
                if ((i22 == 3 && viewPagerBottomSheetBehavior.LJIJI == i2 && (view2 = viewPagerBottomSheetBehavior.LJIILL.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIILJJIL) == null || reference.get() != view) {
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
                    view.postOnAnimation(new C16BF(this.LIZ, view, i22));
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

    public final void startSettlingAnimation(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.LJFF;
        } else if (i == 3) {
            i2 = this.LJ;
        } else if (this.LJI && i == 5) {
            i2 = this.LJIILIIL;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (this.LJIIIZ.LJIJJLI(view.getLeft(), i2, view)) {
            setStateInternal(2);
            view.postOnAnimation(new C16BF(this, view, i));
        } else {
            setStateInternal(i);
        }
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        if (!v.isShown()) {
            this.LJIIJ = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.LJIJI = -1;
            VelocityTracker velocityTracker = this.LJIJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJIJ = null;
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = VelocityTracker.obtain();
        }
        this.LJIJ.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJIJJLI = false;
                this.LJIJI = -1;
                if (this.LJIIJ) {
                    this.LJIIJ = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.LJIJJ = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.LJIILL;
            if (weakReference != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.LJIJJ, view)) {
                this.LJIJI = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.LJIJJLI = true;
            }
            if (this.LJIJI == -1 && !c16g0.LJIIJ(x, this.LJIJJ, v)) {
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
        if (actionMasked != 2 || view2 == null || this.LJIIJ || this.LJIIIIZZ == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || Math.abs(this.LJIJJ - motionEvent.getY()) <= this.LJIIIZ.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        Dialog dialog;
        int iMax;
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        try {
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
                this.LJIIIZ = C21586019dq.LJIIIZ(c16g0, this.LJIL);
            }
            this.LJIILJJIL = new WeakReference<>(v);
            this.LJIILL = new WeakReference<>(findScrollingChild(v));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (this.LJIILLIIL != null && (dialog = this.LJIILLIIL.get()) != null && dialog.isShowing()) {
                dialog.dismiss();
                C785410UrT.LIZ(dialog);
            }
            C2344809Gs.LIZ(e);
            return true;
        }
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
            X.16BF r0 = new X.16BF
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
            android.view.VelocityTracker r2 = r4.LJIJ
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r4.LIZ
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r4.LJIJ
            int r0 = r4.LJIJI
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.poll.ViewPagerBottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View):void");
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIIIIZZ == 1 && actionMasked == 0) {
            return true;
        }
        C21586019dq c21586019dq = this.LJIIIZ;
        if (c21586019dq != null) {
            c21586019dq.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            this.LJIJI = -1;
            VelocityTracker velocityTracker = this.LJIJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJIJ = null;
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = VelocityTracker.obtain();
        }
        this.LJIJ.addMovement(motionEvent);
        if (actionMasked == 2 && !this.LJIIJ) {
            float fAbs = Math.abs(this.LJIJJ - motionEvent.getY());
            C21586019dq c21586019dq2 = this.LJIIIZ;
            if (fAbs > c21586019dq2.LIZIZ) {
                c21586019dq2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.LJIIJ;
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
        v.getTop();
        this.LJIILJJIL.get();
        this.LJIIJJI = i2;
        this.LJIIL = true;
    }
}
