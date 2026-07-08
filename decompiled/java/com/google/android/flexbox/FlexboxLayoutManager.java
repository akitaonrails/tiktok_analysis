package com.google.android.flexbox;

import X.AbstractC21673619ry;
import X.AbstractC21679819sy;
import X.C21532719Or;
import X.C21532919Ot;
import X.C21533019Ou;
import X.C21673319rv;
import X.C21673919s1;
import X.C21674119s3;
import X.C21674319s5;
import X.C21674619s8;
import X.C21675919sL;
import X.C21679619sw;
import X.C21679719sx;
import X.C2188811AlT;
import X.InterfaceC20634915op;
import X.InterfaceC21533119Ov;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements InterfaceC21533119Ov, InterfaceC20634915op {
    public static final Rect LLJJL = new Rect();
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public List<C21532719Or> LLIZLLLIL;
    public final C21533019Ou LLJ;
    public C21673319rv LLJI;
    public C21673919s1 LLJIJIL;
    public C21674619s8 LLJILJIL;
    public final C21674319s5 LLJILJILJ;
    public AbstractC21679819sy LLJILLL;
    public AbstractC21679819sy LLJJ;
    public SavedState LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public final SparseArray<View> LLJJJ;
    public final Context LLJJJIL;
    public View LLJJJJ;
    public int LLJJJJJIL;
    public final C21532919Ot LLJJJJLIIL;

    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: X.19QX
            @Override // android.os.Parcelable.Creator
            public final FlexboxLayoutManager.LayoutParams createFromParcel(Parcel parcel) {
                return new FlexboxLayoutManager.LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final FlexboxLayoutManager.LayoutParams[] newArray(int i) {
                return new FlexboxLayoutManager.LayoutParams[i];
            }
        };
        public int mAlignSelf;
        public float mFlexBasisPercent;
        public float mFlexGrow;
        public float mFlexShrink;
        public int mMaxHeight;
        public int mMaxWidth;
        public int mMinHeight;
        public int mMinWidth;
        public boolean mWrapBefore;

        public LayoutParams() {
            super(-2, -2);
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getOrder() {
            return 1;
        }

        public final void LIZ() {
            this.mFlexBasisPercent = 1.0f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Ca() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float Fo() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int GM() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean oO() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float tB() {
            return this.mFlexGrow;
        }

        public LayoutParams(Parcel parcel) {
            boolean z;
            super(-2, -2);
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.mWrapBefore = z;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void WD(int i) {
            this.mMinWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void sB(int i) {
            this.mMinHeight = i;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }
    }

    public FlexboxLayoutManager() {
        throw null;
    }

    @Override // X.InterfaceC21533119Ov
    public final void LIZ(C21532719Or c21532719Or) {
    }

    @Override // X.InterfaceC21533119Ov
    public final int getAlignContent() {
        return 5;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: X.19nL
            @Override // android.os.Parcelable.Creator
            public final FlexboxLayoutManager.SavedState createFromParcel(Parcel parcel) {
                return new FlexboxLayoutManager.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final FlexboxLayoutManager.SavedState[] newArray(int i) {
                return new FlexboxLayoutManager.SavedState[i];
            }
        };
        public int mAnchorOffset;
        public int mAnchorPosition;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SavedState{mAnchorPosition=");
            sbLIZ.append(this.mAnchorPosition);
            sbLIZ.append(", mAnchorOffset=");
            sbLIZ.append(this.mAnchorOffset);
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
        }
    }

    @Override // X.InterfaceC21533119Ov
    public final boolean LJIIJJI() {
        int i = this.LL;
        return i == 0 || i == 1;
    }

    public final void LJIIL() {
        if (this.LLJILLL != null) {
            return;
        }
        if (LJIIJJI()) {
            if (this.LLILLJJLI == 0) {
                this.LLJILLL = new C21679619sw(this);
                this.LLJJ = new C21679719sx(this);
                return;
            } else {
                this.LLJILLL = new C21679719sx(this);
                this.LLJJ = new C21679619sw(this);
                return;
            }
        }
        if (this.LLILLJJLI == 0) {
            this.LLJILLL = new C21679719sx(this);
            this.LLJJ = new C21679619sw(this);
        } else {
            this.LLJILLL = new C21679619sw(this);
            this.LLJJ = new C21679719sx(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        if (this.LLILLJJLI == 0) {
            return LJIIJJI();
        }
        if (LJIIJJI()) {
            int width = getWidth();
            View view = this.LLJJJJ;
            if (width <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.LLILLJJLI == 0) {
            return !LJIIJJI();
        }
        if (LJIIJJI()) {
            return true;
        }
        int height = getHeight();
        View view = this.LLJJJJ;
        return height > (view != null ? view.getHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // X.InterfaceC21533119Ov
    public final int getFlexItemCount() {
        return this.LLJIJIL.LIZIZ();
    }

    @Override // X.InterfaceC21533119Ov
    public final int getLargestMainSize() {
        if (this.LLIZLLLIL.size() == 0) {
            return 0;
        }
        int size = this.LLIZLLLIL.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((C21532719Or) ListProtector.get(this.LLIZLLLIL, i)).LJ);
        }
        return iMax;
    }

    @Override // X.InterfaceC21533119Ov
    public final int getSumOfCrossSize() {
        int size = this.LLIZLLLIL.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C21532719Or) ListProtector.get(this.LLIZLLLIL, i2)).LJI;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        if (this.LLJJI != null) {
            return new SavedState(this.LLJJI);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.mAnchorPosition = -1;
            return savedState;
        }
        View childAt = getChildAt(0);
        savedState.mAnchorPosition = getPosition(childAt);
        savedState.mAnchorOffset = this.LLJILLL.LJ(childAt) - this.LLJILLL.LJIIJ();
        return savedState;
    }

    public final void LJJ() {
        int heightMode = LJIIJJI() ? getHeightMode() : getWidthMode();
        this.LLJILJIL.LIZIZ = heightMode == 0 || heightMode == Integer.MIN_VALUE;
    }

    public final int findLastVisibleItemPosition() {
        View viewLJIJ = LJIJ(getChildCount() - 1, -1, false);
        if (viewLJIJ != null) {
            return getPosition(viewLJIJ);
        }
        return -1;
    }

    @Override // X.InterfaceC21533119Ov
    public final int getAlignItems() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC21533119Ov
    public final int getFlexDirection() {
        return this.LL;
    }

    @Override // X.InterfaceC21533119Ov
    public final List<C21532719Or> getFlexLinesInternal() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC21533119Ov
    public final int getFlexWrap() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC21533119Ov
    public final int getMaxLine() {
        return this.LLILZIL;
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0);
    }

    @Override // X.InterfaceC21533119Ov
    public final View LIZJ(int i) {
        View view = this.LLJJJ.get(i);
        if (view != null) {
            return view;
        }
        return this.LLJI.LJI(i);
    }

    @Override // X.InterfaceC21533119Ov
    public final int LJFF(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (LJIIJJI()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // X.InterfaceC21533119Ov
    public final View LJIIIIZZ(int i) {
        return LIZJ(i);
    }

    public final View LJIILJJIL(int i) {
        View viewLJIJI = LJIJI(0, getChildCount(), i);
        if (viewLJIJI == null) {
            return null;
        }
        int i2 = this.LLJ.LIZJ[getPosition(viewLJIJI)];
        if (i2 == -1) {
            return null;
        }
        return LJIILL(viewLJIJI, (C21532719Or) ListProtector.get(this.LLIZLLLIL, i2));
    }

    public final View LJIILLIIL(int i) {
        View viewLJIJI = LJIJI(getChildCount() - 1, -1, i);
        if (viewLJIJI == null) {
            return null;
        }
        return LJIIZILJ(viewLJIJI, (C21532719Or) ListProtector.get(this.LLIZLLLIL, this.LLJ.LIZJ[getPosition(viewLJIJI)]));
    }

    public final int LJIJJLI(int i) {
        int height;
        int height2;
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        LJIIL();
        boolean zLJIIJJI = LJIIJJI();
        View view = this.LLJJJJ;
        if (zLJIIJJI) {
            height = view.getWidth();
            height2 = getWidth();
        } else {
            height = view.getHeight();
            height2 = getHeight();
        }
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((height2 + this.LLJILJILJ.LIZLLL) - height, iAbs);
            }
            i2 = this.LLJILJILJ.LIZLLL;
            if (i2 + i <= 0) {
                return i;
            }
        } else {
            if (i > 0) {
                return Math.min((height2 - this.LLJILJILJ.LIZLLL) - height, i);
            }
            i2 = this.LLJILJILJ.LIZLLL;
            if (i2 + i >= 0) {
                return i;
            }
        }
        return -i2;
    }

    public final void LJJI(int i) {
        int i2 = this.LLILZ;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                removeAllViews();
                this.LLIZLLLIL.clear();
                this.LLJILJILJ.LIZIZ();
                this.LLJILJILJ.LIZLLL = 0;
            }
            this.LLILZ = i;
            requestLayout();
        }
    }

    public final void LJJIFFI(int i) {
        if (this.LL != i) {
            removeAllViews();
            this.LL = i;
            this.LLJILLL = null;
            this.LLJJ = null;
            this.LLIZLLLIL.clear();
            this.LLJILJILJ.LIZIZ();
            this.LLJILJILJ.LIZLLL = 0;
            requestLayout();
        }
    }

    public final void LJJII(int i) {
        int i2 = this.LLILLJJLI;
        if (i2 != 1) {
            if (i2 == 0) {
                removeAllViews();
                this.LLIZLLLIL.clear();
                this.LLJILJILJ.LIZIZ();
                this.LLJILJILJ.LIZLLL = 0;
            }
            this.LLILLJJLI = 1;
            this.LLJILLL = null;
            this.LLJJ = null;
            requestLayout();
        }
    }

    public final void LJJIII(int i) {
        if (this.LLILLL != i) {
            this.LLILLL = i;
            requestLayout();
        }
    }

    public final void LJJIIJ(int i) {
        if (i >= findLastVisibleItemPosition()) {
            return;
        }
        int childCount = getChildCount();
        this.LLJ.LJIIIZ(childCount);
        this.LLJ.LJIIJ(childCount);
        this.LLJ.LJIIIIZZ(childCount);
        if (i >= this.LLJ.LIZJ.length) {
            return;
        }
        this.LLJJJJJIL = i;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.LLJJIII = getPosition(childAt);
        if (!LJIIJJI() && this.LLILZLL) {
            this.LLJJIJI = this.LLJILLL.LIZIZ(childAt) + this.LLJILLL.LJII();
        } else {
            this.LLJJIJI = this.LLJILLL.LJ(childAt) - this.LLJILLL.LJIIJ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(C21673919s1 c21673919s1) {
        return computeScrollExtent(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        return computeScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
        return computeScrollRange(c21673919s1);
    }

    public final int computeScrollExtent(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iLIZIZ = c21673919s1.LIZIZ();
        LJIIL();
        View viewLJIILJJIL = LJIILJJIL(iLIZIZ);
        View viewLJIILLIIL = LJIILLIIL(iLIZIZ);
        if (c21673919s1.LIZIZ() == 0 || viewLJIILJJIL == null || viewLJIILLIIL == null) {
            return 0;
        }
        return Math.min(this.LLJILLL.LJIIJJI(), this.LLJILLL.LIZIZ(viewLJIILLIIL) - this.LLJILLL.LJ(viewLJIILJJIL));
    }

    public final int computeScrollOffset(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        int iLIZIZ = c21673919s1.LIZIZ();
        View viewLJIILJJIL = LJIILJJIL(iLIZIZ);
        View viewLJIILLIIL = LJIILLIIL(iLIZIZ);
        if (c21673919s1.LIZIZ() != 0 && viewLJIILJJIL != null && viewLJIILLIIL != null) {
            int position = getPosition(viewLJIILJJIL);
            int position2 = getPosition(viewLJIILLIIL);
            int iAbs = Math.abs(this.LLJILLL.LIZIZ(viewLJIILLIIL) - this.LLJILLL.LJ(viewLJIILJJIL));
            int[] iArr = this.LLJ.LIZJ;
            int i = iArr[position];
            if (i != 0 && i != -1) {
                return Math.round((i * (iAbs / ((iArr[position2] - i) + 1))) + (this.LLJILLL.LJIIJ() - this.LLJILLL.LJ(viewLJIILJJIL)));
            }
        }
        return 0;
    }

    public final int computeScrollRange(C21673919s1 c21673919s1) {
        int position;
        if (getChildCount() == 0) {
            return 0;
        }
        int iLIZIZ = c21673919s1.LIZIZ();
        View viewLJIILJJIL = LJIILJJIL(iLIZIZ);
        View viewLJIILLIIL = LJIILLIIL(iLIZIZ);
        if (c21673919s1.LIZIZ() == 0 || viewLJIILJJIL == null || viewLJIILLIIL == null) {
            return 0;
        }
        View viewLJIJ = LJIJ(0, getChildCount(), false);
        if (viewLJIJ == null) {
            position = -1;
        } else {
            position = getPosition(viewLJIJ);
        }
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        return (int) ((Math.abs(this.LLJILLL.LIZIZ(viewLJIILLIIL) - this.LLJILLL.LJ(viewLJIILJJIL)) / ((iFindLastVisibleItemPosition - position) + 1)) * c21673919s1.LIZIZ());
    }

    @Override // X.InterfaceC20634915op
    public final PointF computeScrollVectorForPosition(int i) {
        int i2;
        if (getChildCount() == 0) {
            return null;
        }
        if (i < getPosition(getChildAt(0))) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (LJIIJJI()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(C21673919s1 c21673919s1) {
        return computeScrollExtent(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
        return computeScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(C21673919s1 c21673919s1) {
        return computeScrollRange(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLJJJJ = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        this.LLJJI = null;
        this.LLJJIII = -1;
        this.LLJJIJI = Integer.MIN_VALUE;
        this.LLJJJJJIL = -1;
        this.LLJILJILJ.LIZIZ();
        this.LLJJJ.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.LLJJI = (SavedState) parcelable;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.LLJJIII = i;
        this.LLJJIJI = Integer.MIN_VALUE;
        SavedState savedState = this.LLJJI;
        if (savedState != null) {
            savedState.mAnchorPosition = -1;
        }
        requestLayout();
    }

    @Override // X.InterfaceC21533119Ov
    public final void setFlexLines(List<C21532719Or> list) {
        this.LLIZLLLIL = list;
    }

    public FlexboxLayoutManager(Context context, int i) {
        this.LLILZIL = -1;
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = new C21533019Ou(this);
        this.LLJILJILJ = new C21674319s5(this);
        this.LLJJIII = -1;
        this.LLJJIJI = Integer.MIN_VALUE;
        this.LLJJIJIIJIL = Integer.MIN_VALUE;
        this.LLJJIJIL = Integer.MIN_VALUE;
        this.LLJJJ = new SparseArray<>();
        this.LLJJJJJIL = -1;
        this.LLJJJJLIIL = new C21532919Ot();
        LJJIFFI(0);
        LJJII(1);
        LJJI(4);
        setAutoMeasureEnabled(true);
        this.LLJJJIL = context;
    }

    @Override // X.InterfaceC21533119Ov
    public final void LJIIJ(int i, View view) {
        this.LLJJJ.put(i, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJIILL(android.view.View r7, X.C21532719Or r8) {
        /*
            r6 = this;
            boolean r5 = r6.LJIIJJI()
            int r4 = r8.LJII
            r3 = 1
        L7:
            if (r3 >= r4) goto L3e
            android.view.View r2 = r6.getChildAt(r3)
            if (r2 == 0) goto L2c
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L2c
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L2f
            if (r5 != 0) goto L2f
            X.19sy r0 = r6.LLJILLL
            int r1 = r0.LIZIZ(r7)
            X.19sy r0 = r6.LLJILLL
            int r0 = r0.LIZIZ(r2)
            if (r1 >= r0) goto L2c
        L2b:
            r7 = r2
        L2c:
            int r3 = r3 + 1
            goto L7
        L2f:
            X.19sy r0 = r6.LLJILLL
            int r1 = r0.LJ(r7)
            X.19sy r0 = r6.LLJILLL
            int r0 = r0.LJ(r2)
            if (r1 <= r0) goto L2c
            goto L2b
        L3e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LJIILL(android.view.View, X.19Or):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJIIZILJ(android.view.View r7, X.C21532719Or r8) {
        /*
            r6 = this;
            boolean r5 = r6.LJIIJJI()
            int r0 = r6.getChildCount()
            int r3 = r0 + (-2)
            int r1 = r6.getChildCount()
            int r0 = r8.LJII
            int r1 = r1 - r0
            int r4 = r1 + (-1)
        L13:
            if (r3 <= r4) goto L4a
            android.view.View r2 = r6.getChildAt(r3)
            if (r2 == 0) goto L38
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L38
            boolean r0 = r6.LLILZLL
            if (r0 == 0) goto L3b
            if (r5 != 0) goto L3b
            X.19sy r0 = r6.LLJILLL
            int r1 = r0.LJ(r7)
            X.19sy r0 = r6.LLJILLL
            int r0 = r0.LJ(r2)
            if (r1 <= r0) goto L38
        L37:
            r7 = r2
        L38:
            int r3 = r3 + (-1)
            goto L13
        L3b:
            X.19sy r0 = r6.LLJILLL
            int r1 = r0.LIZIZ(r7)
            X.19sy r0 = r6.LLJILLL
            int r0 = r0.LIZIZ(r2)
            if (r1 >= r0) goto L38
            goto L37
        L4a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LJIIZILJ(android.view.View, X.19Or):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.C21673319rv r11, X.C21674619s8 r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LJIL(X.19rv, X.19s8):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020d  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(X.C21673319rv r24, X.C21673919s1 r25) {
        /*
            Method dump skipped, instruction units count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(X.19rv, X.19s1):void");
    }

    public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC21533119Ov
    public final int LIZLLL(int i, int i2, View view) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (LJIIJJI()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // X.InterfaceC21533119Ov
    public final int LJII(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // X.InterfaceC21533119Ov
    public final int LJIIIZ(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x03cb, code lost:
    
        r4 = r34.LIZ - r19;
        r34.LIZ = r4;
        r3 = r34.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d5, code lost:
    
        if (r3 == Integer.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d7, code lost:
    
        r3 = r3 + r19;
        r34.LJFF = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03db, code lost:
    
        if (r4 >= 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03dd, code lost:
    
        r34.LJFF = r3 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03e0, code lost:
    
        LJIL(r32, r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03e8, code lost:
    
        return r15 - r34.LIZ;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILIIL(X.C21673319rv r32, X.C21673919s1 r33, X.C21674619s8 r34) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LJIILIIL(X.19rv, X.19s1, X.19s8):int");
    }

    public final View LJIJ(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View childAt = getChildAt(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
            if (paddingLeft <= decoratedLeft && width >= decoratedRight) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (decoratedLeft < width && decoratedRight < paddingLeft) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (paddingTop <= decoratedTop && height >= decoratedBottom) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (decoratedTop < height && decoratedBottom < paddingTop) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z) {
                if (z2 && z4) {
                    return childAt;
                }
            } else if (z3 && z5) {
                return childAt;
            }
            i += i3;
        }
        return null;
    }

    public final View LJIJI(int i, int i2, int i3) {
        int i4;
        LJIIL();
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C21674619s8();
        }
        int iLJIIJ = this.LLJILLL.LJIIJ();
        int iLJI = this.LLJILLL.LJI();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.LLJILLL.LJ(childAt) >= iLJIIJ && this.LLJILLL.LIZIZ(childAt) <= iLJI) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIJJ(int r25, X.C21673319rv r26, X.C21673919s1 r27) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.LJIJJ(int, X.19rv, X.19s1):int");
    }

    public final void LJJIIJZLJL(C21674319s5 c21674319s5, boolean z, boolean z2) {
        int i;
        if (z2) {
            LJJ();
        } else {
            this.LLJILJIL.LIZIZ = false;
        }
        if (!LJIIJJI() && this.LLILZLL) {
            this.LLJILJIL.LIZ = c21674319s5.LIZJ - getPaddingRight();
        } else {
            this.LLJILJIL.LIZ = this.LLJILLL.LJI() - c21674319s5.LIZJ;
        }
        C21674619s8 c21674619s8 = this.LLJILJIL;
        c21674619s8.LIZLLL = c21674319s5.LIZ;
        c21674619s8.LJII = 1;
        c21674619s8.LJIIIIZZ = 1;
        c21674619s8.LJ = c21674319s5.LIZJ;
        c21674619s8.LJFF = Integer.MIN_VALUE;
        c21674619s8.LIZJ = c21674319s5.LIZIZ;
        if (z && this.LLIZLLLIL.size() > 1 && (i = c21674319s5.LIZIZ) >= 0 && i < this.LLIZLLLIL.size() - 1) {
            C21532719Or c21532719Or = (C21532719Or) ListProtector.get(this.LLIZLLLIL, c21674319s5.LIZIZ);
            C21674619s8 c21674619s82 = this.LLJILJIL;
            c21674619s82.LIZJ++;
            c21674619s82.LIZLLL += c21532719Or.LJII;
        }
    }

    public final void LJJIIZ(C21674319s5 c21674319s5, boolean z, boolean z2) {
        if (z2) {
            LJJ();
        } else {
            this.LLJILJIL.LIZIZ = false;
        }
        if (!LJIIJJI() && this.LLILZLL) {
            this.LLJILJIL.LIZ = (this.LLJJJJ.getWidth() - c21674319s5.LIZJ) - this.LLJILLL.LJIIJ();
        } else {
            this.LLJILJIL.LIZ = c21674319s5.LIZJ - this.LLJILLL.LJIIJ();
        }
        C21674619s8 c21674619s8 = this.LLJILJIL;
        c21674619s8.LIZLLL = c21674319s5.LIZ;
        c21674619s8.LJII = 1;
        c21674619s8.LJIIIIZZ = -1;
        c21674619s8.LJ = c21674319s5.LIZJ;
        c21674619s8.LJFF = Integer.MIN_VALUE;
        int i = c21674319s5.LIZIZ;
        c21674619s8.LIZJ = i;
        if (z && i > 0) {
            int size = this.LLIZLLLIL.size();
            int i2 = c21674319s5.LIZIZ;
            if (size > i2) {
                C21532719Or c21532719Or = (C21532719Or) ListProtector.get(this.LLIZLLLIL, i2);
                C21674619s8 c21674619s82 = this.LLJILJIL;
                c21674619s82.LIZJ--;
                c21674619s82.LIZLLL -= c21532719Or.LJII;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        LJJIIJ(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        LJJIIJ(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        super.onItemsUpdated(recyclerView, i, i2);
        LJJIIJ(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (!LJIIJJI() || (this.LLILLJJLI == 0 && LJIIJJI())) {
            int iLJIJJ = LJIJJ(i, c21673319rv, c21673919s1);
            this.LLJJJ.clear();
            return iLJIJJ;
        }
        int iLJIJJLI = LJIJJLI(i);
        this.LLJILJILJ.LIZLLL += iLJIJJLI;
        this.LLJJ.LJIILL(-iLJIJJLI);
        return iLJIJJLI;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (LJIIJJI() || (this.LLILLJJLI == 0 && !LJIIJJI())) {
            int iLJIJJ = LJIJJ(i, c21673319rv, c21673919s1);
            this.LLJJJ.clear();
            return iLJIJJ;
        }
        int iLJIJJLI = LJIJJLI(i);
        this.LLJILJILJ.LIZLLL += iLJIJJLI;
        this.LLJJ.LJIILL(-iLJIJJLI);
        return iLJIJJLI;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C21674119s3 c21674119s3 = new C21674119s3(recyclerView.getContext());
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.LLILZIL = -1;
        this.LLIZLLLIL = new ArrayList();
        this.LLJ = new C21533019Ou(this);
        this.LLJILJILJ = new C21674319s5(this);
        this.LLJJIII = -1;
        this.LLJJIJI = Integer.MIN_VALUE;
        this.LLJJIJIIJIL = Integer.MIN_VALUE;
        this.LLJJIJIL = Integer.MIN_VALUE;
        this.LLJJJ = new SparseArray<>();
        this.LLJJJJJIL = -1;
        this.LLJJJJLIIL = new C21532919Ot();
        C21675919sL properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        int i3 = properties.LIZ;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.LIZJ) {
                    LJJIFFI(3);
                } else {
                    LJJIFFI(2);
                }
            }
        } else if (properties.LIZJ) {
            LJJIFFI(1);
        } else {
            LJJIFFI(0);
        }
        LJJII(1);
        LJJI(4);
        setAutoMeasureEnabled(true);
        this.LLJJJIL = context;
    }

    private boolean shouldMeasureChild(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        if (!view.isLayoutRequested() && isMeasurementCacheEnabled() && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC21533119Ov
    public final void LJI(View view, int i, int i2, C21532719Or c21532719Or) {
        calculateItemDecorationsForChild(view, LLJJL);
        if (LJIIJJI()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            c21532719Or.LJ += leftDecorationWidth;
            c21532719Or.LJFF += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            c21532719Or.LJ += topDecorationHeight;
            c21532719Or.LJFF += topDecorationHeight;
        }
    }

    public final int fixLayoutEndGap(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJIJJ;
        int iLJI;
        if (!LJIIJJI() && this.LLILZLL) {
            int iLJIIJ = i - this.LLJILLL.LJIIJ();
            if (iLJIIJ <= 0) {
                return 0;
            }
            iLJIJJ = LJIJJ(iLJIIJ, c21673319rv, c21673919s1);
        } else {
            int iLJI2 = this.LLJILLL.LJI() - i;
            if (iLJI2 <= 0) {
                return 0;
            }
            iLJIJJ = -LJIJJ(-iLJI2, c21673319rv, c21673919s1);
        }
        int i2 = i + iLJIJJ;
        if (z && (iLJI = this.LLJILLL.LJI() - i2) > 0) {
            this.LLJILLL.LJIILL(iLJI);
            return iLJI + iLJIJJ;
        }
        return iLJIJJ;
    }

    public final int fixLayoutStartGap(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJIJJ;
        int iLJIIJ;
        if (!LJIIJJI() && this.LLILZLL) {
            int iLJI = this.LLJILLL.LJI() - i;
            if (iLJI <= 0) {
                return 0;
            }
            iLJIJJ = LJIJJ(-iLJI, c21673319rv, c21673919s1);
        } else {
            int iLJIIJ2 = i - this.LLJILLL.LJIIJ();
            if (iLJIIJ2 <= 0) {
                return 0;
            }
            iLJIJJ = -LJIJJ(iLJIIJ2, c21673319rv, c21673919s1);
        }
        int i2 = i + iLJIJJ;
        if (z && (iLJIIJ = i2 - this.LLJILLL.LJIIJ()) > 0) {
            this.LLJILLL.LJIILL(-iLJIIJ);
            return iLJIJJ - iLJIIJ;
        }
        return iLJIJJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        super.onItemsMoved(recyclerView, i, i2, i3);
        LJJIIJ(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        LJJIIJ(i);
    }
}
