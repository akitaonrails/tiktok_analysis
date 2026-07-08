package com.bytedance.tux.sheet.sidesheet;

import X.AbstractC1391030mIn;
import X.AbstractC21586119dr;
import X.AbstractC21587719e7;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C21586019dq;
import X.C21587419e4;
import X.C2188811AlT;
import X.C786410Ut5;
import Y.ARunnableS102S0200000_33;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.sheet.sidesheet.SideSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public final class SideSheetBehavior<V extends View> extends C16BC<V> {
    public WeakReference<V> LIZLLL;
    public C21586019dq LJFF;
    public VelocityTracker LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public final AbstractC21587719e7 LJIILJJIL;
    public final C21587419e4 LJIILL;
    public final boolean LIZ = true;
    public final float LIZIZ = 0.1f;
    public int LIZJ = 5;
    public final Set<AbstractC1391030mIn> LJ = new LinkedHashSet();
    public final SideSheetBehavior<V>.b LJI = new b();

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LIZLLL = null;
        this.LJFF = null;
    }

    public final class b {
        public int LIZ;
        public boolean LIZIZ;
        public final ARunnableS102S0200000_33 LIZJ;

        public b() {
            this.LIZJ = new ARunnableS102S0200000_33(SideSheetBehavior.this, this, 17);
        }

        public final void LIZ(int i) {
            V v;
            WeakReference<V> weakReference = SideSheetBehavior.this.LIZLLL;
            if (weakReference != null && (v = weakReference.get()) != null) {
                this.LIZ = i;
                if (!this.LIZIZ) {
                    v.postOnAnimation(this.LIZJ);
                    this.LIZIZ = true;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.19e4] */
    public SideSheetBehavior(boolean z) {
        AbstractC21587719e7 abstractC21587719e7;
        if (z) {
            abstractC21587719e7 = new AbstractC21587719e7(this) { // from class: X.19e5
                public final SideSheetBehavior<? extends View> LIZ;

                @Override // X.AbstractC21587719e7
                public final boolean LJIIIIZZ(float f) {
                    return f > 0.0f;
                }

                @Override // X.AbstractC21587719e7
                public final int LIZJ() {
                    SideSheetBehavior<? extends View> sideSheetBehavior = this.LIZ;
                    return Math.max(0, sideSheetBehavior.LJIIJJI + sideSheetBehavior.LJIIL);
                }

                @Override // X.AbstractC21587719e7
                public final int LIZLLL() {
                    SideSheetBehavior<? extends View> sideSheetBehavior = this.LIZ;
                    return (-sideSheetBehavior.LJIIIZ) - sideSheetBehavior.LJIIL;
                }

                @Override // X.AbstractC21587719e7
                public final int LJ() {
                    return this.LIZ.LJIIL;
                }

                @Override // X.AbstractC21587719e7
                public final int LJFF() {
                    return -this.LIZ.LJIIIZ;
                }

                {
                    this.LIZ = this;
                }

                @Override // X.AbstractC21587719e7
                public final int LIZ(ViewGroup.MarginLayoutParams marginLayoutParams) {
                    return marginLayoutParams.leftMargin;
                }

                @Override // X.AbstractC21587719e7
                public final float LIZIZ(int i) {
                    return (i - LIZLLL()) / (LIZJ() - LIZLLL());
                }

                @Override // X.AbstractC21587719e7
                public final <V extends View> int LJI(V v) {
                    return v.getRight() + this.LIZ.LJIIL;
                }

                @Override // X.AbstractC21587719e7
                public final int LJII(C16G0 c16g0) {
                    return c16g0.getLeft();
                }

                @Override // X.AbstractC21587719e7
                public final boolean LJIIIZ(View view) {
                    if (view.getRight() < (LIZJ() - LIZLLL()) / 2) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21587719e7
                public final boolean LJIIJ(float f, float f2) {
                    if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21587719e7
                public final boolean LJIIJJI(View view, float f) {
                    if (Math.abs(view.getLeft() + (f * this.LIZ.LIZIZ)) > 0.5f) {
                        return true;
                    }
                    return false;
                }
            };
        } else {
            abstractC21587719e7 = new AbstractC21587719e7(this) { // from class: X.19e6
                public final SideSheetBehavior<? extends View> LIZ;

                @Override // X.AbstractC21587719e7
                public final boolean LJIIIIZZ(float f) {
                    return f < 0.0f;
                }

                @Override // X.AbstractC21587719e7
                public final int LIZJ() {
                    SideSheetBehavior<? extends View> sideSheetBehavior = this.LIZ;
                    int i = (sideSheetBehavior.LJIIJ - sideSheetBehavior.LJIIIZ) - sideSheetBehavior.LJIIL;
                    if (i < 0) {
                        return 0;
                    }
                    return i;
                }

                @Override // X.AbstractC21587719e7
                public final int LIZLLL() {
                    return this.LIZ.LJIIJ;
                }

                @Override // X.AbstractC21587719e7
                public final int LJ() {
                    return this.LIZ.LJIIJ;
                }

                @Override // X.AbstractC21587719e7
                public final int LJFF() {
                    return LIZJ();
                }

                {
                    this.LIZ = this;
                }

                @Override // X.AbstractC21587719e7
                public final int LIZ(ViewGroup.MarginLayoutParams marginLayoutParams) {
                    return marginLayoutParams.rightMargin;
                }

                @Override // X.AbstractC21587719e7
                public final float LIZIZ(int i) {
                    return (this.LIZ.LJIIJ - i) / (this.LIZ.LJIIJ - LIZJ());
                }

                @Override // X.AbstractC21587719e7
                public final <V extends View> int LJI(V v) {
                    return v.getLeft() - this.LIZ.LJIIL;
                }

                @Override // X.AbstractC21587719e7
                public final int LJII(C16G0 c16g0) {
                    return c16g0.getRight();
                }

                @Override // X.AbstractC21587719e7
                public final boolean LJIIIZ(View view) {
                    if (view.getLeft() > (this.LIZ.LJIIJ + LIZJ()) / 2) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21587719e7
                public final boolean LJIIJ(float f, float f2) {
                    if (Math.abs(f) > Math.abs(f2) && Math.abs(f) > 500.0f) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC21587719e7
                public final boolean LJIIJJI(View view, float f) {
                    if (Math.abs(view.getRight() + (f * this.LIZ.LIZIZ)) > 0.5f) {
                        return true;
                    }
                    return false;
                }
            };
        }
        this.LJIILJJIL = abstractC21587719e7;
        this.LJIILL = new AbstractC21586119dr(this) { // from class: X.19e4
            public final /* synthetic */ SideSheetBehavior<V> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewHorizontalDragRange(View view) {
                SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
                return sideSheetBehavior.LJIIIZ + sideSheetBehavior.LJIIL;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
                    if (sideSheetBehavior.LIZ) {
                        sideSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                Object obj;
                SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
                if (sideSheetBehavior.LIZJ == 1 || (reference = sideSheetBehavior.LIZLLL) == null || (obj = reference.get()) == null || !Intrinsics.LJFF(obj, view)) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                return C419990GdR.LIZIZ(i, this.LIZ.LJIILJJIL.LJFF(), this.LIZ.LJIILJJIL.LJ());
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i, int i2) {
                return view.getTop();
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC21586119dr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewReleased(android.view.View r6, float r7, float r8) {
                /*
                    r5 = this;
                    com.bytedance.tux.sheet.sidesheet.SideSheetBehavior<V> r4 = r5.LIZ
                    X.19e7 r0 = r4.LJIILJJIL
                    boolean r0 = r0.LJIIIIZZ(r7)
                    r3 = 1
                    if (r0 != 0) goto L59
                    X.19e7 r0 = r4.LJIILJJIL
                    boolean r0 = r0.LJIIJJI(r6, r7)
                    if (r0 == 0) goto L2a
                    X.19e7 r0 = r4.LJIILJJIL
                    boolean r0 = r0.LJIIJ(r7, r8)
                    if (r0 != 0) goto L23
                    X.19e7 r0 = r4.LJIILJJIL
                    boolean r0 = r0.LJIIIZ(r6)
                    if (r0 == 0) goto L59
                L23:
                    r1 = 5
                L24:
                    com.bytedance.tux.sheet.sidesheet.SideSheetBehavior<V> r0 = r5.LIZ
                    r0.LIZ(r1, r6, r3)
                    return
                L2a:
                    r0 = 0
                    int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                    if (r0 == 0) goto L3c
                    float r1 = java.lang.Math.abs(r7)
                    float r0 = java.lang.Math.abs(r8)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L3c
                    goto L23
                L3c:
                    int r2 = r6.getLeft()
                    X.19e7 r0 = r4.LJIILJJIL
                    int r0 = r0.LIZJ()
                    int r0 = r2 - r0
                    int r1 = java.lang.Math.abs(r0)
                    X.19e7 r0 = r4.LJIILJJIL
                    int r0 = r0.LIZLLL()
                    int r2 = r2 - r0
                    int r0 = java.lang.Math.abs(r2)
                    if (r1 >= r0) goto L23
                L59:
                    r1 = 3
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21587419e4.onViewReleased(android.view.View, float, float):void");
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                SideSheetBehavior<V> sideSheetBehavior = this.LIZ;
                if (!sideSheetBehavior.LJ.isEmpty()) {
                    sideSheetBehavior.LJIILJJIL.LIZIZ(i);
                    Iterator<AbstractC1391030mIn> it2 = sideSheetBehavior.LJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                }
            }
        };
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        super.onAttachedToLayoutParams(c16g1);
        this.LIZLLL = null;
        this.LJFF = null;
    }

    public final void setStateInternal(int i) {
        V v;
        int i2;
        if (this.LIZJ == i) {
            return;
        }
        this.LIZJ = i;
        WeakReference<V> weakReference = this.LIZLLL;
        if (weakReference != null && (v = weakReference.get()) != null) {
            if (this.LIZJ == 5) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (v.getVisibility() != i2) {
                C786410Ut5.LJLLLLLL(i2, v);
            }
            Iterator<AbstractC1391030mIn> it2 = this.LJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(i);
            }
        }
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(c16g0, v);
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        return new SavedState(parcelableOnSaveInstanceState, (SideSheetBehavior<?>) this);
    }

    public final void LIZ(int i, View view, boolean z) {
        int iLIZJ;
        boolean zLJIJJLI;
        if (i != 3) {
            if (i == 5) {
                iLIZJ = this.LJIILJJIL.LIZLLL();
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Invalid state to get outer edge offset: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            iLIZJ = this.LJIILJJIL.LIZJ();
        }
        C21586019dq c21586019dq = this.LJFF;
        if (c21586019dq != null) {
            if (z) {
                zLJIJJLI = c21586019dq.LJIJI(iLIZJ, view.getTop());
            } else {
                zLJIJJLI = c21586019dq.LJIJJLI(iLIZJ, view.getTop(), view);
            }
            if (zLJIJJLI) {
                setStateInternal(2);
                this.LJI.LIZ(i);
                return;
            }
        }
        setStateInternal(i);
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        C21586019dq c21586019dq;
        if ((v.isShown() || q0.LJII(v) != null) && this.LIZ) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                VelocityTracker velocityTracker = this.LJII;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                this.LJII = null;
            }
            if (this.LJII == null) {
                this.LJII = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = this.LJII;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.LJIIIIZZ) {
                    this.LJIIIIZZ = false;
                    return false;
                }
            } else {
                this.LJIILIIL = (int) motionEvent.getX();
            }
            if (!this.LJIIIIZZ && (c21586019dq = this.LJFF) != null && c21586019dq.LJIJJ(motionEvent)) {
                return true;
            }
            return false;
        }
        this.LJIIIIZZ = true;
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        int i2;
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        int iLJI = 0;
        if (this.LIZLLL == null) {
            this.LIZLLL = new WeakReference<>(v);
            if (this.LIZJ == 5) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (v.getVisibility() != i2) {
                C786410Ut5.LJLLLLLL(i2, v);
            }
        }
        if (this.LJFF == null) {
            this.LJFF = C21586019dq.LJIIIZ(c16g0, this.LJIILL);
        }
        int iLJI2 = this.LJIILJJIL.LJI(v);
        c16g0.LJIIL(i, v);
        this.LJIIJ = c16g0.getWidth();
        this.LJIIJJI = this.LJIILJJIL.LJII(c16g0);
        this.LJIIIZ = v.getWidth();
        this.LJIIL = this.LJIILJJIL.LIZ((ViewGroup.MarginLayoutParams) v.getLayoutParams());
        int i3 = this.LIZJ;
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                if (i3 == 5) {
                    iLJI = this.LJIILJJIL.LIZLLL();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected value: ");
                    sbLIZ.append(this.LIZJ);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } else {
            iLJI = iLJI2 - this.LJIILJJIL.LJI(v);
        }
        v.offsetLeftAndRight(iLJI);
        Iterator<AbstractC1391030mIn> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        Parcelable parcelable2 = savedState.mSuperState;
        if (parcelable2 != null) {
            super.onRestoreInstanceState(c16g0, v, parcelable2);
        }
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.LIZJ = i;
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.LIZJ;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C21586019dq c21586019dq = this.LJFF;
        if (c21586019dq != null && (this.LIZ || i == 1)) {
            c21586019dq.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            VelocityTracker velocityTracker = this.LJII;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LJII = null;
        }
        if (this.LJII == null) {
            this.LJII = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.LJII;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        C21586019dq c21586019dq2 = this.LJFF;
        if (c21586019dq2 != null && ((this.LIZ || this.LIZJ == 1) && actionMasked == 2 && !this.LJIIIIZZ && c21586019dq2 != null && ((this.LIZ || this.LIZJ == 1) && Math.abs(this.LJIILIIL - motionEvent.getX()) > this.LJFF.LIZIZ))) {
            this.LJFF.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
        }
        return !this.LJIIIIZZ;
    }

    @Override // X.C16BC
    public final boolean onMeasureChild(C16G0 c16g0, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(ViewGroup.getChildMeasureSpec(i, c16g0.getPaddingLeft() + c16g0.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, c16g0.getPaddingTop() + c16g0.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return true;
    }
}
