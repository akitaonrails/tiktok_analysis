package com.bytedance.sdui.components.list;

import X.AbstractC1317090kNX;
import X.C1317360kNy;
import X.C21673319rv;
import X.C21673919s1;
import X.C21681819tI;
import X.C21681919tJ;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import t76.j;

/* JADX INFO: loaded from: classes21.dex */
public final class ListLayoutManager {

    public static class ListGridLayoutManager extends GridLayoutManager implements a {
        public final com.bytedance.sdui.components.list.a LLJ;
        public final int LLJI;
        public float LLJIJIL;
        public float LLJILJIL;

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollHorizontally() {
            if (this.LLJ.LLLLZLLLI) {
                return super.canScrollHorizontally();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollVertically() {
            if (this.LLJ.LLLLZLLLI) {
                return super.canScrollVertically();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutCompleted(C21673919s1 c21673919s1) {
            super.onLayoutCompleted(c21673919s1);
            this.LLJ.LJZI();
        }

        public ListGridLayoutManager(AbstractC1317090kNX abstractC1317090kNX, int i, com.bytedance.sdui.components.list.a aVar) {
            super(abstractC1317090kNX, i);
            this.LLJI = 0;
            this.LLJ = aVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollHorizontallyBy = super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
            this.LLJILJIL = fScrollHorizontallyBy;
            this.LLJ.LLLLZLLIL.LJJIJIIJIL(i, (int) fScrollHorizontallyBy);
            return (int) this.LLJILJIL;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollVerticallyBy = super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
            this.LLJIJIL = fScrollVerticallyBy;
            this.LLJ.LLLLZLLIL.LJJIJIIJIL(i, (int) fScrollVerticallyBy);
            return (int) this.LLJIJIL;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            if (1 == getOrientation()) {
                int i5 = ((C21681919tJ) view.getLayoutParams()).LLILLJJLI;
                int i6 = this.LLILLJJLI;
                if (i5 != i6) {
                    com.bytedance.sdui.components.list.a aVar = this.LLJ;
                    int i7 = this.LLJI;
                    if (i7 > 0) {
                        int i8 = aVar.LLJJJIL;
                        int i9 = aVar.LLJJJJJIL;
                        int i10 = ((i8 - i9) - aVar.LLJJJJLIIL) / i6;
                        if (i10 == 0) {
                            int i11 = C1317360kNy.LIZ;
                        } else {
                            i = ((i7 + (i3 - i)) * ((i - i9) / i10)) + i9;
                        }
                    }
                    super.layoutDecoratedWithMargins(view, i, i2, i + view.getMeasuredWidth(), i4);
                    return;
                }
                ListLayoutManager.LIZ(this, view, i2, i4);
                return;
            }
            super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        }
    }

    public static class ListLinearLayoutManager extends LinearLayoutManager implements a {
        public final com.bytedance.sdui.components.list.a LL;
        public float LLILLJJLI;
        public float LLILLL;

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollHorizontally() {
            if (this.LL.LLLLZLLLI) {
                return super.canScrollHorizontally();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollVertically() {
            if (this.LL.LLLLZLLLI) {
                return super.canScrollVertically();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutCompleted(C21673919s1 c21673919s1) {
            super.onLayoutCompleted(c21673919s1);
            this.LL.LJZI();
        }

        public ListLinearLayoutManager(AbstractC1317090kNX abstractC1317090kNX, com.bytedance.sdui.components.list.a aVar) {
            super(abstractC1317090kNX);
            this.LL = aVar;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollHorizontallyBy = super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
            this.LLILLL = fScrollHorizontallyBy;
            this.LL.LLLLZLLIL.LJJIJIIJIL(i, (int) fScrollHorizontallyBy);
            return (int) this.LLILLL;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            float fScrollVerticallyBy = super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
            this.LLILLJJLI = fScrollVerticallyBy;
            this.LL.LLLLZLLIL.LJJIJIIJIL(i, (int) fScrollVerticallyBy);
            return (int) this.LLILLJJLI;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            if (1 == getOrientation()) {
                int viewAdapterPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
                j jVar = this.LL.LLLLZI;
                if (jVar != null && !jVar.LLLI(viewAdapterPosition)) {
                    super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
                    return;
                } else {
                    ListLayoutManager.LIZ(this, view, i2, i4);
                    return;
                }
            }
            super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        }
    }

    public interface a {
    }

    public static class b extends StaggeredGridLayoutManager implements a {
        public final com.bytedance.sdui.components.list.a LLJJJJLIIL;
        public final int LLJJL;

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean supportsPredictiveItemAnimations() {
            return false;
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollHorizontally() {
            if (this.LLJJJJLIIL.LLLLZLLLI) {
                return super.canScrollHorizontally();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean canScrollVertically() {
            if (this.LLJJJJLIIL.LLLLZLLLI) {
                return super.canScrollVertically();
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onLayoutCompleted(C21673919s1 c21673919s1) {
            super.onLayoutCompleted(c21673919s1);
            this.LLJJJJLIIL.LJZI();
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void onScrollStateChanged(int i) {
            try {
                super.onScrollStateChanged(i);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                e.getMessage();
                int i2 = C1317360kNy.LIZ;
            }
        }

        public b(int i, com.bytedance.sdui.components.list.a aVar) {
            super(i, 1);
            this.LLJJL = 0;
            this.LLJJJJLIIL = aVar;
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            try {
                int iScrollBy = scrollBy(i, c21673319rv, c21673919s1);
                this.LLJJJJLIIL.LLLLZLLIL.LJJIJIIJIL(i, iScrollBy);
                return iScrollBy;
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }

        @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            try {
                int iScrollBy = scrollBy(i, c21673319rv, c21673919s1);
                this.LLJJJJLIIL.LLLLZLLIL.LJJIJIIJIL(i, iScrollBy);
                return iScrollBy;
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            C21681819tI c21681819tI = (C21681819tI) view.getLayoutParams();
            if (1 == this.LLILZIL) {
                if (!c21681819tI.LLILLJJLI) {
                    com.bytedance.sdui.components.list.a aVar = this.LLJJJJLIIL;
                    int i5 = this.LL;
                    int i6 = this.LLJJL;
                    if (i6 > 0) {
                        int i7 = aVar.LLJJJIL;
                        int i8 = aVar.LLJJJJJIL;
                        int i9 = ((i7 - i8) - aVar.LLJJJJLIIL) / i5;
                        if (i9 == 0) {
                            int i10 = C1317360kNy.LIZ;
                        } else {
                            i = ((i6 + (i3 - i)) * ((i - i8) / i9)) + i8;
                        }
                    }
                    super.layoutDecoratedWithMargins(view, i, i2, i + view.getMeasuredWidth(), i4);
                    return;
                }
                ListLayoutManager.LIZ(this, view, i2, i4);
                return;
            }
            super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
        }
    }

    public static void LIZ(RecyclerView.LayoutManager layoutManager, View view, int i, int i2) {
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
        view.layout(paddingLeft, i, view.getMeasuredWidth() + paddingLeft, i2);
    }
}
