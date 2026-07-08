package com.bytedance.tux.sheet.sheet;

import X.AbstractC1391240mJ8;
import X.AbstractC21586119dr;
import X.C0TVI;
import X.C13BV;
import X.C13LP;
import X.C14K9;
import X.C15438062q;
import X.C16B3;
import X.C16B4;
import X.C16B9;
import X.C16BA;
import X.C16BB;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C20092413jW;
import X.C20097313kJ;
import X.C21586019dq;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC20092813ja;
import Y.ARunnableS35S0201000_31;
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
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: loaded from: classes32.dex */
public class TuxSheetBehavior<V extends View> extends C16BC<V> {
    public WeakReference<View> LIZ;
    public boolean LIZIZ;
    public List<Integer> LIZJ;
    public List<Integer> LIZLLL;
    public boolean LJ;
    public final float LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public final int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public float LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public C21586019dq LJIJJLI;
    public boolean LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public WeakReference<V> LJJII;
    public WeakReference<View> LJJIII;
    public final ArrayList<AbstractC1391240mJ8> LJJIIJ;
    public VelocityTracker LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public Map<View, Integer> LJJIJIIJI;
    public int LJJIJIIJIL;
    public boolean LJJIJIL;
    public final C16B3 LJJIJL;

    @Override // X.C16BC
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public final void LIZ() {
        int i;
        if (this.LIZJ.isEmpty()) {
            this.LIZLLL = C13BV.INSTANCE;
            return;
        }
        List<Integer> list = this.LIZJ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<Integer> it2 = list.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            int iIntValue = this.LJJIFFI - it2.next().intValue();
            if (iIntValue > 0) {
                i = iIntValue;
            }
            arrayList.add(Integer.valueOf(i));
        }
        List<Integer> listLJLLJ = C13LP.LJLLJ(arrayList);
        if (!listLJLLJ.isEmpty()) {
            int iIntValue2 = ((Number) C13LP.LJJJJZI(listLJLLJ)).intValue();
            if (iIntValue2 < 0) {
                "offset must be greater than or equal to 0".toString();
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.LJIIL = iIntValue2;
            this.LJIILLIIL = ((Number) C13LP.LJJLIIIJJI(listLJLLJ)).intValue();
            if (this.LJIJJ == 6 && (!this.LIZLLL.isEmpty())) {
                int size = this.LIZLLL.size();
                int i2 = Integer.MAX_VALUE;
                int i3 = 0;
                while (i < size) {
                    int iAbs = Math.abs(((Number) ListProtector.get(this.LIZLLL, i)).intValue() - this.LJIILJJIL);
                    if (iAbs < i2) {
                        i3 = i;
                        i2 = iAbs;
                    }
                    i++;
                }
                this.LJIILJJIL = i3 < listLJLLJ.size() ? ((Number) ListProtector.get(listLJLLJ, i3)).intValue() : ((Number) ListProtector.get(listLJLLJ, listLJLLJ.size() / 2)).intValue();
            } else if (listLJLLJ.size() > 2 && this.LJIJJ != 6) {
                this.LJIILJJIL = ((Number) ListProtector.get(listLJLLJ, listLJLLJ.size() / 2)).intValue();
            }
        }
        this.LIZLLL = listLJLLJ;
    }

    public final int calculatePeekHeight() {
        if (this.LJII) {
            return Math.min(Math.max(this.LJIIIIZZ, this.LJJIFFI - ((this.LJJI * 9) / 16)), this.LJJ);
        }
        int i = this.LJIIJ;
        return i > 0 ? Math.max(this.LJI, i + this.LJIIIZ) : this.LJI;
    }

    public final int getExpandedOffset() {
        return this.LJ ? this.LJIILIIL : this.LJIIL;
    }

    public final int getPeekHeight() {
        if (this.LJII) {
            return -1;
        }
        return this.LJI;
    }

