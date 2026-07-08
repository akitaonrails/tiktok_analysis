package com.ss.android.ugc.gamora.recorder.sticker.gallery;

import X.AbstractC1585810rMx;
import X.C11VU;
import X.C19711312Ad;
import X.C19712112Al;
import X.C20635915oz;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import X.C21679419su;
import X.C21679619sw;
import X.C2188811AlT;
import X.C444960Hcc;
import X.InterfaceC20634915op;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.recorder.sticker.gallery.GalleryStickerLayoutManger;

/* JADX INFO: loaded from: classes34.dex */
public final class GalleryStickerLayoutManger extends RecyclerView.LayoutManager implements InterfaceC20634915op {
    public final boolean LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final C20635915oz LLILZIL;
    public final C19712112Al LLILZLL;
    public View LLIZ;
    public RecyclerView LLIZLLLIL;
    public C19711312Ad LLJ;
    public float LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    static {
        C11VU.LIZ(5.0f);
    }

    public final void LJIILIIL() {
        int i = this.LLILZ;
        if (i != -1) {
            this.LLILLL = i;
        }
        int iMin = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
        this.LLILLL = iMin;
        this.LLILLJJLI = iMin;
        this.LLILZ = -1;
        View view = this.LLIZ;
        if (view != null) {
            view.setSelected(false);
            this.LLIZ = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    public GalleryStickerLayoutManger() {
        this(!C444960Hcc.LIZIZ());
    }

    public final int LJIIL() {
        return (getHeight() - getPaddingBottom()) - getPaddingTop();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.12Al] */
    public GalleryStickerLayoutManger(boolean z) {
        this.LL = z;
        this.LLILZ = -1;
        this.LLILZIL = new C20635915oz();
        this.LLILZLL = new AbstractC1585810rMx() { // from class: X.12Al
            public int LL;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                View viewLJFF;
                Integer numValueOf;
                this.LL = i;
                if (i == 0 && (viewLJFF = this.LLILLJJLI.LLILZIL.LJFF(recyclerView.getLayoutManager())) != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                    } else {
                        numValueOf = null;
                    }
                    int i2 = this.LLILLJJLI.LLILZ;
                    if (numValueOf == null || numValueOf.intValue() != i2) {
                        this.LLILLJJLI.LLIZ = viewLJFF;
                        viewLJFF.setSelected(true);
                        if (numValueOf != null) {
                            this.LLILLJJLI.LLILZ = numValueOf.intValue();
                        }
                    }
                    C19711312Ad c19711312Ad = this.LLILLJJLI.LLJ;
                    if (c19711312Ad != null) {
                        recyclerView.getChildViewHolder(viewLJFF);
                        c19711312Ad.LIZ(this.LLILLJJLI.LLILZ);
                    }
                }
            }

            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                Integer numValueOf;
                C19711312Ad c19711312Ad;
                View viewLJFF = this.LLILLJJLI.LLILZIL.LJFF(recyclerView.getLayoutManager());
                if (viewLJFF != null) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        numValueOf = Integer.valueOf(layoutManager.getPosition(viewLJFF));
                    } else {
                        numValueOf = null;
                    }
                    int i3 = this.LLILLJJLI.LLILZ;
                    if (numValueOf == null || numValueOf.intValue() != i3) {
                        this.LLILLJJLI.LLIZ = viewLJFF;
                        viewLJFF.setSelected(true);
                        if (numValueOf != null) {
                            this.LLILLJJLI.LLILZ = numValueOf.intValue();
                        }
                        if (this.LL != 0) {
                            return;
                        }
                        GalleryStickerLayoutManger galleryStickerLayoutManger = this.LLILLJJLI;
                        if (!galleryStickerLayoutManger.LLJILJIL && (c19711312Ad = galleryStickerLayoutManger.LLJ) != null) {
                            recyclerView.getChildViewHolder(viewLJFF);
                            c19711312Ad.LIZ(this.LLILLJJLI.LLILZ);
                        }
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = 1;
        if (!this.LL ? getChildCount() == 0 || i < this.LLILLJJLI : getChildCount() != 0 && i >= this.LLILLJJLI) {
            i2 = -1;
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        Integer numValueOf;
        if (c21673319rv != null && c21673919s1 != null) {
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
            this.LLILLL = Math.min(Math.max(0, this.LLILLL), getItemCount() - 1);
            detachAndScrapAttachedViews(c21673319rv);
            detachAndScrapAttachedViews(c21673319rv);
            C21679619sw c21679619sw = new C21679619sw(this);
            int iLJIIJ = c21679619sw.LJIIJ();
            int iLJI = c21679619sw.LJI();
            int i = this.LLILLL;
            this.LLJI = (c21679619sw.LJI() - c21679619sw.LJIIJ()) / 2.0f;
            int iLJIIL = LJIIL();
            View viewLJI = c21673319rv.LJI(this.LLILLL);
            addView(viewLJI, 0);
            measureChildWithMargins(viewLJI, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewLJI);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewLJI);
            int paddingTop = (int) (getPaddingTop() + ((iLJIIL - decoratedMeasuredHeight) / 2.0f));
            float f = this.LLJI;
            float f2 = decoratedMeasuredWidth / 2;
            Rect rect = new Rect((int) (f - f2), paddingTop, (int) (f + f2), decoratedMeasuredHeight + paddingTop);
            layoutDecorated(viewLJI, rect.left, rect.top, rect.right, rect.bottom);
            if (new C21679419su().LIZ.get(i) == null) {
                new C21679419su().LIZ.put(i, rect);
            } else {
                new C21679419su().LIZ.get(i).set(rect);
            }
            this.LLILLJJLI = i;
            int iLJ = c21679619sw.LJ(viewLJI);
            int iLIZIZ = c21679619sw.LIZIZ(viewLJI);
            this.LLJIJIL = decoratedMeasuredWidth;
            if (this.LL) {
                int iLJIIL2 = LJIIL();
                for (int i2 = this.LLILLL + 1; i2 < getItemCount() && iLJ > iLJIIJ; i2++) {
                    View viewLJI2 = c21673319rv.LJI(i2);
                    addView(viewLJI2);
                    measureChildWithMargins(viewLJI2, 0, 0);
                    int paddingTop2 = (int) (getPaddingTop() + ((iLJIIL2 - r10) / 2.0f));
                    Rect rect2 = new Rect(iLJ - getDecoratedMeasuredWidth(viewLJI2), paddingTop2, iLJ, getDecoratedMeasuredHeight(viewLJI2) + paddingTop2);
                    layoutDecorated(viewLJI2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    iLJ = viewLJI2.getLeft();
                    C21679419su c21679419su = new C21679419su();
                    if (c21679419su.LIZ.get(i2) == null) {
                        c21679419su.LIZ.put(i2, rect2);
                    } else {
                        c21679419su.LIZ.get(i2).set(rect2);
                    }
                }
                int iLJIIL3 = LJIIL();
                for (int i3 = this.LLILLL - 1; i3 >= 0 && iLIZIZ < iLJI; i3--) {
                    View viewLJI3 = c21673319rv.LJI(i3);
                    addView(viewLJI3, 0);
                    measureChildWithMargins(viewLJI3, 0, 0);
                    int paddingTop3 = (int) (getPaddingTop() + ((iLJIIL3 - r8) / 2.0f));
                    Rect rect3 = new Rect(iLIZIZ, paddingTop3, getDecoratedMeasuredWidth(viewLJI3) + iLIZIZ, getDecoratedMeasuredHeight(viewLJI3) + paddingTop3);
                    layoutDecorated(viewLJI3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                    iLIZIZ = viewLJI3.getRight();
                    this.LLILLJJLI = i3;
                    if (new C21679419su().LIZ.get(i3) == null) {
                        new C21679419su().LIZ.put(i3, rect3);
                    } else {
                        new C21679419su().LIZ.get(i3).set(rect3);
                    }
                }
            } else {
                int iLJIIL4 = LJIIL();
                for (int i4 = this.LLILLL - 1; i4 >= 0 && iLJ > iLJIIJ; i4--) {
                    View viewLJI4 = c21673319rv.LJI(i4);
                    addView(viewLJI4, 0);
                    measureChildWithMargins(viewLJI4, 0, 0);
                    int paddingTop4 = (int) (getPaddingTop() + ((iLJIIL4 - r10) / 2.0f));
                    Rect rect4 = new Rect(iLJ - getDecoratedMeasuredWidth(viewLJI4), paddingTop4, iLJ, getDecoratedMeasuredHeight(viewLJI4) + paddingTop4);
                    layoutDecorated(viewLJI4, rect4.left, rect4.top, rect4.right, rect4.bottom);
                    iLJ = rect4.left;
                    this.LLILLJJLI = i4;
                    C21679419su c21679419su2 = new C21679419su();
                    if (c21679419su2.LIZ.get(i4) == null) {
                        c21679419su2.LIZ.put(i4, rect4);
                    } else {
                        c21679419su2.LIZ.get(i4).set(rect4);
                    }
                }
                int iLJIIL5 = LJIIL();
                for (int i5 = this.LLILLL + 1; i5 < getItemCount() && iLIZIZ < iLJI; i5++) {
                    View viewLJI5 = c21673319rv.LJI(i5);
                    addView(viewLJI5);
                    measureChildWithMargins(viewLJI5, 0, 0);
                    int paddingTop5 = (int) (getPaddingTop() + ((iLJIIL5 - r8) / 2.0f));
                    Rect rect5 = new Rect(iLIZIZ, paddingTop5, getDecoratedMeasuredWidth(viewLJI5) + iLIZIZ, getDecoratedMeasuredHeight(viewLJI5) + paddingTop5);
                    layoutDecorated(viewLJI5, rect5.left, rect5.top, rect5.right, rect5.bottom);
                    iLIZIZ = rect5.right;
                    if (new C21679419su().LIZ.get(i5) == null) {
                        new C21679419su().LIZ.put(i5, rect5);
                    } else {
                        new C21679419su().LIZ.get(i5).set(rect5);
                    }
                }
            }
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pendingOffset = ");
                    sbLIZ.append(0);
                    sbLIZ.append(",child.pos = ");
                    RecyclerView recyclerView = this.LLIZLLLIL;
                    if (recyclerView != null) {
                        numValueOf = Integer.valueOf(recyclerView.indexOfChild(childAt));
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    sbLIZ.append(" childOriginWidth / 2f = ");
                    sbLIZ.append(this.LLJIJIL / 2);
                    sbLIZ.append(", child.left =");
                    sbLIZ.append(new C21679619sw(this).LJ(childAt));
                    sbLIZ.append(", parentCenter = ");
                    sbLIZ.append(this.LLJI);
                    sbLIZ.append("distance = ");
                    sbLIZ.append(((this.LLJIJIL / 2) + new C21679619sw(this).LJ(childAt)) - this.LLJI);
                    C2188811AlT.LIZIZ(sbLIZ);
                    new C21679619sw(this).LJ(childAt);
                }
            }
            RecyclerView recyclerView2 = this.LLIZLLLIL;
            if (recyclerView2 != null) {
                LJJIIZI(recyclerView2, 0, 0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0471, code lost:
    
        addView(r4, 0);
        measureChildWithMargins(r4, 0, 0);
        r1 = (int) (getPaddingTop() + ((r15 - r2) / 2.0f));
        r6.set(r3 - getDecoratedMeasuredWidth(r4), r1, r3, getDecoratedMeasuredHeight(r4) + r1);
        layoutDecorated(r4, r6.left, r6.top, r6.right, r6.bottom);
        r3 = r6.left;
        r23.LLILLJJLI = r7;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f1, code lost:
    
        addView(r7, 0);
        measureChildWithMargins(r7, 0, 0);
        r0 = (int) (getPaddingTop() + ((r14 - r2) / 2.0f));
        r10.set(r3, r0, getDecoratedMeasuredWidth(r7) + r3, getDecoratedMeasuredHeight(r7) + r0);
        layoutDecorated(r7, r10.left, r10.top, r10.right, r10.bottom);
        r3 = r10.right;
        r23.LLILLJJLI = r11;
        r11 = r11 - 1;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int scrollHorizontallyBy(int r24, X.C21673319rv r25, X.C21673919s1 r26) {
        /*
            Method dump skipped, instruction units count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.gallery.GalleryStickerLayoutManger.scrollHorizontallyBy(int, X.19rv, X.19s1):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        final Context context = recyclerView.getContext();
        C21674119s3 c21674119s3 = new C21674119s3(context) { // from class: X.19sn
            @Override // X.C21674119s3
            public final int LJIIL(int i2) {
                if (i2 == 0) {
                    return 0;
                }
                return Math.max(1, Math.min(200, i2));
            }

            @Override // X.C21674119s3, X.AbstractC21674019s2
            public final void LJI(View view, C21673919s1 c21673919s12, C21675319sF c21675319sF) {
                GalleryStickerLayoutManger galleryStickerLayoutManger;
                int iLJ;
                RecyclerView.LayoutManager layoutManager = this.LIZJ;
                if (layoutManager instanceof GalleryStickerLayoutManger) {
                    galleryStickerLayoutManger = (GalleryStickerLayoutManger) layoutManager;
                } else {
                    galleryStickerLayoutManger = null;
                }
                int height = 0;
                if (galleryStickerLayoutManger != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    iLJ = ((int) galleryStickerLayoutManger.LLJI) - ((new C21679619sw(galleryStickerLayoutManger).LJ(view) - marginLayoutParams.leftMargin) + ((int) (((r2.LIZIZ(view) + marginLayoutParams.rightMargin) - r3) / 2.0f)));
                } else {
                    iLJ = 0;
                }
                RecyclerView.LayoutManager layoutManager2 = this.LIZJ;
                if ((layoutManager2 instanceof GalleryStickerLayoutManger) && layoutManager2 != null && layoutManager2.canScrollVertically()) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int decoratedTop = layoutManager2.getDecoratedTop(view) - marginLayoutParams2.topMargin;
                    int decoratedBottom = layoutManager2.getDecoratedBottom(view) + marginLayoutParams2.bottomMargin;
                    int paddingTop = layoutManager2.getPaddingTop();
                    height = ((int) (((layoutManager2.getHeight() - layoutManager2.getPaddingBottom()) - paddingTop) / 2.0f)) - (decoratedTop + ((int) ((decoratedBottom - decoratedTop) / 2.0f)));
                }
                float f = iLJ;
                float f2 = f * 1.0f * f;
                float f3 = height;
                int iLJIIL = LJIIL((int) Math.sqrt(f2 + (1.0f * f3 * f3)));
                if (iLJIIL > 0) {
                    c21675319sF.LIZIZ(-iLJ, -height, this.LJIIIIZZ, iLJIIL);
                }
            }
        };
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }
}
