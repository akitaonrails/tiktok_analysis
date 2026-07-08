package com.bytedance.tux.behavior;

import X.AbstractC1390110mHJ;
import X.AbstractC21586119dr;
import X.C0TVI;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C20092413jW;
import X.C20097313kJ;
import X.C21584719dd;
import X.C21585119dh;
import X.C21585219di;
import X.C21586019dq;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC20092813ja;
import X.InterfaceC21584519db;
import X.RunnableC21584819de;
import Y.ARunnableS37S0201000_33;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.behavior.TopSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public final class TopSheetBehavior<V extends View> extends C16BC<V> {
    public static final /* synthetic */ int LJJIIJZLJL = 0;
    public boolean LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public final int LJ;
    public int LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public final boolean LJIILIIL;
    public int LJIILJJIL;
    public C21586019dq LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public WeakReference<V> LJIJJ;
    public WeakReference<View> LJIJJLI;
    public final ArrayList<AbstractC1390110mHJ> LJIL;
    public VelocityTracker LJJ;
    public int LJJI;
    public int LJJIFFI;
    public boolean LJJII;
    public Map<View, Integer> LJJIII;
    public final C21584719dd LJJIIJ;

    public final int calculatePeekHeight() {
        if (this.LIZJ) {
            return Math.min(Math.max(this.LIZLLL, this.LJIJI - ((this.LJIJ * 9) / 16)), this.LJIIZILJ);
        }
        int i = this.LJFF;
        return i > 0 ? Math.max(this.LIZIZ, i + this.LJ) : this.LIZIZ;
    }

    public final int getExpandedOffset() {
        return this.LIZ ? this.LJIIIIZZ : this.LJII;
    }

    public final void updateAccessibilityActions() {
        V v;
        final int i;
        WeakReference<V> weakReference = this.LJIJJ;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        q0.LJIILJJIL(524288, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(262144, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(1048576, v);
        q0.LJIIJJI(0, v);
        if (this.LJIIL) {
            final int i2 = 5;
            if (this.LJIILJJIL != 5) {
                q0.LJIILL(v, C20092413jW.LJIL, null, new InterfaceC20092813ja(this) { // from class: X.19df
                    public final /* synthetic */ TopSheetBehavior<View> LIZ;

                    {
                        this.LIZ = this;
                    }

                    @Override // X.InterfaceC20092813ja
                    public final boolean LIZ(View view) {
                        TopSheetBehavior<View> topSheetBehavior = this.LIZ;
                        int i3 = i2;
                        if (i3 != topSheetBehavior.LJIILJJIL) {
                            if (topSheetBehavior.LJIJJ == null) {
                                if (i3 == 4 || i3 == 3 || i3 == 6 || (topSheetBehavior.LJIIL && i3 == 5)) {
                                    topSheetBehavior.LJIILJJIL = i3;
                                    return true;
                                }
                                return true;
                            }
                            topSheetBehavior.settleToStatePendingLayout(i3);
                            return true;
                        }
                        return true;
                    }
                });
            }
        }
        int i3 = this.LJIILJJIL;
        final int i4 = 4;
        final int i5 = 3;
        if (i3 == 3) {
            i = this.LIZ ? 4 : 6;
            q0.LJIILL(v, C20092413jW.LJIJJLI, null, new InterfaceC20092813ja(this) { // from class: X.19df
                public final /* synthetic */ TopSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    TopSheetBehavior<View> topSheetBehavior = this.LIZ;
                    int i32 = i;
                    if (i32 != topSheetBehavior.LJIILJJIL) {
                        if (topSheetBehavior.LJIJJ == null) {
                            if (i32 == 4 || i32 == 3 || i32 == 6 || (topSheetBehavior.LJIIL && i32 == 5)) {
                                topSheetBehavior.LJIILJJIL = i32;
                                return true;
                            }
                            return true;
                        }
                        topSheetBehavior.settleToStatePendingLayout(i32);
                        return true;
                    }
                    return true;
                }
            });
        } else if (i3 == 4) {
            i = this.LIZ ? 3 : 6;
            q0.LJIILL(v, C20092413jW.LJIJJ, null, new InterfaceC20092813ja(this) { // from class: X.19df
                public final /* synthetic */ TopSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    TopSheetBehavior<View> topSheetBehavior = this.LIZ;
                    int i32 = i;
                    if (i32 != topSheetBehavior.LJIILJJIL) {
                        if (topSheetBehavior.LJIJJ == null) {
                            if (i32 == 4 || i32 == 3 || i32 == 6 || (topSheetBehavior.LJIIL && i32 == 5)) {
                                topSheetBehavior.LJIILJJIL = i32;
                                return true;
                            }
                            return true;
                        }
                        topSheetBehavior.settleToStatePendingLayout(i32);
                        return true;
                    }
                    return true;
                }
            });
        } else if (i3 == 6) {
            q0.LJIILL(v, C20092413jW.LJIJJLI, null, new InterfaceC20092813ja(this) { // from class: X.19df
                public final /* synthetic */ TopSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    TopSheetBehavior<View> topSheetBehavior = this.LIZ;
                    int i32 = i4;
                    if (i32 != topSheetBehavior.LJIILJJIL) {
                        if (topSheetBehavior.LJIJJ == null) {
                            if (i32 == 4 || i32 == 3 || i32 == 6 || (topSheetBehavior.LJIIL && i32 == 5)) {
                                topSheetBehavior.LJIILJJIL = i32;
                                return true;
                            }
                            return true;
                        }
                        topSheetBehavior.settleToStatePendingLayout(i32);
                        return true;
                    }
                    return true;
                }
            });
            q0.LJIILL(v, C20092413jW.LJIJJ, null, new InterfaceC20092813ja(this) { // from class: X.19df
                public final /* synthetic */ TopSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    TopSheetBehavior<View> topSheetBehavior = this.LIZ;
                    int i32 = i5;
                    if (i32 != topSheetBehavior.LJIILJJIL) {
                        if (topSheetBehavior.LJIJJ == null) {
                            if (i32 == 4 || i32 == 3 || i32 == 6 || (topSheetBehavior.LJIIL && i32 == 5)) {
                                topSheetBehavior.LJIILJJIL = i32;
                                return true;
                            }
                            return true;
                        }
                        topSheetBehavior.settleToStatePendingLayout(i32);
                        return true;
                    }
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.19dd] */
    public TopSheetBehavior() {
        this.LIZ = true;
        this.LJIIJ = 0.5f;
        this.LJIILIIL = true;
        this.LJIILJJIL = 4;
        this.LJIL = new ArrayList<>();
        this.LJJIIJ = new AbstractC21586119dr(this) { // from class: X.19dd
            public final /* synthetic */ TopSheetBehavior<V> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                if (topSheetBehavior.LJIIL) {
                    return topSheetBehavior.LJIJI;
                }
                return topSheetBehavior.LJIIJJI;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                    if (topSheetBehavior.LJIILIIL) {
                        topSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                int i2 = topSheetBehavior.LJIILJJIL;
                if (i2 == 1 || topSheetBehavior.LJJII) {
                    return false;
                }
                if ((i2 == 3 && topSheetBehavior.LJJI == i && (weakReference = topSheetBehavior.LJIJJLI) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIJJ) == null || reference.get() != view) {
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
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                if (topSheetBehavior.LJIIL) {
                    i3 = topSheetBehavior.LJIJI;
                } else {
                    i3 = topSheetBehavior.LJIIJJI;
                }
                return C419990GdR.LIZIZ(i, -i3, -topSheetBehavior.getExpandedOffset());
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
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
            public final void onViewReleased(android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instruction units count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21584719dd.onViewReleased(android.view.View, float, float):void");
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                float f;
                float expandedOffset;
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                Reference reference = topSheetBehavior.LJIJJ;
                if (reference != null && reference.get() != null && (!topSheetBehavior.LJIL.isEmpty())) {
                    int i5 = topSheetBehavior.LJIIJJI;
                    if (i2 <= i5 && i5 != topSheetBehavior.getExpandedOffset()) {
                        int i6 = topSheetBehavior.LJIIJJI;
                        f = i6 - i2;
                        expandedOffset = i6 - topSheetBehavior.getExpandedOffset();
                    } else {
                        int i7 = topSheetBehavior.LJIIJJI;
                        f = i7 - i2;
                        expandedOffset = topSheetBehavior.LJIJI - i7;
                    }
                    float f2 = f / expandedOffset;
                    int size = topSheetBehavior.LJIL.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ((AbstractC1390110mHJ) ListProtector.get(topSheetBehavior.LJIL, i8)).LIZ(f2);
                    }
                }
            }
        };
    }

    public final void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        this.LJIIJJI = this.LIZ ? Math.max(this.LJIJI - iCalculatePeekHeight, this.LJIIIIZZ) : this.LJIJI - iCalculatePeekHeight;
    }

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJIJJ = null;
        this.LJIILL = null;
    }

    public final View findScrollingChild(View view) {
        if (view == null) {
            return null;
        }
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
        }
        return null;
    }

    @Override // X.C16BC
    public final void onAttachedToLayoutParams(C16G1 c16g1) {
        super.onAttachedToLayoutParams(c16g1);
        this.LJIJJ = null;
        this.LJIILL = null;
    }

    public final void setPeekHeight(int i) {
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
        }
        updatePeekHeight(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033 A[LOOP:0: B:25:0x0031->B:26:0x0033, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStateInternal(int r5) {
        /*
            r4 = this;
            int r0 = r4.LJIILJJIL
            if (r0 != r5) goto L5
            return
        L5:
            r4.LJIILJJIL = r5
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.LJIJJ
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L4d
            r3 = 0
            r2 = 3
            r1 = 1
            if (r5 == r2) goto L46
            r0 = 4
            if (r5 == r0) goto L41
            r0 = 5
            if (r5 == r0) goto L41
            r0 = 6
            if (r5 == r0) goto L41
            r0 = 2
            if (r5 == r0) goto L2b
            if (r5 != r2) goto L44
        L25:
            boolean r0 = r4.LJI
            if (r0 == r1) goto L2b
            r4.LJI = r1
        L2b:
            java.util.ArrayList<X.0mHJ> r0 = r4.LJIL
            int r1 = r0.size()
        L31:
            if (r3 >= r1) goto L4a
            java.util.ArrayList<X.0mHJ> r0 = r4.LJIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0mHJ r0 = (X.AbstractC1390110mHJ) r0
            r0.LIZIZ(r5)
            int r3 = r3 + 1
            goto L31
        L41:
            r4.updateImportantForAccessibility(r3)
        L44:
            r1 = 0
            goto L25
        L46:
            r4.updateImportantForAccessibility(r1)
            goto L25
        L4a:
            r4.updateAccessibilityActions()
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.behavior.TopSheetBehavior.setStateInternal(int):void");
    }

    public final void settleToStatePendingLayout(int i) {
        V v;
        WeakReference<V> weakReference = this.LJIJJ;
        if (weakReference != null && (v = weakReference.get()) != null) {
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
                HandlerHook.viewPost(v, new ARunnableS37S0201000_33(this, i, v, 2));
            } else {
                settleToState(v, i);
            }
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        V v;
        ViewParent parent;
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.LJIJJ;
        if (weakReference == null || (v = weakReference.get()) == null || (parent = v.getParent()) == null || !(parent instanceof C16G0)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        if (z) {
            if (this.LJJIII == null) {
                this.LJJIII = new HashMap(childCount);
            } else {
                return;
            }
        }
        int i = 0;
        while (true) {
            V v2 = null;
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            WeakReference<V> weakReference2 = this.LJIJJ;
            if (weakReference2 != null) {
                v2 = weakReference2.get();
            }
            if (childAt != v2 && z && (map = this.LJJIII) != null) {
                map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
            i++;
        }
        if (!z) {
            this.LJJIII = null;
        }
    }

    public final void updatePeekHeight(boolean z) {
        V v;
        WeakReference<V> weakReference = this.LJIJJ;
        if (weakReference != null) {
            calculateCollapsedOffset();
            if (this.LJIILJJIL == 4 && (v = weakReference.get()) != null) {
                v.requestLayout();
            }
        }
    }

    public static final class SavedState extends AbsSavedState {
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;
        public static final C21585219di Companion = new Object() { // from class: X.19di
        };
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19dg
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new TopSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TopSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final TopSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new TopSheetBehavior.SavedState(parcel, classLoader);
            }
        };

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            boolean z2;
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.fitToContents = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.hideable = z2;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, TopSheetBehavior<?> topSheetBehavior) {
            super(parcelable);
            this.state = topSheetBehavior.LJIILJJIL;
            this.peekHeight = topSheetBehavior.LIZIZ;
            this.fitToContents = topSheetBehavior.LIZ;
            this.hideable = topSheetBehavior.LJIIL;
            this.skipCollapsed = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19dd] */
    public TopSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.LIZ = true;
        this.LJIIJ = 0.5f;
        this.LJIILIIL = true;
        this.LJIILJJIL = 4;
        this.LJIL = new ArrayList<>();
        this.LJJIIJ = new AbstractC21586119dr(this) { // from class: X.19dd
            public final /* synthetic */ TopSheetBehavior<V> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                if (topSheetBehavior.LJIIL) {
                    return topSheetBehavior.LJIJI;
                }
                return topSheetBehavior.LJIIJJI;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                    if (topSheetBehavior.LJIILIIL) {
                        topSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i2) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                int i22 = topSheetBehavior.LJIILJJIL;
                if (i22 == 1 || topSheetBehavior.LJJII) {
                    return false;
                }
                if ((i22 == 3 && topSheetBehavior.LJJI == i2 && (weakReference = topSheetBehavior.LJIJJLI) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJIJJ) == null || reference.get() != view) {
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
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                if (topSheetBehavior.LJIIL) {
                    i3 = topSheetBehavior.LJIJI;
                } else {
                    i3 = topSheetBehavior.LJIIJJI;
                }
                return C419990GdR.LIZIZ(i2, -i3, -topSheetBehavior.getExpandedOffset());
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
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
            public final void onViewReleased(android.view.View r8, float r9, float r10) {
                /*
                    Method dump skipped, instruction units count: 333
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21584719dd.onViewReleased(android.view.View, float, float):void");
            }

            @Override // X.AbstractC21586119dr
            public final void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                float f;
                float expandedOffset;
                TopSheetBehavior<V> topSheetBehavior = this.LIZ;
                Reference reference = topSheetBehavior.LJIJJ;
                if (reference != null && reference.get() != null && (!topSheetBehavior.LJIL.isEmpty())) {
                    int i5 = topSheetBehavior.LJIIJJI;
                    if (i22 <= i5 && i5 != topSheetBehavior.getExpandedOffset()) {
                        int i6 = topSheetBehavior.LJIIJJI;
                        f = i6 - i22;
                        expandedOffset = i6 - topSheetBehavior.getExpandedOffset();
                    } else {
                        int i7 = topSheetBehavior.LJIIJJI;
                        f = i7 - i22;
                        expandedOffset = topSheetBehavior.LJIJI - i7;
                    }
                    float f2 = f / expandedOffset;
                    int size = topSheetBehavior.LJIL.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ((AbstractC1390110mHJ) ListProtector.get(topSheetBehavior.LJIL, i8)).LIZ(f2);
                    }
                }
            }
        };
        this.LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        C418440Gaw.LIZIZ(16);
        setPeekHeight(-1);
        this.LJIIL = true;
        if (!this.LIZ) {
            this.LIZ = true;
            if (this.LJIJJ != null) {
                calculateCollapsedOffset();
            }
            if (this.LIZ && this.LJIILJJIL == 6) {
                i = 3;
            } else {
                i = this.LJIILJJIL;
            }
            setStateInternal(i);
            updateAccessibilityActions();
        }
        this.LJIILIIL = true;
        this.LJIIJ = 0.5f;
        if (this.LJIJJ != null) {
            this.LJIIIZ = (int) (this.LJIJI * (1 - 0.5f));
        }
        this.LJII = 0;
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(c16g0, v);
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        return new SavedState(parcelableOnSaveInstanceState, (TopSheetBehavior<?>) this);
    }

    public final void settleToState(View view, int i) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.LJIIJJI;
        } else if (i == 6) {
            expandedOffset = this.LJIIIZ;
            if (this.LIZ && expandedOffset <= (i2 = this.LJIIIIZZ)) {
                this.LJIILJJIL = 3;
                expandedOffset = i2;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else if (this.LJIIL && i == 5) {
            expandedOffset = this.LJIJI;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        startSettlingAnimation(view, i, expandedOffset, false);
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        if (v.isShown() && this.LJIILIIL) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.LJJI = -1;
                VelocityTracker velocityTracker = this.LJJ;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                this.LJJ = null;
            }
            if (this.LJJ == null) {
                this.LJJ = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = this.LJJ;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.LJJII = false;
                    this.LJJI = -1;
                    if (this.LJIILLIIL) {
                        this.LJIILLIIL = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.LJJIFFI = (int) motionEvent.getY();
                if (this.LJIILJJIL != 2 && (weakReference = this.LJIJJLI) != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.LJJIFFI, view)) {
                    this.LJJI = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.LJJII = true;
                }
                if (this.LJJI == -1 && !c16g0.LJIIJ(x, this.LJJIFFI, v)) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJIILLIIL = z;
            }
            C21586019dq c21586019dq = this.LJIILL;
            if (!this.LJIILLIIL && c21586019dq != null && c21586019dq.LJIJJ(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.LJIJJLI;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.LJIILLIIL || this.LJIILJJIL == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || c21586019dq == null || Math.abs(this.LJJIFFI - motionEvent.getY()) <= c21586019dq.LIZIZ) {
                return false;
            }
            return true;
        }
        this.LJIILLIIL = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.19dV] */
    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.LJIJJ == null) {
            this.LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            if (Build.VERSION.SDK_INT >= 29 && !this.LIZJ) {
                final ?? r6 = new InterfaceC21584519db(this) { // from class: X.19dV
                    public final /* synthetic */ TopSheetBehavior<View> LIZ;

                    {
                        this.LIZ = this;
                    }

                    @Override // X.InterfaceC21584519db
                    public final C20246014Ju LIZ(C20246014Ju c20246014Ju) {
                        this.LIZ.LJFF = c20246014Ju.LIZ.LJIIIIZZ().LIZLLL;
                        this.LIZ.updatePeekHeight(false);
                        return c20246014Ju;
                    }
                };
                final C21585119dh c21585119dh = new C21585119dh(v.getPaddingStart(), v.getPaddingTop(), v.getPaddingEnd(), v.getPaddingBottom());
                C14K9.LJIJJ(v, new C0TVI() { // from class: X.19dc
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                        InterfaceC21584519db interfaceC21584519db = r6;
                        new C21585119dh(c21585119dh);
                        interfaceC21584519db.LIZ(c20246014Ju);
                        return c20246014Ju;
                    }
                });
                if (v.isAttachedToWindow()) {
                    C20097313kJ.LIZJ(v);
                } else {
                    v.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.19XZ
                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewDetachedFromWindow(View view) {
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public final void onViewAttachedToWindow(View view) {
                            view.removeOnAttachStateChangeListener(this);
                            C20097313kJ.LIZJ(view);
                        }
                    });
                }
            }
            this.LJIJJ = new WeakReference<>(v);
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.LJIILL == null) {
            this.LJIILL = C21586019dq.LJIIIZ(c16g0, this.LJJIIJ);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.LJIJ = c16g0.getWidth();
        this.LJIJI = c16g0.getHeight();
        int height = v.getHeight();
        this.LJIIZILJ = height;
        this.LJIIIIZZ = Math.max(0, this.LJIJI - height);
        this.LJIIIZ = (int) (this.LJIJI * (1 - this.LJIIJ));
        calculateCollapsedOffset();
        int i2 = this.LJIILJJIL;
        if (i2 == 3) {
            v.offsetTopAndBottom(-getExpandedOffset());
        } else if (i2 == 6) {
            v.offsetTopAndBottom(-this.LJIIIZ);
        } else if (this.LJIIL && i2 == 5) {
            v.offsetTopAndBottom(-this.LJIJI);
        } else if (i2 == 4) {
            v.offsetTopAndBottom(-this.LJIIJJI);
        } else if (i2 == 1 || i2 == 2) {
            v.offsetTopAndBottom(-(top - v.getTop()));
        }
        this.LJIJJLI = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C16BC
    public final void onRestoreInstanceState(C16G0 c16g0, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        Parcelable parcelable2 = savedState.mSuperState;
        if (parcelable2 == null) {
            return;
        }
        super.onRestoreInstanceState(c16g0, v, parcelable2);
        int i = savedState.state;
        if (i != 1 && i != 2) {
            this.LJIILJJIL = i;
        } else {
            this.LJIILJJIL = 4;
        }
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIILJJIL == 1 && actionMasked == 0) {
            return true;
        }
        C21586019dq c21586019dq = this.LJIILL;
        if (c21586019dq != null) {
            c21586019dq.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            this.LJJI = -1;
            VelocityTracker velocityTracker = this.LJJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LJJ = null;
        }
        if (this.LJJ == null) {
            this.LJJ = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.LJJ;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (c21586019dq != null && actionMasked == 2 && !this.LJIILLIIL && Math.abs(this.LJJIFFI - motionEvent.getY()) > c21586019dq.LIZIZ) {
            c21586019dq.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
        }
        return !this.LJIILLIIL;
    }

    public final void startSettlingAnimation(View view, int i, int i2, boolean z) {
        boolean zLJIJJLI;
        C21586019dq c21586019dq = this.LJIILL;
        boolean z2 = false;
        if (c21586019dq != null) {
            if (z) {
                zLJIJJLI = c21586019dq.LJIJI(view.getLeft(), i2);
            } else {
                zLJIJJLI = c21586019dq.LJIJJLI(view.getLeft(), i2, view);
            }
            if (zLJIJJLI) {
                setStateInternal(2);
                if (i != 2) {
                    if (i == 3) {
                        z2 = true;
                    }
                    if (this.LJI != z2) {
                        this.LJI = z2;
                    }
                }
                RunnableC21584819de runnableC21584819de = new RunnableC21584819de(this, view, i);
                if (!runnableC21584819de.LLILLL) {
                    runnableC21584819de.LLILLJJLI = i;
                    view.postOnAnimation(runnableC21584819de);
                    runnableC21584819de.LLILLL = true;
                    return;
                }
                return;
            }
        }
        setStateInternal(i);
    }
}
