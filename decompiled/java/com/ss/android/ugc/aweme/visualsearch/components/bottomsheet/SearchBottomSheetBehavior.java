package com.ss.android.ugc.aweme.visualsearch.components.bottomsheet;

import X.AbstractC21586119dr;
import X.AbstractC677220QhM;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C20691215xu;
import X.C20733016Bc;
import X.C21586019dq;
import X.C2188811AlT;
import X.RunnableC20733216Be;
import Y.ARunnableS17S0201000_10;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public class SearchBottomSheetBehavior<V extends View> extends C16BC<V> {
    public final float LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public final float LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public C21586019dq LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public WeakReference<V> LJIJJ;
    public WeakReference<View> LJIJJLI;
    public final List<AbstractC677220QhM> LJIL;
    public VelocityTracker LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public final C20733016Bc LJJIJL;

    public boolean LJ(View view, MotionEvent motionEvent) {
        return false;
    }

    public void LJFF(int i) {
    }

    public boolean LJI(View view) {
        return true;
    }

    public final int LIZJ() {
        int i = this.LJJIIJZLJL;
        return i > 0 ? i : this.LJIJI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.16Bc] */
    public SearchBottomSheetBehavior() {
        this.LJIIIIZZ = 0.5f;
        this.LJIILIIL = true;
        this.LJIILJJIL = 4;
        this.LJIL = new ArrayList();
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = -1;
        this.LJJIIZ = -1;
        this.LJJIIZI = -1;
        this.LJJIJ = false;
        this.LJJIJIIJI = true;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = true;
        this.LJJIJL = new AbstractC21586119dr() { // from class: X.16Bc
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i;
                int i2;
                SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                if (searchBottomSheetBehavior.LJIIJ) {
                    i = searchBottomSheetBehavior.LJIJI;
                    i2 = searchBottomSheetBehavior.LJFF;
                } else {
                    i = searchBottomSheetBehavior.LJI;
                    i2 = searchBottomSheetBehavior.LJFF;
                }
                return i - i2;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                    if (searchBottomSheetBehavior.LJJIJIL) {
                        searchBottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                View view2;
                SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                int i2 = searchBottomSheetBehavior.LJIILJJIL;
                if (i2 == 1 || searchBottomSheetBehavior.LJJIII) {
                    return false;
                }
                if ((i2 == 3 && searchBottomSheetBehavior.LJJI == i && (view2 = searchBottomSheetBehavior.LJIJJLI.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIJJ) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                this.LIZ.LJJIIJ = i2;
                return view.getLeft();
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i, int i2) {
                int i3;
                int i4;
                int top = view.getTop();
                if (Math.abs(this.LIZ.LJJIIJ) > Math.abs(i2) && this.LIZ.LJJIJIIJIL) {
                    if (C426750GoL.LIZLLL(view.getContext())) {
                        i4 = -this.LIZ.LJJIIJ;
                    } else {
                        i4 = this.LIZ.LJJIIJ;
                    }
                    i = top + ((int) (((double) i4) * 1.3d));
                }
                SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                int i5 = searchBottomSheetBehavior.LJFF;
                if (searchBottomSheetBehavior.LJIIJ) {
                    i3 = searchBottomSheetBehavior.LJIJI;
                } else {
                    i3 = searchBottomSheetBehavior.LJI;
                }
                return C419990GdR.LIZIZ(i, i5, i3);
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
            @Override // X.AbstractC21586119dr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewReleased(android.view.View r6, float r7, float r8) {
                /*
                    Method dump skipped, instruction units count: 329
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20733016Bc.onViewReleased(android.view.View, float, float):void");
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
            }
        };
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16Bm
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                if (Build.VERSION.SDK_INT < 24) {
                    return new SearchBottomSheetBehavior.SavedState(parcel);
                }
                return new SearchBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchBottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SearchBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT < 24) {
                    return new SearchBottomSheetBehavior.SavedState(parcel);
                }
                return new SearchBottomSheetBehavior.SavedState(parcel, classLoader);
            }
        };
        public final int LL;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LL = parcel.readInt();
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LL = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.LL = i;
        }
    }

    public final void LIZ(AbstractC677220QhM abstractC677220QhM) {
        if (!((ArrayList) this.LJIL).contains(abstractC677220QhM)) {
            ((ArrayList) this.LJIL).add(abstractC677220QhM);
        }
    }

    public int LIZLLL(int i) {
        int i2 = this.LJJIIZ;
        if (i2 > 0) {
            return i2;
        }
        return Math.max(this.LJIJI - i, this.LJFF);
    }

    public void dispatchOnSlide(int i) {
        if (this.LJIJJ.get() != null && !((ArrayList) this.LJIL).isEmpty()) {
            int i2 = this.LJI;
            int i3 = 0;
            if (i <= i2) {
                if (i < i2) {
                    while (i3 < ((ArrayList) this.LJIL).size()) {
                        AbstractC677220QhM abstractC677220QhM = (AbstractC677220QhM) ListProtector.get(this.LJIL, i3);
                        int i4 = this.LJI;
                        abstractC677220QhM.LIZ((i4 - i) / (i4 - this.LJFF));
                        i3++;
                    }
                    return;
                }
                while (i3 < ((ArrayList) this.LJIL).size()) {
                    ((AbstractC677220QhM) ListProtector.get(this.LJIL, i3)).LIZ(0.0f);
                    i3++;
                }
                return;
            }
            while (i3 < ((ArrayList) this.LJIL).size()) {
                ((AbstractC677220QhM) ListProtector.get(this.LJIL, i3)).LIZ((this.LJI - i) / (LIZJ() - this.LJI));
                i3++;
            }
        }
    }

    public View findScrollingChild(View view) {
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
            if (!this.LIZLLL) {
                this.LIZLLL = true;
            } else {
                return;
            }
        } else {
            if (!this.LIZLLL && this.LIZIZ == i) {
                return;
            }
            this.LIZLLL = false;
            this.LIZIZ = Math.max(0, i);
            this.LJI = this.LJIJI - i;
        }
        if (this.LJIILJJIL == 4 && (weakReference = this.LJIJJ) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public final void setState(int i) {
        if (i == this.LJIILJJIL) {
            return;
        }
        WeakReference<V> weakReference = this.LJIJJ;
        if (weakReference == null) {
            if (i == 4 || i == 3 || ((i == 6 && !this.LJIILIIL) || (this.LJIIJ && i == 5))) {
                this.LJIILJJIL = i;
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
            HandlerHook.viewPost(v, new ARunnableS17S0201000_10(i, v, this, 4));
        } else {
            startSettlingAnimation(v, i);
        }
    }

    public final void setStateInternal(int i) {
        if (this.LJIILJJIL == i) {
            return;
        }
        LJFF(i);
        this.LJIILJJIL = i;
        if (this.LJIJJ.get() != null && !((ArrayList) this.LJIL).isEmpty()) {
            for (int i2 = 0; i2 < ((ArrayList) this.LJIL).size(); i2++) {
                ((AbstractC677220QhM) ListProtector.get(this.LJIL, i2)).LIZIZ(i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.16Bc] */
    public SearchBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.LJIIIIZZ = 0.5f;
        this.LJIILIIL = true;
        this.LJIILJJIL = 4;
        this.LJIL = new ArrayList();
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = -1;
        this.LJJIIZ = -1;
        this.LJJIIZI = -1;
        this.LJJIJ = false;
        this.LJJIJIIJI = true;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = true;
        this.LJJIJL = new AbstractC21586119dr() { // from class: X.16Bc
            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                int i2;
                int i22;
                SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                if (searchBottomSheetBehavior.LJIIJ) {
                    i2 = searchBottomSheetBehavior.LJIJI;
                    i22 = searchBottomSheetBehavior.LJFF;
                } else {
                    i2 = searchBottomSheetBehavior.LJI;
                    i22 = searchBottomSheetBehavior.LJFF;
                }
                return i2 - i22;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                    if (searchBottomSheetBehavior.LJJIJIL) {
                        searchBottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i2) {
                Reference reference;
                View view2;
                SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                int i22 = searchBottomSheetBehavior.LJIILJJIL;
                if (i22 == 1 || searchBottomSheetBehavior.LJJIII) {
                    return false;
                }
                if ((i22 == 3 && searchBottomSheetBehavior.LJJI == i2 && (view2 = searchBottomSheetBehavior.LJIJJLI.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIJJ) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i2, int i22) {
                this.LIZ.LJJIIJ = i22;
                return view.getLeft();
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i2, int i22) {
                int i3;
                int i4;
                int top = view.getTop();
                if (Math.abs(this.LIZ.LJJIIJ) > Math.abs(i22) && this.LIZ.LJJIJIIJIL) {
                    if (C426750GoL.LIZLLL(view.getContext())) {
                        i4 = -this.LIZ.LJJIIJ;
                    } else {
                        i4 = this.LIZ.LJJIIJ;
                    }
                    i2 = top + ((int) (((double) i4) * 1.3d));
                }
                SearchBottomSheetBehavior searchBottomSheetBehavior = this.LIZ;
                int i5 = searchBottomSheetBehavior.LJFF;
                if (searchBottomSheetBehavior.LJIIJ) {
                    i3 = searchBottomSheetBehavior.LJIJI;
                } else {
                    i3 = searchBottomSheetBehavior.LJI;
                }
                return C419990GdR.LIZIZ(i2, i5, i3);
            }

            /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
            @Override // X.AbstractC21586119dr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewReleased(android.view.View r6, float r7, float r8) {
                /*
                    Method dump skipped, instruction units count: 329
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20733016Bc.onViewReleased(android.view.View, float, float):void");
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
        typedArrayObtainStyledAttributes.recycle();
        this.LIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public C21586019dq LIZIZ(C16G0 c16g0, AbstractC21586119dr abstractC21586119dr) {
        return C21586019dq.LJIIIZ(c16g0, abstractC21586119dr);
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), this.LJIILJJIL);
    }

    public boolean shouldHide(View view, float f) {
        if (this.LJIIL) {
            return true;
        }
        if (view.getTop() >= this.LJI && Math.abs((view.getTop() + (f * 0.1f)) - this.LJI) / this.LIZIZ > 0.5f) {
            return true;
        }
        return false;
    }

    public final void startSettlingAnimation(View view, int i) {
        int iLIZJ;
        if (i == 4) {
            iLIZJ = this.LJI;
        } else if (i == 3) {
            iLIZJ = this.LJFF;
        } else if (!this.LJIILIIL && i == 6) {
            iLIZJ = this.LJJIIZI;
        } else if (this.LJIIJ && i == 5) {
            iLIZJ = LIZJ();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        C21586019dq c21586019dq = this.LJIILL;
        if (c21586019dq != null && c21586019dq.LJIJJLI(view.getLeft(), iLIZJ, view)) {
            setStateInternal(2);
            LJFF(i);
            view.postOnAnimation(new RunnableC20733216Be(this, view, i));
            return;
        }
        setStateInternal(i);
    }

    @Override // X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        boolean z2;
        C21586019dq c21586019dq;
        if (v.isShown() && this.LJJIJIL) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.LJJI = -1;
                VelocityTracker velocityTracker = this.LJJ;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.LJJ = null;
                }
            }
            if (this.LJJ == null) {
                this.LJJ = VelocityTracker.obtain();
            }
            this.LJJ.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.LJJIII = false;
                    this.LJJI = -1;
                    if (this.LJIILLIIL) {
                        this.LJIILLIIL = false;
                        return false;
                    }
                }
            } else {
                this.LJJII = (int) motionEvent.getX();
                this.LJJIFFI = (int) motionEvent.getY();
                WeakReference<View> weakReference = this.LJIJJLI;
                if (weakReference != null && (view = weakReference.get()) != null && c16g0.LJIIJ(this.LJJII, this.LJJIFFI, view)) {
                    this.LJJI = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.LJJIII = true;
                }
                if ((this.LJJI != -1 || c16g0.LJIIJ(this.LJJII, this.LJJIFFI, v)) && !LJ(v, motionEvent)) {
                    z = false;
                } else {
                    z = true;
                }
                this.LJIILLIIL = z;
            }
            if (!this.LJIILLIIL && (c21586019dq = this.LJIILL) != null && c21586019dq.LJIJJ(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.LJIJJLI;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (this.LJJIJIIJIL && Math.abs(this.LJJII - motionEvent.getX()) > this.LJIILL.LIZIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (actionMasked != 2 || view2 == null || this.LJIILLIIL || this.LJIILJJIL == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.LJIILL == null) {
                return false;
            }
            if (Math.abs(this.LJJIFFI - motionEvent.getY()) <= this.LJIILL.LIZIZ && !z2) {
                return false;
            }
            return true;
        }
        this.LJIILLIIL = true;
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        int iMax;
        int iLIZJ;
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.LJIJI = c16g0.getHeight();
        if (this.LIZLLL) {
            if (this.LJ == 0) {
                this.LJ = c16g0.getResources().getDimensionPixelSize(R.dimen.qk);
            }
            iMax = Math.max(this.LJ, this.LJIJI - ((c16g0.getWidth() * 9) / 16));
            this.LIZJ = iMax;
        } else {
            iMax = this.LIZIZ;
        }
        int i2 = this.LJIJI;
        this.LJII = (int) (i2 * 0.25f);
        int iMax2 = this.LJJIIZ;
        if (iMax2 <= 0) {
            iMax2 = Math.max(0, i2 - v.getHeight());
        }
        this.LJFF = iMax2;
        int iLIZLLL = LIZLLL(iMax);
        this.LJI = iLIZLLL;
        int i3 = this.LJJIIZI;
        if (i3 > 0) {
            this.LJIIIZ = i3;
        } else {
            this.LJIIIZ = (int) (this.LJIJI * (1.0f - this.LJIIIIZZ));
        }
        int i4 = this.LJIILJJIL;
        if (i4 == 3) {
            v.offsetTopAndBottom(this.LJFF);
        } else if (!this.LJIILIIL && i4 == 6) {
            v.offsetTopAndBottom(i3);
        } else if (this.LJIIJ && i4 == 5) {
            if (this.LJJIJ) {
                iLIZJ = LIZJ();
            } else {
                iLIZJ = this.LJIJI;
            }
            v.offsetTopAndBottom(iLIZJ);
        } else if (i4 == 4) {
            v.offsetTopAndBottom(iLIZLLL);
        } else if (i4 == 1 || i4 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        if (this.LJIILL == null) {
            this.LJIILL = LIZIZ(c16g0, this.LJJIJL);
        }
        this.LJIJJ = new WeakReference<>(v);
        this.LJIJJLI = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c16g0, v, savedState.getSuperState());
        if (!this.LJJIJIIJI) {
            return;
        }
        int i = savedState.LL;
        if (i != 1 && i != 2) {
            this.LJIILJJIL = i;
        } else {
            this.LJIILJJIL = 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r6, V r7, android.view.View r8) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(X.C16G0 r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            boolean r0 = r8.isShown()
            r5 = 0
            if (r0 != 0) goto L8
            return r5
        L8:
            int r3 = r9.getActionMasked()
            int r0 = r6.LJIILJJIL
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
            if (r1 != r0) goto La3
        L22:
            X.19dq r0 = r6.LJIILL
            int r0 = r0.LIZJ
            int r1 = r9.findPointerIndex(r0)
            X.19dq r0 = r6.LJIILL
            if (r0 == 0) goto La3
            int r0 = r0.LIZ
            if (r0 != r4) goto La3
            if (r1 >= 0) goto La3
            r1 = 0
        L35:
            X.19dq r0 = r6.LJIILL
            if (r0 == 0) goto L3e
            if (r1 == 0) goto L3e
            r0.LJIILIIL(r9)
        L3e:
            if (r3 != 0) goto L4d
            r0 = -1
            r6.LJJI = r0
            android.view.VelocityTracker r0 = r6.LJJ
            if (r0 == 0) goto L4d
            r0.recycle()
            r0 = 0
            r6.LJJ = r0
        L4d:
            android.view.VelocityTracker r0 = r6.LJJ
            if (r0 != 0) goto L57
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.LJJ = r0
        L57:
            android.view.VelocityTracker r0 = r6.LJJ
            r0.addMovement(r9)
            if (r3 != r2) goto L9e
            boolean r0 = r6.LJIILLIIL
            if (r0 != 0) goto L9e
            boolean r0 = r6.LJJIJIIJIL
            if (r0 == 0) goto L7c
            int r0 = r6.LJJII
            float r1 = (float) r0
            float r0 = r9.getX()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            X.19dq r0 = r6.LJIILL
            int r0 = r0.LIZIZ
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7c
            r5 = 1
        L7c:
            int r0 = r6.LJJIFFI
            float r1 = (float) r0
            float r0 = r9.getY()
            float r1 = r1 - r0
            float r2 = java.lang.Math.abs(r1)
            X.19dq r1 = r6.LJIILL
            int r0 = r1.LIZIZ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L93
            if (r5 == 0) goto L9e
        L93:
            int r0 = r9.getActionIndex()
            int r0 = r9.getPointerId(r0)
            r1.LIZJ(r0, r8)
        L9e:
            boolean r0 = r6.LJIILLIIL
            r0 = r0 ^ 1
            return r0
        La3:
            r1 = 1
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        if (view == this.LJIJJLI.get()) {
            if (this.LJIILJJIL != 3 || super.onNestedPreFling(c16g0, v, view, f, f2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i) {
        this.LJIIZILJ = 0;
        this.LJIJ = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.LJIJJLI.get()) {
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
                if (!this.LJJIJIL) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.LJI;
            if (i3 > i6 && !this.LJIIJ) {
                int i7 = top - i6;
                iArr[1] = i7;
                v.offsetTopAndBottom(-i7);
                setStateInternal(4);
            } else {
                if (!this.LJJIJIL) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJIIZILJ = i2;
        this.LJIJ = true;
    }
}
