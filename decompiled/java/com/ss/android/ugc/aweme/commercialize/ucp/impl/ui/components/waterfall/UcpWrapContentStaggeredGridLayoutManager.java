package com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall;

import X.C13LQ;
import X.C21673319rv;
import X.C21673919s1;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public final class UcpWrapContentStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;

    public UcpWrapContentStaggeredGridLayoutManager() {
        super(2, 1);
        this.LLJJJJLIIL = -1;
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
        int paddingTop;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.LLILZIL == 1 && mode != 1073741824 && c21673919s1.LIZIZ() != 0 && size > 0) {
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i3 = 0;
            if (paddingLeft >= 0 && paddingLeft > 0) {
                if (!c21673919s1.LJFF && this.LLJJJJLIIL == size && this.LLJJL == c21673919s1.LIZIZ() && this.LLJJLIIIJLLLLLLLZ > 0) {
                    setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(this.LLJJLIIIJLLLLLLLZ, i2));
                    return;
                }
                int i4 = this.LL;
                if (i4 < 1) {
                    i4 = 1;
                }
                int i5 = paddingLeft / i4;
                int[] iArr = new int[i4];
                int i6 = 0;
                do {
                    iArr[i6] = getPaddingTop();
                    i6++;
                } while (i6 < i4);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                try {
                    int iLIZIZ = c21673919s1.LIZIZ();
                    int i7 = 0;
                    while (i7 < iLIZIZ) {
                        View viewLJI = c21673319rv.LJI(i7);
                        try {
                            if (viewLJI.getLayoutParams() == null) {
                                C786410Ut5.W5(viewLJI, generateDefaultLayoutParams());
                            }
                            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewLJI.getLayoutParams();
                            viewLJI.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(i3, i3), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                            int measuredHeight = viewLJI.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            int i8 = iArr[0];
                            int i9 = 0;
                            for (int i10 = 1; i10 < i4; i10++) {
                                int i11 = iArr[i10];
                                if (i11 < i8) {
                                    i8 = i11;
                                    i9 = i10;
                                }
                            }
                            iArr[i9] = iArr[i9] + measuredHeight;
                            c21673319rv.LJIIJJI(viewLJI);
                            i7++;
                            i3 = 0;
                        } finally {
                        }
                    }
                    Integer numLJJJJJL = C13LQ.LJJJJJL(iArr);
                    if (numLJJJJJL != null) {
                        paddingTop = numLJJJJJL.intValue();
                    } else {
                        paddingTop = getPaddingTop();
                    }
                    int paddingBottom = paddingTop + getPaddingBottom();
                    int iResolveSize = View.resolveSize(size, i);
                    int iResolveSize2 = View.resolveSize(paddingBottom, i2);
                    this.LLJJJJLIIL = size;
                    this.LLJJL = c21673919s1.LIZIZ();
                    this.LLJJLIIIJLLLLLLLZ = paddingBottom;
                    setMeasuredDimension(iResolveSize, iResolveSize2);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLJJJJLIIL = -1;
                    this.LLJJL = -1;
                    this.LLJJLIIIJLLLLLLLZ = -1;
                    super.onMeasure(c21673319rv, c21673919s1, i, i2);
                    return;
                }
            }
            this.LLJJJJLIIL = -1;
            this.LLJJL = -1;
            this.LLJJLIIIJLLLLLLLZ = -1;
            super.onMeasure(c21673319rv, c21673919s1, i, i2);
            return;
        }
        this.LLJJJJLIIL = -1;
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = -1;
        super.onMeasure(c21673319rv, c21673919s1, i, i2);
    }
}
