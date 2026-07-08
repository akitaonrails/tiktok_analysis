package com.ss.android.ugc.aweme.shortvideo.duet.layout;

import X.AbstractC1585810rMx;
import X.C1657170tE3;
import X.C1657300tEG;
import X.C20635915oz;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import X.C21679319st;
import X.C21679619sw;
import X.C444960Hcc;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.duet.layout.CenterLinearLayoutManager;

/* JADX INFO: loaded from: classes34.dex */
public final class CenterLinearLayoutManager extends LinearLayoutManager {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final C20635915oz LLILZ;
    public final C1657300tEG LLILZIL;
    public View LLILZLL;
    public RecyclerView LLIZ;
    public C1657170tE3 LLIZLLLIL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    public final void LJIILIIL() {
        int i = this.LLILLL;
        if (i != -1) {
            this.LLILLJJLI = i;
        }
        int iMin = Math.min(Math.max(0, this.LLILLJJLI), getItemCount() - 1);
        this.LLILLJJLI = iMin;
        this.LL = iMin;
        this.LLILLL = -1;
        View view = this.LLILZLL;
        if (view != null) {
            view.setSelected(false);
            this.LLILZLL = null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    public final int LJIIL() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tEG] */
    public CenterLinearLayoutManager(Context context) {
        super(context, 0, false);
        this.LLILLL = -1;
        this.LLILZ = new C20635915oz();
        this.LLILZIL = new AbstractC1585810rMx() { // from class: X.0tEG
            public int LL;
            public boolean LLILLJJLI;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                View viewLJFF;
                Integer numValueOf;
                this.LL = i;
                if (i == 0 && (viewLJFF = this.LLILLL.LLILZ.LJFF(recyclerView.getLayoutManager())) != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                    } else {
                        numValueOf = null;
                    }
                    int i2 = this.LLILLL.LLILLL;
                    if (numValueOf != null && numValueOf.intValue() == i2) {
                        this.LLILLL.getClass();
                        CenterLinearLayoutManager centerLinearLayoutManager = this.LLILLL;
                        C1657170tE3 c1657170tE3 = centerLinearLayoutManager.LLIZLLLIL;
                        if (c1657170tE3 != null && this.LLILLJJLI) {
                            this.LLILLJJLI = false;
                            c1657170tE3.LIZ(centerLinearLayoutManager.LLILLL);
                            return;
                        }
                        return;
                    }
                    View view = this.LLILLL.LLILZLL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LLILLL.LLILZLL = viewLJFF;
                    viewLJFF.setSelected(true);
                    if (numValueOf != null) {
                        this.LLILLL.LLILLL = numValueOf.intValue();
                    }
                    CenterLinearLayoutManager centerLinearLayoutManager2 = this.LLILLL;
                    C1657170tE3 c1657170tE32 = centerLinearLayoutManager2.LLIZLLLIL;
                    if (c1657170tE32 == null) {
                        return;
                    }
                    c1657170tE32.LIZ(centerLinearLayoutManager2.LLILLL);
                }
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                Integer numValueOf;
                View viewLJFF = this.LLILLL.LLILZ.LJFF(recyclerView.getLayoutManager());
                if (viewLJFF != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                    } else {
                        numValueOf = null;
                    }
                    int i3 = this.LLILLL.LLILLL;
                    if (numValueOf == null || numValueOf.intValue() != i3) {
                        View view = this.LLILLL.LLILZLL;
                        if (view != null) {
                            view.setSelected(false);
                        }
                        this.LLILLL.LLILZLL = viewLJFF;
                        viewLJFF.setSelected(true);
                        if (numValueOf != null) {
                            this.LLILLL.LLILLL = numValueOf.intValue();
                        }
                        this.LLILLL.getClass();
                        if (this.LL != 0) {
                            this.LLILLJJLI = true;
                            return;
                        }
                        CenterLinearLayoutManager centerLinearLayoutManager = this.LLILLL;
                        C1657170tE3 c1657170tE3 = centerLinearLayoutManager.LLIZLLLIL;
                        if (c1657170tE3 != null) {
                            c1657170tE3.LIZ(centerLinearLayoutManager.LLILLL);
                        }
                    }
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = 1;
        if (!C444960Hcc.LIZIZ() ? getChildCount() == 0 || i < this.LL : getChildCount() != 0 && i >= this.LL) {
            i2 = -1;
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i = c21673919s1.LIZ;
        if (getItemCount() == 0) {
            LJIILIIL();
            detachAndScrapAttachedViews(c21673319rv);
            return;
        }
        if (c21673919s1.LJI) {
            return;
        }
        if (c21673919s1.LIZIZ() != 0 && !c21673919s1.LJFF) {
            return;
        }
        if (getChildCount() == 0 || c21673919s1.LJFF) {
            LJIILIIL();
        }
        this.LLILLJJLI = Math.min(Math.max(i, this.LLILLJJLI), getItemCount() - 1);
        detachAndScrapAttachedViews(c21673319rv);
        detachAndScrapAttachedViews(c21673319rv);
        C21679619sw c21679619sw = new C21679619sw(this);
        c21679619sw.LJIIJ();
        c21679619sw.LJI();
        int i2 = this.LLILLJJLI;
        int iLJIIL = LJIIL();
        View viewLJI = c21673319rv.LJI(this.LLILLJJLI);
        addView(viewLJI, 0);
        measureChildWithMargins(viewLJI, 0, 0);
        int paddingTop = (int) (getPaddingTop() + ((iLJIIL - r7) / 2.0f));
        int paddingLeft = (int) (getPaddingLeft() + ((((getWidth() - getPaddingRight()) - getPaddingLeft()) - r8) / 2.0f));
        Rect rect = new Rect(paddingLeft, paddingTop, getDecoratedMeasuredWidth(viewLJI) + paddingLeft, getDecoratedMeasuredHeight(viewLJI) + paddingTop);
        layoutDecorated(viewLJI, rect.left, rect.top, rect.right, rect.bottom);
        if (new C21679319st().LIZ.get(i2) == null) {
            new C21679319st().LIZ.put(i2, rect);
        } else {
            new C21679319st().LIZ.get(i2).set(rect);
        }
        this.LL = i2;
        int decoratedLeft = getDecoratedLeft(viewLJI);
        int decoratedRight = getDecoratedRight(viewLJI);
        if (C444960Hcc.LIZIZ()) {
            int iLJIIL2 = LJIIL();
            for (int i3 = this.LLILLJJLI + 1; i3 < getItemCount(); i3++) {
                View viewLJI2 = c21673319rv.LJI(i3);
                addView(viewLJI2, 0);
                measureChildWithMargins(viewLJI2, 0, 0);
                int paddingTop2 = (int) (getPaddingTop() + ((iLJIIL2 - r8) / 2.0f));
                Rect rect2 = new Rect(decoratedLeft - getDecoratedMeasuredWidth(viewLJI2), paddingTop2, decoratedLeft, getDecoratedMeasuredHeight(viewLJI2) + paddingTop2);
                layoutDecorated(viewLJI2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                C21679319st c21679319st = new C21679319st();
                if (c21679319st.LIZ.get(i3) == null) {
                    c21679319st.LIZ.put(i3, rect2);
                } else {
                    c21679319st.LIZ.get(i3).set(rect2);
                }
            }
            int iLJIIL3 = LJIIL();
            for (int i4 = this.LLILLJJLI - 1; i4 >= 0; i4--) {
                View viewLJI3 = c21673319rv.LJI(i4);
                addView(viewLJI3);
                measureChildWithMargins(viewLJI3, 0, 0);
                int paddingTop3 = (int) (getPaddingTop() + ((iLJIIL3 - r6) / 2.0f));
                Rect rect3 = new Rect(decoratedRight, paddingTop3, getDecoratedMeasuredWidth(viewLJI3) + decoratedRight, getDecoratedMeasuredHeight(viewLJI3) + paddingTop3);
                layoutDecorated(viewLJI3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                decoratedRight = rect3.right;
                viewLJI3.getLeft();
                this.LL = i4;
                if (new C21679319st().LIZ.get(i4) == null) {
                    new C21679319st().LIZ.put(i4, rect3);
                } else {
                    new C21679319st().LIZ.get(i4).set(rect3);
                }
            }
        } else {
            int iLJIIL4 = LJIIL();
            for (int i5 = this.LLILLJJLI - 1; i5 >= 0; i5--) {
                View viewLJI4 = c21673319rv.LJI(i5);
                addView(viewLJI4, 0);
                measureChildWithMargins(viewLJI4, 0, 0);
                int paddingTop4 = (int) (getPaddingTop() + ((iLJIIL4 - r8) / 2.0f));
                Rect rect4 = new Rect(decoratedLeft - getDecoratedMeasuredWidth(viewLJI4), paddingTop4, decoratedLeft, getDecoratedMeasuredHeight(viewLJI4) + paddingTop4);
                layoutDecorated(viewLJI4, rect4.left, rect4.top, rect4.right, rect4.bottom);
                decoratedLeft = rect4.left;
                this.LL = i5;
                C21679319st c21679319st2 = new C21679319st();
                if (c21679319st2.LIZ.get(i5) == null) {
                    c21679319st2.LIZ.put(i5, rect4);
                } else {
                    c21679319st2.LIZ.get(i5).set(rect4);
                }
            }
            int iLJIIL5 = LJIIL();
            for (int i6 = this.LLILLJJLI + 1; i6 < getItemCount(); i6++) {
                View viewLJI5 = c21673319rv.LJI(i6);
                addView(viewLJI5);
                measureChildWithMargins(viewLJI5, 0, 0);
                int paddingTop5 = (int) (getPaddingTop() + ((iLJIIL5 - r6) / 2.0f));
                Rect rect5 = new Rect(decoratedRight, paddingTop5, getDecoratedMeasuredWidth(viewLJI5) + decoratedRight, getDecoratedMeasuredHeight(viewLJI5) + paddingTop5);
                layoutDecorated(viewLJI5, rect5.left, rect5.top, rect5.right, rect5.bottom);
                decoratedRight = rect5.right;
                if (new C21679319st().LIZ.get(i6) == null) {
                    new C21679319st().LIZ.put(i6, rect5);
                } else {
                    new C21679319st().LIZ.get(i6).set(rect5);
                }
            }
        }
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView != null) {
            LJJIIZI(recyclerView, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        View childAt;
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        C21679619sw c21679619sw = new C21679619sw(this);
        int i2 = -i;
        int iLJI = ((c21679619sw.LJI() - c21679619sw.LJIIJ()) / 2) + c21679619sw.LJIIJ();
        if (i > 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null && getPosition(childAt2) == getItemCount() - 1) {
                iMin = Math.max(0, Math.min(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - iLJI));
                i2 = -iMin;
            }
        } else if (this.LL == 0 && (childAt = getChildAt(0)) != null) {
            iMin = Math.min(0, Math.max(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - iLJI));
            i2 = -iMin;
        }
        new C21679319st();
        int i3 = -i2;
        offsetChildrenHorizontal(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.19sj
            @Override // X.C21674119s3, X.AbstractC21674019s2
            public final void LJI(View view, C21673919s1 c21673919s12, C21675319sF c21675319sF) {
                int width;
                RecyclerView.LayoutManager layoutManager = this.LIZJ;
                int height = 0;
                if (layoutManager != null && layoutManager.canScrollHorizontally()) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int decoratedLeft = layoutManager.getDecoratedLeft(view) - marginLayoutParams.leftMargin;
                    int decoratedRight = layoutManager.getDecoratedRight(view) + marginLayoutParams.rightMargin;
                    int paddingLeft = layoutManager.getPaddingLeft();
                    width = ((int) (((layoutManager.getWidth() - layoutManager.getPaddingRight()) - paddingLeft) / 2.0f)) - (decoratedLeft + ((int) ((decoratedRight - decoratedLeft) / 2.0f)));
                } else {
                    width = 0;
                }
                RecyclerView.LayoutManager layoutManager2 = this.LIZJ;
                if (layoutManager2 != null && layoutManager2.canScrollVertically()) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int decoratedTop = layoutManager2.getDecoratedTop(view) - marginLayoutParams2.topMargin;
                    int decoratedBottom = layoutManager2.getDecoratedBottom(view) + marginLayoutParams2.bottomMargin;
                    int paddingTop = layoutManager2.getPaddingTop();
                    height = ((int) (((layoutManager2.getHeight() - layoutManager2.getPaddingBottom()) - paddingTop) / 2.0f)) - (decoratedTop + ((int) ((decoratedBottom - decoratedTop) / 2.0f)));
                }
                float f = width;
                float f2 = f * 1.0f * f;
                float f3 = height;
                int iLJIIL = LJIIL((int) Math.sqrt(f2 + (1.0f * f3 * f3)));
                if (iLJIIL > 0) {
                    c21675319sF.LIZIZ(-width, -height, this.LJIIIIZZ, iLJIIL);
                }
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }
}
