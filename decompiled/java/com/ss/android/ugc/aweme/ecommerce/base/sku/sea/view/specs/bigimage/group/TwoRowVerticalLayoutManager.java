package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.view.specs.bigimage.group;

import X.C13LP;
import X.C13LZ;
import X.C21673319rv;
import X.C21673919s1;
import X.InterfaceC20634915op;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes34.dex */
public final class TwoRowVerticalLayoutManager extends RecyclerView.LayoutManager implements InterfaceC20634915op {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJIJIL;
    public final HashMap<Integer, Rect> LLJI = new HashMap<>();
    public final float LLJILJIL = 1.0f;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(C21673919s1 c21673919s1) {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        return this.LLILZIL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
        return Math.max(Math.max(this.LLIZLLLIL, this.LLJ) + getPaddingRight(), getWidth());
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        return new PointF(1.0f, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.LLJI.clear();
        this.LLIZLLLIL = getPaddingLeft();
        this.LLJ = getPaddingLeft();
        this.LLJIJIL = 0;
        requestLayout();
    }

    public final void LJIILJJIL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof RecyclerView.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            int i3 = 0;
            if (i % 2 == 0) {
                i2 = this.LL;
            } else {
                i2 = this.LLILLJJLI;
            }
            int childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width, true);
            int i4 = (i2 - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
            if (i4 >= 0) {
                i3 = i4;
            }
            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (c21673919s1.LIZIZ() == 0) {
            detachAndScrapAttachedViews(c21673319rv);
            this.LLILZIL = 0;
            this.LLJI.clear();
            this.LLIZLLLIL = 0;
            this.LLJ = 0;
            this.LLJIJIL = 0;
            return;
        }
        int paddingTop = getPaddingTop();
        this.LLILZLL = paddingTop;
        this.LLIZ = paddingTop + this.LL + this.LLILLL;
        if (this.LLJI.isEmpty()) {
            this.LLIZLLLIL = getPaddingLeft();
            this.LLJ = getPaddingLeft();
            this.LLJIJIL = 0;
        }
        detachAndScrapAttachedViews(c21673319rv);
        LJIILIIL(((this.LLILZIL + getWidth()) - getPaddingRight()) + ((int) (getWidth() * this.LLJILJIL)), c21673319rv, c21673919s1);
        int paddingLeft = this.LLILZIL + getPaddingLeft();
        int width = (this.LLILZIL + getWidth()) - getPaddingRight();
        LJIILL(c21673319rv, paddingLeft, width);
        LJIIL(c21673319rv, paddingLeft, width, c21673919s1.LIZIZ());
    }

    public final void LJIILIIL(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i2;
        int i3;
        while (this.LLJIJIL < c21673919s1.LIZIZ() && Math.max(this.LLIZLLLIL, this.LLJ) < i) {
            int i4 = this.LLJIJIL;
            View viewLJI = c21673319rv.LJI(i4);
            addView(viewLJI);
            LJIILJJIL(i4, viewLJI);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLJI.getLayoutParams();
            int i5 = i4 % 2;
            if (i5 == 0) {
                i2 = this.LLIZLLLIL;
            } else {
                i2 = this.LLJ;
            }
            if (i5 == 0) {
                i3 = this.LLILZLL;
            } else {
                i3 = this.LLIZ;
            }
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI);
            int i6 = i2 + marginLayoutParams.leftMargin;
            int i7 = i3 + marginLayoutParams.topMargin;
            int i8 = decoratedMeasuredWidth + i6;
            this.LLJI.put(Integer.valueOf(i4), new Rect(i6, i7, i8, decoratedMeasuredHeight + i7));
            int i9 = i8 + marginLayoutParams.rightMargin + this.LLILZ;
            if (i5 == 0) {
                this.LLIZLLLIL = i9;
            } else {
                this.LLJ = i9;
            }
            detachAndScrapView(viewLJI, c21673319rv);
            this.LLJIJIL++;
        }
    }

    public final void LJIILL(C21673319rv c21673319rv, int i, int i2) {
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt != null) {
                Rect rect = this.LLJI.get(Integer.valueOf(getPosition(childAt)));
                if (rect != null && (rect.right < i || rect.left > i2)) {
                    removeAndRecycleView(childAt, c21673319rv);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (c21673919s1.LIZIZ() == 0 || getWidth() == 0) {
            return 0;
        }
        int iMax = Math.max(this.LLIZLLLIL, this.LLJ);
        int iLJ = C13LZ.LJ(this.LLILZIL + i, 0, Math.max(0, (getPaddingRight() + iMax) - (getWidth() - getPaddingLeft())));
        int i2 = iLJ - this.LLILZIL;
        if (i2 == 0) {
            return 0;
        }
        this.LLILZIL = iLJ;
        offsetChildrenHorizontal(-i2);
        int width = (this.LLILZIL + getWidth()) - getPaddingRight();
        if (iMax < getWidth() + width) {
            LJIILIIL(((int) (getWidth() * this.LLJILJIL)) + width, c21673319rv, c21673919s1);
        }
        int paddingLeft = this.LLILZIL + getPaddingLeft();
        LJIILL(c21673319rv, paddingLeft, width);
        LJIIL(c21673319rv, paddingLeft, width, c21673919s1.LIZIZ());
        return i2;
    }

    public TwoRowVerticalLayoutManager(int i, int i2, int i3, int i4) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
    }

    public final void LJIIL(C21673319rv c21673319rv, int i, int i2, int i3) {
        Rect rect;
        if (Math.max(this.LLIZLLLIL, this.LLJ) < getWidth() + i2) {
            LJIILIIL(getWidth() + i2, c21673319rv, new C21673919s1() { // from class: X.19si
            });
        }
        Iterator it2 = C13LP.LJLLJ(this.LLJI.keySet()).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue >= 0 && iIntValue < i3 && (rect = this.LLJI.get(Integer.valueOf(iIntValue))) != null && rect.right >= i && rect.left <= i2) {
                int childCount = getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 < childCount) {
                        View childAt = getChildAt(i4);
                        if (childAt == null || getPosition(childAt) != iIntValue) {
                            i4++;
                        }
                    } else {
                        View viewLJI = c21673319rv.LJI(iIntValue);
                        addView(viewLJI);
                        LJIILJJIL(iIntValue, viewLJI);
                        int i5 = rect.left;
                        int i6 = this.LLILZIL;
                        layoutDecorated(viewLJI, i5 - i6, rect.top, rect.right - i6, rect.bottom);
                        break;
                    }
                }
            }
        }
    }
}
