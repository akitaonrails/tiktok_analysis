package com.ss.android.ugc.aweme.poi.detail.post.tag;

import X.C1189890h4N;
import X.C1189900h4O;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C1697810uHb;
import X.C21673319rv;
import X.C21673919s1;
import X.C21675719sJ;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.poi.detail.post.tag.TagBarLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class TagBarLayoutManager extends RecyclerView.LayoutManager {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLJI;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJIIJIL;
    public int LLILZ = C13LZ.LJ(1, 1, 2);
    public final SparseArray<Rect> LLIZLLLIL = new SparseArray<>();
    public final Rect LLJ = new Rect();
    public int LLJIJIL = -1;
    public int[] LLJILJIL = new int[0];
    public int[] LLJILJILJ = new int[0];
    public int[] LLJILLL = new int[0];
    public int[] LLJJ = new int[0];
    public int LLJJIJI = -1;
    public int LLJJIJIL = -1;

    public final void LJIJ() {
        this.LLILZLL = 0;
        this.LLIZ = 0;
        this.LLIZLLLIL.clear();
        this.LLJIJIL = -1;
        this.LLJILJIL = new int[0];
        this.LLJILJILJ = new int[0];
        this.LLJILLL = new int[0];
        this.LLJJ = new int[0];
        this.LLJJI = 0;
        this.LLJJIII = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return false;
    }

    public final void LJIIZILJ() {
        this.LLIZLLLIL.clear();
        this.LLJIJIL = -1;
        int i = this.LLILZ;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = getPaddingLeft();
        }
        this.LLJILJIL = iArr;
        int[] iArr2 = new int[this.LLILZ];
        this.LLJILJILJ = iArr2;
        iArr2[0] = getPaddingTop() + this.LLILLJJLI;
        if (this.LLILZ == 2) {
            this.LLJILJILJ[1] = getPaddingTop() + this.LLILLJJLI + this.LLILLL;
        }
        int i3 = this.LLILZ;
        this.LLJILLL = new int[i3];
        int[] iArr3 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr3[i4] = getPaddingLeft();
        }
        this.LLJJ = iArr3;
        this.LLJJI = getPaddingLeft();
        this.LLJJIII = getPaddingTop() + this.LLILLJJLI;
        LJIJJLI();
    }

    public final int LJIJJ() {
        return Math.max(this.LL * 6, 120);
    }

    public final void LJIJJLI() {
        int iIntValue;
        int paddingBottom;
        this.LLILZLL = this.LLJJI + getPaddingRight();
        if (this.LLILZ == 1) {
            int paddingTop = getPaddingTop() + this.LLILLJJLI;
            Integer numLJJIIJ = C13LQ.LJJIIJ(0, this.LLJILLL);
            iIntValue = paddingTop + (numLJJIIJ != null ? numLJJIIJ.intValue() : 0) + this.LLILLJJLI;
            paddingBottom = getPaddingBottom();
        } else {
            int paddingTop2 = getPaddingTop() + this.LLILLJJLI;
            Integer numLJJIIJ2 = C13LQ.LJJIIJ(0, this.LLJILLL);
            int iIntValue2 = paddingTop2 + (numLJJIIJ2 != null ? numLJJIIJ2.intValue() : 0) + this.LLILLL;
            Integer numLJJIIJ3 = C13LQ.LJJIIJ(1, this.LLJILLL);
            iIntValue = iIntValue2 + (numLJJIIJ3 != null ? numLJJIIJ3.intValue() : 0) + this.LLILLJJLI;
            paddingBottom = getPaddingBottom();
        }
        this.LLIZ = Math.max(iIntValue + paddingBottom, this.LLJJIII + this.LLILLJJLI + getPaddingBottom());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        return new SavedState(this.LLILZIL, this.LLILZ);
    }

    public final int LJIILIIL(int i) {
        Rect rect;
        if (i == -1 || (rect = this.LLIZLLLIL.get(i)) == null) {
            return 0;
        }
        int paddingLeft = this.LLILZIL + getPaddingLeft();
        int width = (this.LLILZIL + getWidth()) - getPaddingRight();
        int i2 = rect.left;
        if (i2 < paddingLeft) {
            return i2 - paddingLeft;
        }
        int i3 = rect.right;
        if (i3 <= width) {
            return 0;
        }
        return i3 - width;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(C21673919s1 c21673919s1) {
        return Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        return this.LLILZIL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
        return this.LLILZLL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        LJIJ();
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = 0;
        this.LLJJIJIL = -1;
        super.onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState;
        if ((parcelable instanceof SavedState) && (savedState = (SavedState) parcelable) != null) {
            this.LLILZ = C13LZ.LJ(savedState.rowCount, 1, 2);
            this.LLILZIL = Math.max(0, savedState.scrollOffset);
            LJIJ();
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = 0;
        requestLayout();
    }

    public static final class SavedState implements Parcelable {
        public static final C21675719sJ CREATOR = new Parcelable.Creator<SavedState>() { // from class: X.19sJ
            @Override // android.os.Parcelable.Creator
            public final TagBarLayoutManager.SavedState createFromParcel(Parcel parcel) {
                return new TagBarLayoutManager.SavedState(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final TagBarLayoutManager.SavedState[] newArray(int i) {
                return new TagBarLayoutManager.SavedState[i];
            }
        };
        public final int rowCount;
        public final int scrollOffset;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(int i, int i2) {
            this.scrollOffset = i;
            this.rowCount = i2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.scrollOffset);
            parcel.writeInt(this.rowCount);
        }
    }

    public final boolean LJIILLIIL(int i, int i2) {
        int i3 = this.LLJIJIL + 1;
        int i4 = i2 - 1;
        if (i3 > i4) {
            return false;
        }
        if (i != 0 ? i4 % 2 != 1 : i4 % 2 != 0) {
            i4 = i2 - 2;
        }
        if (i3 <= i4) {
            return true;
        }
        return false;
    }

    public final void LJIJI(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int iLIZIZ = c21673919s1.LIZIZ();
        if (iLIZIZ <= 0) {
            return;
        }
        int i = this.LLILZIL;
        int width = getWidth() + i;
        int i2 = 0;
        do {
            Rect rect = this.LLIZLLLIL.get(i2);
            if (rect != null && rect.right > i && rect.left < width) {
                View viewLJI = c21673319rv.LJI(i2);
                addView(viewLJI);
                measureChildWithMargins(viewLJI, 0, 0);
                int i3 = rect.left;
                int i4 = this.LLILZIL;
                layoutDecoratedWithMargins(viewLJI, i3 - i4, rect.top, rect.right - i4, rect.bottom);
            }
            i2++;
        } while (i2 < iLIZIZ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int width;
        int paddingRight;
        if (c21673919s1.LIZIZ() <= 0) {
            detachAndScrapAttachedViews(c21673319rv);
            this.LLILZIL = 0;
            LJIJ();
            return;
        }
        if (getWidth() > 0) {
            width = getWidth();
        } else {
            width = this.LLJI;
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(this.LLJJIJI), Integer.valueOf(this.LLJJIJIL));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (((Number) obj).intValue() != -1) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList);
        if (num != null) {
            LJIILJJIL(num.intValue(), c21673319rv, c21673919s1);
        }
        LJIILL(this.LLILZIL + width + LJIJJ(), c21673319rv, c21673919s1);
        int i = this.LLJJIJI;
        if (i != -1) {
            Rect rect = this.LLIZLLLIL.get(i);
            if (rect != null) {
                this.LLILZIL = (rect.left - getPaddingLeft()) - this.LLJJIJIIJIL;
            }
            this.LLJJIJI = -1;
            this.LLJJIJIIJIL = 0;
        }
        LJIILL(this.LLILZIL + width + LJIJJ(), c21673319rv, c21673919s1);
        this.LLILZIL = C13LZ.LJ(this.LLILZIL, 0, Math.max(0, this.LLILZLL - width));
        int i2 = this.LLJJIJIL;
        if (i2 != -1) {
            this.LLJJIJIL = -1;
            LJIILJJIL(i2, c21673319rv, c21673919s1);
            Rect rect2 = this.LLIZLLLIL.get(i2);
            if (rect2 != null) {
                int paddingLeft = this.LLILZIL + getPaddingLeft();
                int paddingRight2 = (this.LLILZIL + width) - getPaddingRight();
                int i3 = rect2.left;
                if (i3 < paddingLeft) {
                    paddingRight = i3 - getPaddingLeft();
                } else {
                    int i4 = rect2.right;
                    if (i4 > paddingRight2) {
                        paddingRight = i4 - (width - getPaddingRight());
                    } else {
                        paddingRight = this.LLILZIL;
                    }
                }
                this.LLILZIL = paddingRight;
            }
        }
        LJIILL(this.LLILZIL + width + LJIJJ(), c21673319rv, c21673919s1);
        this.LLILZIL = C13LZ.LJ(this.LLILZIL, 0, Math.max(0, this.LLILZLL - width));
        detachAndScrapAttachedViews(c21673319rv);
        LJIJI(c21673319rv, c21673919s1);
    }

    public TagBarLayoutManager(int i, int i2, int i3) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    public final void LJIIL(C21673319rv c21673319rv, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4;
        int iMakeMeasureSpec;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i > i2) {
            return;
        }
        while (true) {
            View viewLJI = c21673319rv.LJI(i);
            ViewGroup.LayoutParams layoutParams = viewLJI.getLayoutParams();
            Integer numValueOf = null;
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            if (marginLayoutParams != null) {
                i3 = marginLayoutParams.leftMargin;
            } else {
                i3 = 0;
            }
            int i9 = paddingLeft + i3;
            if (marginLayoutParams != null) {
                i4 = marginLayoutParams.rightMargin;
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            int width = this.LLJI;
            if (width <= 0 && (width = getWidth()) < 0) {
                width = 0;
            }
            int iMax = Math.max(0, width - i10);
            if (marginLayoutParams != null) {
                numValueOf = Integer.valueOf(marginLayoutParams.width);
            }
            if (numValueOf != null && numValueOf.intValue() == -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
            } else if (numValueOf == null || numValueOf.intValue() == -2) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(marginLayoutParams.width, 1073741824);
            }
            viewLJI.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            calculateItemDecorationsForChild(viewLJI, this.LLJ);
            int measuredWidth = viewLJI.getMeasuredWidth();
            Rect rect = this.LLJ;
            int i11 = measuredWidth + rect.left + rect.right;
            if (marginLayoutParams != null) {
                i5 = marginLayoutParams.leftMargin;
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (marginLayoutParams != null) {
                i6 = marginLayoutParams.rightMargin;
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            calculateItemDecorationsForChild(viewLJI, rect);
            int measuredHeight = viewLJI.getMeasuredHeight();
            Rect rect2 = this.LLJ;
            int i14 = measuredHeight + rect2.top + rect2.bottom;
            if (marginLayoutParams != null) {
                i7 = marginLayoutParams.topMargin;
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (marginLayoutParams != null) {
                i8 = marginLayoutParams.bottomMargin;
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            int i17 = this.LLILZ;
            int i18 = i % i17;
            if (i18 == 0 && i17 == 2) {
                int[] iArr = this.LLJILLL;
                int i19 = iArr[0];
                if (i16 > i19) {
                    int i20 = i16 - i19;
                    iArr[0] = i16;
                    int[] iArr2 = this.LLJILJILJ;
                    iArr2[1] = iArr2[1] + i20;
                    int size = this.LLIZLLLIL.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        if (this.LLIZLLLIL.keyAt(i21) % 2 == 1) {
                            this.LLIZLLLIL.valueAt(i21).offset(0, i20);
                        }
                    }
                    this.LLJJIII += i20;
                }
            } else {
                int[] iArr3 = this.LLJILLL;
                iArr3[i18] = Math.max(iArr3[i18], i16);
            }
            int i22 = this.LLJILJIL[i18];
            int i23 = this.LLJILJILJ[i18];
            int i24 = i13 + i22;
            int i25 = i16 + i23;
            this.LLIZLLLIL.put(i, new Rect(i22, i23, i24, i25));
            this.LLJILJIL[i18] = this.LL + i24;
            this.LLJJI = Math.max(this.LLJJI, i24);
            int[] iArr4 = this.LLJJ;
            iArr4[i18] = Math.max(iArr4[i18], i24);
            this.LLJJIII = Math.max(this.LLJJIII, i25);
            this.LLJIJIL = i;
            LJIJJLI();
            c21673319rv.LJIIJJI(viewLJI);
            if (i != i2) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void LJIILJJIL(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int iLIZIZ = c21673919s1.LIZIZ();
        if (iLIZIZ <= 0) {
            return;
        }
        if (this.LLJIJIL == -1) {
            LJIIZILJ();
        }
        int iMin = Math.min(i, iLIZIZ - 1);
        int i2 = this.LLJIJIL;
        if (i2 >= iMin) {
            return;
        }
        LJIIL(c21673319rv, i2 + 1, iMin);
    }

    public final void LJIILL(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int iIntValue;
        boolean z;
        int iIntValue2;
        boolean z2;
        int iLIZIZ = c21673919s1.LIZIZ();
        if (iLIZIZ <= 0) {
            return;
        }
        if (this.LLJIJIL == -1) {
            LJIIZILJ();
        }
        int iMax = Math.max(i, getPaddingLeft());
        while (true) {
            int i2 = iLIZIZ - 1;
            if (this.LLJIJIL < i2) {
                if (this.LLILZ == 1) {
                    if (this.LLILZLL >= iMax) {
                        return;
                    }
                } else {
                    Integer numLJJIIJ = C13LQ.LJJIIJ(0, this.LLJJ);
                    if (numLJJIIJ != null) {
                        iIntValue = numLJJIIJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue + getPaddingRight() < iMax && LJIILLIIL(0, iLIZIZ)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer numLJJIIJ2 = C13LQ.LJJIIJ(1, this.LLJJ);
                    if (numLJJIIJ2 != null) {
                        iIntValue2 = numLJJIIJ2.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (iIntValue2 + getPaddingRight() < iMax && LJIILLIIL(1, iLIZIZ)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z && !z2) {
                        return;
                    }
                }
                int i3 = this.LLJIJIL;
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    LJIIL(c21673319rv, i4, i4);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        LJIJ();
        this.LLJJIJIL = -1;
        super.onItemsAdded(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        LJIJ();
        this.LLJJIJIL = -1;
        super.onItemsRemoved(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        LJIJ();
        this.LLJJIJIL = -1;
        super.onItemsUpdated(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i2 = this.LLILZIL + i;
        LJIILL(getWidth() + i2 + LJIJJ(), c21673319rv, c21673919s1);
        int iLJ = C13LZ.LJ(i2, 0, Math.max(0, this.LLILZLL - getWidth()));
        int i3 = iLJ - this.LLILZIL;
        if (i3 == 0) {
            return 0;
        }
        this.LLILZIL = iLJ;
        detachAndScrapAttachedViews(c21673319rv);
        LJIJI(c21673319rv, c21673919s1);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        LJIJ();
        this.LLJJIJIL = -1;
        super.onItemsMoved(recyclerView, i, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        if (obj != C1189900h4O.LIZ && obj != C1189890h4N.LIZ) {
            LJIJ();
            this.LLJJIJIL = -1;
        }
        super.onItemsUpdated(recyclerView, i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
        this.LLJI = View.MeasureSpec.getSize(i);
        if (c21673919s1.LIZIZ() <= 0) {
            LJIJ();
        } else {
            if (this.LLJIJIL == -1) {
                LJIIZILJ();
            }
            int i3 = this.LLJI;
            List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(this.LLJJIJI), Integer.valueOf(this.LLJJIJIL));
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJIIJJI) {
                if (((Number) obj).intValue() != -1) {
                    arrayList.add(obj);
                }
            }
            Integer num = (Integer) C13LP.LJJLIIIJLJLI(arrayList);
            if (num != null) {
                LJIILJJIL(num.intValue(), c21673319rv, c21673919s1);
            }
            LJIILL(this.LLILZIL + i3 + LJIJJ(), c21673319rv, c21673919s1);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSize(this.LLIZ, i2));
    }
}