    public final void updateAccessibilityActions() {
        V v;
        final int i;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        q0.LJIILJJIL(524288, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(262144, v);
        q0.LJIIJJI(0, v);
        q0.LJIILJJIL(1048576, v);
        q0.LJIIJJI(0, v);
        if (this.LJIIZILJ) {
            final int i2 = 5;
            if (this.LJIJJ != 5) {
                q0.LJIILL(v, C20092413jW.LJIL, null, new InterfaceC20092813ja(this) { // from class: X.0mJb
                    public final /* synthetic */ TuxSheetBehavior<View> LIZ;

                    {
                        this.LIZ = this;
                    }

                    @Override // X.InterfaceC20092813ja
                    public final boolean LIZ(View view) {
                        this.LIZ.setState(i2);
                        return true;
                    }
                });
            }
        }
        int i3 = this.LJIJJ;
        final int i4 = 4;
        final int i5 = 3;
        if (i3 == 3) {
            i = this.LJ ? 4 : 6;
            q0.LJIILL(v, C20092413jW.LJIJJLI, null, new InterfaceC20092813ja(this) { // from class: X.0mJb
                public final /* synthetic */ TuxSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZ.setState(i);
                    return true;
                }
            });
        } else if (i3 == 4) {
            i = this.LJ ? 3 : 6;
            q0.LJIILL(v, C20092413jW.LJIJJ, null, new InterfaceC20092813ja(this) { // from class: X.0mJb
                public final /* synthetic */ TuxSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZ.setState(i);
                    return true;
                }
            });
        } else if (i3 == 6) {
            q0.LJIILL(v, C20092413jW.LJIJJLI, null, new InterfaceC20092813ja(this) { // from class: X.0mJb
                public final /* synthetic */ TuxSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZ.setState(i4);
                    return true;
                }
            });
            q0.LJIILL(v, C20092413jW.LJIJJ, null, new InterfaceC20092813ja(this) { // from class: X.0mJb
                public final /* synthetic */ TuxSheetBehavior<View> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.InterfaceC20092813ja
                public final boolean LIZ(View view) {
                    this.LIZ.setState(i5);
                    return true;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.16B3] */
    public TuxSheetBehavior() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZJ = c13bv;
        this.LIZLLL = c13bv;
        this.LJ = true;
        this.LJIILL = 0.5f;
        this.LJIJI = true;
        this.LJIJJ = 4;
        this.LJJIIJ = new ArrayList<>();
        this.LJJIJL = new AbstractC21586119dr(this) { // from class: X.16B3
            public final /* synthetic */ TuxSheetBehavior<V> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                if (tuxSheetBehavior.LJIIZILJ) {
                    return tuxSheetBehavior.LJJIFFI;
                }
                if (!tuxSheetBehavior.LIZLLL.isEmpty()) {
                    return ((Number) C13LP.LJJLIIIJJI(this.LIZ.LIZLLL)).intValue();
                }
                return this.LIZ.LJIILLIIL;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                    if (tuxSheetBehavior.LJIJI) {
                        tuxSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                int i2 = tuxSheetBehavior.LJIJJ;
                if (i2 == 1) {
                    return false;
                }
                if (tuxSheetBehavior.LIZIZ) {
                    return true;
                }
                if (tuxSheetBehavior.LJJIJ) {
                    return false;
                }
                if ((i2 == 3 && tuxSheetBehavior.LJJIIZ == i && (weakReference = tuxSheetBehavior.LJJIII) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJJII) == null || reference.get() != view) {
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
                int expandedOffset;
                int iIntValue;
                if (!this.LIZ.LIZLLL.isEmpty()) {
                    expandedOffset = ((Number) C13LP.LJJJJZI(this.LIZ.LIZLLL)).intValue();
                } else {
                    expandedOffset = this.LIZ.getExpandedOffset();
                }
                TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                if (tuxSheetBehavior.LJIIZILJ) {
                    iIntValue = tuxSheetBehavior.LJJIFFI;
                } else if (!tuxSheetBehavior.LIZLLL.isEmpty()) {
                    iIntValue = ((Number) C13LP.LJJLIIIJJI(this.LIZ.LIZLLL)).intValue();
                } else {
                    iIntValue = this.LIZ.LJIILLIIL;
                }
                return C419990GdR.LIZIZ(i, expandedOffset, iIntValue);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
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
                    Method dump skipped, instruction units count: 439
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16B3.onViewReleased(android.view.View, float, float):void");
            }

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
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
            }
        };
    }

    public final void calculateCollapsedOffset() {
        int iCalculatePeekHeight = calculatePeekHeight();
        this.LJIILLIIL = this.LJ ? Math.max(this.LJJIFFI - iCalculatePeekHeight, this.LJIILIIL) : this.LJJIFFI - iCalculatePeekHeight;
    }

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJII = null;
        this.LJIJJLI = null;
    }

