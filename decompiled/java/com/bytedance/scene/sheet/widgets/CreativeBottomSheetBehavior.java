package com.bytedance.scene.sheet.widgets;

import X.AbstractC214811194v;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C19RN;
import X.C19RX;
import X.C19W0;
import X.C20092413jW;
import X.C21538919Rb;
import X.C21551419Vw;
import X.C21583119dN;
import X.C21584319dZ;
import X.C2188811AlT;
import X.InterfaceC20092813ja;
import X.RunnableC21583219dO;
import Y.ARunnableS34S0201000_29;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
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
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public class CreativeBottomSheetBehavior<V extends View> extends C16BC<V> {
    public final int LIZ;
    public boolean LIZIZ;
    public final float LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public int LJFF;
    public final int LJI;
    public final boolean LJII;
    public C21538919Rb LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public C19RX LJIIJJI;
    public boolean LJIIL;
    public RunnableC21583219dO LJIILIIL;
    public ValueAnimator LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public float LJIJ;
    public int LJIJI;
    public final float LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public int LJJI;
    public C21583119dN LJJIFFI;
    public boolean LJJII;
    public int LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public WeakReference<V> LJJIJ;
    public WeakReference<View> LJJIJIIJI;
    public final ArrayList<AbstractC214811194v> LJJIJIIJIL;
    public VelocityTracker LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    public boolean LJJIL;
    public Map<View, Integer> LJJIZ;
    public int LJJJ;
    public int LJJJI;
    public final C21584319dZ LJJJIL;

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public final int calculatePeekHeight() {
        int i;
        return this.LJ ? Math.min(Math.max(this.LJFF, this.LJJIIZI - ((this.LJJIIZ * 9) / 16)), this.LJJIIJZLJL) : (this.LJIIJ || (i = this.LJIIIZ) <= 0) ? this.LIZLLL : Math.max(this.LIZLLL, i + this.LJI);
    }

    public final int getExpandedOffset() {
        return this.LIZIZ ? this.LJIILLIIL : this.LJIILL;
    }

    public final void updateAccessibilityActions() {
        V v;
        WeakReference<V> weakReference = this.LJJIJ;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        q0.LJIILJJIL(524288, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(262144, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(1048576, v);
        q0.LJIIJJI(0, v);
        int i = this.LJJJ;
        if (i != -1) {
            q0.LJIILJJIL(i, v);
            q0.LJIIJJI(0, v);
        }
        if (this.LJJI != 6) {
            this.LJJJ = q0.LIZ(v, v.getResources().getString(2131827880), new InterfaceC20092813ja() { // from class: X.19dY
                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZIZ.setState(i);
                    return true;
                }
            });
        }
        if (this.LJIJJLI) {
            final int i2 = 5;
            if (this.LJJI != 5) {
                q0.LJIILL(v, C20092413jW.LJIL, null, new InterfaceC20092813ja() { // from class: X.19dY
                    @Override // X.InterfaceC20092813ja
                    public final boolean LIZ(View view) {
                        this.LIZIZ.setState(i2);
                        return true;
                    }
                });
            }
        }
        int i3 = this.LJJI;
        final int i4 = 4;
        final int i5 = 3;
        if (i3 == 3) {
            i = this.LIZIZ ? 4 : 6;
            q0.LJIILL(v, C20092413jW.LJIJJLI, null, new InterfaceC20092813ja() { // from class: X.19dY
                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZIZ.setState(i);
                    return true;
                }
            });
        } else if (i3 == 4) {
            i = this.LIZIZ ? 3 : 6;
            q0.LJIILL(v, C20092413jW.LJIJJ, null, new InterfaceC20092813ja() { // from class: X.19dY
                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZIZ.setState(i);
                    return true;
                }
            });
        } else if (i3 == 6) {
            q0.LJIILL(v, C20092413jW.LJIJJLI, null, new InterfaceC20092813ja() { // from class: X.19dY
                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZIZ.setState(i4);
                    return true;
                }
            });
            q0.LJIILL(v, C20092413jW.LJIJJ, null, new InterfaceC20092813ja() { // from class: X.19dY
                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZIZ.setState(i5);
                    return true;
                }
            });
        }
    }

    public CreativeBottomSheetBehavior() {
        this.LIZIZ = true;
        this.LJIJ = 0.5f;
        this.LJIJJ = -1.0f;
        this.LJJ = true;
        this.LJJI = 4;
        this.LJJIJIIJIL = new ArrayList<>();
        this.LJJJ = -1;
        this.LJJJI = -1;
        this.LJJJIL = new C21584319dZ(this);
    }

    public final void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        if (this.LIZIZ) {
            this.LJIJI = Math.max(this.LJJIIZI - iCalculatePeekHeight, this.LJIILLIIL);
        } else {
            this.LJIJI = this.LJJIIZI - iCalculatePeekHeight;
        }
    }

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJIJ = null;
        this.LJJIFFI = null;
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float expandedOffset;
        V v = this.LJJIJ.get();
        if (v != null && !this.LJJIJIIJIL.isEmpty()) {
            int i2 = this.LJIJI;
            if (i <= i2 && i2 != getExpandedOffset()) {
                int i3 = this.LJIJI;
                f = i3 - i;
                expandedOffset = i3 - getExpandedOffset();
            } else {
                int i4 = this.LJIJI;
                f = i4 - i;
                expandedOffset = this.LJJIIZI - i4;
            }
            float f2 = f / expandedOffset;
            for (int i5 = 0; i5 < this.LJJIJIIJIL.size(); i5++) {
                ((AbstractC214811194v) ListProtector.get(this.LJJIJIIJIL, i5)).LIZ(v, f2);
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
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        super.onAttachedToLayoutParams(c16g1);
        this.LJJIJ = null;
        this.LJJIFFI = null;
    }

    public final void setPeekHeight(int i) {
        if (i == -1) {
            if (!this.LJ) {
                this.LJ = true;
            } else {
                return;
            }
        } else {
            if (!this.LJ && this.LIZLLL == i) {
                return;
            }
            this.LJ = false;
            this.LIZLLL = Math.max(0, i);
        }
        updatePeekHeight(false);
    }

    public final void setState(int i) {
        if (i == this.LJJI) {
            return;
        }
        if (this.LJJIJ == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJIJJLI && i == 5)) {
                this.LJJI = i;
                return;
            }
            return;
        }
        settleToStatePendingLayout(i);
    }

    public final void setStateInternal(int i) {
        V v;
        if (this.LJJI == i) {
            return;
        }
        this.LJJI = i;
        WeakReference<V> weakReference = this.LJJIJ;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i);
        for (int i2 = 0; i2 < this.LJJIJIIJIL.size(); i2++) {
            ((AbstractC214811194v) ListProtector.get(this.LJJIJIIJIL, i2)).LIZIZ(i, v);
        }
        updateAccessibilityActions();
    }

    public final void settleToStatePendingLayout(int i) {
        V v = this.LJJIJ.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
            HandlerHook.viewPost(v, new ARunnableS34S0201000_29(v, i, this, 1));
        } else {
            settleToState(v, i);
        }
    }

    public final void updateDrawableForTargetState(int i) {
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
        if (this.LJIIL != z) {
            this.LJIIL = z;
            if (this.LJIIIIZZ != null && (valueAnimator = this.LJIILJJIL) != null) {
                if (valueAnimator.isRunning()) {
                    this.LJIILJJIL.reverse();
                    return;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                this.LJIILJJIL.setFloatValues(1.0f - f, f);
                this.LJIILJJIL.start();
            }
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.LJJIJ;
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
            if (this.LJJIZ == null) {
                this.LJJIZ = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.LJJIJ.get() && z) {
                this.LJJIZ.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.LJJIZ = null;
        }
    }

    public final void updatePeekHeight(boolean z) {
        V v;
        if (this.LJJIJ != null) {
            calculateCollapsedOffset();
            if (this.LJJI == 4 && (v = this.LJJIJ.get()) != null) {
                v.requestLayout();
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19dQ
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new CreativeBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreativeBottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final CreativeBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new CreativeBottomSheetBehavior.SavedState(parcel, classLoader);
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

        public SavedState(Parcelable parcelable, CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior) {
            super(parcelable);
            this.LL = creativeBottomSheetBehavior.LJJI;
            this.LLILLJJLI = creativeBottomSheetBehavior.LIZLLL;
            this.LLILLL = creativeBottomSheetBehavior.LIZIZ;
            this.LLILZ = creativeBottomSheetBehavior.LJIJJLI;
            this.LLILZIL = creativeBottomSheetBehavior.LJIL;
        }
    }

    public CreativeBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        super(context, attributeSet);
        this.LIZIZ = true;
        this.LJIJ = 0.5f;
        this.LJIJJ = -1.0f;
        this.LJJ = true;
        this.LJJI = 4;
        this.LJJIJIIJIL = new ArrayList<>();
        this.LJJJ = -1;
        this.LJJJI = -1;
        this.LJJJIL = new C21584319dZ(this);
        this.LJI = context.getResources().getDimensionPixelSize(R.dimen.a_t);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        this.LJII = typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (zHasValue) {
            createMaterialShapeDrawable(context, attributeSet, zHasValue, C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            createMaterialShapeDrawable(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJIILJJIL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.LJIILJJIL.addUpdateListener(new AUListenerS280S0100000_33(this, 57));
        this.LJIJJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i2);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.LJIJJLI != z) {
            this.LJIJJLI = z;
            if (!z && this.LJJI == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
        this.LJIIJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.LIZIZ != z2) {
            this.LIZIZ = z2;
            if (this.LJJIJ != null) {
                calculateCollapsedOffset();
            }
            if (this.LIZIZ && this.LJJI == 6) {
                i = 3;
            } else {
                i = this.LJJI;
            }
            setStateInternal(i);
            updateAccessibilityActions();
        }
        this.LJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.LJJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.LJIJ = f;
            if (this.LJJIJ != null) {
                this.LJIIZILJ = (int) (this.LJJIIZI * (1.0f - f));
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.LJIILL = i3;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0);
                if (dimensionPixelOffset >= 0) {
                    this.LJIILL = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            this.LIZJ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        return new SavedState(super.onSaveInstanceState(c16g0, v), (CreativeBottomSheetBehavior<?>) this);
    }

    public final void settleToState(View view, int i) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.LJIJI;
        } else if (i == 6) {
            expandedOffset = this.LJIIZILJ;
            if (this.LIZIZ && expandedOffset <= (i2 = this.LJIILLIIL)) {
                i = 3;
                expandedOffset = i2;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else if (this.LJIJJLI && i == 5) {
            expandedOffset = this.LJJIIZI;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        startSettlingAnimation(view, i, expandedOffset, false);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJIL) {
            return true;
        }
        if (view.getTop() < this.LJIJI) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * 0.1f)) - this.LJIJI) / calculatePeekHeight() > 0.5f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0147  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C16G0 r18, V r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior.onInterceptTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        boolean z;
        float f;
        C21538919Rb c21538919Rb;
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.LJJIJ == null) {
            this.LJFF = c16g0.getResources().getDimensionPixelSize(R.dimen.qk);
            if (Build.VERSION.SDK_INT >= 29 && !this.LJIIJ && !this.LJ) {
                C21551419Vw.LIZ(v, new C19W0() { // from class: X.19dP
                    @Override // X.C19W0
                    public final C20246014Ju LIZ(View view, C20246014Ju c20246014Ju, C21551719Vz c21551719Vz) {
                        this.LIZ.LJIIIZ = c20246014Ju.LIZ.LJIIIIZZ().LIZLLL;
                        this.LIZ.updatePeekHeight(false);
                        return c20246014Ju;
                    }
                });
            }
            this.LJJIJ = new WeakReference<>(v);
            if (this.LJII && (c21538919Rb = this.LJIIIIZZ) != null) {
                v.setBackground(c21538919Rb);
            }
            C21538919Rb c21538919Rb2 = this.LJIIIIZZ;
            if (c21538919Rb2 != null) {
                float fLJIIIIZZ = this.LJIJJ;
                if (fLJIIIIZZ == -1.0f) {
                    fLJIIIIZZ = C14K9.LJIIIIZZ(v);
                }
                c21538919Rb2.LJIIJ(fLJIIIIZZ);
                if (this.LJJI == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJIIL = z;
                C21538919Rb c21538919Rb3 = this.LJIIIIZZ;
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
        if (this.LJJIFFI == null) {
            C21583119dN c21583119dN = new C21583119dN(c16g0.getContext(), c16g0, this.LJJJIL);
            this.LJJIFFI = c21583119dN;
            c21583119dN.LJIIJJI = this.LJJJI;
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.LJJIIZ = c16g0.getWidth();
        this.LJJIIZI = c16g0.getHeight();
        int height = v.getHeight();
        this.LJJIIJZLJL = height;
        this.LJIILLIIL = Math.max(0, this.LJJIIZI - height);
        this.LJIIZILJ = (int) (this.LJJIIZI * (1.0f - this.LJIJ));
        calculateCollapsedOffset();
        int i2 = this.LJJI;
        if (i2 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i2 == 6) {
            v.offsetTopAndBottom(this.LJIIZILJ);
        } else if (this.LJIJJLI && i2 == 5) {
            v.offsetTopAndBottom(this.LJJIIZI);
        } else if (i2 == 4) {
            v.offsetTopAndBottom(this.LJIJI);
        } else if (i2 == 1 || i2 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.LJJIJIIJI = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c16g0, v, savedState.mSuperState);
        int i = this.LIZ;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.LIZLLL = savedState.LLILLJJLI;
            }
            if (i == -1 || (i & 2) == 2) {
                this.LIZIZ = savedState.LLILLL;
            }
            if (i == -1 || (i & 4) == 4) {
                this.LJIJJLI = savedState.LLILZ;
            }
            if (i == -1 || (i & 8) == 8) {
                this.LJIL = savedState.LLILZIL;
            }
        }
        int i2 = savedState.LL;
        if (i2 != 1 && i2 != 2) {
            this.LJJI = i2;
        } else {
            this.LJJI = 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        r10.LJIIIZ();
     */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r16, V r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    public final void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.LJII) {
            this.LJIIJJI = C19RX.LIZIZ(context, attributeSet, R.attr.bd0, R.style.a2e).LIZ();
            C21538919Rb c21538919Rb = new C21538919Rb(this.LJIIJJI);
            this.LJIIIIZZ = c21538919Rb;
            c21538919Rb.LJIIIIZZ(context);
            if (z && colorStateList != null) {
                this.LJIIIIZZ.LJIIJJI(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.LJIIIIZZ.setTint(typedValue.data);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r5, V r6, android.view.View r7, int r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r3.LJIIIIZZ(r5, r9, (int) r3.LJIIL.getXVelocity(r3.LIZJ), (int) r3.LJIIL.getYVelocity(r3.LIZJ)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startSettlingAnimation(android.view.View r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            X.19dN r3 = r6.LJJIFFI
            r2 = 1
            r4 = 0
            if (r3 == 0) goto L64
            if (r10 == 0) goto L4a
            int r5 = r7.getLeft()
            boolean r0 = r3.LJIJI
            if (r0 == 0) goto L6b
            android.view.VelocityTracker r1 = r3.LJIIL
            int r0 = r3.LIZJ
            float r0 = r1.getXVelocity(r0)
            int r4 = (int) r0
            android.view.VelocityTracker r1 = r3.LJIIL
            int r0 = r3.LIZJ
            float r0 = r1.getYVelocity(r0)
            int r0 = (int) r0
            boolean r0 = r3.LJIIIIZZ(r5, r9, r4, r0)
            if (r0 == 0) goto L64
        L28:
            r0 = 2
            r6.setStateInternal(r0)
            r6.updateDrawableForTargetState(r8)
            X.19dO r0 = r6.LJIILIIL
            if (r0 != 0) goto L3a
            X.19dO r0 = new X.19dO
            r0.<init>(r6, r7, r8)
            r6.LJIILIIL = r0
        L3a:
            X.19dO r1 = r6.LJIILIIL
            boolean r0 = r1.LLILLJJLI
            if (r0 != 0) goto L68
            r1.LLILLL = r8
            r7.postOnAnimation(r1)
            X.19dO r0 = r6.LJIILIIL
            r0.LLILLJJLI = r2
            return
        L4a:
            int r1 = r7.getLeft()
            r3.LJIJ = r7
            r0 = -1
            r3.LIZJ = r0
            boolean r0 = r3.LJIIIIZZ(r1, r9, r4, r4)
            if (r0 != 0) goto L28
            int r0 = r3.LIZ
            if (r0 != 0) goto L64
            android.view.View r0 = r3.LJIJ
            if (r0 == 0) goto L64
            r0 = 0
            r3.LJIJ = r0
        L64:
            r6.setStateInternal(r8)
            return
        L68:
            r1.LLILLL = r8
            return
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior.startSettlingAnimation(android.view.View, int, int, boolean):void");
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIJIIJI;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.LJJI == 3 && !super.onNestedPreFling(c16g0, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        this.LJJIII = 0;
        this.LJJIIJ = false;
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
        WeakReference<View> weakReference = this.LJJIJIIJI;
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
                if (!this.LJJ) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.LJIJI;
            if (i4 > i5 && !this.LJIJJLI) {
                int i6 = top - i5;
                iArr[1] = i6;
                v.offsetTopAndBottom(-i6);
                setStateInternal(4);
            } else {
                if (!this.LJJ) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJJIII = i2;
        this.LJJIIJ = true;
    }
}
