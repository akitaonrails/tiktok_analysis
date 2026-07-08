package com.lynx.tasm.behavior.ui.list;

import X.C1319030kQf;
import X.C21673319rv;
import X.C21673919s1;
import X.C21681919tJ;
import X.InterfaceC1319200kQw;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.base.log.LynxLog;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class ListLayoutManager {

    public static class ListGridLayoutManager extends GridLayoutManager implements InterfaceC1319200kQw {
        public final UIList LLJ;
        public int LLJI;
        public float LLJIJIL;
        public float LLJILJIL;

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollHorizontally() {
            if (this.LLJ.LLJJ) {
                return super.canScrollHorizontally();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollVertically() {
            if (this.LLJ.LLJJ) {
                return super.canScrollVertically();
            }
            return false;
        }

        @Override // X.InterfaceC1319200kQw
        public final float LIZIZ() {
            return this.LLJILJIL;
        }

        @Override // X.InterfaceC1319200kQw
        public final float LJ() {
            return this.LLJIJIL;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutCompleted(C21673919s1 c21673919s1) {
            super.onLayoutCompleted(c21673919s1);
            this.LLJ.LJJJJJ();
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollHorizontallyBy = super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
            this.LLJILJIL = fScrollHorizontallyBy;
            this.LLJ.LLJ.LJJJ(i, (int) fScrollHorizontallyBy);
            return (int) this.LLJILJIL;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollVerticallyBy = super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
            this.LLJIJIL = fScrollVerticallyBy;
            this.LLJ.LLJ.LJJJ(i, (int) fScrollVerticallyBy);
            return (int) this.LLJIJIL;
        }

        public ListGridLayoutManager(s sVar, int i, int i2, UIList uIList) {
            super(sVar, i);
            this.LLJI = i2;
            this.LLJ = uIList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            if (1 == getOrientation()) {
                int i5 = ((C21681919tJ) view.getLayoutParams()).LLILLJJLI;
                int i6 = this.LLILLJJLI;
                if (i5 != i6) {
                    UIList uIList = this.LLJ;
                    if (!uIList.LLLIIIIL) {
                        i = ListLayoutManager.LIZ(uIList, i6, this.LLJI, i, i3);
                        i3 = view.getMeasuredWidth() + i;
                    }
                    super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
                    return;
                }
                ListLayoutManager.LIZIZ(this, view, i2, i4, this.LLJ.LLLIIIIL);
                return;
            }
            super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        }
    }

    public static class ListLinearLayoutManager extends LinearLayoutManager implements InterfaceC1319200kQw {
        public final UIList LL;
        public float LLILLJJLI;
        public float LLILLL;

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollHorizontally() {
            if (this.LL.LLJJ) {
                return super.canScrollHorizontally();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollVertically() {
            if (this.LL.LLJJ) {
                return super.canScrollVertically();
            }
            return false;
        }

        @Override // X.InterfaceC1319200kQw
        public final float LIZIZ() {
            return this.LLILLL;
        }

        @Override // X.InterfaceC1319200kQw
        public final float LJ() {
            return this.LLILLJJLI;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutCompleted(C21673919s1 c21673919s1) {
            super.onLayoutCompleted(c21673919s1);
            this.LL.LJJJJJ();
        }

        public ListLinearLayoutManager(s sVar, UIList uIList) {
            super(sVar);
            this.LL = uIList;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollHorizontallyBy = super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
            this.LLILLL = fScrollHorizontallyBy;
            this.LL.LLJ.LJJJ(i, (int) fScrollHorizontallyBy);
            return (int) this.LLILLL;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollVerticallyBy = super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
            this.LLILLJJLI = fScrollVerticallyBy;
            this.LL.LLJ.LJJJ(i, (int) fScrollVerticallyBy);
            return (int) this.LLILLJJLI;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            if (1 == getOrientation()) {
                int viewAdapterPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
                C1319030kQf c1319030kQf = this.LL.LLILLL;
                if (c1319030kQf != null && !c1319030kQf.LLLILZLLLI(viewAdapterPosition)) {
                    super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
                    return;
                } else {
                    ListLayoutManager.LIZIZ(this, view, i2, i4, this.LL.LLLIIIIL);
                    return;
                }
            }
            super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        }
    }

    public static int LIZ(UIList uIList, int i, int i2, int i3, int i4) {
        T t;
        if (i2 > 0 && uIList != null && (t = uIList.mView) != 0) {
            int paddingLeft = t.getPaddingLeft();
            int width = ((t.getWidth() - paddingLeft) - t.getPaddingRight()) / i;
            if (width == 0) {
                LynxLog.i("ListLayoutManager", "the width of list maybe 0 ");
                return i3;
            }
            return ((i2 + (i4 - i3)) * ((i3 - paddingLeft) / width)) + paddingLeft;
        }
        return i3;
    }

    public static void LIZIZ(RecyclerView.LayoutManager layoutManager, View view, int i, int i2, boolean z) {
        int width = layoutManager.getWidth();
        int measuredWidth = view.getMeasuredWidth();
        int paddingLeft = layoutManager.getPaddingLeft();
        int paddingRight = layoutManager.getPaddingRight();
        int i3 = width - measuredWidth;
        if (i3 <= 0) {
            paddingLeft = 0;
        } else {
            int i4 = paddingRight + paddingLeft;
            int i5 = i3 - i4;
            if (i5 < 0) {
                paddingLeft += (int) (((double) i5) * (((double) paddingLeft) / ((double) i4)));
            }
        }
        int measuredWidth2 = paddingLeft + view.getMeasuredWidth();
        if (z) {
            layoutManager.layoutDecorated(view, paddingLeft, i, measuredWidth2, i2);
        } else {
            view.layout(paddingLeft, i, measuredWidth2, i2);
        }
    }
}
