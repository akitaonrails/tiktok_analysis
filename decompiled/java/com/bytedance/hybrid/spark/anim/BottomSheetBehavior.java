package com.bytedance.hybrid.spark.anim;

import X.AbstractC1554310qY9;
import X.C14K9;
import X.C1549340qQ8;
import X.C1554250qY3;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C1C7U;
import X.C21589619eQ;
import X.C21589919eT;
import X.EnumC1779540wPQ;
import Y.ARunnableS2S0211000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class BottomSheetBehavior<V extends View> extends C16BC<V> {
    public boolean LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public BottomSheetBehavior<V>.d LJI;
    public ValueAnimator LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public float LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public WeakReference<View> LJIJ;
    public WeakReference<View> LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public C21589619eQ LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public WeakReference<V> LJJIJIL;
    public WeakReference<View> LJJIJL;
    public final ArrayList<AbstractC1554310qY9> LJJIJLIJ;
    public VelocityTracker LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public int LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public Map<View, Integer> LJJJJI;
    public final C21589919eT LJJJJIZL;
    public C1554250qY3 LJJJJJ;

    public class d implements Runnable {
        public final View LL;
        public boolean LLILLJJLI;
        public int LLILLL;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZ() {
            /*
                r9 = this;
                com.bytedance.hybrid.spark.anim.BottomSheetBehavior r0 = com.bytedance.hybrid.spark.anim.BottomSheetBehavior.this
                X.19eQ r4 = r0.LJJIIJZLJL
                r2 = 0
                if (r4 == 0) goto L73
                int r0 = r4.LIZ
                r3 = 2
                if (r0 != r3) goto L67
                android.widget.OverScroller r0 = r4.LJIILL
                boolean r8 = r0.computeScrollOffset()
                android.widget.OverScroller r0 = r4.LJIILL
                int r7 = r0.getCurrX()
                android.widget.OverScroller r0 = r4.LJIILL
                int r5 = r0.getCurrY()
                android.view.View r0 = r4.LJIIZILJ
                int r0 = r0.getLeft()
                int r6 = r7 - r0
                android.view.View r0 = r4.LJIIZILJ
                int r0 = r0.getTop()
                int r1 = r5 - r0
                if (r6 == 0) goto L35
                android.view.View r0 = r4.LJIIZILJ
                r0.offsetLeftAndRight(r6)
            L35:
                if (r1 == 0) goto L3c
                android.view.View r0 = r4.LJIIZILJ
                r0.offsetTopAndBottom(r1)
            L3c:
                if (r6 != 0) goto L40
                if (r1 == 0) goto L49
            L40:
                X.19eU r0 = r4.LJIILLIIL
                X.19eT r0 = (X.C21589919eT) r0
                com.bytedance.hybrid.spark.anim.BottomSheetBehavior r0 = r0.LIZ
                r0.dispatchOnSlide(r5)
            L49:
                if (r8 == 0) goto L60
                android.widget.OverScroller r0 = r4.LJIILL
                int r0 = r0.getFinalX()
                if (r7 != r0) goto L67
                android.widget.OverScroller r0 = r4.LJIILL
                int r0 = r0.getFinalY()
                if (r5 != r0) goto L67
                android.widget.OverScroller r0 = r4.LJIILL
                r0.abortAnimation()
            L60:
                android.view.ViewGroup r1 = r4.LJIJI
                Y.ARunnableS126S0100000_26 r0 = r4.LJIJJ
                com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r1, r0)
            L67:
                int r0 = r4.LIZ
                if (r0 != r3) goto L73
                android.view.View r0 = r9.LL
                r0.postOnAnimation(r9)
            L70:
                r9.LLILLJJLI = r2
                return
            L73:
                com.bytedance.hybrid.spark.anim.BottomSheetBehavior r1 = com.bytedance.hybrid.spark.anim.BottomSheetBehavior.this
                int r0 = r9.LLILLL
                r1.setStateInternal(r0)
                goto L70
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.d.LIZ():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("BottomSheetBehavior$SettleRunnable@25ea.run");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("BottomSheetBehavior$SettleRunnable@25ea.run");
        }

        public d(View view, int i) {
            this.LL = view;
            this.LLILLL = i;
        }
    }

    public final int LIZ() {
        int i = this.LJIJJLI;
        return i == -1 ? this.LIZJ : i;
    }

    public final void calculateCollapsedOffset() {
        int iMax = this.LIZLLL ? Math.max(this.LJ, this.LJJIJIIJIL - ((this.LJJIJIIJI * 9) / 16)) : this.LIZJ;
        if (this.LIZ) {
            this.LJIILJJIL = Math.max(this.LJJIJIIJIL - iMax, this.LJIIJJI);
        } else {
            this.LJIILJJIL = this.LJJIJIIJIL - iMax;
        }
    }

    public final int getExpandedOffset() {
        return this.LIZ ? this.LJIIJJI : this.LJIIIIZZ;
    }

    public final int getPeekHeight() {
        if (this.LIZLLL) {
            return -1;
        }
        return this.LIZJ;
    }

    public BottomSheetBehavior() {
        this.LIZ = true;
        this.LJIILIIL = 0.5f;
        this.LJIIZILJ = true;
        this.LJJII = 5;
        this.LJJIIJ = 4;
        this.LJJIJLIJ = new ArrayList<>();
        this.LJJJJIZL = new C21589919eT(this);
    }

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJIJIL = null;
        this.LJJIIJZLJL = null;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19eR
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new BottomSheetBehavior.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final BottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new BottomSheetBehavior.SavedState(parcel);
            }
        };
        public final int LL;
        public final int LLILLJJLI;
        public final int LLILLL;
        public final boolean LLILZ;
        public final boolean LLILZIL;
        public final boolean LLILZLL;

        public SavedState(Parcel parcel) {
            boolean z;
            boolean z2;
            super(parcel);
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readInt();
            this.LLILLL = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LLILZ = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLILZIL = z2;
            this.LLILZLL = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.LL = bottomSheetBehavior.LJJIIJ;
            this.LLILLJJLI = bottomSheetBehavior.LIZJ;
            this.LLILLL = bottomSheetBehavior.LJIJJLI;
            this.LLILZ = bottomSheetBehavior.LIZ;
            this.LLILZIL = bottomSheetBehavior.LJIILL;
            this.LLILZLL = bottomSheetBehavior.LJIILLIIL;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
            parcel.writeInt(this.LLILLJJLI);
            parcel.writeInt(this.LLILLL);
            parcel.writeInt(this.LLILZ ? 1 : 0);
            parcel.writeInt(this.LLILZIL ? 1 : 0);
            parcel.writeInt(this.LLILZLL ? 1 : 0);
        }
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float expandedOffset;
        View view;
        View view2;
        C1554250qY3 c1554250qY3;
        V v = this.LJJIJIL.get();
        try {
            WeakReference<View> weakReference = this.LJIJ;
            if (weakReference == null) {
                view = null;
            } else {
                view = weakReference.get();
            }
            WeakReference<View> weakReference2 = this.LJIJI;
            if (weakReference2 == null) {
                view2 = null;
            } else {
                view2 = weakReference2.get();
            }
            c1554250qY3 = this.LJJJJJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
        }
        if (c1554250qY3 != null && c1554250qY3.LIZ == EnumC1779540wPQ.DONE && i <= this.LJIILJJIL) {
            v.getLayoutParams().height = this.LJJIJIIJIL - i;
            if (view != null) {
                view.getLayoutParams().height = (this.LJJIJIIJIL - i) - C1549340qQ8.LIZJ(view2, null);
            }
            v.requestLayout();
        } else if (v == null) {
            return;
        }
        if (!this.LJJIJLIJ.isEmpty()) {
            int i2 = this.LJIILJJIL;
            if (i <= i2 && i2 != getExpandedOffset()) {
                int i3 = this.LJIILJJIL;
                f = i3 - i;
                expandedOffset = i3 - getExpandedOffset();
            } else {
                int i4 = this.LJIILJJIL;
                f = i4 - i;
                expandedOffset = this.LJJIJIIJIL - i4;
            }
            float f2 = f / expandedOffset;
            for (int i5 = 0; i5 < this.LJJIJLIJ.size(); i5++) {
                ((AbstractC1554310qY9) ListProtector.get(this.LJJIJLIJ, i5)).LIZ(v, f2);
            }
        }
    }

    public final View findScrollingChild(View view) {
        if (C14K9.LJIILL(view) && (view.canScrollVertically(-1) || view.canScrollVertically(1))) {
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
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        super.onAttachedToLayoutParams(c16g1);
        this.LJJIJIL = null;
        this.LJJIIJZLJL = null;
    }

    public final void setFitToContents(boolean z) {
        int i;
        if (this.LIZ == z) {
            return;
        }
        this.LIZ = z;
        if (this.LJJIJIL != null) {
            calculateCollapsedOffset();
        }
        if (this.LIZ && this.LJJIIJ == 6) {
            i = 3;
        } else {
            i = this.LJJIIJ;
        }
        setStateInternal(i);
    }

    public final void setHideable(boolean z) {
        if (this.LJIILL != z) {
            this.LJIILL = z;
            if (!z && this.LJJIIJ == 5) {
                LIZIZ(4, true);
            }
        }
    }

    public final void setPeekHeight(int i) {
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
        }
        if (this.LJJIJIL != null) {
            calculateCollapsedOffset();
            if (this.LJJIIJ == 4 && (v = this.LJJIJIL.get()) != null) {
                v.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[LOOP:0: B:17:0x0025->B:19:0x002d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStateInternal(int r6) {
        /*
            r5 = this;
            int r0 = r5.LJJIIJ
            if (r0 != r6) goto L5
            return
        L5:
            r5.LJJII = r0
            r5.LJJIIJ = r6
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.LJJIJIL
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.Object r4 = r0.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L17
            return
        L17:
            r3 = 0
            r2 = 3
            r1 = 1
            if (r6 != r2) goto L3b
            r5.updateImportantForAccessibility(r1)
        L1f:
            boolean r0 = r5.LJFF
            if (r0 == r1) goto L25
            r5.LJFF = r1
        L25:
            java.util.ArrayList<X.0qY9> r0 = r5.LJJIJLIJ
            int r0 = r0.size()
            if (r3 >= r0) goto L4f
            java.util.ArrayList<X.0qY9> r0 = r5.LJJIJLIJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0qY9 r0 = (X.AbstractC1554310qY9) r0
            r0.LIZIZ(r6, r4)
            int r3 = r3 + 1
            goto L25
        L3b:
            r0 = 6
            if (r6 == r0) goto L4a
            r0 = 5
            if (r6 == r0) goto L4a
            r0 = 4
            if (r6 == r0) goto L4a
            r0 = 2
            if (r6 == r0) goto L25
            if (r6 != r2) goto L4d
            goto L1f
        L4a:
            r5.updateImportantForAccessibility(r3)
        L4d:
            r1 = 0
            goto L1f
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.setStateInternal(int):void");
    }

    public final void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.LJJIJIL;
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
            if (this.LJJJJI == null) {
                this.LJJJJI = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.LJJIJIL.get() && z) {
                this.LJJJJI.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.LJJJJI = null;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.LIZ = true;
        this.LJIILIIL = 0.5f;
        this.LJIIZILJ = true;
        this.LJJII = 5;
        this.LJJIIJ = 4;
        this.LJJIJLIJ = new ArrayList<>();
        this.LJJJJIZL = new C21589919eT(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJII = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.LJII.addUpdateListener(new AUListenerS277S0100000_29(this, 36));
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setFitToContents(true);
        this.LJIILLIIL = false;
        this.LJIIZILJ = true;
        this.LJIILIIL = 0.5f;
        if (this.LJJIJIL != null) {
            this.LJIIL = (int) (this.LJJIJIIJIL * (1.0f - 0.5f));
        }
        this.LJIIIIZZ = 0;
        typedArrayObtainStyledAttributes.recycle();
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void LIZIZ(int i, boolean z) {
        if (i == this.LJJIIJ) {
            return;
        }
        if (this.LJJIJIL == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJIILL && i == 5)) {
                this.LJJIIJ = i;
                return;
            }
            return;
        }
        LIZLLL(i, z);
    }

    public final void LIZLLL(int i, boolean z) {
        V v = this.LJJIJIL.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            HandlerHook.viewPost(v, new ARunnableS2S0211000_29(this, v, i, z, 0));
        } else {
            LIZJ(i, v, z);
        }
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), this);
    }

    public final boolean shouldHide(View view, float f) {
        int iMax;
        if (this.LJIILLIIL && view.getTop() - this.LJIIIIZZ >= this.LJJIFFI) {
            return true;
        }
        if ((this.LJJII == 3 && this.LJJIFFI != 0 && view.getTop() - this.LJIIIIZZ >= this.LJJIFFI) || (this.LJJII == 4 && this.LJJI != 0 && view.getTop() - this.LJIILJJIL >= this.LJJI)) {
            return true;
        }
        if (view.getTop() < this.LJIILJJIL) {
            return false;
        }
        if (this.LIZLLL) {
            iMax = Math.max(this.LJ, this.LJJIJIIJIL - ((this.LJJIJIIJI * 9) / 16));
        } else {
            iMax = this.LIZJ;
        }
        if (Math.abs((view.getTop() + (f * 0.1f)) - this.LJIILJJIL) / iMax > 0.5f) {
            return true;
        }
        return false;
    }

    public final void LIZJ(int i, View view, boolean z) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.LJIILJJIL;
        } else if (i == 6) {
            expandedOffset = this.LJIIL;
            if (this.LIZ && expandedOffset <= (i2 = this.LJIIJJI)) {
                i = 3;
                expandedOffset = i2;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else if (!this.LJIILL || i != 5) {
            return;
        } else {
            expandedOffset = this.LJJIJIIJIL;
        }
        startSettlingAnimation(view, i, expandedOffset, !z);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r21, V r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.LJJIJIL == null) {
            this.LJ = c16g0.getResources().getDimensionPixelSize(R.dimen.qk);
            this.LJJIJIL = new WeakReference<>(v);
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = new C21589619eQ(c16g0.getContext(), c16g0, this.LJJJJIZL);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.LJJIJIIJI = c16g0.getWidth();
        this.LJJIJIIJIL = c16g0.getHeight();
        if (LIZ() > 0) {
            int iLIZ = this.LJJIJIIJIL - LIZ();
            this.LJIIIIZZ = iLIZ;
            int i2 = this.LJIIJ;
            if (i2 == 0) {
                i2 = this.LJIIIZ;
            }
            this.LJIIIIZZ = Math.max(i2, iLIZ);
        } else {
            this.LJIIIIZZ = this.LJJIJIIJIL;
        }
        this.LJIIJJI = Math.max(0, this.LJJIJIIJIL - v.getHeight());
        this.LJIIL = (int) (this.LJJIJIIJIL * (1.0f - this.LJIILIIL));
        calculateCollapsedOffset();
        if (!this.LJJIII) {
            int i3 = this.LJJIIJ;
            if (i3 == 3) {
                v.offsetTopAndBottom(getExpandedOffset() - v.getTop());
            } else if (i3 == 6) {
                v.offsetTopAndBottom(this.LJIIL);
            } else if (this.LJIILL && i3 == 5) {
                v.offsetTopAndBottom(this.LJJIJIIJIL);
            } else if (i3 == 4) {
                v.offsetTopAndBottom(this.LJIILJJIL - v.getTop());
            } else if (i3 == 1 || i3 == 2) {
                v.offsetTopAndBottom(top - v.getTop());
            }
        } else {
            this.LJJIII = false;
        }
        this.LJJIJL = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c16g0, v, savedState.getSuperState());
        int i = savedState.LL;
        if (i != 1 && i != 2) {
            this.LJJIIJ = i;
        } else {
            this.LJJIIJ = 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        r10.LJIIJJI();
     */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r16, V r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r5, V r6, android.view.View r7, int r8) {
        /*
            r4 = this;
            int r1 = r6.getTop()
            int r0 = r4.getExpandedOffset()
            r3 = 3
            if (r1 != r0) goto Lf
            r4.setStateInternal(r3)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.LJJIJL
            if (r0 == 0) goto La8
            java.lang.Object r0 = r0.get()
            if (r7 != r0) goto La8
            boolean r0 = r4.LJJIJ
            if (r0 == 0) goto La8
            int r2 = r4.LJJIIJ
            r0 = 1
            r1 = 4
            if (r2 != r0) goto L2c
            boolean r0 = r4.LJIIZILJ
            if (r0 == 0) goto L2c
            int r0 = r4.LJJII
            if (r0 != r1) goto L2c
            return
        L2c:
            int r0 = r4.LJJIIZI
            if (r0 <= 0) goto L40
            boolean r0 = r4.LIZ
            if (r0 == 0) goto L3d
            int r1 = r4.LJIIJJI
        L36:
            r0 = 0
            r4.startSettlingAnimation(r6, r3, r1, r0)
            r4.LJJIJ = r0
            return
        L3d:
            int r1 = r4.LJIIIIZZ
            goto L36
        L40:
            boolean r0 = r4.LJIILL
            if (r0 == 0) goto L63
            android.view.VelocityTracker r2 = r4.LJJIL
            if (r2 != 0) goto L53
            r0 = 0
        L49:
            boolean r0 = r4.shouldHide(r6, r0)
            if (r0 == 0) goto L63
            int r1 = r4.LJJIJIIJIL
            r3 = 5
            goto L36
        L53:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r4.LIZIZ
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r4.LJJIL
            int r0 = r4.LJJIZ
            float r0 = r1.getYVelocity(r0)
            goto L49
        L63:
            int r0 = r4.LJJIIZI
            if (r0 != 0) goto L9a
            int r2 = r6.getTop()
            boolean r0 = r4.LIZ
            if (r0 == 0) goto L86
            int r0 = r4.LJIIJJI
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r4.LJIILJJIL
            int r2 = r2 - r0
            int r0 = java.lang.Math.abs(r2)
            if (r1 >= r0) goto L83
            int r1 = r4.LJIIJJI
            goto L36
        L83:
            int r1 = r4.LJIILJJIL
            goto La6
        L86:
            int r0 = r4.LJIIIIZZ
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r4.LJIILJJIL
            int r2 = r2 - r0
            int r0 = java.lang.Math.abs(r2)
            if (r1 >= r0) goto La4
            int r1 = r4.LJIIIIZZ
            goto L36
        L9a:
            boolean r0 = r4.LIZ
            if (r0 == 0) goto La1
            int r1 = r4.LJIILJJIL
            goto La6
        La1:
            int r1 = r4.LJIILJJIL
            goto La6
        La4:
            int r1 = r4.LJIILJJIL
        La6:
            r3 = 4
            goto L36
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r5.LJIIJ(r4, r9, (int) r5.LJIIJJI.getXVelocity(r5.LIZJ), (int) r5.LJIIJJI.getYVelocity(r5.LIZJ)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startSettlingAnimation(android.view.View r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r3 = 0
            if (r10 == 0) goto L51
            X.19eQ r5 = r6.LJJIIJZLJL
            int r4 = r7.getLeft()
            boolean r0 = r5.LJIJ
            if (r0 == 0) goto L74
            android.view.VelocityTracker r1 = r5.LJIIJJI
            int r0 = r5.LIZJ
            float r0 = r1.getXVelocity(r0)
            int r2 = (int) r0
            android.view.VelocityTracker r1 = r5.LJIIJJI
            int r0 = r5.LIZJ
            float r0 = r1.getYVelocity(r0)
            int r0 = (int) r0
            boolean r0 = r5.LJIIJ(r4, r9, r2, r0)
            if (r0 == 0) goto L6d
        L25:
            r0 = 2
            r6.setStateInternal(r0)
            r2 = 1
            if (r8 == r0) goto L36
            r0 = 3
            if (r8 != r0) goto L30
            r3 = 1
        L30:
            boolean r0 = r6.LJFF
            if (r0 == r3) goto L36
            r6.LJFF = r3
        L36:
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior<V>$d r0 = r6.LJI
            if (r0 != 0) goto L41
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior$d r0 = new com.bytedance.hybrid.spark.anim.BottomSheetBehavior$d
            r0.<init>(r7, r8)
            r6.LJI = r0
        L41:
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior<V>$d r1 = r6.LJI
            boolean r0 = r1.LLILLJJLI
            if (r0 != 0) goto L71
            r1.LLILLL = r8
            r7.postOnAnimation(r1)
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior<V>$d r0 = r6.LJI
            r0.LLILLJJLI = r2
            return
        L51:
            X.19eQ r2 = r6.LJJIIJZLJL
            int r1 = r7.getLeft()
            r2.LJIIZILJ = r7
            r0 = -1
            r2.LIZJ = r0
            boolean r0 = r2.LJIIJ(r1, r9, r3, r3)
            if (r0 != 0) goto L25
            int r0 = r2.LIZ
            if (r0 != 0) goto L6d
            android.view.View r0 = r2.LJIIZILJ
            if (r0 == 0) goto L6d
            r0 = 0
            r2.LJIIZILJ = r0
        L6d:
            r6.setStateInternal(r8)
            return
        L71:
            r1.LLILLL = r8
            return
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.startSettlingAnimation(android.view.View, int, int, boolean):void");
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIJL;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.LJJIIJ == 3 && !super.onNestedPreFling(c16g0, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        this.LJJIIZI = 0;
        this.LJJIJ = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.LJJIJL;
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
                if (!this.LJIIZILJ) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.LJIILJJIL;
            if (i4 > i5 && !this.LJIILL) {
                int i6 = top - i5;
                iArr[1] = i6;
                v.offsetTopAndBottom(-i6);
                setStateInternal(4);
            } else {
                if (!this.LJIIZILJ) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJJIIZI = i2;
        this.LJJIJ = true;
    }
}