    public final boolean LIZJ(MotionEvent motionEvent) {
        View view;
        WeakReference<View> weakReference = this.LIZ;
        if (weakReference == null || (view = weakReference.get()) == null || !view.isShown()) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (rawX < i || rawX > i + view.getWidth() || rawY < i2 || rawY > i2 + view.getHeight()) {
            return false;
        }
        return true;
    }

    public final void dispatchOnSlide(int i) {
        V v;
        float f;
        float expandedOffset;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference != null && (v = weakReference.get()) != null && (!this.LJJIIJ.isEmpty())) {
            int i2 = this.LJIILLIIL;
            if (i <= i2 && i2 != getExpandedOffset()) {
                int i3 = this.LJIILLIIL;
                f = i3 - i;
                expandedOffset = i3 - getExpandedOffset();
            } else {
                int i4 = this.LJIILLIIL;
                f = i4 - i;
                expandedOffset = this.LJJIFFI - i4;
            }
            float f2 = f / expandedOffset;
            int size = this.LJJIIJ.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((AbstractC1391240mJ8) ListProtector.get(this.LJJIIJ, i5)).LIZ(v, f2);
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
        this.LJJII = null;
        this.LJIJJLI = null;
    }

    public final void setFitToContents(boolean z) {
        int i;
        if (this.LJ == z) {
            return;
        }
        this.LJ = z;
        if (this.LJJII != null) {
            calculateCollapsedOffset();
        }
        if (this.LJ && this.LJIJJ == 6) {
            i = 3;
        } else {
            i = this.LJIJJ;
        }
        setStateInternal(i);
        updateAccessibilityActions();
    }

