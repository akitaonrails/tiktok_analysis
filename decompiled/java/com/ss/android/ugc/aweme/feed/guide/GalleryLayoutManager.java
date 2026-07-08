package com.ss.android.ugc.aweme.feed.guide;

import X.AbstractC1585810rMx;
import X.AbstractC20634115oh;
import X.AbstractC21679819sy;
import X.C1213620hge;
import X.C19252910Tv;
import X.C19253010Tw;
import X.C20635115or;
import X.C20635915oz;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import X.C21678919sp;
import X.C21679219ss;
import X.C21679619sw;
import X.C21679719sx;
import X.InterfaceC19230410Le;
import X.InterfaceC20634915op;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
public class GalleryLayoutManager extends RecyclerView.LayoutManager implements InterfaceC20634915op {
    public int LL;
    public int LLILLL;
    public View LLILZIL;
    public C21679219ss LLILZLL;
    public final AbstractC20634115oh LLIZ;
    public final int LLJ;
    public C21679619sw LLJI;
    public C21679719sx LLJIJIL;
    public WeakReference<Activity> LLJILJIL;
    public C1213620hge LLJILJILJ;
    public RecyclerView LLJJ;
    public final boolean LLILLJJLI = true;
    public int LLILZ = -1;
    public final C19253010Tw LLIZLLLIL = new AbstractC1585810rMx() { // from class: X.10Tw
        public int LL;
        public boolean LLILLJJLI;

        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            this.LL = i;
            if (i == 0) {
                this.LLILLL.getClass();
                View viewLJFF = this.LLILLL.LLIZ.LJFF(recyclerView.getLayoutManager());
                if (viewLJFF != null) {
                    int position = recyclerView.getLayoutManager().getPosition(viewLJFF);
                    GalleryLayoutManager galleryLayoutManager = this.LLILLL;
                    int i2 = galleryLayoutManager.LLILZ;
                    if (position != i2) {
                        View view = galleryLayoutManager.LLILZIL;
                        if (view != null) {
                            view.setSelected(false);
                        }
                        this.LLILLL.LLILZIL = viewLJFF;
                        viewLJFF.setSelected(true);
                        GalleryLayoutManager galleryLayoutManager2 = this.LLILLL;
                        galleryLayoutManager2.LLILZ = position;
                        if (galleryLayoutManager2.LLJILLL != null) {
                            galleryLayoutManager2.LJIJ(position, viewLJFF, recyclerView);
                            return;
                        }
                        return;
                    }
                    if (galleryLayoutManager.LLJILLL == null || !this.LLILLJJLI) {
                        return;
                    }
                    this.LLILLJJLI = false;
                    galleryLayoutManager.LJIJ(i2, viewLJFF, recyclerView);
                    return;
                }
                return;
            }
            this.LLILLL.getClass();
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            View viewLJFF = this.LLILLL.LLIZ.LJFF(recyclerView.getLayoutManager());
            if (viewLJFF != null) {
                int position = recyclerView.getLayoutManager().getPosition(viewLJFF);
                GalleryLayoutManager galleryLayoutManager = this.LLILLL;
                if (position != galleryLayoutManager.LLILZ) {
                    View view = galleryLayoutManager.LLILZIL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LLILLL.LLILZIL = viewLJFF;
                    viewLJFF.setSelected(true);
                    GalleryLayoutManager galleryLayoutManager2 = this.LLILLL;
                    galleryLayoutManager2.LLILZ = position;
                    galleryLayoutManager2.getClass();
                    if (this.LL != 0) {
                        this.LLILLJJLI = true;
                        return;
                    }
                    GalleryLayoutManager galleryLayoutManager3 = this.LLILLL;
                    if (galleryLayoutManager3.LLJILLL != null) {
                        galleryLayoutManager3.LJIJ(galleryLayoutManager3.LLILZ, viewLJFF, recyclerView);
                    }
                }
            }
        }
    };
    public final ArrayList<InterfaceC19230410Le> LLJILLL = new ArrayList<>();

    public final AbstractC21679819sy LJIILL() {
        if (this.LLJ == 0) {
            if (this.LLJI == null) {
                this.LLJI = new C21679619sw(this);
            }
            return this.LLJI;
        }
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new C21679719sx(this);
        }
        return this.LLJIJIL;
    }

    public final C21679219ss LJIILLIIL() {
        if (this.LLILZLL == null) {
            this.LLILZLL = new C21679219ss();
        }
        return this.LLILZLL;
    }

    public final void LJIJI() {
        C21679219ss c21679219ss = this.LLILZLL;
        if (c21679219ss != null) {
            c21679219ss.LIZ.clear();
        }
        int i = this.LLILZ;
        if (i != -1) {
            this.LLILLL = i;
        }
        int iMin = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
        this.LLILLL = iMin;
        this.LL = iMin;
        this.LLILZ = -1;
        View view = this.LLILZIL;
        if (view != null) {
            view.setSelected(false);
            this.LLILZIL = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        RecyclerView recyclerView = this.LLJJ;
        return recyclerView != null && !recyclerView.isAnimating() && this.LLILLJJLI && this.LLJ == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        RecyclerView recyclerView = this.LLJJ;
        return recyclerView != null && !recyclerView.isAnimating() && this.LLILLJJLI && this.LLJ == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.LLJ == 1 ? new C21678919sp(-1, -2) : new C21678919sp(-2, -1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.10Tw] */
    public GalleryLayoutManager() {
        this.LLJ = 0;
        this.LLJ = 0;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1) {
            this.LLIZ = new C20635115or();
        } else {
            this.LLIZ = new C20635915oz();
        }
    }

    public final int LJIILJJIL() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public final int LJIIZILJ() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C21678919sp;
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() != 0 && i >= this.LL) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.LLJ == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C21678919sp((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21678919sp(layoutParams);
    }

    public final float LJIIL(View view, float f) {
        float height;
        int top;
        int height2;
        AbstractC21679819sy abstractC21679819syLJIILL = LJIILL();
        int iLJI = ((abstractC21679819syLJIILL.LJI() - abstractC21679819syLJIILL.LJIIJ()) / 2) + abstractC21679819syLJIILL.LJIIJ();
        if (this.LLJ == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        int i = (int) ((height + top) - iLJI);
        if (this.LLJ == 0) {
            height2 = view.getWidth();
        } else {
            height2 = view.getHeight();
        }
        return Math.max(-1.0f, Math.min(1.0f, (i * 1.0f) / height2));
    }

    public final void LJIILIIL(int i, C21673319rv c21673319rv) {
        int decoratedBottom;
        int decoratedRight;
        if (getItemCount() == 0) {
            return;
        }
        int decoratedTop = -1;
        int i2 = 0;
        if (this.LLJ == 0) {
            int iLJIIJ = LJIILL().LJIIJ();
            int iLJI = LJIILL().LJI();
            if (getChildCount() > 0) {
                if (i >= 0) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < getChildCount(); i4++) {
                        View childAt = getChildAt(i4 + i3);
                        if (getDecoratedRight(childAt) - i >= iLJIIJ) {
                            break;
                        }
                        removeAndRecycleView(childAt, c21673319rv);
                        this.LL++;
                        i3--;
                    }
                } else {
                    for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt2 = getChildAt(childCount);
                        if (getDecoratedLeft(childAt2) - i > iLJI) {
                            removeAndRecycleView(childAt2, c21673319rv);
                        }
                    }
                }
            }
            int position = this.LL;
            int iLJIIZILJ = LJIIZILJ();
            if (i >= 0) {
                if (getChildCount() != 0) {
                    View childAt3 = getChildAt(getChildCount() - 1);
                    position = getPosition(childAt3) + 1;
                    decoratedRight = getDecoratedRight(childAt3);
                } else {
                    decoratedRight = -1;
                }
                int i5 = position;
                while (i5 < getItemCount() && decoratedRight < iLJI + i) {
                    Rect rect = LJIILLIIL().LIZ.get(i5);
                    View viewLJI = c21673319rv.LJI(i5);
                    addView(viewLJI);
                    if (rect == null) {
                        rect = new Rect();
                        LJIILLIIL().LIZ.put(i5, rect);
                    }
                    measureChildWithMargins(viewLJI, i2, i2);
                    int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI);
                    int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI);
                    int paddingTop = (int) (getPaddingTop() + ((iLJIIZILJ - decoratedMeasuredHeight) / 2.0f));
                    if (decoratedRight == -1 && position == 0) {
                        int paddingLeft = (int) (getPaddingLeft() + ((LJIILJJIL() - decoratedMeasuredWidth) / 2.0f));
                        rect.set(paddingLeft, paddingTop, decoratedMeasuredWidth + paddingLeft, decoratedMeasuredHeight + paddingTop);
                    } else {
                        rect.set(decoratedRight, paddingTop, decoratedMeasuredWidth + decoratedRight, decoratedMeasuredHeight + paddingTop);
                    }
                    layoutDecorated(viewLJI, rect.left, rect.top, rect.right, rect.bottom);
                    decoratedRight = rect.right;
                    i5++;
                    i2 = 0;
                }
            } else {
                if (getChildCount() > 0) {
                    View childAt4 = getChildAt(0);
                    position = getPosition(childAt4) - 1;
                    decoratedTop = getDecoratedLeft(childAt4);
                }
                while (position >= 0 && decoratedTop > iLJIIJ + i) {
                    Rect rect2 = LJIILLIIL().LIZ.get(position);
                    View viewLJI2 = c21673319rv.LJI(position);
                    addView(viewLJI2, 0);
                    if (rect2 == null) {
                        rect2 = new Rect();
                        LJIILLIIL().LIZ.put(position, rect2);
                    }
                    measureChildWithMargins(viewLJI2, 0, 0);
                    int paddingTop2 = (int) (getPaddingTop() + ((iLJIIZILJ - r2) / 2.0f));
                    rect2.set(decoratedTop - getDecoratedMeasuredWidth(viewLJI2), paddingTop2, decoratedTop, getDecoratedMeasuredHeight(viewLJI2) + paddingTop2);
                    layoutDecorated(viewLJI2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    decoratedTop = rect2.left;
                    this.LL = position;
                    position--;
                }
            }
        } else {
            int iLJIIJ2 = LJIILL().LJIIJ();
            int iLJI2 = LJIILL().LJI();
            if (getChildCount() > 0) {
                if (i >= 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        View childAt5 = getChildAt(i7 + i6);
                        if (getDecoratedBottom(childAt5) - i >= iLJIIJ2) {
                            break;
                        }
                        removeAndRecycleView(childAt5, c21673319rv);
                        this.LL++;
                        i6--;
                    }
                } else {
                    for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                        View childAt6 = getChildAt(childCount2);
                        if (getDecoratedTop(childAt6) - i <= iLJI2) {
                            break;
                        }
                        removeAndRecycleView(childAt6, c21673319rv);
                    }
                }
            }
            int position2 = this.LL;
            int iLJIILJJIL = LJIILJJIL();
            if (i >= 0) {
                if (getChildCount() != 0) {
                    View childAt7 = getChildAt(getChildCount() - 1);
                    position2 = getPosition(childAt7) + 1;
                    decoratedBottom = getDecoratedBottom(childAt7);
                } else {
                    decoratedBottom = -1;
                }
                for (int i8 = position2; i8 < getItemCount() && decoratedBottom < iLJI2 + i; i8++) {
                    Rect rect3 = LJIILLIIL().LIZ.get(i8);
                    View viewLJI3 = c21673319rv.LJI(i8);
                    addView(viewLJI3);
                    if (rect3 == null) {
                        rect3 = new Rect();
                        LJIILLIIL().LIZ.put(i8, rect3);
                    }
                    measureChildWithMargins(viewLJI3, 0, 0);
                    int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewLJI3);
                    int decoratedMeasuredHeight2 = getDecoratedMeasuredHeight(viewLJI3);
                    int paddingLeft2 = (int) (getPaddingLeft() + ((iLJIILJJIL - decoratedMeasuredWidth2) / 2.0f));
                    if (decoratedBottom == -1 && position2 == 0) {
                        int paddingTop3 = (int) (getPaddingTop() + ((LJIIZILJ() - decoratedMeasuredHeight2) / 2.0f));
                        rect3.set(paddingLeft2, paddingTop3, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + paddingTop3);
                    } else {
                        rect3.set(paddingLeft2, decoratedBottom, decoratedMeasuredWidth2 + paddingLeft2, decoratedMeasuredHeight2 + decoratedBottom);
                    }
                    layoutDecorated(viewLJI3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                    decoratedBottom = rect3.bottom;
                }
            } else {
                if (getChildCount() > 0) {
                    View childAt8 = getChildAt(0);
                    position2 = getPosition(childAt8) - 1;
                    decoratedTop = getDecoratedTop(childAt8);
                }
                while (position2 >= 0 && decoratedTop > iLJIIJ2 + i) {
                    Rect rect4 = LJIILLIIL().LIZ.get(position2);
                    View viewLJI4 = c21673319rv.LJI(position2);
                    addView(viewLJI4, 0);
                    if (rect4 == null) {
                        rect4 = new Rect();
                        LJIILLIIL().LIZ.put(position2, rect4);
                    }
                    measureChildWithMargins(viewLJI4, 0, 0);
                    int decoratedMeasuredWidth3 = getDecoratedMeasuredWidth(viewLJI4);
                    int paddingLeft3 = (int) (getPaddingLeft() + ((iLJIILJJIL - decoratedMeasuredWidth3) / 2.0f));
                    rect4.set(paddingLeft3, decoratedTop - getDecoratedMeasuredHeight(viewLJI4), decoratedMeasuredWidth3 + paddingLeft3, decoratedTop);
                    layoutDecorated(viewLJI4, rect4.left, rect4.top, rect4.right, rect4.bottom);
                    decoratedTop = rect4.top;
                    this.LL = position2;
                    position2--;
                }
            }
        }
        if (this.LLJILJILJ != null) {
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt9 = getChildAt(i9);
                this.LLJILJILJ.LIZ(childAt9, LJIIL(childAt9, i));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C21678919sp(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (getItemCount() == 0) {
            LJIJI();
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
            LJIJI();
        }
        this.LLILLL = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
        detachAndScrapAttachedViews(c21673319rv);
        if (this.LLJ == 0) {
            detachAndScrapAttachedViews(c21673319rv);
            int iLJIIJ = LJIILL().LJIIJ();
            int iLJI = LJIILL().LJI();
            int i = this.LLILLL;
            Rect rect = new Rect();
            int iLJIIZILJ = LJIIZILJ();
            View viewLJI = c21673319rv.LJI(this.LLILLL);
            addView(viewLJI, 0);
            measureChildWithMargins(viewLJI, 0, 0);
            int paddingTop = (int) (getPaddingTop() + ((iLJIIZILJ - r9) / 2.0f));
            int paddingLeft = (int) (getPaddingLeft() + ((LJIILJJIL() - r10) / 2.0f));
            rect.set(paddingLeft, paddingTop, getDecoratedMeasuredWidth(viewLJI) + paddingLeft, getDecoratedMeasuredHeight(viewLJI) + paddingTop);
            layoutDecorated(viewLJI, rect.left, rect.top, rect.right, rect.bottom);
            if (LJIILLIIL().LIZ.get(i) == null) {
                LJIILLIIL().LIZ.put(i, rect);
            } else {
                LJIILLIIL().LIZ.get(i).set(rect);
            }
            this.LL = i;
            int decoratedLeft = getDecoratedLeft(viewLJI);
            int decoratedRight = getDecoratedRight(viewLJI);
            Rect rect2 = new Rect();
            int iLJIIZILJ2 = LJIIZILJ();
            for (int i2 = this.LLILLL - 1; i2 >= 0 && decoratedLeft > iLJIIJ; i2--) {
                View viewLJI2 = c21673319rv.LJI(i2);
                addView(viewLJI2, 0);
                measureChildWithMargins(viewLJI2, 0, 0);
                int paddingTop2 = (int) (getPaddingTop() + ((iLJIIZILJ2 - r10) / 2.0f));
                rect2.set(decoratedLeft - getDecoratedMeasuredWidth(viewLJI2), paddingTop2, decoratedLeft, getDecoratedMeasuredHeight(viewLJI2) + paddingTop2);
                layoutDecorated(viewLJI2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                decoratedLeft = rect2.left;
                this.LL = i2;
                if (LJIILLIIL().LIZ.get(i2) == null) {
                    LJIILLIIL().LIZ.put(i2, rect2);
                } else {
                    LJIILLIIL().LIZ.get(i2).set(rect2);
                }
            }
            Rect rect3 = new Rect();
            int iLJIIZILJ3 = LJIIZILJ();
            for (int i3 = this.LLILLL + 1; i3 < getItemCount() && decoratedRight < iLJI; i3++) {
                View viewLJI3 = c21673319rv.LJI(i3);
                addView(viewLJI3);
                measureChildWithMargins(viewLJI3, 0, 0);
                int paddingTop3 = (int) (getPaddingTop() + ((iLJIIZILJ3 - r8) / 2.0f));
                rect3.set(decoratedRight, paddingTop3, getDecoratedMeasuredWidth(viewLJI3) + decoratedRight, getDecoratedMeasuredHeight(viewLJI3) + paddingTop3);
                layoutDecorated(viewLJI3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                decoratedRight = rect3.right;
                if (LJIILLIIL().LIZ.get(i3) == null) {
                    LJIILLIIL().LIZ.put(i3, rect3);
                } else {
                    LJIILLIIL().LIZ.get(i3).set(rect3);
                }
            }
        } else {
            detachAndScrapAttachedViews(c21673319rv);
            int iLJIIJ2 = LJIILL().LJIIJ();
            int iLJI2 = LJIILL().LJI();
            int i4 = this.LLILLL;
            Rect rect4 = new Rect();
            int iLJIILJJIL = LJIILJJIL();
            View viewLJI4 = c21673319rv.LJI(this.LLILLL);
            addView(viewLJI4, 0);
            measureChildWithMargins(viewLJI4, 0, 0);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iLJIILJJIL - r10) / 2.0f));
            int paddingTop4 = (int) (getPaddingTop() + ((LJIIZILJ() - r9) / 2.0f));
            rect4.set(paddingLeft2, paddingTop4, getDecoratedMeasuredWidth(viewLJI4) + paddingLeft2, getDecoratedMeasuredHeight(viewLJI4) + paddingTop4);
            layoutDecorated(viewLJI4, rect4.left, rect4.top, rect4.right, rect4.bottom);
            if (LJIILLIIL().LIZ.get(i4) == null) {
                LJIILLIIL().LIZ.put(i4, rect4);
            } else {
                LJIILLIIL().LIZ.get(i4).set(rect4);
            }
            this.LL = i4;
            int decoratedTop = getDecoratedTop(viewLJI4);
            int decoratedBottom = getDecoratedBottom(viewLJI4);
            Rect rect5 = new Rect();
            int iLJIILJJIL2 = LJIILJJIL();
            for (int i5 = this.LLILLL - 1; i5 >= 0 && decoratedTop > iLJIIJ2; i5--) {
                View viewLJI5 = c21673319rv.LJI(i5);
                addView(viewLJI5, 0);
                measureChildWithMargins(viewLJI5, 0, 0);
                int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI5);
                int paddingLeft3 = (int) (getPaddingLeft() + ((iLJIILJJIL2 - decoratedMeasuredWidth) / 2.0f));
                rect5.set(paddingLeft3, decoratedTop - getDecoratedMeasuredHeight(viewLJI5), decoratedMeasuredWidth + paddingLeft3, decoratedTop);
                layoutDecorated(viewLJI5, rect5.left, rect5.top, rect5.right, rect5.bottom);
                decoratedTop = rect5.top;
                this.LL = i5;
                if (LJIILLIIL().LIZ.get(i5) == null) {
                    LJIILLIIL().LIZ.put(i5, rect5);
                } else {
                    LJIILLIIL().LIZ.get(i5).set(rect5);
                }
            }
            Rect rect6 = new Rect();
            int iLJIILJJIL3 = LJIILJJIL();
            for (int i6 = this.LLILLL + 1; i6 < getItemCount() && decoratedBottom < iLJI2; i6++) {
                View viewLJI6 = c21673319rv.LJI(i6);
                addView(viewLJI6);
                measureChildWithMargins(viewLJI6, 0, 0);
                int paddingLeft4 = (int) (getPaddingLeft() + ((iLJIILJJIL3 - r9) / 2.0f));
                rect6.set(paddingLeft4, decoratedBottom, getDecoratedMeasuredWidth(viewLJI6) + paddingLeft4, getDecoratedMeasuredHeight(viewLJI6) + decoratedBottom);
                layoutDecorated(viewLJI6, rect6.left, rect6.top, rect6.right, rect6.bottom);
                decoratedBottom = rect6.bottom;
                if (LJIILLIIL().LIZ.get(i6) == null) {
                    LJIILLIIL().LIZ.put(i6, rect6);
                } else {
                    LJIILLIIL().LIZ.get(i6).set(rect6);
                }
            }
        }
        if (this.LLJILJILJ != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                this.LLJILJILJ.LIZ(childAt, LJIIL(childAt, 0));
            }
        }
        LJJIIZI(this.LLJJ, 0, 0);
    }

    public final void LJIJ(int i, View view, RecyclerView recyclerView) {
        Iterator<InterfaceC19230410Le> it2 = this.LLJILLL.iterator();
        while (it2.hasNext()) {
            it2.next().H2(i, view, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iLJI = ((LJIILL().LJI() - LJIILL().LJIIJ()) / 2) + LJIILL().LJIIJ();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - iLJI));
                i2 = -iMin;
            }
        } else if (this.LL == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - iLJI));
            i2 = -iMin;
        }
        int i3 = -i2;
        LJIILLIIL().getClass();
        LJIILIIL(i3, c21673319rv);
        offsetChildrenHorizontal(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int iMin;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iLJI = ((LJIILL().LJI() - LJIILL().LJIIJ()) / 2) + LJIILL().LJIIJ();
        if (i > 0) {
            if (getPosition(getChildAt(getChildCount() - 1)) == getItemCount() - 1) {
                View childAt = getChildAt(getChildCount() - 1);
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - iLJI));
                i2 = -iMin;
            }
        } else if (this.LL == 0) {
            View childAt2 = getChildAt(0);
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - iLJI));
            i2 = -iMin;
        }
        int i3 = -i2;
        LJIILLIIL().getClass();
        LJIILIIL(i3, c21673319rv);
        offsetChildrenVertical(i2);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.19so
            @Override // X.C21674119s3
            public final float LJIIJJI(DisplayMetrics displayMetrics) {
                if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1) {
                    return (25.0f / displayMetrics.densityDpi) / 1.5f;
                }
                return 25.0f / displayMetrics.densityDpi;
            }

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
                int iLJIIL = LJIIL((int) Math.sqrt((width * width) + (height * height)));
                if (iLJIIL > 0) {
                    c21675319sF.LIZIZ(-width, -height, this.LJIIIIZZ, iLJIIL);
                }
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }
}
