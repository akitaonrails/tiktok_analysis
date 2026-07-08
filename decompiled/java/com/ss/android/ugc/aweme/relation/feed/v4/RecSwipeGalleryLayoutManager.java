package com.ss.android.ugc.aweme.relation.feed.v4;

import X.AbstractC1585810rMx;
import X.AbstractC21679819sy;
import X.C01GW;
import X.C0HG0;
import X.C0HG1;
import X.C20635115or;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import X.C21679619sw;
import X.C21679719sx;
import X.C21682619tQ;
import X.C21682919tT;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C744300THo;
import X.InterfaceC20634915op;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import kotlin.jvm.internal.AwS170S0101000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class RecSwipeGalleryLayoutManager extends RecyclerView.LayoutManager implements InterfaceC20634915op {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public View LLILZLL;
    public C21682919tT LLIZ;
    public C21679619sw LLJIJIL;
    public C21679719sx LLJILJIL;
    public C744300THo LLJILLL;
    public C0HG1 LLJJ;
    public RecyclerView LLJJI;
    public int LLILZIL = -1;
    public final C20635115or LLIZLLLIL = new C20635115or();
    public final C0HG0 LLJ = new AbstractC1585810rMx() { // from class: X.0HG0
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
                View viewLJFF = this.LLILLL.LLIZLLLIL.LJFF(recyclerView.getLayoutManager());
                if (viewLJFF != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                    } else {
                        numValueOf = null;
                    }
                    int i3 = this.LLILLL.LLILZIL;
                    if (numValueOf != null && numValueOf.intValue() == i3) {
                        this.LLILLL.getClass();
                        RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = this.LLILLL;
                        C0HG1 c0hg1 = recSwipeGalleryLayoutManager.LLJJ;
                        if (c0hg1 != null && this.LLILLJJLI) {
                            this.LLILLJJLI = false;
                            c0hg1.LJLJJI(recSwipeGalleryLayoutManager.LLILZIL);
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
                        this.LLILLL.LLILZIL = numValueOf.intValue();
                    }
                    RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager2 = this.LLILLL;
                    C0HG1 c0hg12 = recSwipeGalleryLayoutManager2.LLJJ;
                    if (c0hg12 == null) {
                        return;
                    }
                    c0hg12.LJLJJI(recSwipeGalleryLayoutManager2.LLILZIL);
                    return;
                }
                C1720106oR.LIZ("TTRecGalleryLayoutManager", "onScrollStateChanged: snap null");
            }
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            Integer numValueOf;
            View viewLJFF = this.LLILLL.LLIZLLLIL.LJFF(recyclerView.getLayoutManager());
            if (viewLJFF != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                } else {
                    numValueOf = null;
                }
                int i3 = this.LLILLL.LLILZIL;
                if (numValueOf == null || numValueOf.intValue() != i3) {
                    View view = this.LLILLL.LLILZLL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LLILLL.LLILZLL = viewLJFF;
                    viewLJFF.setSelected(true);
                    if (numValueOf != null) {
                        this.LLILLL.LLILZIL = numValueOf.intValue();
                    }
                    this.LLILLL.getClass();
                    if (this.LL != 0) {
                        int i4 = C2187451AjH.LIZ;
                        this.LLILLJJLI = true;
                        return;
                    } else {
                        RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = this.LLILLL;
                        C0HG1 c0hg1 = recSwipeGalleryLayoutManager.LLJJ;
                        if (c0hg1 != null) {
                            c0hg1.LJLJJI(recSwipeGalleryLayoutManager.LLILZIL);
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
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS170S0101000_33(this, 6));
    public final int LLJI = 0;

    public final AbstractC21679819sy LJIILLIIL() {
        return (AbstractC21679819sy) this.LLJILJILJ.getValue();
    }

    public final C21682919tT LJIIZILJ() {
        if (this.LLIZ == null) {
            this.LLIZ = new C21682919tT();
        }
        return this.LLIZ;
    }

    public final void LJIJI() {
        SparseArray<Rect> sparseArray;
        int i = C2187451AjH.LIZ;
        C21682919tT c21682919tT = this.LLIZ;
        if (c21682919tT != null && (sparseArray = c21682919tT.LIZ) != null) {
            sparseArray.clear();
        }
        int i2 = this.LLILZIL;
        if (i2 != -1) {
            this.LLILLL = i2;
        }
        int iMin = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
        this.LLILLL = iMin;
        this.LL = iMin;
        this.LLILLJJLI = iMin;
        this.LLILZIL = -1;
        View view = this.LLILZLL;
        if (view != null) {
            view.setSelected(false);
            this.LLILZLL = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        RecyclerView recyclerView = this.LLJJI;
        return (recyclerView == null || !recyclerView.isAnimating()) && this.LLJI == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        RecyclerView recyclerView = this.LLJJI;
        return (recyclerView == null || !recyclerView.isAnimating()) && this.LLJI == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.LLJI == 1 ? new C21682619tQ(-1, -2) : new C21682619tQ(-2, -1);
    }

    public final int LJIILL() {
        return (getWidth() - getPaddingRight()) - getPaddingLeft();
    }

    public final int LJIJ() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    public final void LJIIL(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.LLJJI = recyclerView;
            this.LLILLL = Math.max(0, 0);
            recyclerView.setLayoutManager(this);
            this.LLIZLLLIL.LIZIZ(recyclerView);
            recyclerView.addOnScrollListener(this.LLJ);
            return;
        }
        "The attach RecycleView must not null!!".toString();
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C21682619tQ;
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() != 0 && i >= this.LL) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.LLJI == 0) {
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
            return new C21682619tQ((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21682619tQ(layoutParams);
    }

    public final float LJIILIIL(View view, float f) {
        float height;
        int top;
        int height2;
        AbstractC21679819sy abstractC21679819syLJIILLIIL = LJIILLIIL();
        int iLJI = ((abstractC21679819syLJIILLIIL.LJI() - abstractC21679819syLJIILLIIL.LJIIJ()) / 2) + abstractC21679819syLJIILLIIL.LJIIJ();
        if (this.LLJI == 0) {
            height = (view.getWidth() / 2) - f;
            top = view.getLeft();
        } else {
            height = (view.getHeight() / 2) - f;
            top = view.getTop();
        }
        int i = (int) ((height + top) - iLJI);
        if (this.LLJI == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:103:0x02bc A[LOOP:5: B:96:0x02a7->B:103:0x02bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0303 A[LOOP:6: B:107:0x02f2->B:114:0x0303, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00de A[EDGE_INSN: B:183:0x00de->B:34:0x00de BREAK  A[LOOP:0: B:12:0x0057->B:19:0x006a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[LOOP:0: B:12:0x0057->B:19:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0345 A[EDGE_INSN: B:205:0x0345->B:118:0x0345 BREAK  A[LOOP:6: B:107:0x02f2->B:114:0x0303], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(int r24, X.C21673319rv r25) {
        /*
            Method dump skipped, instruction units count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager.LJIILJJIL(int, X.19rv):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C21682619tQ(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        boolean z;
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
        SparseArray<Rect> sparseArray10;
        SparseArray<Rect> sparseArray11;
        SparseArray<Rect> sparseArray12;
        SparseArray<Rect> sparseArray13;
        Rect rect4;
        SparseArray<Rect> sparseArray14;
        SparseArray<Rect> sparseArray15;
        SparseArray<Rect> sparseArray16;
        Rect rect5;
        SparseArray<Rect> sparseArray17;
        SparseArray<Rect> sparseArray18;
        Rect rect6;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutChildren() called with: state = [");
        sbLIZ.append(c21673919s1);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = 0;
        if (getItemCount() == 0) {
            LJIJI();
            detachAndScrapAttachedViews(c21673319rv);
            this.LLILZ = 0;
            return;
        }
        if (c21673919s1.LJI) {
            return;
        }
        if (c21673919s1.LIZIZ() != this.LLILZ) {
            z = true;
        } else {
            z = false;
        }
        this.LLILZ = c21673919s1.LIZIZ();
        if (c21673919s1.LIZIZ() != 0 && !c21673919s1.LJFF && !z) {
            return;
        }
        if (getChildCount() == 0 || c21673919s1.LJFF || z) {
            LJIJI();
        }
        this.LLILLL = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
        detachAndScrapAttachedViews(c21673319rv);
        float f = 2.0f;
        if (this.LLJI == 0) {
            detachAndScrapAttachedViews(c21673319rv);
            AbstractC21679819sy abstractC21679819syLJIILLIIL = LJIILLIIL();
            if (abstractC21679819syLJIILLIIL != null) {
                numValueOf3 = Integer.valueOf(abstractC21679819syLJIILLIIL.LJIIJ());
            } else {
                numValueOf3 = null;
            }
            AbstractC21679819sy abstractC21679819syLJIILLIIL2 = LJIILLIIL();
            if (abstractC21679819syLJIILLIIL2 != null) {
                numValueOf4 = Integer.valueOf(abstractC21679819syLJIILLIIL2.LJI());
            } else {
                numValueOf4 = null;
            }
            int i3 = this.LLILLL;
            Rect rect7 = new Rect();
            int iLJIJ = LJIJ();
            View viewLJI = c21673319rv.LJI(this.LLILLL);
            addView(viewLJI, 0);
            measureChildWithMargins(viewLJI, 0, 0);
            int paddingTop = (int) (getPaddingTop() + ((iLJIJ - r6) / 2.0f));
            int paddingLeft = (int) (getPaddingLeft() + ((LJIILL() - r8) / 2.0f));
            rect7.set(paddingLeft, paddingTop, getDecoratedMeasuredWidth(viewLJI) + paddingLeft, getDecoratedMeasuredHeight(viewLJI) + paddingTop);
            layoutDecorated(viewLJI, rect7.left, rect7.top, rect7.right, rect7.bottom);
            C21682919tT c21682919tTLJIIZILJ = LJIIZILJ();
            if (c21682919tTLJIIZILJ != null && (sparseArray17 = c21682919tTLJIIZILJ.LIZ) != null && sparseArray17.get(i3) != null) {
                C21682919tT c21682919tTLJIIZILJ2 = LJIIZILJ();
                if (c21682919tTLJIIZILJ2 != null && (sparseArray18 = c21682919tTLJIIZILJ2.LIZ) != null && (rect6 = sparseArray18.get(i3)) != null) {
                    rect6.set(rect7);
                }
            } else {
                C21682919tT c21682919tTLJIIZILJ3 = LJIIZILJ();
                if (c21682919tTLJIIZILJ3 != null && (sparseArray10 = c21682919tTLJIIZILJ3.LIZ) != null) {
                    sparseArray10.put(i3, rect7);
                }
            }
            this.LLILLJJLI = i3;
            this.LL = i3;
            int decoratedLeft = getDecoratedLeft(viewLJI);
            int decoratedRight = getDecoratedRight(viewLJI);
            if (numValueOf3 != null) {
                int i4 = this.LLILLL - 1;
                int iIntValue = numValueOf3.intValue();
                Rect rect8 = new Rect();
                int iLJIJ2 = LJIJ();
                while (i4 >= 0 && decoratedLeft > iIntValue) {
                    View viewLJI2 = c21673319rv.LJI(i4);
                    addView(viewLJI2, i2);
                    measureChildWithMargins(viewLJI2, i2, i2);
                    int paddingTop2 = (int) (getPaddingTop() + ((iLJIJ2 - r8) / f));
                    rect8.set(decoratedLeft - getDecoratedMeasuredWidth(viewLJI2), paddingTop2, decoratedLeft, getDecoratedMeasuredHeight(viewLJI2) + paddingTop2);
                    layoutDecorated(viewLJI2, rect8.left, rect8.top, rect8.right, rect8.bottom);
                    decoratedLeft = rect8.left;
                    this.LL = i4;
                    C21682919tT c21682919tTLJIIZILJ4 = LJIIZILJ();
                    if (c21682919tTLJIIZILJ4 != null && (sparseArray15 = c21682919tTLJIIZILJ4.LIZ) != null && sparseArray15.get(i4) != null) {
                        C21682919tT c21682919tTLJIIZILJ5 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ5 != null && (sparseArray16 = c21682919tTLJIIZILJ5.LIZ) != null && (rect5 = sparseArray16.get(i4)) != null) {
                            rect5.set(rect8);
                        }
                    } else {
                        C21682919tT c21682919tTLJIIZILJ6 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ6 != null && (sparseArray14 = c21682919tTLJIIZILJ6.LIZ) != null) {
                            sparseArray14.put(i4, rect8);
                        }
                    }
                    i4--;
                    i2 = 0;
                    f = 2.0f;
                }
            }
            if (numValueOf4 != null) {
                int iIntValue2 = numValueOf4.intValue();
                Rect rect9 = new Rect();
                int iLJIJ3 = LJIJ();
                for (int i5 = this.LLILLL + 1; i5 < getItemCount() && decoratedRight < iIntValue2; i5++) {
                    View viewLJI3 = c21673319rv.LJI(i5);
                    addView(viewLJI3);
                    measureChildWithMargins(viewLJI3, 0, 0);
                    int paddingTop3 = (int) (getPaddingTop() + ((iLJIJ3 - r8) / 2.0f));
                    rect9.set(decoratedRight, paddingTop3, getDecoratedMeasuredWidth(viewLJI3) + decoratedRight, getDecoratedMeasuredHeight(viewLJI3) + paddingTop3);
                    layoutDecorated(viewLJI3, rect9.left, rect9.top, rect9.right, rect9.bottom);
                    decoratedRight = rect9.right;
                    this.LLILLJJLI = i5;
                    C21682919tT c21682919tTLJIIZILJ7 = LJIIZILJ();
                    if (c21682919tTLJIIZILJ7 != null && (sparseArray12 = c21682919tTLJIIZILJ7.LIZ) != null && sparseArray12.get(i5) != null) {
                        C21682919tT c21682919tTLJIIZILJ8 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ8 != null && (sparseArray13 = c21682919tTLJIIZILJ8.LIZ) != null && (rect4 = sparseArray13.get(i5)) != null) {
                            rect4.set(rect9);
                        }
                    } else {
                        C21682919tT c21682919tTLJIIZILJ9 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ9 != null && (sparseArray11 = c21682919tTLJIIZILJ9.LIZ) != null) {
                            sparseArray11.put(i5, rect9);
                        }
                    }
                }
            }
        } else {
            detachAndScrapAttachedViews(c21673319rv);
            AbstractC21679819sy abstractC21679819syLJIILLIIL3 = LJIILLIIL();
            if (abstractC21679819syLJIILLIIL3 != null) {
                numValueOf = Integer.valueOf(abstractC21679819syLJIILLIIL3.LJIIJ());
            } else {
                numValueOf = null;
            }
            AbstractC21679819sy abstractC21679819syLJIILLIIL4 = LJIILLIIL();
            if (abstractC21679819syLJIILLIIL4 != null) {
                numValueOf2 = Integer.valueOf(abstractC21679819syLJIILLIIL4.LJI());
            } else {
                numValueOf2 = null;
            }
            int i6 = this.LLILLL;
            Rect rect10 = new Rect();
            int iLJIILL = LJIILL();
            View viewLJI4 = c21673319rv.LJI(this.LLILLL);
            addView(viewLJI4, 0);
            measureChildWithMargins(viewLJI4, 0, 0);
            int paddingLeft2 = (int) (getPaddingLeft() + ((iLJIILL - r8) / 2.0f));
            int paddingTop4 = (int) (getPaddingTop() + ((LJIJ() - r7) / 2.0f));
            rect10.set(paddingLeft2, paddingTop4, getDecoratedMeasuredWidth(viewLJI4) + paddingLeft2, getDecoratedMeasuredHeight(viewLJI4) + paddingTop4);
            layoutDecorated(viewLJI4, rect10.left, rect10.top, rect10.right, rect10.bottom);
            C21682919tT c21682919tTLJIIZILJ10 = LJIIZILJ();
            if (c21682919tTLJIIZILJ10 != null && (sparseArray8 = c21682919tTLJIIZILJ10.LIZ) != null && sparseArray8.get(i6) != null) {
                C21682919tT c21682919tTLJIIZILJ11 = LJIIZILJ();
                if (c21682919tTLJIIZILJ11 != null && (sparseArray9 = c21682919tTLJIIZILJ11.LIZ) != null && (rect3 = sparseArray9.get(i6)) != null) {
                    rect3.set(rect10);
                }
            } else {
                C21682919tT c21682919tTLJIIZILJ12 = LJIIZILJ();
                if (c21682919tTLJIIZILJ12 != null && (sparseArray = c21682919tTLJIIZILJ12.LIZ) != null) {
                    sparseArray.put(i6, rect10);
                }
            }
            this.LLILLJJLI = i6;
            this.LL = i6;
            int decoratedTop = getDecoratedTop(viewLJI4);
            int decoratedBottom = getDecoratedBottom(viewLJI4);
            if (numValueOf != null) {
                int iIntValue3 = numValueOf.intValue();
                Rect rect11 = new Rect();
                int iLJIILL2 = LJIILL();
                for (int i7 = this.LLILLL - 1; i7 >= 0 && decoratedTop > iIntValue3; i7--) {
                    View viewLJI5 = c21673319rv.LJI(i7);
                    addView(viewLJI5, 0);
                    measureChildWithMargins(viewLJI5, 0, 0);
                    int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI5);
                    int paddingLeft3 = (int) (getPaddingLeft() + ((iLJIILL2 - decoratedMeasuredWidth) / 2.0f));
                    rect11.set(paddingLeft3, decoratedTop - getDecoratedMeasuredHeight(viewLJI5), decoratedMeasuredWidth + paddingLeft3, decoratedTop);
                    layoutDecorated(viewLJI5, rect11.left, rect11.top, rect11.right, rect11.bottom);
                    decoratedTop = rect11.top;
                    this.LL = i7;
                    C21682919tT c21682919tTLJIIZILJ13 = LJIIZILJ();
                    if (c21682919tTLJIIZILJ13 != null && (sparseArray6 = c21682919tTLJIIZILJ13.LIZ) != null && sparseArray6.get(i7) != null) {
                        C21682919tT c21682919tTLJIIZILJ14 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ14 != null && (sparseArray7 = c21682919tTLJIIZILJ14.LIZ) != null && (rect2 = sparseArray7.get(i7)) != null) {
                            rect2.set(rect11);
                        }
                    } else {
                        C21682919tT c21682919tTLJIIZILJ15 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ15 != null && (sparseArray5 = c21682919tTLJIIZILJ15.LIZ) != null) {
                            sparseArray5.put(i7, rect11);
                        }
                    }
                }
            }
            if (numValueOf2 != null) {
                int iIntValue4 = numValueOf2.intValue();
                Rect rect12 = new Rect();
                int iLJIILL3 = LJIILL();
                for (int i8 = this.LLILLL + 1; i8 < getItemCount() && decoratedBottom < iIntValue4; i8++) {
                    View viewLJI6 = c21673319rv.LJI(i8);
                    addView(viewLJI6);
                    measureChildWithMargins(viewLJI6, 0, 0);
                    int paddingLeft4 = (int) (getPaddingLeft() + ((iLJIILL3 - r9) / 2.0f));
                    rect12.set(paddingLeft4, decoratedBottom, getDecoratedMeasuredWidth(viewLJI6) + paddingLeft4, getDecoratedMeasuredHeight(viewLJI6) + decoratedBottom);
                    layoutDecorated(viewLJI6, rect12.left, rect12.top, rect12.right, rect12.bottom);
                    decoratedBottom = rect12.bottom;
                    this.LLILLJJLI = i8;
                    C21682919tT c21682919tTLJIIZILJ16 = LJIIZILJ();
                    if (c21682919tTLJIIZILJ16 != null && (sparseArray3 = c21682919tTLJIIZILJ16.LIZ) != null && sparseArray3.get(i8) != null) {
                        C21682919tT c21682919tTLJIIZILJ17 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ17 != null && (sparseArray4 = c21682919tTLJIIZILJ17.LIZ) != null && (rect = sparseArray4.get(i8)) != null) {
                            rect.set(rect12);
                        }
                    } else {
                        C21682919tT c21682919tTLJIIZILJ18 = LJIIZILJ();
                        if (c21682919tTLJIIZILJ18 != null && (sparseArray2 = c21682919tTLJIIZILJ18.LIZ) != null) {
                            sparseArray2.put(i8, rect12);
                        }
                    }
                }
            }
        }
        int i9 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("firstFillCover finish:first: ");
        sbLIZ2.append(this.LL);
        sbLIZ2.append(",last:");
        sbLIZ2.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LLJILLL != null) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != null && this.LLJILLL != null) {
                    C744300THo.LIZ(childAt, LJIILIIL(childAt, 0));
                }
            }
        }
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView != null) {
            LJJIIZI(recyclerView, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        int i3 = this.LLILZIL;
        if (i3 == -1) {
            return;
        }
        if (i3 >= i + i2) {
            this.LLILZIL = i3 - i2;
            return;
        }
        if (i3 < i) {
            return;
        }
        int itemCount = getItemCount() - 1;
        if (itemCount < 0) {
            itemCount = 0;
        }
        if (i > itemCount) {
            i = itemCount;
        }
        this.LLILZIL = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        View childAt;
        int iMin;
        View childAt2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int iLJI = ((LJIILLIIL().LJI() - LJIILLIIL().LJIIJ()) / 2) + LJIILLIIL().LJIIJ();
        if (i > 0) {
            View childAt3 = getChildAt(getChildCount() - 1);
            if (childAt3 != null && getPosition(childAt3) == getItemCount() - 1 && (childAt2 = getChildAt(getChildCount() - 1)) != null) {
                iMin = Math.max(0, Math.min(i, (((childAt2.getRight() - childAt2.getLeft()) / 2) + childAt2.getLeft()) - iLJI));
                i2 = -iMin;
            }
        } else if (this.LL == 0 && (childAt = getChildAt(0)) != null) {
            iMin = Math.min(0, Math.max(i, (((childAt.getRight() - childAt.getLeft()) / 2) + childAt.getLeft()) - iLJI));
            i2 = -iMin;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("scrollHorizontallyBy: dx:");
        sbLIZ.append(i);
        sbLIZ.append(",fixed:");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIZILJ();
        int i4 = -i2;
        LJIILJJIL(i4, c21673319rv);
        offsetChildrenHorizontal(i2);
        return i4;
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
        int iLJI = ((LJIILLIIL().LJI() - LJIILLIIL().LJIIJ()) / 2) + LJIILLIIL().LJIIJ();
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
        LJIIZILJ();
        int i4 = -i2;
        LJIILJJIL(i4, c21673319rv);
        offsetChildrenVertical(i2);
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        if (i >= 0 && i < c21673919s1.LIZIZ()) {
            final Context context = recyclerView.getContext();
            C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.19sl
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
}
