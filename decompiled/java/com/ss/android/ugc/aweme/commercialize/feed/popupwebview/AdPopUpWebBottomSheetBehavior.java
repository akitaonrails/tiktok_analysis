package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.AbstractC1026070co9;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C20691215xu;
import X.C21589019eK;
import X.C21589319eN;
import X.C2188811AlT;
import X.RunnableC21589119eL;
import Y.ARunnableS22S0201000_16;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public class AdPopUpWebBottomSheetBehavior<V extends View> extends C16BC<V> {
    public final float LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public C21589019eK LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public WeakReference<V> LJIILJJIL;
    public WeakReference<View> LJIILL;
    public AbstractC1026070co9 LJIILLIIL;
    public VelocityTracker LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public final boolean LJIL;
    public int LJJ;
    public int LJJI;
    public final float LJJIFFI;
    public boolean LJJII;
    public final C21589319eN LJJIII;

    public AdPopUpWebBottomSheetBehavior() {
        this.LJIIIIZZ = 4;
        this.LJIL = true;
        this.LJJIFFI = 0.2683658f;
        this.LJJIII = new C21589319eN(this);
    }

    public final void dispatchOnSlide(int i) {
        V v;
        AbstractC1026070co9 abstractC1026070co9;
        WeakReference<V> weakReference = this.LJIILJJIL;
        if (weakReference != null && (v = weakReference.get()) != null && (abstractC1026070co9 = this.LJIILLIIL) != null) {
            if (i > this.LJFF) {
                abstractC1026070co9.LIZ(v, (r2 - i) / (this.LJIILIIL - r2));
            } else {
                abstractC1026070co9.LIZ(v, (r2 - i) / (r2 - this.LJ));
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
            return findScrollingChild(C20691215xu.LIZ((ViewPager) view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                    if (viewFindScrollingChild != null) {
                        return viewFindScrollingChild;
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

    public final void setState(int i) {
        if (i == this.LJIIIIZZ) {
            return;
        }
        WeakReference<V> weakReference = this.LJIILJJIL;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJI && i == 5)) {
                this.LJIIIIZZ = i;
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
            HandlerHook.viewPost(v, new ARunnableS22S0201000_16(i, this, v, 0));
        } else {
            startSettlingAnimation(v, i);
        }
    }

    public final void setStateInternal(int i) {
        AbstractC1026070co9 abstractC1026070co9;
        if (this.LJIIIIZZ == i) {
            return;
        }
        this.LJIIIIZZ = i;
        WeakReference<V> weakReference = this.LJIILJJIL;
        if (weakReference != null && weakReference.get() != null && (abstractC1026070co9 = this.LJIILLIIL) != null) {
            abstractC1026070co9.LIZIZ(i);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19eM
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new AdPopUpWebBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdPopUpWebBottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final AdPopUpWebBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new AdPopUpWebBottomSheetBehavior.SavedState(parcel, classLoader);
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

    public AdPopUpWebBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.LJIIIIZZ = 4;
        this.LJIL = true;
        this.LJJIFFI = 0.2683658f;
        this.LJJIII = new C21589319eN(this);
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

    public final boolean LIZ(float f, View view) {
        if (this.LJII) {
            if ((view.getTop() + (f * 0.1f)) / this.LJIILIIL <= 0.5f) {
                return false;
            }
        } else if (view.getTop() < this.LJFF || Math.abs((view.getTop() + (f * 0.1f)) - this.LJFF) / this.LIZIZ <= 0.5f) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), this.LJIIIIZZ);
    }

    public final void startSettlingAnimation(View view, int i) {
        int i2;
        float f;
        boolean z = this.LJIJJLI;
        if (i == 4) {
            i2 = this.LJFF;
            z = false;
        } else if (i == 3) {
            i2 = this.LJ;
        } else if (this.LJI && i == 5) {
            i2 = this.LJIILIIL;
        } else if (i == 6) {
            i2 = this.LJJI;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C21589019eK c21589019eK = this.LJIIIZ;
        if (c21589019eK != null) {
            int left = view.getLeft();
            if (z) {
                f = 0.8f;
            } else {
                f = 1.0f;
            }
            C21589019eK.LJIJJLI = f;
            c21589019eK.LJIIZILJ = view;
            c21589019eK.LIZJ = -1;
            if (!c21589019eK.LJIIIIZZ(left, i2, 0, 0)) {
                if (c21589019eK.LIZ == 0 && c21589019eK.LJIIZILJ != null) {
                    c21589019eK.LJIIZILJ = null;
                }
            } else {
                setStateInternal(2);
                view.postOnAnimation(new RunnableC21589119eL(this, view, i));
                return;
            }
        }
        setStateInternal(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x018f  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r22, V r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
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
        int i2 = this.LJ;
        this.LJJ = i2;
        int i3 = this.LJIILIIL;
        int i4 = (int) (i3 * this.LJJIFFI);
        this.LJJI = i4;
        int i5 = this.LJIIIIZZ;
        if (i5 == 3) {
            v.offsetTopAndBottom(i2);
        } else if (this.LJI && i5 == 5) {
            v.offsetTopAndBottom(i3);
        } else if (i5 == 4) {
            v.offsetTopAndBottom(iMax3);
        } else if (i5 != 1 && i5 != 2) {
            if (i5 == 6) {
                v.offsetTopAndBottom(i4);
            }
        } else {
            v.offsetTopAndBottom(top - v.getTop());
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new C21589019eK(c16g0.getContext(), c16g0, this.LJJIII);
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

    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r7, V r8, android.view.View r9) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x025f  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r16, V r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJIILL;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.LJIIIIZZ == 3 && !super.onNestedPreFling(c16g0, v, view, f, f2)) {
            return false;
        }
        return true;
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
        View view2;
        WeakReference<View> weakReference = this.LJIILL;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
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
