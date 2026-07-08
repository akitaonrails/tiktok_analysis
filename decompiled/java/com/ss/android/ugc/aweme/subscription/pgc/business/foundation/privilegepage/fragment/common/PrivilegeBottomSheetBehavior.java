package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common;

import X.AbstractC21586119dr;
import X.C0K2B;
import X.C0K69;
import X.C0K6D;
import X.C0KXV;
import X.C14K9;
import X.C16BC;
import X.C16G0;
import X.C16G1;
import X.C1C7U;
import X.C20246014Ju;
import X.C20632315oP;
import X.C20732216Au;
import X.C2097608Jq;
import X.C21586019dq;
import X.C2188811AlT;
import X.C511520K4g;
import X.InterfaceC1294060jmO;
import Y.ARunnableS14S0201000_7;
import android.content.Context;
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
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common.PrivilegeBottomSheetBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class PrivilegeBottomSheetBehavior<V extends View> extends C16BC<V> {
    public static final /* synthetic */ int LJJJJ = 0;
    public boolean LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public float LJ;
    public int LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public PrivilegeBottomSheetBehavior<V>.c LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final float LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public C21586019dq LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public WeakReference<V> LJJII;
    public WeakReference<View> LJJIII;
    public final ArrayList<C0K69> LJJIIJ;
    public VelocityTracker LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public Map<View, Integer> LJJIJIIJI;
    public int LJJIJIIJIL;
    public float LJJIJIL;
    public int LJJIJL;
    public float LJJIJLIJ;
    public View LJJIL;
    public int LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public final C20732216Au LJJJIL;

    public final class c implements Runnable {
        public final View LL;
        public int LLILLJJLI;
        public boolean LLILLL;

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("PrivilegeBottomSheetBehavior$SettleRunnable@50a3.run");
            try {
                C21586019dq c21586019dq = PrivilegeBottomSheetBehavior.this.LJIJ;
                if (c21586019dq == null || !c21586019dq.LJIIIIZZ()) {
                    PrivilegeBottomSheetBehavior.this.setStateInternal(this.LLILLJJLI);
                } else {
                    this.LL.postOnAnimation(this);
                }
                this.LLILLL = false;
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("PrivilegeBottomSheetBehavior$SettleRunnable@50a3.run");
        }

        public c(View view, int i) {
            this.LL = view;
            this.LLILLJJLI = i;
        }
    }

    @Override // X.C16BC
    @InterfaceC1294060jmO
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4) {
    }

    @Override // X.C16BC
    @InterfaceC1294060jmO
    public final void onNestedScroll(C16G0 c16g0, V v, View view, int i, int i2, int i3, int i4, int i5) {
    }

    public final void LIZ() {
        V v;
        View view;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference == null || (v = weakReference.get()) == null || (view = this.LJJIL) == null) {
            return;
        }
        view.offsetTopAndBottom((((v.getHeight() - view.getHeight()) - ((int) ((Math.min(v.getTop(), this.LJIILIIL) - ((double) getExpandedOffset())) + ((double) 0)))) + this.LJJIZ) - view.getTop());
    }

    public final int calculatePeekHeight() {
        int i = this.LIZJ;
        if (i != -1) {
            return i;
        }
        int i2 = this.LJFF;
        if (i2 == -1) {
            float f = this.LJI;
            i2 = f > 0.0f ? (int) (this.LJJI * f) : Integer.MAX_VALUE;
        }
        float f2 = this.LJ;
        if (f2 > 0.0f) {
            i2 = (int) (this.LJJI * f2);
        }
        return (int) Math.min(i2, this.LJIL);
    }

    public final int getExpandedOffset() {
        if (this.LIZ) {
            return this.LJIIJ;
        }
        return 0;
    }

    public final void calculateCollapsedOffset() {
        this.LJIILIIL = this.LIZ ? (int) Math.max(this.LJJ - r1, this.LJIIJ) : this.LJJ - calculatePeekHeight();
    }

    @Override // X.C16BC
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJII = null;
        this.LJIJ = null;
    }

    public final void dispatchOnSlide(int i) {
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference != null && weakReference.get() != null && !this.LJJIIJ.isEmpty()) {
            if (i <= this.LJIILIIL) {
                getExpandedOffset();
            }
            int size = this.LJJIIJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0K69) ListProtector.get(this.LJJIIJ, i2)).LIZ();
            }
        }
        LIZ();
    }

    public final View findScrollingChild(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof C20632315oP) {
            C20632315oP c20632315oP = (C20632315oP) view;
            int currentItem = c20632315oP.getCurrentItem();
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) c20632315oP.getChildAt(0)).getLayoutManager();
            if (layoutManager == null) {
                return null;
            }
            return findScrollingChild(layoutManager.findViewByPosition(currentItem));
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
        this.LJIJ = null;
    }

    public final void setState(int i) {
        if (i == this.LJIIZILJ) {
            return;
        }
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJIILJJIL && i == 5)) {
                this.LJIIZILJ = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v != null) {
            ViewParent parent = v.getParent();
            if (parent != null && parent.isLayoutRequested() && v.isAttachedToWindow()) {
                HandlerHook.viewPost(v, new ARunnableS14S0201000_7(i, this, v, 1));
            } else {
                settleToState(v, i);
            }
        }
    }

    public final void setStateInternal(int i) {
        if (this.LJIIZILJ == i) {
            return;
        }
        this.LJIIZILJ = i;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference != null && weakReference.get() != null) {
            if (i != 3) {
                if (i == 4 || i == 5 || i == 6) {
                    updateImportantForAccessibility(false);
                }
            } else {
                updateImportantForAccessibility(true);
            }
            int size = this.LJJIIJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0K69) ListProtector.get(this.LJJIIJ, i2)).LIZIZ(i);
            }
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        ViewParent parent;
        ViewGroup viewGroup;
        V v;
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference == null) {
            return;
        }
        V v2 = weakReference.get();
        if (v2 != null) {
            parent = v2.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof C16G0) && (viewGroup = (ViewGroup) parent) != null) {
            int childCount = viewGroup.getChildCount();
            if (z) {
                if (this.LJJIJIIJI == null) {
                    this.LJJIJIIJI = new HashMap(childCount);
                } else {
                    return;
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                WeakReference<V> weakReference2 = this.LJJII;
                if (weakReference2 != null) {
                    v = weakReference2.get();
                } else {
                    v = null;
                }
                if (childAt != v && z && (map = this.LJJIJIIJI) != null) {
                    map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (!z) {
                this.LJJIJIIJI = null;
            }
        }
    }

    public static final class SavedState extends AbsSavedState {
        public final boolean fitToContents;
        public final boolean hideable;
        public final int peekHeight;
        public final boolean skipCollapsed;
        public final int state;

        public SavedState(Parcelable parcelable, PrivilegeBottomSheetBehavior<?> privilegeBottomSheetBehavior) {
            super(parcelable);
            this.state = privilegeBottomSheetBehavior.LJIIZILJ;
            this.peekHeight = privilegeBottomSheetBehavior.LIZJ;
            this.fitToContents = privilegeBottomSheetBehavior.LIZ;
            this.hideable = privilegeBottomSheetBehavior.LJIILJJIL;
            this.skipCollapsed = privilegeBottomSheetBehavior.LJIILL;
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
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.16Au] */
    public PrivilegeBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        WeakReference<V> weakReference;
        V v;
        super(context, attributeSet);
        this.LIZ = true;
        this.LIZJ = -1;
        this.LJFF = -1;
        this.LJIIL = 0.5f;
        this.LJIILLIIL = true;
        this.LJIIZILJ = 4;
        this.LJJIIJ = new ArrayList<>();
        this.LJJIJIIJIL = -1;
        this.LJJIJL = -1;
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            if (this.LJJII != null) {
                calculateCollapsedOffset();
                if (this.LJIIZILJ == 4 && (weakReference = this.LJJII) != null && (v = weakReference.get()) != null) {
                    v.requestLayout();
                }
            }
        }
        if (this.LJIILJJIL) {
            this.LJIILJJIL = false;
            if (this.LJIIZILJ == 5) {
                setState(4);
            }
        }
        if (!this.LIZ) {
            this.LIZ = true;
            if (this.LJJII != null) {
                calculateCollapsedOffset();
            }
            if (this.LIZ && this.LJIIZILJ == 6) {
                i = 3;
            } else {
                i = this.LJIIZILJ;
            }
            setStateInternal(i);
        }
        this.LJIILL = false;
        this.LJIILLIIL = true;
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.LJJJI = true;
        this.LJJJIL = new AbstractC21586119dr(this) { // from class: X.16Au
            public final /* synthetic */ PrivilegeBottomSheetBehavior<V> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.AbstractC21586119dr
            public final int getViewVerticalDragRange(View view) {
                PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior = this.LIZ;
                if (privilegeBottomSheetBehavior.LJIILJJIL) {
                    return privilegeBottomSheetBehavior.LJJ;
                }
                return privilegeBottomSheetBehavior.LJIILIIL;
            }

            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior = this.LIZ;
                    if (privilegeBottomSheetBehavior.LJIILLIIL) {
                        privilegeBottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i2) {
                Reference reference;
                WeakReference<View> weakReference2;
                View view2;
                PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior = this.LIZ;
                int i3 = privilegeBottomSheetBehavior.LJIIZILJ;
                if (i3 == 1) {
                    return false;
                }
                if (privilegeBottomSheetBehavior.LJJIJ) {
                    if (!privilegeBottomSheetBehavior.LJJJ) {
                        return false;
                    }
                    if (i3 == 3 && !privilegeBottomSheetBehavior.LJJJI) {
                        return false;
                    }
                }
                if ((i3 == 3 && privilegeBottomSheetBehavior.LJJIIZ == i2 && (weakReference2 = privilegeBottomSheetBehavior.LJJIII) != null && (view2 = weakReference2.get()) != null && view2.canScrollVertically(-1)) || (reference = this.LIZ.LJJII) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i2, int i3) {
                int i4;
                int expandedOffset = this.LIZ.getExpandedOffset();
                PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior = this.LIZ;
                if (privilegeBottomSheetBehavior.LJIILJJIL) {
                    i4 = privilegeBottomSheetBehavior.LJJ;
                } else {
                    i4 = privilegeBottomSheetBehavior.LJIILIIL;
                }
                return C419990GdR.LIZIZ(i2, expandedOffset, i4);
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
            public final void onViewReleased(View view, float f, float f2) {
                int i2 = 0;
                int i3 = 6;
                if (f2 >= 0.0f && !this.LIZ.LIZIZ(view, f2)) {
                    PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior = this.LIZ;
                    if (privilegeBottomSheetBehavior.LJIILJJIL && privilegeBottomSheetBehavior.shouldHide(view, f2)) {
                        i2 = this.LIZ.LJJ;
                        i3 = 5;
                    } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior2 = this.LIZ;
                        if (privilegeBottomSheetBehavior2.LIZ) {
                            if (Math.abs(top - privilegeBottomSheetBehavior2.LJIIJ) < Math.abs(top - this.LIZ.LJIILIIL)) {
                                i2 = this.LIZ.LJIIJ;
                                i3 = 3;
                            } else {
                                i2 = this.LIZ.LJIILIIL;
                                i3 = 4;
                            }
                        } else {
                            if (top < privilegeBottomSheetBehavior2.LJIIJJI) {
                                if (top < Math.abs(top - privilegeBottomSheetBehavior2.LJIILIIL)) {
                                    this.LIZ.getClass();
                                    i3 = 3;
                                } else {
                                    i2 = this.LIZ.LJIIJJI;
                                }
                            } else if (Math.abs(top - r0) < Math.abs(top - this.LIZ.LJIILIIL)) {
                                i2 = this.LIZ.LJIIJJI;
                            } else {
                                i2 = this.LIZ.LJIILIIL;
                                i3 = 4;
                            }
                        }
                    } else {
                        PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior3 = this.LIZ;
                        if (privilegeBottomSheetBehavior3.LIZ) {
                            i2 = privilegeBottomSheetBehavior3.LJIILIIL;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - this.LIZ.LJIIJJI) < Math.abs(top2 - this.LIZ.LJIILIIL)) {
                                i2 = this.LIZ.LJIIJJI;
                            } else {
                                i2 = this.LIZ.LJIILIIL;
                            }
                        }
                        i3 = 4;
                    }
                } else {
                    PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior4 = this.LIZ;
                    if (privilegeBottomSheetBehavior4.LIZ) {
                        i2 = privilegeBottomSheetBehavior4.LJIIJ;
                    } else {
                        int top3 = view.getTop();
                        PrivilegeBottomSheetBehavior<V> privilegeBottomSheetBehavior5 = this.LIZ;
                        int i4 = privilegeBottomSheetBehavior5.LJIIJJI;
                        if (top3 > i4) {
                            i2 = i4;
                        } else {
                            privilegeBottomSheetBehavior5.getClass();
                        }
                    }
                    i3 = 3;
                }
                this.LIZ.startSettlingAnimation(view, i3, i2, true);
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
            public final void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                this.LIZ.dispatchOnSlide(i3);
            }
        };
    }

    public final boolean LIZIZ(View view, float f) {
        int expandedOffset = this.LJJ - getExpandedOffset();
        float fAbs = (float) Math.abs((view.getTop() + (f * 0.01f)) - getExpandedOffset());
        double d = fAbs;
        double d2 = expandedOffset >> 2;
        int expandedOffset2 = this.LJJIFFI;
        double d3 = expandedOffset2;
        if (!this.LJIILL) {
            expandedOffset2 = (this.LJIILIIL - getExpandedOffset()) >> 1;
        }
        if (d < Math.min(d2, Math.min(d3, expandedOffset2)) && fAbs / this.LJJ < 0.16f) {
            return true;
        }
        return false;
    }

    @Override // X.C16BC
    public final Parcelable onSaveInstanceState(C16G0 c16g0, V v) {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(c16g0, v);
        if (parcelableOnSaveInstanceState != null) {
            return new SavedState(parcelableOnSaveInstanceState, this);
        }
        return null;
    }

    public final void settleToState(View view, int i) {
        int expandedOffset;
        int i2;
        if (i == 4) {
            expandedOffset = this.LJIILIIL;
        } else if (i == 6) {
            expandedOffset = this.LJIIJJI;
            if (this.LIZ && expandedOffset <= (i2 = this.LJIIJ)) {
                i = 3;
                expandedOffset = i2;
            }
        } else if (i == 3) {
            expandedOffset = getExpandedOffset();
        } else if (this.LJIILJJIL && i == 5) {
            expandedOffset = this.LJJ;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Illegal state argument: ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        startSettlingAnimation(view, i, expandedOffset, false);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJIILL) {
            return true;
        }
        if (view.getTop() < this.LJIILIIL) {
            return false;
        }
        int iCalculatePeekHeight = calculatePeekHeight();
        float fAbs = (float) Math.abs((view.getTop() + (f * 0.01f)) - this.LJIILIIL);
        if (fAbs > Math.min(this.LJJIFFI, iCalculatePeekHeight >> 1) || fAbs / this.LJJ > 0.16f) {
            return true;
        }
        return false;
    }

    @Override // X.C16BC
    public final C20246014Ju onApplyWindowInsets(C16G0 c16g0, V v, C20246014Ju c20246014Ju) {
        this.LJII = c20246014Ju.LJFF();
        this.LJIIIIZZ = c20246014Ju.LIZ(2).LIZLLL;
        return c20246014Ju;
    }

    @Override // X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        C21586019dq c21586019dq;
        C21586019dq c21586019dq2;
        if (v.isShown() && this.LJIILLIIL) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.LJJIIZ = -1;
                VelocityTracker velocityTracker = this.LJJIIJZLJL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.LJJIIJZLJL = null;
                }
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
                    if (this.LJIJI) {
                        this.LJIJI = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.LJJIIZI = (int) motionEvent.getY();
                if (this.LJIIZILJ != 2 && (weakReference = this.LJJIII) != null && (view = weakReference.get()) != null && c16g0.LJIIJ(x, this.LJJIIZI, view)) {
                    this.LJJIIZ = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.LJJIJ = true;
                }
                if (this.LJJIIZ == -1 && !c16g0.LJIIJ(x, this.LJJIIZI, v)) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJIJI = z;
            }
            if (!this.LJIJI && (c21586019dq2 = this.LJIJ) != null && c21586019dq2.LJIJJ(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.LJJIII;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.LJIJI || this.LJIIZILJ == 1 || c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || (c21586019dq = this.LJIJ) == null || Math.abs(this.LJJIIZI - motionEvent.getY()) <= c21586019dq.LIZIZ) {
                return false;
            }
            return true;
        }
        this.LJIJI = true;
        return false;
    }

    @Override // X.C16BC
    public final boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        if (this.LJJII == null) {
            this.LJJII = new WeakReference<>(v);
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = C21586019dq.LJIIIZ(c16g0, this.LJJJIL);
        }
        int top = v.getTop();
        c16g0.LJIIL(i, v);
        c16g0.getWidth();
        this.LJJ = c16g0.getHeight();
        int height = v.getHeight();
        this.LJIL = height;
        int i2 = this.LJJ;
        this.LJJIFFI = (int) (i2 * 0.25f);
        if (i2 - height < this.LJII) {
            this.LJIL = i2;
        }
        this.LJIIJ = (int) Math.max(0.0d, i2 - this.LJIL);
        this.LJIIJJI = (int) (this.LJJ * (1 - this.LJIIL));
        calculateCollapsedOffset();
        int i3 = this.LJIIZILJ;
        if (i3 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i3 == 6) {
            v.offsetTopAndBottom(this.LJIIJJI);
        } else if (this.LJIILJJIL && i3 == 5) {
            v.offsetTopAndBottom(this.LJJ);
        } else if (i3 == 4) {
            v.offsetTopAndBottom(this.LJIILIIL);
        } else if (i3 == 1 || i3 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.LJJIII = new WeakReference<>(findScrollingChild(v));
        if (this.LJJIL == null) {
            View childAt = null;
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    if (viewGroup.getChildAt(i4) instanceof C0KXV) {
                        childAt = viewGroup.getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            break;
                        }
                    }
                }
            }
            this.LJJIL = childAt;
        }
        LIZ();
        return true;
    }

    @Override // X.C16BC
    public final boolean onTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) throws JSONException {
        C21586019dq c21586019dq;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIIZILJ == 1 && actionMasked == 0) {
            return true;
        }
        C21586019dq c21586019dq2 = this.LJIJ;
        if (c21586019dq2 != null) {
            try {
                c21586019dq2.LJIILIIL(motionEvent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0K6D.LIZJ(e, "PrivilegeBottomSheetBehavior onTouchEvent", C2097608Jq.LJ());
            }
        }
        if (actionMasked == 0) {
            this.LJJIIZ = -1;
            VelocityTracker velocityTracker = this.LJJIIJZLJL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJJIIJZLJL = null;
            }
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.LJJIIJZLJL;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.LJIJ != null && actionMasked == 2 && !this.LJIJI && Math.abs(this.LJJIIZI - motionEvent.getY()) > r2.LIZIZ && (c21586019dq = this.LJIJ) != null) {
            c21586019dq.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
        }
        return !this.LJIJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    @Override // X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r8, V r9, android.view.View r10, int r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.common.PrivilegeBottomSheetBehavior.onStopNestedScroll(X.16G0, android.view.View, android.view.View, int):void");
    }

    public final void startSettlingAnimation(View view, int i, int i2, boolean z) {
        C21586019dq c21586019dq = this.LJIJ;
        if (c21586019dq != null && (!z ? c21586019dq.LJIJJLI(view.getLeft(), i2, view) : c21586019dq.LJIJI(view.getLeft(), i2))) {
            setStateInternal(2);
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new c(view, i);
            }
            PrivilegeBottomSheetBehavior<V>.c cVar = this.LJIIIZ;
            if (cVar != null) {
                if (!cVar.LLILLL) {
                    cVar.LLILLJJLI = i;
                    view.postOnAnimation(cVar);
                    PrivilegeBottomSheetBehavior<V>.c cVar2 = this.LJIIIZ;
                    if (cVar2 != null) {
                        cVar2.LLILLL = true;
                        return;
                    }
                    return;
                }
                cVar.LLILLJJLI = i;
                return;
            }
            return;
        }
        setStateInternal(i);
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference == null || !this.LJIILLIIL || view != weakReference.get()) {
            return false;
        }
        if (this.LJIIZILJ == 3 && !super.onNestedPreFling(c16g0, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C16BC
    public final boolean onMeasureChild(C16G0 c16g0, V v, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = v.getContext().getResources().getConfiguration().orientation;
        int size = View.MeasureSpec.getSize(i3);
        if (i7 == 1) {
            i5 = this.LJIIIIZZ + size;
        } else {
            i5 = size;
        }
        this.LJJI = i5;
        int i8 = this.LJJIJIIJIL;
        if (i8 == -1) {
            float f = this.LJJIJIL;
            if (f > 0.0f) {
                i8 = (int) (f * i5);
            } else {
                i8 = this.LJJIJL;
                i6 = Integer.MIN_VALUE;
                if (i8 == -1) {
                    float f2 = this.LJJIJLIJ;
                    if (f2 > 0.0f) {
                        i8 = (int) (i5 * f2);
                    } else {
                        i8 = -1;
                    }
                }
            }
            i6 = 1073741824;
        } else {
            i6 = 1073741824;
        }
        int iMin = (int) Math.min(i8, size);
        if (iMin == -1) {
            return super.onMeasureChild(c16g0, v, i, i2, i3, i4);
        }
        if (i7 != 1 && !C0K2B.LIZ(v.getContext())) {
            v.measure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, i6));
            return true;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, c16g0.getPaddingLeft() + c16g0.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        if (C0K2B.LIZ(v.getContext())) {
            v.getContext();
            childMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) C511520K4g.LIZ(375.0f), 1073741824);
        }
        if (iMin < this.LJJI * 0.9f) {
            iMin = (int) Math.min(iMin, (int) r1);
        }
        v.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(iMin, i6));
        return true;
    }

    @Override // X.C16BC
    public final boolean onStartNestedScroll(C16G0 c16g0, V v, View view, View view2, int i, int i2) {
        this.LJIJJ = 0;
        this.LJIJJLI = false;
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
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2 || !this.LJIILLIIL) {
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
                if (!this.LJIILLIIL) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.LJIILIIL;
            if (i4 > i5 && !this.LJIILJJIL) {
                int i6 = top - i5;
                iArr[1] = i6;
                v.offsetTopAndBottom(-i6);
                setStateInternal(4);
            } else {
                if (!this.LJIILLIIL) {
                    return;
                }
                iArr[1] = i2;
                v.offsetTopAndBottom(-i2);
                setStateInternal(1);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJIJJ = i2;
        this.LJIJJLI = true;
    }
}
