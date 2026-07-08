package com.bytedance.ies.powerlist.layout.core;

import X.AbstractC21673619ry;
import X.AbstractC21686119tz;
import X.AbstractC21686519u3;
import X.AbstractC21687419uC;
import X.AbstractC21688019uI;
import X.C0WZX;
import X.C136N;
import X.C1838120xvu;
import X.C20104113lP;
import X.C2115308Ql;
import X.C21673319rv;
import X.C21673919s1;
import X.C21685119tp;
import X.C21685619tu;
import X.C21685719tv;
import X.C21686019ty;
import X.C21686319u1;
import X.C21686419u2;
import X.C21686619u4;
import X.C21686719u5;
import X.C21686819u6;
import X.C21687219uA;
import X.C21687319uB;
import X.C21687819uG;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC21686919u7;
import X.InterfaceC21687919uH;
import Y.AComparatorS37S0000000_18;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class PowerLayoutManager extends LinearLayoutManager implements InterfaceC21686919u7 {
    public static Field LLJL;
    public static Method LLJLIL;
    public final C1838120xvu LL;
    public AbstractC21686519u3 LLILLJJLI;
    public final AbstractC21686519u3 LLILLL;
    public C21686419u2 LLILZ;
    public RecyclerView LLILZIL;
    public final Method LLILZLL;
    public final C21685619tu LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public final C21686619u4 LLJILLL;
    public Bundle LLJJ;
    public AbstractC21687419uC LLJJI;
    public final HashMap<Integer, AbstractC21686119tz> LLJJIII;
    public final HashMap<Integer, AbstractC21686119tz> LLJJIJI;
    public final C21686719u5 LLJJIJIIJIL;
    public final C2115308Ql LLJJIJIL;
    public final Object[] LLJJJ;
    public final Rect LLJJJIL;
    public int LLJJJJ;
    public final C21686319u1 LLJJJJJIL;
    public final List<Pair<C136N<Integer>, Integer>> LLJJJJLIIL;
    public final C21687819uG LLJJL;
    public final AComparatorS37S0000000_18 LLJJLIIIJLLLLLLLZ;

    /* JADX WARN: Type inference failed for: r7v0, types: [X.19uB, android.view.View] */
    public final View LJIILLIIL() {
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView == null) {
            return null;
        }
        C2115308Ql c2115308Ql = this.LLJJIJIL;
        Context context = recyclerView.getContext();
        c2115308Ql.getClass();
        ?? r7 = new View(context) { // from class: X.19uB
            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
            }
        };
        C21685119tp c21685119tp = new C21685119tp();
        LayoutViewCell layoutViewCell = new LayoutViewCell(r7);
        try {
            if (LLJL == null) {
                LLJL = RecyclerView.LayoutParams.class.getDeclaredField("mViewHolder");
            }
            LLJL.setAccessible(true);
            LLJL.set(c21685119tp, layoutViewCell);
            if (LLJLIL == null) {
                Class cls = Integer.TYPE;
                Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("setFlags", cls, cls);
                LLJLIL = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            LLJLIL.invoke(layoutViewCell, 4, 4);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C786410Ut5.W5(r7, c21685119tp);
        return r7;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.LLIZLLLIL;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LLJ;
    }

    public final void ensureLayoutStateExpose() {
        if (this.LLILZ == null) {
            this.LLILZ = new C21686419u2();
        }
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = AbstractC21686519u3.LIZ(this, getOrientation());
        }
        try {
            C2204961BRm.a0(this.LLILZLL, this, this.LLJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5Sn8defrWuQXD+mhYCW6mCi/RADqdE0p7MKfqtVvX/VpwOlvXA==", null));
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new C21685119tp();
    }

    public final View getChildClosestToEndExpose() {
        return getChildAt(this.LLJIJIL ? 0 : getChildCount() - 1);
    }

    public final View getChildClosestToStartExpose() {
        return getChildAt(this.LLJIJIL ? getChildCount() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        if (this.LLJJ != null) {
            return new Bundle(this.LLJJ);
        }
        Bundle bundle = new Bundle();
        if (getChildCount() <= 0) {
            bundle.putInt("AnchorPosition", -1);
            return bundle;
        }
        boolean z = this.LLJI ^ this.LLJIJIL;
        bundle.putBoolean("AnchorLayoutFromEnd", z);
        if (z) {
            View childClosestToEndExpose = getChildClosestToEndExpose();
            bundle.putInt("AnchorOffset", this.LLILLJJLI.LJI() - this.LLILLJJLI.LIZIZ(childClosestToEndExpose));
            bundle.putInt("AnchorPosition", getPosition(childClosestToEndExpose));
            return bundle;
        }
        View childClosestToStartExpose = getChildClosestToStartExpose();
        bundle.putInt("AnchorPosition", getPosition(childClosestToStartExpose));
        bundle.putInt("AnchorOffset", this.LLILLJJLI.LJ(childClosestToStartExpose) - this.LLILLJJLI.LJIIIIZZ());
        return bundle;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.LLJJ == null;
    }

    public final int LJIIZILJ() {
        return super.getHeight();
    }

    public final int LJIJ() {
        return super.getWidth();
    }

    public final void LJJ() {
        if (getOrientation() == 1 || !isLayoutRTL()) {
            this.LLJIJIL = getReverseLayout();
        } else {
            this.LLJIJIL = !getReverseLayout();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int findFirstVisibleItemPosition() {
        ensureLayoutStateExpose();
        return super.findFirstVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int findLastVisibleItemPosition() throws Exception {
        ensureLayoutStateExpose();
        try {
            return super.findLastVisibleItemPosition();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("itemCount: ");
            sbLIZ.append(getItemCount());
            C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("childCount: ");
            sbLIZ2.append(getChildCount());
            C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("child: ");
            sbLIZ3.append(getChildAt(getChildCount() - 1));
            C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("RV childCount: ");
            sbLIZ4.append(this.LLILZIL.getChildCount());
            C2188811AlT.LIZIZ(sbLIZ4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("RV child: ");
            sbLIZ5.append(this.LLILZIL.getChildAt(this.LLILZIL.getChildCount() - 1));
            C2188811AlT.LIZIZ(sbLIZ5);
            throw e;
        }
    }

    public static class LayoutViewCell extends PowerCell<InterfaceC1891350zJl> {
        public final View LL;

        public LayoutViewCell(C21687319uB c21687319uB) {
            this.LL = c21687319uB;
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup, int i) {
            return this.LL;
        }
    }

    public final void LJIIL(C21686619u4 c21686619u4) {
        int iLJIIIIZZ;
        if (c21686619u4.LIZJ) {
            iLJIIIIZZ = this.LLILLJJLI.LJI();
        } else {
            iLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ();
        }
        c21686619u4.LIZIZ = iLJIIIIZZ;
    }

    public final void LJJII(List<AbstractC21686119tz> list) {
        C21685719tv c21685719tv;
        WeakReference<PowerLayoutManager> weakReference;
        for (AbstractC21686119tz abstractC21686119tz : ((C21687219uA) this.LLJJI).LIZIZ) {
            this.LLJJIJI.put(Integer.valueOf(System.identityHashCode(abstractC21686119tz)), abstractC21686119tz);
        }
        if (list != null) {
            int iLJI = 0;
            for (AbstractC21686119tz abstractC21686119tz2 : (ArrayList) list) {
                if (abstractC21686119tz2 instanceof AbstractC21688019uI) {
                    abstractC21686119tz2.getClass();
                }
                if ((abstractC21686119tz2 instanceof C21685719tv) && ((weakReference = (c21685719tv = (C21685719tv) abstractC21686119tz2).LJJ) == null || weakReference.get() != this)) {
                    c21685719tv.LJJ = new WeakReference<>(this);
                }
                if (abstractC21686119tz2.LJI() > 0) {
                    abstractC21686119tz2.LJIILLIIL(iLJI, (abstractC21686119tz2.LJI() + iLJI) - 1);
                } else {
                    abstractC21686119tz2.LJIILLIIL(-1, -1);
                }
                iLJI += abstractC21686119tz2.LJI();
            }
        }
        this.LLJJI.LIZIZ(list);
        for (AbstractC21686119tz abstractC21686119tz3 : ((C21687219uA) this.LLJJI).LIZIZ) {
            this.LLJJIII.put(Integer.valueOf(System.identityHashCode(abstractC21686119tz3)), abstractC21686119tz3);
        }
        Iterator<Map.Entry<Integer, AbstractC21686119tz>> it2 = this.LLJJIJI.entrySet().iterator();
        while (it2.hasNext()) {
            Integer key = it2.next().getKey();
            if (this.LLJJIII.containsKey(key)) {
                this.LLJJIII.remove(key);
                it2.remove();
            }
        }
        Iterator<AbstractC21686119tz> it3 = this.LLJJIJI.values().iterator();
        while (it3.hasNext()) {
            it3.next().LJ(this);
        }
        if (this.LLJJIJI.isEmpty()) {
            this.LLJJIII.isEmpty();
        }
        this.LLJJIJI.clear();
        this.LLJJIII.clear();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.LLJJ == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C21685119tp;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        int i2 = 1;
        if (i < getPosition(childAt)) {
            z = true;
        }
        if (z != this.LLJIJIL) {
            i2 = -1;
        }
        if (getOrientation() == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void detachAndScrapAttachedViews(C21673319rv c21673319rv) {
        RecyclerView.ViewHolder childViewHolder;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                RecyclerView recyclerView = this.LLILZIL;
                if (recyclerView != null) {
                    childViewHolder = recyclerView.getChildViewHolder(childAt);
                } else {
                    childViewHolder = null;
                }
                if ((childViewHolder instanceof InterfaceC21687919uH) && ((InterfaceC21687919uH) childViewHolder).LIZ()) {
                    C20104113lP.LIZ(childViewHolder, 6);
                }
            } else {
                super.detachAndScrapAttachedViews(c21673319rv);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View findViewByPosition(int i) {
        View viewFindViewByPosition = super.findViewByPosition(i);
        if (viewFindViewByPosition != null && getPosition(viewFindViewByPosition) == i) {
            return viewFindViewByPosition;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && getPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C21685119tp) {
            return new C21685119tp((C21685119tp) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new C21685119tp((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C21685119tp((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21685119tp(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        Iterator<AbstractC21686119tz> it2 = ((C21687219uA) this.LLJJI).LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        Iterator<AbstractC21686119tz> it2 = ((C21687219uA) this.LLJJI).LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(i, this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLILZIL = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        Iterator<AbstractC21686119tz> it2 = ((C21687219uA) this.LLJJI).LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            this.LLJJ = (Bundle) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        Iterator<AbstractC21686119tz> it2 = ((C21687219uA) this.LLJJI).LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ(i, iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.LLJILJIL = i;
        this.LLJILJILJ = Integer.MIN_VALUE;
        Bundle bundle = this.LLJJ;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setOrientation(int i) {
        this.LLILLJJLI = AbstractC21686519u3.LIZ(this, i);
        super.setOrientation(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setReverseLayout(boolean z) {
        if (!z) {
            super.setReverseLayout(false);
            return;
        }
        throw new UnsupportedOperationException("Does not support reverse layout in current version.");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("Does not support stack from end.");
    }

    public final void showView(View view) throws Throwable {
        C21685619tu c21685619tu = this.LLIZ;
        c21685619tu.getClass();
        try {
            c21685619tu.LIZ();
            c21685619tu.LJII[0] = Integer.valueOf(c21685619tu.LJI.LLILZIL.indexOfChild(view));
            C2204961BRm.a0(c21685619tu.LIZLLL, c21685619tu.LIZJ, c21685619tu.LJII, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtWRf5Sn8defrWuQXD+mhYCWsgzO2RCbsZl919sqD4Ru3tVkh", null));
            List list = c21685619tu.LJFF;
            if (list != null) {
                list.remove(view);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0xvu] */
    public PowerLayoutManager(Context context, int i) {
        super(context, 1, false);
        this.LL = new C21686019ty() { // from class: X.0xvu
            @Override // X.AbstractC21686119tz
            public final boolean LJIIJJI(int i2) {
                return false;
            }
        };
        this.LLJIJIL = false;
        this.LLJILJIL = -1;
        this.LLJILJILJ = Integer.MIN_VALUE;
        this.LLJJ = null;
        this.LLJJIII = new HashMap<>();
        this.LLJJIJI = new HashMap<>();
        this.LLJJIJIIJIL = new C21686719u5();
        this.LLJJIJIL = new C2115308Ql();
        this.LLJJJ = new Object[0];
        this.LLJJJIL = new Rect();
        this.LLJJJJ = 0;
        this.LLJJJJJIL = new C21686319u1();
        this.LLJJJJLIIL = new ArrayList();
        this.LLJJL = new C21687819uG();
        this.LLJJLIIIJLLLLLLLZ = new AComparatorS37S0000000_18(0);
        this.LLJILLL = new C21686619u4();
        this.LLIZ = new C21685619tu(this);
        setOrientation(1);
        setReverseLayout(false);
        try {
            Method declaredMethod = LinearLayoutManager.class.getDeclaredMethod("ensureLayoutState", new Class[0]);
            this.LLILZLL = declaredMethod;
            declaredMethod.setAccessible(true);
            try {
                RecyclerView.LayoutManager.class.getDeclaredMethod("setItemPrefetchEnabled", Boolean.TYPE).invoke(this, Boolean.FALSE);
            } catch (IllegalAccessException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            } catch (InvocationTargetException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLILLJJLI = AbstractC21686519u3.LIZ(this, 1);
            this.LLILLL = AbstractC21686519u3.LIZ(this, 0);
            this.LLJ = super.canScrollVertically();
            this.LLIZLLLIL = super.canScrollHorizontally();
            C21687219uA c21687219uA = new C21687219uA();
            LinkedList linkedList = new LinkedList();
            AbstractC21687419uC abstractC21687419uC = this.LLJJI;
            if (abstractC21687419uC != null) {
                Iterator<AbstractC21686119tz> it2 = ((C21687219uA) abstractC21687419uC).LIZIZ.iterator();
                while (it2.hasNext()) {
                    linkedList.add(it2.next());
                }
            }
            this.LLJJI = c21687219uA;
            if (!linkedList.isEmpty()) {
                this.LLJJI.LIZIZ(linkedList);
            }
            requestLayout();
        } catch (NoSuchMethodException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new RuntimeException(e4);
        }
    }

    public final void LJIILIIL(View view, C21686619u4 c21686619u4) {
        int iLJIIIZ;
        if (c21686619u4.LIZJ) {
            int iLIZIZ = this.LLILLJJLI.LIZIZ(view) + LJIILJJIL(view, c21686619u4.LIZJ, true);
            AbstractC21686519u3 abstractC21686519u3 = this.LLILLJJLI;
            if (Integer.MIN_VALUE == abstractC21686519u3.LIZIZ) {
                iLJIIIZ = 0;
            } else {
                iLJIIIZ = abstractC21686519u3.LJIIIZ() - abstractC21686519u3.LIZIZ;
            }
            c21686619u4.LIZIZ = iLIZIZ + iLJIIIZ;
        } else {
            c21686619u4.LIZIZ = this.LLILLJJLI.LJ(view) + LJIILJJIL(view, c21686619u4.LIZJ, true);
        }
        c21686619u4.LIZ = getPosition(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(X.C21673319rv r14, X.C21673919s1 r15) {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.layout.core.PowerLayoutManager.LJIJI(X.19rv, X.19s1):void");
    }

    public final void LJIL(C21673319rv c21673319rv, C21686419u2 c21686419u2) {
        if (!c21686419u2.LIZIZ) {
            return;
        }
        if (c21686419u2.LJI == -1) {
            int i = c21686419u2.LJII;
            int childCount = getChildCount();
            if (i >= 0) {
                int iLJFF = this.LLILLJJLI.LJFF() - i;
                if (this.LLJIJIL) {
                    for (int i2 = 0; i2 < childCount; i2++) {
                        if (this.LLILLJJLI.LJ(getChildAt(i2)) < iLJFF) {
                            recycleChildren(c21673319rv, 0, i2);
                            return;
                        }
                    }
                    return;
                }
                int i3 = childCount - 1;
                for (int i4 = i3; i4 >= 0; i4--) {
                    if (this.LLILLJJLI.LJ(getChildAt(i4)) < iLJFF) {
                        recycleChildren(c21673319rv, i3, i4);
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i5 = c21686419u2.LJII;
        if (i5 < 0) {
            return;
        }
        int childCount2 = getChildCount();
        if (this.LLJIJIL) {
            int i6 = childCount2 - 1;
            for (int i7 = i6; i7 >= 0; i7--) {
                if (this.LLILLJJLI.LIZIZ(getChildAt(i7)) > i5) {
                    recycleChildren(c21673319rv, i6, i7);
                    return;
                }
            }
            return;
        }
        for (int i8 = 0; i8 < childCount2; i8++) {
            if (this.LLILLJJLI.LIZIZ(getChildAt(i8)) > i5) {
                recycleChildren(c21673319rv, 0, i8);
                return;
            }
        }
    }

    public final void LJJIFFI(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (this.LLJJJJ == 0) {
            Iterator<AbstractC21686119tz> it2 = ((C21687219uA) this.LLJJI).LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIILJJIL(c21673319rv, c21673919s1, this);
            }
        }
        this.LLJJJJ++;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void detachAndScrapViewAt(int i, C21673319rv c21673319rv) {
        RecyclerView.ViewHolder childViewHolder;
        View childAt = getChildAt(i);
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView != null) {
            childViewHolder = recyclerView.getChildViewHolder(childAt);
        } else {
            childViewHolder = null;
        }
        if ((childViewHolder instanceof InterfaceC21687919uH) && ((InterfaceC21687919uH) childViewHolder).LIZ()) {
            C20104113lP.LIZ(childViewHolder, 4);
        }
        super.detachAndScrapViewAt(i, c21673319rv);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(final Context context, final AttributeSet attributeSet) {
        return new C21685119tp(context, attributeSet) { // from class: X.19tq
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void moveView(int i, int i2) {
        super.moveView(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        super.onAdapterChanged(abstractC21673619ry, abstractC21673619ry2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
        Iterator<AbstractC21686119tz> it2 = ((C21687219uA) this.LLJJI).LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(this);
        }
        this.LLILZIL = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        LJJIFFI(c21673319rv, c21673919s1);
        try {
            try {
                LJIJI(c21673319rv, c21673919s1);
                LJJI(Integer.MAX_VALUE, c21673319rv, c21673919s1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJJI(Integer.MAX_VALUE, c21673319rv, c21673919s1);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void scrollToPositionWithOffset(int i, int i2) {
        this.LLJILJIL = i;
        this.LLJILJILJ = i2;
        Bundle bundle = this.LLJJ;
        if (bundle != null) {
            bundle.putInt("AnchorPosition", -1);
        }
        requestLayout();
    }

    public final void updateLayoutStateToFillEndExpose(int i, int i2) {
        int i3;
        this.LLILZ.LIZLLL = this.LLILLJJLI.LJI() - i2;
        C21686419u2 c21686419u2 = this.LLILZ;
        if (this.LLJIJIL) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c21686419u2.LJFF = i3;
        c21686419u2.LJ = i;
        c21686419u2.LJI = 1;
        c21686419u2.LIZJ = i2;
        c21686419u2.LJII = Integer.MIN_VALUE;
    }

    public final void updateLayoutStateToFillStartExpose(int i, int i2) {
        int i3;
        this.LLILZ.LIZLLL = i2 - this.LLILLJJLI.LJIIIIZZ();
        C21686419u2 c21686419u2 = this.LLILZ;
        c21686419u2.LJ = i;
        if (this.LLJIJIL) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c21686419u2.LJFF = i3;
        c21686419u2.LJI = -1;
        c21686419u2.LIZJ = i2;
        c21686419u2.LJII = Integer.MIN_VALUE;
    }

    public final int LJIILJJIL(View view, boolean z, boolean z2) {
        AbstractC21686119tz abstractC21686119tzLIZ;
        int position = getPosition(view);
        if (position != -1 && (abstractC21686119tzLIZ = this.LLJJI.LIZ(position)) != null) {
            return abstractC21686119tzLIZ.LIZJ(position - ((Integer) abstractC21686119tzLIZ.LIZ.LIZ).intValue(), z, z2, this);
        }
        return 0;
    }

    public final int LJIJJ(View view, boolean z, boolean z2) {
        if (view != null) {
            return LJIILJJIL(view, z, z2);
        }
        return 0;
    }

    public final int LJIJJLI(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        this.LLILZ.LIZIZ = true;
        ensureLayoutStateExpose();
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        updateLayoutStateExpose(i2, iAbs, true, c21673919s1);
        C21686419u2 c21686419u2 = this.LLILZ;
        int i3 = c21686419u2.LJII;
        c21686419u2.getClass();
        int iLJIILL = i3 + LJIILL(c21673319rv, this.LLILZ, c21673919s1, false);
        if (iLJIILL < 0) {
            return 0;
        }
        if (iAbs > iLJIILL) {
            i = i2 * iLJIILL;
        }
        this.LLILLJJLI.LJIIJ(-i);
        return i;
    }

    public final void LJJI(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i2 = this.LLJJJJ - 1;
        this.LLJJJJ = i2;
        if (i2 <= 0) {
            this.LLJJJJ = 0;
            int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
            Iterator<AbstractC21686119tz> it2 = ((C21687219uA) this.LLJJI).LIZIZ.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().LJFF(c21673319rv, c21673919s1, iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, i, this);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public final int LJJIII(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        if ((View.MeasureSpec.getSize(i) - i2) - i3 < 0) {
            return View.MeasureSpec.makeMeasureSpec(0, mode);
        }
        return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
    }

    public final View findReferenceChildInternal(int i, int i2, int i3) {
        int i4;
        int position;
        ensureLayoutStateExpose();
        int iLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ();
        int iLJI = this.LLILLJJLI.LJI();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.LLILLJJLI.LJ(childAt) < iLJI && this.LLILLJJLI.LIZIZ(childAt) >= iLJIIIIZZ) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChild(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.LLJJJIL);
        Rect rect = this.LLJJJIL;
        int iLJJIII = LJJIII(i, rect.left, rect.right);
        Rect rect2 = this.LLJJJIL;
        view.measure(iLJJIII, LJJIII(i2, rect2.top, rect2.bottom));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.LLJJJIL);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (getOrientation() == 1) {
            int i3 = marginLayoutParams.leftMargin;
            Rect rect = this.LLJJJIL;
            i = LJJIII(i, i3 + rect.left, marginLayoutParams.rightMargin + rect.right);
        }
        if (getOrientation() == 0) {
            Rect rect2 = this.LLJJJIL;
            i2 = LJJIII(i2, rect2.top, rect2.bottom);
        }
        view.measure(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        C21685719tv c21685719tv;
        WeakReference<PowerLayoutManager> weakReference;
        int i3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemsAdded. pos:");
        sbLIZ.append(i);
        sbLIZ.append(" count:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        onItemsChanged(recyclerView);
        for (AbstractC21686119tz abstractC21686119tz : ((C21687219uA) this.LLJJI).LIZIZ) {
            if ((abstractC21686119tz instanceof C21685719tv) && (weakReference = (c21685719tv = (C21685719tv) abstractC21686119tz).LJJ) != null && weakReference.get() != null) {
                boolean reverseLayout = c21685719tv.LJJ.get().getReverseLayout();
                int iFindFirstVisibleItemPosition = c21685719tv.LJJ.get().findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = c21685719tv.LJJ.get().findLastVisibleItemPosition();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handleItemAdded. positionStart:");
                sbLIZ2.append(i);
                sbLIZ2.append(" itemCount:");
                sbLIZ2.append(i2);
                sbLIZ2.append(" reverse:");
                sbLIZ2.append(reverseLayout);
                sbLIZ2.append(" firstPos:");
                sbLIZ2.append(iFindFirstVisibleItemPosition);
                sbLIZ2.append(" lastPos:");
                sbLIZ2.append(iFindLastVisibleItemPosition);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (reverseLayout) {
                    i3 = iFindLastVisibleItemPosition;
                } else {
                    i3 = iFindFirstVisibleItemPosition;
                }
                int i4 = i + i2;
                int[] iArr = c21685719tv.LJIJJLI.LIZ;
                if (iArr != null && i < iArr.length) {
                    Arrays.fill(iArr, i, iArr.length, Integer.MIN_VALUE);
                }
                C21686819u6 c21686819u6 = c21685719tv.LJIJJLI;
                int[] iArr2 = c21686819u6.LIZ;
                if (iArr2 != null && i < iArr2.length) {
                    c21686819u6.LIZ(i4);
                    int[] iArr3 = c21686819u6.LIZ;
                    System.arraycopy(iArr3, i, iArr3, i4, (iArr3.length - i) - i2);
                    Arrays.fill(c21686819u6.LIZ, i, i4, Integer.MIN_VALUE);
                }
                if (i4 > i3) {
                    if (!reverseLayout) {
                        iFindFirstVisibleItemPosition = iFindLastVisibleItemPosition;
                    }
                    if (i <= iFindFirstVisibleItemPosition) {
                        HandlerHook.viewPost(recyclerView, new ARunnableS107S0100000_7(recyclerView, 2));
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemsUpdated. pos:");
        sbLIZ.append(i);
        sbLIZ.append(" count:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        onItemsChanged(recyclerView);
    }

    public final void recycleChildren(C21673319rv c21673319rv, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            View childAt = getChildAt(i2 - 1);
            View childAt2 = getChildAt(i);
            if (childAt != null && childAt2 != null) {
                getPosition(childAt2);
                getPosition(childAt);
                for (int i3 = i; i3 < i2; i3++) {
                    View childAt3 = getChildAt(i);
                    if (childAt3 != null) {
                        int position = getPosition(childAt3);
                        if (position != -1) {
                            AbstractC21686119tz abstractC21686119tzLIZ = this.LLJJI.LIZ(position);
                            if (abstractC21686119tzLIZ != null) {
                                abstractC21686119tzLIZ.LIZLLL(position, this, true);
                            }
                            removeAndRecycleViewAt(i, c21673319rv);
                        } else {
                            removeAndRecycleViewAt(i, c21673319rv);
                        }
                    }
                }
                return;
            }
            return;
        }
        View childAt4 = getChildAt(i);
        View childAt5 = getChildAt(i2 + 1);
        if (childAt4 != null && childAt5 != null) {
            getPosition(childAt5);
            getPosition(childAt4);
            while (i > i2) {
                View childAt6 = getChildAt(i);
                if (childAt6 != null) {
                    int position2 = getPosition(childAt6);
                    if (position2 != -1) {
                        AbstractC21686119tz abstractC21686119tzLIZ2 = this.LLJJI.LIZ(position2);
                        if (abstractC21686119tzLIZ2 != null) {
                            abstractC21686119tzLIZ2.LIZLLL(position2, this, false);
                        }
                        removeAndRecycleViewAt(i, c21673319rv);
                    } else {
                        removeAndRecycleViewAt(i, c21673319rv);
                    }
                }
                i--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (getOrientation() == 1) {
            return 0;
        }
        return scrollInternalBy(i, c21673319rv, c21673919s1);
    }

    public final int scrollInternalBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        LJJIFFI(c21673319rv, c21673919s1);
        int iLJIJJLI = 0;
        try {
            try {
                iLJIJJLI = LJIJJLI(i, c21673319rv, c21673919s1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LJJI(iLJIJJLI, c21673319rv, c21673919s1);
            return iLJIJJLI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJJI(iLJIJJLI, c21673319rv, c21673919s1);
            throw th;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (getOrientation() == 0) {
            return 0;
        }
        return scrollInternalBy(i, c21673319rv, c21673919s1);
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int LJIILL(C21673319rv c21673319rv, C21686419u2 c21686419u2, C21673919s1 c21673919s1, boolean z) {
        AbstractC21686119tz abstractC21686119tzLIZ;
        int i;
        boolean z2;
        boolean z3;
        int i2 = c21686419u2.LIZLLL;
        int i3 = c21686419u2.LJII;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c21686419u2.LJII = i3 + i2;
            }
            LJIL(c21673319rv, c21686419u2);
        }
        int i4 = c21686419u2.LIZLLL + c21686419u2.LJIIIIZZ;
        ?? r2 = 0;
        while (i4 > 0) {
            int i5 = c21686419u2.LJ;
            if (i5 >= 0 && i5 < c21673919s1.LIZIZ()) {
                C21687819uG c21687819uG = this.LLJJL;
                c21687819uG.LIZ = r2;
                c21687819uG.LIZIZ = r2;
                c21687819uG.LIZJ = r2;
                c21687819uG.LIZLLL = r2;
                int i6 = c21686419u2.LJ;
                this.LLJJJJJIL.LIZ = c21686419u2;
                AbstractC21687419uC abstractC21687419uC = this.LLJJI;
                if (abstractC21687419uC == null || (abstractC21686119tzLIZ = abstractC21687419uC.LIZ(i6)) == null) {
                    abstractC21686119tzLIZ = this.LL;
                }
                abstractC21686119tzLIZ.LJIILIIL(c21673319rv, c21673919s1, this.LLJJJJJIL, c21687819uG, this);
                this.LLJJJJJIL.LIZ = null;
                int i7 = c21686419u2.LJ;
                if (i7 == i6) {
                    c21687819uG.LIZIZ = true;
                } else {
                    int i8 = i7 - c21686419u2.LJFF;
                    if (c21687819uG.LIZJ) {
                        i = 0;
                    } else {
                        i = c21687819uG.LIZ;
                    }
                    C136N c136n = new C136N(Integer.valueOf(Math.min(i6, i8)), Integer.valueOf(Math.max(i6, i8)));
                    int size = ((ArrayList) this.LLJJJJLIIL).size();
                    if (size != 0) {
                        int i9 = size - 1;
                        int i10 = 0;
                        while (i10 <= i9) {
                            int i11 = (i10 + i9) / 2;
                            C136N c136n2 = (C136N) ((Pair) ListProtector.get(this.LLJJJJLIIL, i11)).first;
                            if (c136n2 == null) {
                                break;
                            }
                            if (!c136n2.LIZ(c136n.LIZ) && !c136n2.LIZ(c136n.LIZIZ)) {
                                if (c136n2.LIZ.compareTo(c136n.LIZ) >= 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (c136n2.LIZIZ.compareTo(c136n.LIZIZ) <= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z2 || !z3) {
                                    if (((Integer) c136n2.LIZ).intValue() > ((Integer) c136n.LIZIZ).intValue()) {
                                        i9 = i11 - 1;
                                    } else if (((Integer) c136n2.LIZIZ).intValue() < ((Integer) c136n.LIZ).intValue()) {
                                        i10 = i11 + 1;
                                    }
                                }
                            }
                            if (i11 < 0) {
                                break;
                            }
                            Pair pair = (Pair) ListProtector.get(this.LLJJJJLIIL, i11);
                            if (pair == null || !((C136N) pair.first).equals(c136n) || ((Integer) pair.second).intValue() != i) {
                                ListProtector.remove(this.LLJJJJLIIL, i11);
                            }
                        }
                        ((ArrayList) this.LLJJJJLIIL).add(Pair.create(c136n, Integer.valueOf(i)));
                        Collections.sort(this.LLJJJJLIIL, this.LLJJLIIIJLLLLLLLZ);
                    } else {
                        ((ArrayList) this.LLJJJJLIIL).add(Pair.create(c136n, Integer.valueOf(i)));
                        Collections.sort(this.LLJJJJLIIL, this.LLJJLIIIJLLLLLLLZ);
                    }
                }
                C21687819uG c21687819uG2 = this.LLJJL;
                if (!c21687819uG2.LIZIZ) {
                    int i12 = c21686419u2.LIZJ;
                    int i13 = c21687819uG2.LIZ;
                    c21686419u2.LIZJ = i12 + (c21686419u2.LJI * i13);
                    if (!c21687819uG2.LIZJ || this.LLILZ.LJIIJ != null || !c21673919s1.LJI) {
                        c21686419u2.LIZLLL -= i13;
                        i4 -= i13;
                    }
                    int i14 = c21686419u2.LJII;
                    if (i14 != Integer.MIN_VALUE) {
                        int i15 = i14 + i13;
                        c21686419u2.LJII = i15;
                        int i16 = c21686419u2.LIZLLL;
                        if (i16 < 0) {
                            c21686419u2.LJII = i15 + i16;
                        }
                        LJIL(c21673319rv, c21686419u2);
                    }
                    if (z && this.LLJJL.LIZLLL) {
                        break;
                    }
                    r2 = 0;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c21686419u2.LIZLLL;
    }

    public final int fixLayoutEndGapExpose(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJI;
        int iLJI2 = this.LLILLJJLI.LJI() - i;
        if (iLJI2 > 0) {
            int i2 = -scrollInternalBy(-iLJI2, c21673319rv, c21673919s1);
            int i3 = i + i2;
            if (z && (iLJI = this.LLILLJJLI.LJI() - i3) > 0) {
                this.LLILLJJLI.LJIIJ(iLJI);
                return iLJI + i2;
            }
            return i2;
        }
        return 0;
    }

    public final int fixLayoutStartGapExpose(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJIIIIZZ;
        int iLJIIIIZZ2 = i - this.LLILLJJLI.LJIIIIZZ();
        if (iLJIIIIZZ2 > 0) {
            int i2 = -scrollInternalBy(iLJIIIIZZ2, c21673319rv, c21673919s1);
            int i3 = i + i2;
            if (z && (iLJIIIIZZ = i3 - this.LLILLJJLI.LJIIIIZZ()) > 0) {
                this.LLILLJJLI.LJIIJ(-iLJIIIIZZ);
                return i2 - iLJIIIIZZ;
            }
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
    
        if (r1 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r1 == 1) goto L36;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r10, int r11, X.C21673319rv r12, X.C21673919s1 r13) {
        /*
            r9 = this;
            r9.LJJ()
            int r0 = r9.getChildCount()
            r8 = 0
            if (r0 != 0) goto Lb
            return r8
        Lb:
            int r1 = r9.getOrientation()
            r5 = -1
            r4 = 1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r4) goto L70
            r0 = 2
            if (r11 == r0) goto L2a
            r0 = 17
            if (r11 == r0) goto L6b
            r0 = 33
            if (r11 == r0) goto L6e
            r0 = 66
            if (r11 == r0) goto L68
            r0 = 130(0x82, float:1.82E-43)
            if (r11 != r0) goto La2
            if (r1 != r4) goto La2
        L2a:
            r6 = 1
        L2b:
            r2 = 0
            if (r6 != r5) goto L4c
            boolean r0 = r9.LLJIJIL
            int r1 = r13.LIZIZ()
            if (r0 == 0) goto L43
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r7 = r9.findReferenceChildInternal(r0, r5, r1)
        L40:
            if (r7 != 0) goto L72
            return r8
        L43:
            int r0 = r9.getChildCount()
            android.view.View r7 = r9.findReferenceChildInternal(r2, r0, r1)
            goto L40
        L4c:
            boolean r0 = r9.LLJIJIL
            int r1 = r13.LIZIZ()
            if (r0 == 0) goto L5d
            int r0 = r9.getChildCount()
            android.view.View r7 = r9.findReferenceChildInternal(r2, r0, r1)
            goto L40
        L5d:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r7 = r9.findReferenceChildInternal(r0, r5, r1)
            goto L40
        L68:
            if (r1 != 0) goto La2
            goto L2a
        L6b:
            if (r1 != 0) goto La2
            goto L70
        L6e:
            if (r1 != r4) goto La2
        L70:
            r6 = -1
            goto L2b
        L72:
            r9.ensureLayoutStateExpose()
            X.19u3 r0 = r9.LLILLJJLI
            int r0 = r0.LJIIIZ()
            float r1 = (float) r0
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
            float r1 = r1 * r0
            int r0 = (int) r1
            r9.updateLayoutStateExpose(r6, r0, r2, r13)
            X.19u2 r0 = r9.LLILZ
            r0.LJII = r3
            r0.LIZIZ = r2
            r9.LJIILL(r12, r0, r13, r4)
            if (r6 != r5) goto L9c
            android.view.View r1 = r9.getChildClosestToStartExpose()
        L93:
            if (r1 == r7) goto La1
            boolean r0 = r1.isFocusable()
            if (r0 == 0) goto La1
            return r1
        L9c:
            android.view.View r1 = r9.getChildClosestToEndExpose()
            goto L93
        La1:
            return r8
        La2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.powerlist.layout.core.PowerLayoutManager.onFocusSearchFailed(android.view.View, int, X.19rv, X.19s1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
        super.onMeasure(c21673319rv, c21673919s1, i, i2);
    }

    public final void updateLayoutStateExpose(int i, int i2, boolean z, C21673919s1 c21673919s1) {
        int iLJIIIIZZ;
        this.LLILZ.LJIIIIZZ = getExtraLayoutSpace(c21673919s1);
        C21686419u2 c21686419u2 = this.LLILZ;
        c21686419u2.LJI = i;
        int i3 = -1;
        if (i == 1) {
            c21686419u2.LJIIIIZZ += this.LLILLJJLI.LJII();
            View childClosestToEndExpose = getChildClosestToEndExpose();
            C21686419u2 c21686419u22 = this.LLILZ;
            if (!this.LLJIJIL) {
                i3 = 1;
            }
            c21686419u22.LJFF = i3;
            int position = getPosition(childClosestToEndExpose);
            C21686419u2 c21686419u23 = this.LLILZ;
            c21686419u22.LJ = position + c21686419u23.LJFF;
            c21686419u23.LIZJ = this.LLILLJJLI.LIZIZ(childClosestToEndExpose) + LJIILJJIL(childClosestToEndExpose, true, false);
            iLJIIIIZZ = this.LLILZ.LIZJ - this.LLILLJJLI.LJI();
        } else {
            View childClosestToStartExpose = getChildClosestToStartExpose();
            this.LLILZ.LJIIIIZZ += this.LLILLJJLI.LJIIIIZZ();
            C21686419u2 c21686419u24 = this.LLILZ;
            if (this.LLJIJIL) {
                i3 = 1;
            }
            c21686419u24.LJFF = i3;
            int position2 = getPosition(childClosestToStartExpose);
            C21686419u2 c21686419u25 = this.LLILZ;
            c21686419u24.LJ = position2 + c21686419u25.LJFF;
            c21686419u25.LIZJ = this.LLILLJJLI.LJ(childClosestToStartExpose) + LJIILJJIL(childClosestToStartExpose, false, false);
            iLJIIIIZZ = (-this.LLILZ.LIZJ) + this.LLILLJJLI.LJIIIIZZ();
        }
        C21686419u2 c21686419u26 = this.LLILZ;
        c21686419u26.LIZLLL = i2;
        if (z) {
            c21686419u26.LIZLLL = i2 - iLJIIIIZZ;
        }
        c21686419u26.LJII = iLJIIIIZZ;
    }
}
