package com.ss.android.ugc.gamora.editor.recommendeffect;

import X.AbstractC1585810rMx;
import X.C13LZ;
import X.C1415300mvw;
import X.C1415390mw5;
import X.C1415420mw8;
import X.C15438062q;
import X.C20635915oz;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674219s4;
import X.C21679619sw;
import X.C531650Kt9;
import X.InterfaceC20634915op;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendEffectLayoutManager extends RecyclerView.LayoutManager implements InterfaceC20634915op {
    public int LL;
    public View LLILZIL;
    public RecyclerView LLILZLL;
    public C1415420mw8 LLIZ;
    public C1415390mw5 LLIZLLLIL;
    public C21679619sw LLJ;
    public float LLJI;
    public int LLJIJIL;
    public C21674219s4 LLJILJIL;
    public int LLILLJJLI = -1;
    public final C20635915oz LLILLL = new C20635915oz();
    public final C1415300mvw LLILZ = new AbstractC1585810rMx() { // from class: X.0mvw
        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            View viewLJFF;
            Integer numValueOf;
            this.LL.getClass();
            if (i == 0 && (viewLJFF = this.LL.LLILLL.LJFF(recyclerView.getLayoutManager())) != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                String str = null;
                if (layoutManager != null) {
                    numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                } else {
                    numValueOf = null;
                }
                int i2 = this.LL.LLILLJJLI;
                if (numValueOf == null || numValueOf.intValue() != i2) {
                    this.LL.LLILZIL = viewLJFF;
                    viewLJFF.setSelected(true);
                    if (numValueOf != null) {
                        this.LL.LLILLJJLI = numValueOf.intValue();
                    }
                }
                C1415390mw5 c1415390mw5 = this.LL.LLIZLLLIL;
                if (c1415390mw5 != null) {
                    RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(viewLJFF);
                    int i3 = this.LL.LLILLJJLI;
                    RecommendEffectItem recommendEffectItem = ((C1419150n29) childViewHolder).LL;
                    Integer num = c1415390mw5.LIZ.LLLLILI().LIZ.LIZIZ;
                    if (num != null && i3 == num.intValue()) {
                        if (recommendEffectItem != null) {
                            str = recommendEffectItem.id;
                        }
                        if (Intrinsics.LJFF(str, c1415390mw5.LIZ.LLLLIL().LJIIJ.invoke())) {
                            c1415390mw5.LIZ.LLLLIL().LJII.invoke(Boolean.FALSE, 10000L);
                            return;
                        }
                    }
                    C1415280mvu c1415280mvu = c1415390mw5.LIZ;
                    c1415280mvu.LLLLLL(recommendEffectItem, i3, c1415280mvu.LLJZ);
                }
            }
        }
    };
    public Function0<Integer> LLJILJILJ = AFwS210S0000000_22.get$arr$(229);

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        View viewLJI;
        if (getItemCount() <= 0) {
            return;
        }
        if (c21673919s1 != null && c21673919s1.LJI) {
            return;
        }
        if (c21673319rv != null) {
            detachAndScrapAttachedViews(c21673319rv);
        }
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(this.LLJILJILJ.invoke().intValue(), this.LLJILJILJ.invoke().intValue() + 5);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            int iNextInt = it2.nextInt() - 2;
            if (iNextInt < 0) {
                iNextInt += getItemCount();
            }
            arrayList.add(Integer.valueOf(iNextInt % getItemCount()));
        }
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            int iIntValue = ((Number) it3.next()).intValue();
            if (c21673319rv != null && (viewLJI = c21673319rv.LJI(iIntValue)) != null) {
                addView(viewLJI);
                measureChildWithMargins(viewLJI, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI);
                int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI);
                this.LLJIJIL = decoratedMeasuredWidth;
                int i2 = i + decoratedMeasuredWidth;
                layoutDecorated(viewLJI, i, 0, i2, decoratedMeasuredHeight);
                if (i2 >= getWidth()) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        C21679619sw c21679619sw = this.LLJ;
        if (c21679619sw == null) {
            c21679619sw = new C21679619sw(this);
            this.LLJ = c21679619sw;
        }
        this.LLJI = (c21679619sw.LJI() - c21679619sw.LJIIJ()) / 2.0f;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                int i4 = this.LLJIJIL / 2;
                C21679619sw c21679619sw2 = this.LLJ;
                if (c21679619sw2 == null) {
                    c21679619sw2 = new C21679619sw(this);
                    this.LLJ = c21679619sw2;
                }
                float fLJ = ((i4 + c21679619sw2.LJ(childAt)) - this.LLJI) / this.LLJIJIL;
                C1415420mw8 c1415420mw8 = this.LLIZ;
                if (c1415420mw8 != null) {
                    c1415420mw8.LIZ(this, childAt, fLJ);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int scrollHorizontallyBy(int r14, X.C21673319rv r15, X.C21673919s1 r16) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectLayoutManager.scrollHorizontallyBy(int, X.19rv, X.19s1):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C21674219s4(recyclerView.getContext());
        }
        C21674219s4 c21674219s4 = this.LLJILJIL;
        if (c21674219s4 != null) {
            c21674219s4.LJIILLIIL = ((Number) c21674219s4.LJIILL.getValue()).floatValue() / 0.1f;
        }
        if (i >= 0) {
            C21674219s4 c21674219s42 = this.LLJILJIL;
            if (c21674219s42 != null) {
                c21674219s42.LIZ = i;
            }
            startSmoothScroll(c21674219s42);
        }
    }
}
