package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;

/* JADX INFO: loaded from: classes34.dex */
public class FlexboxLayout$LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
    public static final Parcelable.Creator<FlexboxLayout$LayoutParams> CREATOR = new Parcelable.Creator<FlexboxLayout$LayoutParams>() { // from class: X.19MF
        @Override // android.os.Parcelable.Creator
        public final FlexboxLayout$LayoutParams createFromParcel(Parcel parcel) {
            return new FlexboxLayout$LayoutParams(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexboxLayout$LayoutParams[] newArray(int i) {
            return new FlexboxLayout$LayoutParams[i];
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
    public int mOrder;
    public boolean mWrapBefore;

    public final void LIZIZ() {
        this.mWrapBefore = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void LIZ() {
        this.mFlexGrow = 1.0f;
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
    public final int getOrder() {
        return this.mOrder;
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

    public FlexboxLayout$LayoutParams(Parcel parcel) {
        super(0, 0);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
        this.mOrder = parcel.readInt();
        this.mFlexGrow = parcel.readFloat();
        this.mFlexShrink = parcel.readFloat();
        this.mAlignSelf = parcel.readInt();
        this.mFlexBasisPercent = parcel.readFloat();
        this.mMinWidth = parcel.readInt();
        this.mMinHeight = parcel.readInt();
        this.mMaxWidth = parcel.readInt();
        this.mMaxHeight = parcel.readInt();
        this.mWrapBefore = parcel.readByte() != 0;
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

    public FlexboxLayout$LayoutParams(FlexboxLayout$LayoutParams flexboxLayout$LayoutParams) {
        super((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
        this.mOrder = flexboxLayout$LayoutParams.mOrder;
        this.mFlexGrow = flexboxLayout$LayoutParams.mFlexGrow;
        this.mFlexShrink = flexboxLayout$LayoutParams.mFlexShrink;
        this.mAlignSelf = flexboxLayout$LayoutParams.mAlignSelf;
        this.mFlexBasisPercent = flexboxLayout$LayoutParams.mFlexBasisPercent;
        this.mMinWidth = flexboxLayout$LayoutParams.mMinWidth;
        this.mMinHeight = flexboxLayout$LayoutParams.mMinHeight;
        this.mMaxWidth = flexboxLayout$LayoutParams.mMaxWidth;
        this.mMaxHeight = flexboxLayout$LayoutParams.mMaxHeight;
        this.mWrapBefore = flexboxLayout$LayoutParams.mWrapBefore;
    }

    public FlexboxLayout$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
    }

    public FlexboxLayout$LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
    }

    public FlexboxLayout$LayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOrder = 1;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout);
        this.mOrder = typedArrayObtainStyledAttributes.getInt(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_order, 1);
        this.mFlexGrow = typedArrayObtainStyledAttributes.getFloat(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
        this.mFlexShrink = typedArrayObtainStyledAttributes.getFloat(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
        this.mAlignSelf = typedArrayObtainStyledAttributes.getInt(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
        this.mFlexBasisPercent = typedArrayObtainStyledAttributes.getFraction(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
        this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_minWidth, -1);
        this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_minHeight, -1);
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
        this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
        this.mWrapBefore = typedArrayObtainStyledAttributes.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mOrder);
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

    public FlexboxLayout$LayoutParams(int i, int i2) {
        super(new ViewGroup.LayoutParams(i, i2));
        this.mOrder = 1;
        this.mFlexGrow = 0.0f;
        this.mFlexShrink = 1.0f;
        this.mAlignSelf = -1;
        this.mFlexBasisPercent = -1.0f;
        this.mMinWidth = -1;
        this.mMinHeight = -1;
        this.mMaxWidth = 16777215;
        this.mMaxHeight = 16777215;
    }
}