    public final void setHideable(boolean z) {
        if (this.LJIIZILJ != z) {
            this.LJIIZILJ = z;
            if (!z && this.LJIJJ == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public final void setState(int i) {
        if (this.LJIJJ == i) {
            return;
        }
        if (this.LJJII == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJIIZILJ && i == 5)) {
                this.LJIJJ = i;
                return;
            }
            return;
        }
        settleToStatePendingLayout(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034 A[LOOP:0: B:24:0x0032->B:25:0x0034, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStateInternal(int r6) {
        /*
            r5 = this;
            int r0 = r5.LJIJJ
            if (r0 != r6) goto L5
            return
        L5:
            r5.LJIJJ = r6
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.LJJII
            if (r0 == 0) goto L4e
            java.lang.Object r4 = r0.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L4e
            r3 = 0
            r2 = 3
            r1 = 1
            if (r6 == r2) goto L47
            r0 = 4
            if (r6 == r0) goto L42
            r0 = 5
            if (r6 == r0) goto L42
            r0 = 6
            if (r6 == r0) goto L42
            r0 = 2
            if (r6 == r0) goto L2c
            if (r6 != r2) goto L45
        L26:
            boolean r0 = r5.LJIIJJI
            if (r0 == r1) goto L2c
            r5.LJIIJJI = r1
        L2c:
            java.util.ArrayList<X.0mJ8> r0 = r5.LJJIIJ
            int r1 = r0.size()
        L32:
            if (r3 >= r1) goto L4b
            java.util.ArrayList<X.0mJ8> r0 = r5.LJJIIJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0mJ8 r0 = (X.AbstractC1391240mJ8) r0
            r0.LIZIZ(r6, r4)
            int r3 = r3 + 1
            goto L32
        L42:
            r5.updateImportantForAccessibility(r3)
        L45:
            r1 = 0
            goto L26
        L47:
            r5.updateImportantForAccessibility(r1)
            goto L26
        L4b:
            r5.updateAccessibilityActions()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.sheet.TuxSheetBehavior.setStateInternal(int):void");
    }

    public final void settleToStatePendingLayout(int i) {
        V v;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference != null && (v = weakReference.get()) != null) {
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
                HandlerHook.viewPost(v, new ARunnableS35S0201000_31(i, v, this, 3));
            } else {
                LIZLLL(i, v);
            }
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        V v;
        ViewParent parent;
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference == null || (v = weakReference.get()) == null || (parent = v.getParent()) == null || !(parent instanceof C16G0)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        if (z) {
            if (this.LJJIJIIJI == null) {
                this.LJJIJIIJI = new HashMap(childCount);
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
            WeakReference<V> weakReference2 = this.LJJII;
            if (weakReference2 != null) {
                v2 = weakReference2.get();
            }
            if (!Intrinsics.LJFF(childAt, v2) && z && (map = this.LJJIJIIJI) != null) {
                map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
            i++;
        }
        if (!z) {
            this.LJJIJIIJI = null;
        }
    }

    public final void updatePeekHeight(boolean z) {
        WeakReference<V> weakReference;
        V v;
        if (this.LJJII != null) {
            calculateCollapsedOffset();
            if (this.LJIJJ == 4 && (weakReference = this.LJJII) != null && (v = weakReference.get()) != null) {
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
        public static final C16BB Companion = new Object() { // from class: X.16BB
        };
        public static final Parcelable.ClassLoaderCreator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.16B6
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new TuxSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TuxSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final TuxSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new TuxSheetBehavior.SavedState(parcel, classLoader);
            }
        };

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            boolean z2;
            super(parcel, classLoader);
            this.fitToContents = true;
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

        public SavedState(Parcelable parcelable, TuxSheetBehavior<?> tuxSheetBehavior) {
            super(parcelable);
            this.fitToContents = true;
            this.state = tuxSheetBehavior.LJIJJ;
            this.peekHeight = tuxSheetBehavior.LJI;
            this.fitToContents = tuxSheetBehavior.LJ;
            this.hideable = tuxSheetBehavior.LJIIZILJ;
            this.skipCollapsed = tuxSheetBehavior.LJIJ;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.16B3] */
    public TuxSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZJ = c13bv;
        this.LIZLLL = c13bv;
        this.LJ = true;
        this.LJIILL = 0.5f;
        this.LJIJI = true;
        this.LJIJJ = 4;
        this.LJJIIJ = new ArrayList<>();
        this.LJJIJL = new AbstractC21586119dr(this) { // from class: X.16B3
            public final /* synthetic */ TuxSheetBehavior<V> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                if (tuxSheetBehavior.LJIIZILJ) {
                    return tuxSheetBehavior.LJJIFFI;
                }
                if (!tuxSheetBehavior.LIZLLL.isEmpty()) {
                    return ((Number) C13LP.LJJLIIIJJI(this.LIZ.LIZLLL)).intValue();
                }
                return this.LIZ.LJIILLIIL;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                    if (tuxSheetBehavior.LJIJI) {
                        tuxSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                int i2 = tuxSheetBehavior.LJIJJ;
                if (i2 == 1) {
                    return false;
                }
                if (tuxSheetBehavior.LIZIZ) {
                    return true;
                }
                if (tuxSheetBehavior.LJJIJ) {
                    return false;
                }
                if ((i2 == 3 && tuxSheetBehavior.LJJIIZ == i && (weakReference = tuxSheetBehavior.LJJIII) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJJII) == null || reference.get() != view) {
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
                int expandedOffset;
                int iIntValue;
                if (!this.LIZ.LIZLLL.isEmpty()) {
                    expandedOffset = ((Number) C13LP.LJJJJZI(this.LIZ.LIZLLL)).intValue();
                } else {
                    expandedOffset = this.LIZ.getExpandedOffset();
                }
                TuxSheetBehavior<V> tuxSheetBehavior = this.LIZ;
                if (tuxSheetBehavior.LJIIZILJ) {
                    iIntValue = tuxSheetBehavior.LJJIFFI;
                } else if (!tuxSheetBehavior.LIZLLL.isEmpty()) {
                    iIntValue = ((Number) C13LP.LJJLIIIJJI(this.LIZ.LIZLLL)).intValue();
                } else {
                    iIntValue = this.LIZ.LJIILLIIL;
                }
                return C419990GdR.LIZIZ(i, expandedOffset, iIntValue);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
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
                    Method dump skipped, instruction units count: 439
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C16B3.onViewReleased(android.view.View, float, float):void");
            }

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
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                this.LIZ.dispatchOnSlide(i2);
            }
        };
        this.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        C418440Gaw.LIZIZ(16);
        setPeekHeight(-1);
        setHideable(true);
        setFitToContents(true);
        this.LJIJ = false;
        this.LJIJI = true;
        this.LJIILL = 0.5f;
        if (this.LJJII != null && !(!this.LIZLLL.isEmpty())) {
            this.LJIILJJIL = (int) (this.LJJIFFI * (1 - this.LJIILL));
        }
        this.LJIIL = 0;
        this.LJFF = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r4, android.view.View r5) {
        /*
            r3 = this;
            r0 = 3
            if (r4 == r0) goto L2b
            r0 = 4
            if (r4 == r0) goto L28
            r0 = 5
            java.lang.String r2 = "Illegal state argument: "
            if (r4 == r0) goto L21
            r0 = 6
            if (r4 != r0) goto L30
            boolean r0 = r3.LJ
            if (r0 == 0) goto L1e
            int r0 = r3.LJIILJJIL
            int r1 = r3.LJIILIIL
            if (r0 > r1) goto L1e
            r4 = 3
        L19:
            r0 = 0
            r3.LJFF(r5, r4, r1, r0)
            return
        L1e:
            int r1 = r3.LJIILJJIL
            goto L19
        L21:
            boolean r0 = r3.LJIIZILJ
            if (r0 == 0) goto L44
            int r1 = r3.LJJIFFI
            goto L19
        L28:
            int r1 = r3.LJIILLIIL
            goto L19
        L2b:
            int r1 = r3.getExpandedOffset()
            goto L19
        L30:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.<init>(r0)
            throw r1
        L44:
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.sheet.sheet.TuxSheetBehavior.LIZLLL(int, android.view.View):void");
    }

    public final boolean LJ(View view, float f) {
        if (this.LJIJ) {
            return true;
        }
        if (view.getTop() < this.LJIILLIIL) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * 0.1f)) - this.LJIILLIIL) / calculatePeekHeight() > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(c16g0, v);
        if (parcelableOnSaveInstanceState == null) {
            return null;
        }
        return new SavedState(parcelableOnSaveInstanceState, (TuxSheetBehavior<?>) this);
    }

    public final void setPeekHeight(int i, boolean z) {
        if (i == -1) {
            if (!this.LJII) {
                this.LJII = true;
            } else {
                return;
            }
        } else {
            if (!this.LJII && this.LJI == i) {
                return;
            }
            this.LJII = false;
            this.LJI = Math.max(0, i);
        }
        updatePeekHeight(false);
    }

    public final Pair LIZIZ(float f, int i, int i2) {
        boolean z;
        boolean z2;
        int iIntValue;
        int i3 = 4;
        if (this.LIZLLL.isEmpty()) {
            return new Pair(Integer.valueOf(this.LJIILLIIL), 4);
        }
        if (Math.abs(f) > 500.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f >= 0.0f && i2 <= 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        Integer next = null;
        if (!z && Math.abs(i2) <= 0) {
            Iterator<Integer> it2 = this.LIZLLL.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int iAbs = Math.abs(next.intValue() - i);
                    do {
                        Integer next2 = it2.next();
                        int iAbs2 = Math.abs(next2.intValue() - i);
                        if (iAbs > iAbs2) {
                            next = next2;
                            iAbs = iAbs2;
                        }
                    } while (it2.hasNext());
                }
            }
            Integer num = next;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = ((Number) C13LP.LJJLIIIJJI(this.LIZLLL)).intValue();
            }
        } else if (z2) {
            List<Integer> list = this.LIZLLL;
            ListIterator<Integer> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Integer numPrevious = listIterator.previous();
                if (numPrevious.intValue() < i) {
                    next = numPrevious;
                    break;
                }
            }
            Integer num2 = next;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = ((Number) C13LP.LJJJJZI(this.LIZLLL)).intValue();
            }
        } else {
            Iterator<Integer> it3 = this.LIZLLL.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Integer next3 = it3.next();
                if (next3.intValue() > i) {
                    next = next3;
                    break;
                }
            }
            Integer num3 = next;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = ((Number) C13LP.LJJLIIIJJI(this.LIZLLL)).intValue();
            }
        }
        if (iIntValue == ((Number) C13LP.LJJJJZI(this.LIZLLL)).intValue()) {
            i3 = 3;
        } else if (iIntValue != ((Number) C13LP.LJJLIIIJJI(this.LIZLLL)).intValue()) {
            this.LJIILJJIL = iIntValue;
            i3 = 6;
        }
        return new Pair(Integer.valueOf(iIntValue), Integer.valueOf(i3));
    }

    @Override // X.C16BC
    public boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        if (v.isShown() && this.LJIJI) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.LJJIIZ = -1;
                VelocityTracker velocityTracker = this.LJJIIJZLJL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                this.LJJIIJZLJL = null;
                this.LIZIZ = false;
            }
            if (this.LJJIIJZLJL == null) {
                this.LJJIIJZLJL = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = this.LJJIIJZLJL;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.LJJIJ = false;
                    this.LJJIIZ = -1;
                    this.LIZIZ = false;
                    if (this.LJIL) {
                        this.LJIL = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.LJJIIZI = (int) motionEvent.getY();
                this.LIZIZ = LIZJ(motionEvent);
                if (this.LJIJJ != 2 && (weakReference = this.LJJIII) != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.LJJIIZI, view)) {
                    this.LJJIIZ = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.LJJIJ = true;
                }
                if (this.LJJIIZ == -1 && !c16g0.LJIIJ(x, this.LJJIIZI, v)) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJIL = z;
            }
            C21586019dq c21586019dq = this.LJIJJLI;
            if (!this.LJIL && c21586019dq != null && c21586019dq.LJIJJ(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.LJJIII;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.LJIL || this.LJIJJ == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || c21586019dq == null || Math.abs(this.LJJIIZI - motionEvent.getY()) <= c21586019dq.LIZIZ) {
                return false;
            }
            return true;
        }
        this.LJIL = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.16B5] */
    @Override // X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        if (c16g0.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.LJJII == null) {
            this.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
            if (Build.VERSION.SDK_INT >= 29 && !this.LJII) {
                final ?? r6 = new C16B9(this) { // from class: X.16B5
                    public final /* synthetic */ TuxSheetBehavior<View> LIZ;

                    {
                        this.LIZ = this;
                    }

                    @Override // X.C16B9
                    public final C20246014Ju LIZ(C20246014Ju c20246014Ju) {
                        this.LIZ.LJIIJ = c20246014Ju.LIZ.LJIIIIZZ().LIZLLL;
                        this.LIZ.updatePeekHeight(false);
                        return c20246014Ju;
                    }
                };
                final C16BA c16ba = new C16BA(v.getPaddingStart(), v.getPaddingTop(), v.getPaddingEnd(), v.getPaddingBottom());
                C14K9.LJIJJ(v, new C0TVI() { // from class: X.16B7
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                        C16B9 c16b9 = r6;
                        new C16BA(c16ba);
                        c16b9.LIZ(c20246014Ju);
                        return c20246014Ju;
                    }
                });
                if (v.isAttachedToWindow()) {
                    C20097313kJ.LIZJ(v);
                } else {
                    v.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.16B8
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
            this.LJJII = new WeakReference<>(v);
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.LJIJJLI == null) {
            this.LJIJJLI = C21586019dq.LJIIIZ(c16g0, this.LJJIJL);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        this.LJJI = c16g0.getWidth();
        this.LJJIFFI = c16g0.getHeight();
        int height = v.getHeight();
        this.LJJ = height;
        this.LJIILIIL = Math.max(0, this.LJJIFFI - height);
        if (!(!this.LIZLLL.isEmpty())) {
            this.LJIILJJIL = (int) (this.LJJIFFI * (1 - this.LJIILL));
        }
        calculateCollapsedOffset();
        LIZ();
        switch (this.LJIJJ) {
            case 1:
            case 2:
                v.offsetTopAndBottom(top - v.getTop());
                break;
            case 3:
                v.offsetTopAndBottom(getExpandedOffset());
                break;
            case 4:
                v.offsetTopAndBottom(this.LJIILLIIL);
                break;
            case 5:
                if (this.LJIIZILJ) {
                    v.offsetTopAndBottom(this.LJJIFFI);
                }
                break;
            case 6:
                v.offsetTopAndBottom(this.LJIILJJIL);
                break;
        }
        this.LJJIII = new WeakReference<>(findScrollingChild(v));
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
            setState(i);
        } else {
            setState(4);
        }
    }

    @Override // X.C16BC
    public boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIJJ == 1 && actionMasked == 0) {
            return true;
        }
        C21586019dq c21586019dq = this.LJIJJLI;
        if (c21586019dq != null) {
            c21586019dq.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            this.LJJIIZ = -1;
            VelocityTracker velocityTracker = this.LJJIIJZLJL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LJJIIJZLJL = null;
            this.LIZIZ = false;
            this.LJJIIZI = (int) motionEvent.getY();
            this.LIZIZ = LIZJ(motionEvent);
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.LJJIIJZLJL;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.LJIJJLI != null && actionMasked == 2 && !this.LJIL) {
            float fAbs = Math.abs(this.LJJIIZI - motionEvent.getY());
            C21586019dq c21586019dq2 = this.LJIJJLI;
            if (fAbs > c21586019dq2.LIZIZ) {
                c21586019dq2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.LJIL;
    }

    public final void LJFF(View view, int i, int i2, boolean z) {
        boolean zLJIJJLI;
        C21586019dq c21586019dq = this.LJIJJLI;
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
                    if (this.LJIIJJI != z2) {
                        this.LJIIJJI = z2;
                    }
                }
                C16B4 c16b4 = new C16B4(this, view, i);
                if (!c16b4.LLILLL) {
                    c16b4.LLILLJJLI = i;
                    view.postOnAnimation(c16b4);
                    c16b4.LLILLL = true;
                    return;
                }
                return;
            }
        }
        setStateInternal(i);
    }

    @Override // X.C16BC
    public void onStopNestedScroll(C16G0 c16g0, V v, View view, int i) {
        int expandedOffset;
        float yVelocity;
        int iIntValue = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference != null && view == weakReference.get() && this.LJJIJIL) {
            float yVelocity2 = 0.0f;
            if (!this.LIZLLL.isEmpty()) {
                if (this.LJIIZILJ) {
                    VelocityTracker velocityTracker = this.LJJIIJZLJL;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LJFF);
                    }
                    VelocityTracker velocityTracker2 = this.LJJIIJZLJL;
                    if (velocityTracker2 != null) {
                        yVelocity = velocityTracker2.getYVelocity(this.LJJIIZ);
                    } else {
                        yVelocity = 0.0f;
                    }
                    if (LJ(v, yVelocity)) {
                        expandedOffset = this.LJJIFFI;
                        iIntValue = 5;
                    }
                }
                Pair pairLIZIZ = LIZIZ(0.0f, v.getTop(), this.LJJIJIIJIL);
                expandedOffset = ((Number) pairLIZIZ.getFirst()).intValue();
                iIntValue = ((Number) pairLIZIZ.getSecond()).intValue();
            } else if (this.LJJIJIIJIL > 0) {
                if (this.LJ) {
                    expandedOffset = this.LJIILIIL;
                } else {
                    int top = v.getTop();
                    expandedOffset = this.LJIILJJIL;
                    if (top <= expandedOffset) {
                        expandedOffset = getExpandedOffset();
                    } else {
                        iIntValue = 6;
                    }
                }
            } else {
                if (this.LJIIZILJ) {
                    VelocityTracker velocityTracker3 = this.LJJIIJZLJL;
                    if (velocityTracker3 != null) {
                        velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LJFF);
                    }
                    VelocityTracker velocityTracker4 = this.LJJIIJZLJL;
                    if (velocityTracker4 != null) {
                        yVelocity2 = velocityTracker4.getYVelocity(this.LJJIIZ);
                    }
                    if (LJ(v, yVelocity2)) {
                        expandedOffset = this.LJJIFFI;
                        iIntValue = 5;
                    }
                }
                if (this.LJJIJIIJIL == 0) {
                    int top2 = v.getTop();
                    if (this.LJ) {
                        if (Math.abs(top2 - this.LJIILIIL) < Math.abs(top2 - this.LJIILLIIL)) {
                            expandedOffset = this.LJIILIIL;
                        } else {
                            expandedOffset = this.LJIILLIIL;
                            iIntValue = 4;
                        }
                    } else {
                        int i2 = this.LJIILJJIL;
                        if (top2 < i2) {
                            if (Math.abs(top2 - getExpandedOffset()) < Math.abs(top2 - this.LJIILJJIL)) {
                                expandedOffset = getExpandedOffset();
                            } else {
                                expandedOffset = this.LJIILJJIL;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.LJIILLIIL)) {
                            expandedOffset = this.LJIILJJIL;
                        } else {
                            expandedOffset = this.LJIILLIIL;
                            iIntValue = 4;
                        }
                        iIntValue = 6;
                    }
                } else {
                    if (this.LJ) {
                        expandedOffset = this.LJIILLIIL;
                    } else {
                        int top3 = v.getTop();
                        if (Math.abs(top3 - this.LJIILJJIL) < Math.abs(top3 - this.LJIILLIIL)) {
                            expandedOffset = this.LJIILJJIL;
                            iIntValue = 6;
                        } else {
                            expandedOffset = this.LJIILLIIL;
                        }
                    }
                    iIntValue = 4;
                }
            }
            LJFF(v, iIntValue, expandedOffset, false);
            this.LJJIJIL = false;
        }
    }

    @Override // X.C16BC
    public boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference == null || !Intrinsics.LJFF(view, weakReference.get())) {
            return false;
        }
        if (this.LJIJJ == 3 && !super.onNestedPreFling(c16g0, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        this.LJJIJIIJIL = 0;
        this.LJJIJIL = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public void onNestedPreScroll(C16G0 c16g0, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        int expandedOffset;
        int iIntValue;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (!Intrinsics.LJFF(view, view2)) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (!this.LIZLLL.isEmpty()) {
            expandedOffset = ((Number) C13LP.LJJJJZI(this.LIZLLL)).intValue();
        } else {
            expandedOffset = getExpandedOffset();
        }
        if (!this.LIZLLL.isEmpty()) {
            iIntValue = ((Number) C13LP.LJJLIIIJJI(this.LIZLLL)).intValue();
        } else {
            iIntValue = this.LJIILLIIL;
        }
        if (i2 > 0) {
            if (i4 < expandedOffset) {
                int i5 = top - expandedOffset;
                iArr[1] = i5;
                v.offsetTopAndBottom(-i5);
                setStateInternal(3);
            } else {
                if (!this.LJIJI) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (i4 > iIntValue && !this.LJIIZILJ) {
                int i6 = top - iIntValue;
                iArr[1] = i6;
                v.offsetTopAndBottom(-i6);
                setStateInternal(4);
            } else {
                if (!this.LJIJI) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJJIJIIJIL = i2;
        this.LJJIJIL = true;
    }
}
