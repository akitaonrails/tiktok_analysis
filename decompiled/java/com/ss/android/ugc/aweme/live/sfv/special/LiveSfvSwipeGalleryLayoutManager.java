package com.ss.android.ugc.aweme.live.sfv.special;

import X.AbstractC1585810rMx;
import X.AbstractC21679819sy;
import X.C01GW;
import X.C0HG6;
import X.C20571815ee;
import X.C20635115or;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import X.C21679619sw;
import X.C21679719sx;
import X.C21682719tR;
import X.C21683019tU;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C419930GdL;
import X.C452501pT;
import X.InterfaceC20634915op;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvSwipeGalleryLayoutManager;
import kotlin.jvm.internal.AwS170S0101000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveSfvSwipeGalleryLayoutManager extends RecyclerView.LayoutManager implements InterfaceC20634915op {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public View LLILZIL;
    public C21683019tU LLILZLL;
    public C21679619sw LLJI;
    public C21679719sx LLJIJIL;
    public C419930GdL LLJILJILJ;
    public C20571815ee LLJILLL;
    public RecyclerView LLJJ;
    public int LLILZ = -1;
    public final C20635115or LLIZ = new C20635115or();
    public final C0HG6 LLIZLLLIL = new AbstractC1585810rMx() { // from class: X.0HG6
        public int LL;
        public boolean LLILLJJLI;

        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            Integer numValueOf;
            this.LL = i;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onScrollStateChanged: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LL == 0) {
                View viewLJFF = this.LLILLL.LLIZ.LJFF(recyclerView.getLayoutManager());
                if (viewLJFF != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                    } else {
                        numValueOf = null;
                    }
                    int i3 = this.LLILLL.LLILZ;
                    if (numValueOf != null && numValueOf.intValue() == i3) {
                        this.LLILLL.getClass();
                        LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManager = this.LLILLL;
                        C20571815ee c20571815ee = liveSfvSwipeGalleryLayoutManager.LLJILLL;
                        if (c20571815ee != null && this.LLILLJJLI) {
                            this.LLILLJJLI = false;
                            c20571815ee.LIZ(liveSfvSwipeGalleryLayoutManager.LLILZ, recyclerView);
                            return;
                        }
                        return;
                    }
                    View view = this.LLILLL.LLILZIL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LLILLL.LLILZIL = viewLJFF;
                    viewLJFF.setSelected(true);
                    if (numValueOf != null) {
                        this.LLILLL.LLILZ = numValueOf.intValue();
                    }
                    LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManager2 = this.LLILLL;
                    C20571815ee c20571815ee2 = liveSfvSwipeGalleryLayoutManager2.LLJILLL;
                    if (c20571815ee2 == null) {
                        return;
                    }
                    c20571815ee2.LIZ(liveSfvSwipeGalleryLayoutManager2.LLILZ, recyclerView);
                    return;
                }
                C1720106oR.LIZ("LiveSfvSwipeGalleryLayoutManager", "onScrollStateChanged: snap null");
            }
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            Integer numValueOf;
            View viewLJFF = this.LLILLL.LLIZ.LJFF(recyclerView.getLayoutManager());
            if (viewLJFF != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                } else {
                    numValueOf = null;
                }
                int i3 = this.LLILLL.LLILZ;
                if (numValueOf == null || numValueOf.intValue() != i3) {
                    View view = this.LLILLL.LLILZIL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LLILLL.LLILZIL = viewLJFF;
                    viewLJFF.setSelected(true);
                    if (numValueOf != null) {
                        this.LLILLL.LLILZ = numValueOf.intValue();
                    }
                    this.LLILLL.getClass();
                    if (this.LL != 0) {
                        int i4 = C2187451AjH.LIZ;
                        this.LLILLJJLI = true;
                        return;
                    } else {
                        LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManager = this.LLILLL;
                        C20571815ee c20571815ee = liveSfvSwipeGalleryLayoutManager.LLJILLL;
                        if (c20571815ee != null) {
                            c20571815ee.LIZ(liveSfvSwipeGalleryLayoutManager.LLILZ, recyclerView);
                        }
                    }
                }
            }
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onScrolled: dx:");
            sbLIZ.append(i);
            sbLIZ.append(",dy:");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    };
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS170S0101000_33(this, 5));
    public final int LLJ = 0;

    public final AbstractC21679819sy LJIIZILJ() {
        return (AbstractC21679819sy) this.LLJILJIL.getValue();
    }

    public final C21683019tU LJIJ() {
        if (this.LLILZLL == null) {
            this.LLILZLL = new C21683019tU();
        }
        return this.LLILZLL;
    }

    public final boolean LJIJJ() {
        RecyclerView recyclerView = this.LLJJ;
        return recyclerView != null && recyclerView.getLayoutDirection() == 1;
    }

    public final void LJIJJLI() {
        SparseArray<Rect> sparseArray;
        int i = C2187451AjH.LIZ;
        C21683019tU c21683019tU = this.LLILZLL;
        if (c21683019tU != null && (sparseArray = c21683019tU.LIZ) != null) {
            sparseArray.clear();
        }
        int i2 = this.LLILZ;
        if (i2 != -1) {
            this.LLILLL = i2;
        }
        int iMin = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
        this.LLILLL = iMin;
        this.LL = iMin;
        this.LLILLJJLI = iMin;
        this.LLILZ = -1;
        View view = this.LLILZIL;
        if (view != null) {
            view.setSelected(false);
            this.LLILZIL = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.LLJ == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.LLJ == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.LLJ == 1 ? new C21682719tR(-1, -2) : new C21682719tR(-2, -1);
    }

    public final int LJIILLIIL() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public final int LJIJI() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C21682719tR;
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() != 0) {
            int i3 = this.LL;
            if (!LJIJJ() ? i >= i3 : i <= i3) {
                i2 = 1;
            }
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
            return new C21682719tR((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21682719tR(layoutParams);
    }

    public final float LJIIL(View view, float f) {
        float height;
        int top;
        int height2;
        AbstractC21679819sy abstractC21679819syLJIIZILJ = LJIIZILJ();
        int iLJI = ((abstractC21679819syLJIIZILJ.LJI() - abstractC21679819syLJIIZILJ.LJIIJ()) / 2) + abstractC21679819syLJIIZILJ.LJIIJ();
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
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculateToCenterFraction: distance:");
        sbLIZ.append(i);
        sbLIZ.append(",childLength:");
        sbLIZ.append(height2);
        C2188811AlT.LIZIZ(sbLIZ);
        return Math.max(-1.0f, Math.min(1.0f, (i * 1.0f) / height2));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(int r24, X.C21673319rv r25) {
        /*
            Method dump skipped, instruction units count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.sfv.special.LiveSfvSwipeGalleryLayoutManager.LJIILIIL(int, X.19rv):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C21682719tR(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        Integer numValueOf;
        Integer numValueOf2;
        SparseArray<Rect> sparseArray;
        SparseArray<Rect> sparseArray2;
        SparseArray<Rect> sparseArray3;
        SparseArray<Rect> sparseArray4;
        Rect rect;
        SparseArray<Rect> sparseArray5;
        SparseArray<Rect> sparseArray6;
        SparseArray<Rect> sparseArray7;
        Rect rect2;
        SparseArray<Rect> sparseArray8;
        SparseArray<Rect> sparseArray9;
        Rect rect3;
        Integer numValueOf3;
        Integer numValueOf4;
        int paddingLeft;
        SparseArray<Rect> sparseArray10;
        SparseArray<Rect> sparseArray11;
        SparseArray<Rect> sparseArray12;
        Rect rect4;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutChildren() called with: state = [");
        sbLIZ.append(c21673919s1);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (getItemCount() == 0) {
            LJIJJLI();
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
            LJIJJLI();
        }
        this.LLILLL = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
        detachAndScrapAttachedViews(c21673319rv);
        float f = 2.0f;
        if (this.LLJ == 0) {
            detachAndScrapAttachedViews(c21673319rv);
            AbstractC21679819sy abstractC21679819syLJIIZILJ = LJIIZILJ();
            if (abstractC21679819syLJIIZILJ != null) {
                numValueOf3 = Integer.valueOf(abstractC21679819syLJIIZILJ.LJIIJ());
            } else {
                numValueOf3 = null;
            }
            AbstractC21679819sy abstractC21679819syLJIIZILJ2 = LJIIZILJ();
            if (abstractC21679819syLJIIZILJ2 != null) {
                numValueOf4 = Integer.valueOf(abstractC21679819syLJIIZILJ2.LJI());
            } else {
                numValueOf4 = null;
            }
            int i2 = this.LLILLL;
            Rect rect5 = new Rect();
            int iLJIJI = LJIJI();
            View viewLJI = c21673319rv.LJI(this.LLILLL);
            addView(viewLJI, 0);
            measureChildWithMargins(viewLJI, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI);
            int paddingTop = (int) (getPaddingTop() + ((iLJIJI - decoratedMeasuredHeight) / 2.0f));
            if (LJIJJ()) {
                paddingLeft = getPaddingRight();
            } else {
                paddingLeft = getPaddingLeft();
            }
            int iLJIILLIIL = (int) (paddingLeft + ((LJIILLIIL() - decoratedMeasuredWidth) / 2.0f));
            rect5.set(iLJIILLIIL, paddingTop, decoratedMeasuredWidth + iLJIILLIIL, decoratedMeasuredHeight + paddingTop);
            layoutDecorated(viewLJI, rect5.left, rect5.top, rect5.right, rect5.bottom);
            C21683019tU c21683019tULJIJ = LJIJ();
            if (c21683019tULJIJ != null && (sparseArray11 = c21683019tULJIJ.LIZ) != null && sparseArray11.get(i2) != null) {
                C21683019tU c21683019tULJIJ2 = LJIJ();
                if (c21683019tULJIJ2 != null && (sparseArray12 = c21683019tULJIJ2.LIZ) != null && (rect4 = sparseArray12.get(i2)) != null) {
                    rect4.set(rect5);
                }
            } else {
                C21683019tU c21683019tULJIJ3 = LJIJ();
                if (c21683019tULJIJ3 != null && (sparseArray10 = c21683019tULJIJ3.LIZ) != null) {
                    sparseArray10.put(i2, rect5);
                }
            }
            this.LLILLJJLI = i2;
            this.LL = i2;
            int decoratedLeft = getDecoratedLeft(viewLJI);
            int decoratedRight = getDecoratedRight(viewLJI);
            if (LJIJJ()) {
                if (numValueOf3 != null) {
                    LJIILJJIL(c21673319rv, this.LLILLL + 1, decoratedLeft, numValueOf3.intValue());
                }
                if (numValueOf4 != null) {
                    LJIILL(c21673319rv, this.LLILLL - 1, decoratedRight, numValueOf4.intValue());
                }
            } else {
                if (numValueOf3 != null) {
                    LJIILJJIL(c21673319rv, this.LLILLL - 1, decoratedLeft, numValueOf3.intValue());
                }
                if (numValueOf4 != null) {
                    LJIILL(c21673319rv, this.LLILLL + 1, decoratedRight, numValueOf4.intValue());
                }
            }
        } else {
            detachAndScrapAttachedViews(c21673319rv);
            AbstractC21679819sy abstractC21679819syLJIIZILJ3 = LJIIZILJ();
            if (abstractC21679819syLJIIZILJ3 != null) {
                numValueOf = Integer.valueOf(abstractC21679819syLJIIZILJ3.LJIIJ());
            } else {
                numValueOf = null;
            }
            AbstractC21679819sy abstractC21679819syLJIIZILJ4 = LJIIZILJ();
            if (abstractC21679819syLJIIZILJ4 != null) {
                numValueOf2 = Integer.valueOf(abstractC21679819syLJIIZILJ4.LJI());
            } else {
                numValueOf2 = null;
            }
            int i3 = this.LLILLL;
            Rect rect6 = new Rect();
            int iLJIILLIIL2 = LJIILLIIL();
            View viewLJI2 = c21673319rv.LJI(this.LLILLL);
            addView(viewLJI2, 0);
            measureChildWithMargins(viewLJI2, 0, 0);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iLJIILLIIL2 - r8) / 2.0f));
            int paddingTop2 = (int) (getPaddingTop() + ((LJIJI() - r7) / 2.0f));
            rect6.set(paddingLeft2, paddingTop2, getDecoratedMeasuredWidth(viewLJI2) + paddingLeft2, getDecoratedMeasuredHeight(viewLJI2) + paddingTop2);
            layoutDecorated(viewLJI2, rect6.left, rect6.top, rect6.right, rect6.bottom);
            C21683019tU c21683019tULJIJ4 = LJIJ();
            if (c21683019tULJIJ4 != null && (sparseArray8 = c21683019tULJIJ4.LIZ) != null && sparseArray8.get(i3) != null) {
                C21683019tU c21683019tULJIJ5 = LJIJ();
                if (c21683019tULJIJ5 != null && (sparseArray9 = c21683019tULJIJ5.LIZ) != null && (rect3 = sparseArray9.get(i3)) != null) {
                    rect3.set(rect6);
                }
            } else {
                C21683019tU c21683019tULJIJ6 = LJIJ();
                if (c21683019tULJIJ6 != null && (sparseArray = c21683019tULJIJ6.LIZ) != null) {
                    sparseArray.put(i3, rect6);
                }
            }
            this.LLILLJJLI = i3;
            this.LL = i3;
            int decoratedTop = getDecoratedTop(viewLJI2);
            int decoratedBottom = getDecoratedBottom(viewLJI2);
            if (numValueOf != null) {
                int i4 = this.LLILLL - 1;
                int iIntValue = numValueOf.intValue();
                Rect rect7 = new Rect();
                int iLJIILLIIL3 = LJIILLIIL();
                while (i4 >= 0 && decoratedTop > iIntValue) {
                    View viewLJI3 = c21673319rv.LJI(i4);
                    addView(viewLJI3, 0);
                    measureChildWithMargins(viewLJI3, 0, 0);
                    int decoratedMeasuredWidth2 = getDecoratedMeasuredWidth(viewLJI3);
                    int paddingLeft3 = (int) (getPaddingLeft() + ((iLJIILLIIL3 - decoratedMeasuredWidth2) / f));
                    rect7.set(paddingLeft3, decoratedTop - getDecoratedMeasuredHeight(viewLJI3), decoratedMeasuredWidth2 + paddingLeft3, decoratedTop);
                    layoutDecorated(viewLJI3, rect7.left, rect7.top, rect7.right, rect7.bottom);
                    decoratedTop = rect7.top;
                    this.LL = i4;
                    C21683019tU c21683019tULJIJ7 = LJIJ();
                    if (c21683019tULJIJ7 != null && (sparseArray6 = c21683019tULJIJ7.LIZ) != null && sparseArray6.get(i4) != null) {
                        C21683019tU c21683019tULJIJ8 = LJIJ();
                        if (c21683019tULJIJ8 != null && (sparseArray7 = c21683019tULJIJ8.LIZ) != null && (rect2 = sparseArray7.get(i4)) != null) {
                            rect2.set(rect7);
                        }
                    } else {
                        C21683019tU c21683019tULJIJ9 = LJIJ();
                        if (c21683019tULJIJ9 != null && (sparseArray5 = c21683019tULJIJ9.LIZ) != null) {
                            sparseArray5.put(i4, rect7);
                        }
                    }
                    i4--;
                    f = 2.0f;
                }
            }
            if (numValueOf2 != null) {
                int iIntValue2 = numValueOf2.intValue();
                Rect rect8 = new Rect();
                int iLJIILLIIL4 = LJIILLIIL();
                for (int i5 = this.LLILLL + 1; i5 < getItemCount() && decoratedBottom < iIntValue2; i5++) {
                    View viewLJI4 = c21673319rv.LJI(i5);
                    addView(viewLJI4);
                    measureChildWithMargins(viewLJI4, 0, 0);
                    int paddingLeft4 = (int) (getPaddingLeft() + ((iLJIILLIIL4 - r10) / 2.0f));
                    rect8.set(paddingLeft4, decoratedBottom, getDecoratedMeasuredWidth(viewLJI4) + paddingLeft4, getDecoratedMeasuredHeight(viewLJI4) + decoratedBottom);
                    layoutDecorated(viewLJI4, rect8.left, rect8.top, rect8.right, rect8.bottom);
                    decoratedBottom = rect8.bottom;
                    this.LLILLJJLI = i5;
                    C21683019tU c21683019tULJIJ10 = LJIJ();
                    if (c21683019tULJIJ10 != null && (sparseArray3 = c21683019tULJIJ10.LIZ) != null && sparseArray3.get(i5) != null) {
                        C21683019tU c21683019tULJIJ11 = LJIJ();
                        if (c21683019tULJIJ11 != null && (sparseArray4 = c21683019tULJIJ11.LIZ) != null && (rect = sparseArray4.get(i5)) != null) {
                            rect.set(rect8);
                        }
                    } else {
                        C21683019tU c21683019tULJIJ12 = LJIJ();
                        if (c21683019tULJIJ12 != null && (sparseArray2 = c21683019tULJIJ12.LIZ) != null) {
                            sparseArray2.put(i5, rect8);
                        }
                    }
                }
            }
        }
        int i6 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("firstFillCover finish:first: ");
        sbLIZ2.append(this.LL);
        sbLIZ2.append(",last:");
        sbLIZ2.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LLJILJILJ != null) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt != null && this.LLJILJILJ != null) {
                    C419930GdL.LIZ(childAt, LJIIL(childAt, 0));
                }
            }
        }
        RecyclerView recyclerView = this.LLJJ;
        if (recyclerView != null) {
            LJJIIZI(recyclerView, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r0 = java.lang.Math.max(0, java.lang.Math.min(r8, (((r2.getRight() - r2.getLeft()) / 2) + r2.getLeft()) - r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        r0 = java.lang.Math.min(0, java.lang.Math.max(r8, (((r2.getRight() - r2.getLeft()) / 2) + r2.getLeft()) - r6));
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int scrollHorizontallyBy(int r8, X.C21673319rv r9, X.C21673919s1 r10) {
        /*
            r7 = this;
            int r0 = r7.getChildCount()
            r3 = 0
            if (r0 == 0) goto Lc2
            if (r8 == 0) goto Lc2
            int r4 = -r8
            X.19sy r0 = r7.LJIIZILJ()
            int r1 = r0.LJI()
            X.19sy r0 = r7.LJIIZILJ()
            int r0 = r0.LJIIJ()
            int r1 = r1 - r0
            int r6 = r1 / 2
            X.19sy r0 = r7.LJIIZILJ()
            int r0 = r0.LJIIJ()
            int r6 = r6 + r0
            r5 = 1
            if (r8 <= 0) goto L8a
            int r0 = r7.getChildCount()
            int r0 = r0 - r5
            android.view.View r2 = r7.getChildAt(r0)
            if (r2 == 0) goto L5a
            boolean r0 = r7.LJIJJ()
            if (r0 == 0) goto L7e
            int r0 = r7.getPosition(r2)
            if (r0 != 0) goto L5a
        L40:
            int r1 = r2.getRight()
            int r0 = r2.getLeft()
            int r1 = r1 - r0
            int r1 = r1 / 2
            int r0 = r2.getLeft()
            int r1 = r1 + r0
            int r1 = r1 - r6
            int r0 = java.lang.Math.min(r8, r1)
            int r0 = java.lang.Math.max(r3, r0)
        L59:
            int r4 = -r0
        L5a:
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "scrollHorizontallyBy: dx:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ",fixed:"
            r1.append(r0)
            r1.append(r4)
            X.C2188811AlT.LIZIZ(r1)
            r7.LJIJ()
            int r0 = -r4
            r7.LJIILIIL(r0, r9)
            r7.offsetChildrenHorizontal(r4)
            return r0
        L7e:
            int r1 = r7.getPosition(r2)
            int r0 = r7.getItemCount()
            int r0 = r0 - r5
            if (r1 != r0) goto L5a
            goto L40
        L8a:
            android.view.View r2 = r7.getChildAt(r3)
            if (r2 == 0) goto L5a
            boolean r0 = r7.LJIJJ()
            if (r0 == 0) goto Lbb
            int r1 = r7.getPosition(r2)
            int r0 = r7.getItemCount()
            int r0 = r0 - r5
            if (r1 != r0) goto L5a
        La1:
            int r1 = r2.getRight()
            int r0 = r2.getLeft()
            int r1 = r1 - r0
            int r1 = r1 / 2
            int r0 = r2.getLeft()
            int r1 = r1 + r0
            int r1 = r1 - r6
            int r0 = java.lang.Math.max(r8, r1)
            int r0 = java.lang.Math.min(r3, r0)
            goto L59
        Lbb:
            int r0 = r7.getPosition(r2)
            if (r0 != 0) goto L5a
            goto La1
        Lc2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.sfv.special.LiveSfvSwipeGalleryLayoutManager.scrollHorizontallyBy(int, X.19rv, X.19s1):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        View childAt;
        int iMin;
        View childAt2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iLJI = ((LJIIZILJ().LJI() - LJIIZILJ().LJIIJ()) / 2) + LJIIZILJ().LJIIJ();
        if (i > 0) {
            View childAt3 = getChildAt(getChildCount() - 1);
            if (childAt3 != null && getPosition(childAt3) == getItemCount() - 1 && (childAt2 = getChildAt(getChildCount() - 1)) != null) {
                iMin = Math.max(0, Math.min(i, (((getDecoratedBottom(childAt2) - getDecoratedTop(childAt2)) / 2) + getDecoratedTop(childAt2)) - iLJI));
                i2 = -iMin;
            }
        } else if (this.LL == 0 && (childAt = getChildAt(0)) != null) {
            iMin = Math.min(0, Math.max(i, (((getDecoratedBottom(childAt) - getDecoratedTop(childAt)) / 2) + getDecoratedTop(childAt)) - iLJI));
            i2 = -iMin;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollVerticallyBy: dy:");
        sbLIZ.append(i);
        sbLIZ.append(",fixed:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIJ();
        int i4 = -i2;
        LJIILIIL(i4, c21673319rv);
        offsetChildrenVertical(i2);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.19sk
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

    public final void LJIILJJIL(C21673319rv c21673319rv, int i, int i2, int i3) {
        SparseArray<Rect> sparseArray;
        SparseArray<Rect> sparseArray2;
        SparseArray<Rect> sparseArray3;
        Rect rect;
        int i4 = i;
        int i5 = i2;
        Rect rect2 = new Rect();
        int iLJIJI = LJIJI();
        while (true) {
            if (LJIJJ()) {
                if (i4 >= getItemCount()) {
                    return;
                }
            } else if (i4 < 0) {
                return;
            }
            if (i5 > i3) {
                View viewLJI = c21673319rv.LJI(i4);
                addView(viewLJI, 0);
                measureChildWithMargins(viewLJI, 0, 0);
                int paddingTop = (int) (getPaddingTop() + ((iLJIJI - r6) / 2.0f));
                rect2.set(i5 - getDecoratedMeasuredWidth(viewLJI), paddingTop, i5, getDecoratedMeasuredHeight(viewLJI) + paddingTop);
                layoutDecorated(viewLJI, rect2.left, rect2.top, rect2.right, rect2.bottom);
                i5 = rect2.left;
                if (LJIJJ()) {
                    this.LLILLJJLI = i4;
                } else {
                    this.LL = i4;
                }
                C21683019tU c21683019tULJIJ = LJIJ();
                if (c21683019tULJIJ != null && (sparseArray2 = c21683019tULJIJ.LIZ) != null && sparseArray2.get(i4) != null) {
                    C21683019tU c21683019tULJIJ2 = LJIJ();
                    if (c21683019tULJIJ2 != null && (sparseArray3 = c21683019tULJIJ2.LIZ) != null && (rect = sparseArray3.get(i4)) != null) {
                        rect.set(rect2);
                    }
                } else {
                    C21683019tU c21683019tULJIJ3 = LJIJ();
                    if (c21683019tULJIJ3 != null && (sparseArray = c21683019tULJIJ3.LIZ) != null) {
                        sparseArray.put(i4, rect2);
                    }
                }
                if (LJIJJ()) {
                    i4++;
                } else {
                    i4--;
                }
            } else {
                return;
            }
        }
    }

    public final void LJIILL(C21673319rv c21673319rv, int i, int i2, int i3) {
        SparseArray<Rect> sparseArray;
        SparseArray<Rect> sparseArray2;
        SparseArray<Rect> sparseArray3;
        Rect rect;
        int i4 = i;
        int i5 = i2;
        Rect rect2 = new Rect();
        int iLJIJI = LJIJI();
        while (true) {
            if (LJIJJ()) {
                if (i4 < 0) {
                    return;
                }
            } else if (i4 >= getItemCount()) {
                return;
            }
            if (i5 < i3) {
                View viewLJI = c21673319rv.LJI(i4);
                addView(viewLJI);
                measureChildWithMargins(viewLJI, 0, 0);
                int paddingTop = (int) (getPaddingTop() + ((iLJIJI - r6) / 2.0f));
                rect2.set(i5, paddingTop, getDecoratedMeasuredWidth(viewLJI) + i5, getDecoratedMeasuredHeight(viewLJI) + paddingTop);
                layoutDecorated(viewLJI, rect2.left, rect2.top, rect2.right, rect2.bottom);
                i5 = rect2.right;
                if (LJIJJ()) {
                    this.LL = i4;
                } else {
                    this.LLILLJJLI = i4;
                }
                C21683019tU c21683019tULJIJ = LJIJ();
                if (c21683019tULJIJ != null && (sparseArray2 = c21683019tULJIJ.LIZ) != null && sparseArray2.get(i4) != null) {
                    C21683019tU c21683019tULJIJ2 = LJIJ();
                    if (c21683019tULJIJ2 != null && (sparseArray3 = c21683019tULJIJ2.LIZ) != null && (rect = sparseArray3.get(i4)) != null) {
                        rect.set(rect2);
                    }
                } else {
                    C21683019tU c21683019tULJIJ3 = LJIJ();
                    if (c21683019tULJIJ3 != null && (sparseArray = c21683019tULJIJ3.LIZ) != null) {
                        sparseArray.put(i4, rect2);
                    }
                }
                if (LJIJJ()) {
                    i4--;
                } else {
                    i4++;
                }
            } else {
                return;
            }
        }
    }
}
