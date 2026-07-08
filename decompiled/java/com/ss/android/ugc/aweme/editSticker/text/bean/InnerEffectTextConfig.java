package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C12KA;
import X.C12KE;
import X.InterfaceC1294060jmO;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectExtraConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class InnerEffectTextConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextConfig> CREATOR = new Parcelable.Creator<InnerEffectTextConfig>() { // from class: X.12K5
        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextConfig createFromParcel(Parcel parcel) {
            InnerEffectTextShadowConfig innerEffectTextShadowConfigCreateFromParcel;
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            Pair pair = (Pair) parcel.readSerializable();
            int i15 = parcel.readInt();
            Paint.Style styleValueOf = Paint.Style.valueOf(parcel.readString());
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            C12KA c12kaValueOf = C12KA.valueOf(parcel.readString());
            C12KE c12keValueOf = C12KE.valueOf(parcel.readString());
            int i18 = parcel.readInt();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            float f3 = parcel.readFloat();
            String string = parcel.readString();
            int i19 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i19);
            for (int i20 = 0; i20 != i19; i20++) {
                arrayList.add(InnerEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
            }
            int i21 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i21);
            for (int i22 = 0; i22 != i21; i22++) {
                arrayList2.add(InnerEffectTextCoverConfig.CREATOR.createFromParcel(parcel));
            }
            int i23 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i23);
            for (int i24 = 0; i24 != i23; i24++) {
                arrayList3.add(InnerEffectTextBgConfig.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                innerEffectTextShadowConfigCreateFromParcel = null;
            } else {
                innerEffectTextShadowConfigCreateFromParcel = InnerEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
            }
            return new InnerEffectTextConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, pair, i15, styleValueOf, i16, i17, c12kaValueOf, c12keValueOf, i18, f, f2, f3, string, arrayList, arrayList2, arrayList3, innerEffectTextShadowConfigCreateFromParcel, InnerEffectExtraConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final InnerEffectTextConfig[] newArray(int i) {
            return new InnerEffectTextConfig[i];
        }
    };
    public final List<InnerEffectTextBgConfig> bgConfigs;
    public final List<InnerEffectTextCoverConfig> coverConfigs;
    public final String cursorColor;
    public final InnerEffectExtraConfig extraConfig;
    public final int fontStyle;
    public final C12KE gradientOrientation;
    public final C12KA gradientType;
    public final int gravity;
    public final int layerWeight;
    public final int marginBottom;
    public final int marginEnd;
    public final int marginStart;
    public final int marginTop;
    public final int maxLine;
    public final int minHeight;
    public final int minWidth;
    public final int paddingBottom;
    public final int paddingEnd;
    public final int paddingStart;
    public final int paddingTop;
    public final Paint.Style paintStyle;
    public final int replaceStringColor;
    public final InnerEffectTextShadowConfig shadowConfig;
    public final float spacingAdd;
    public final float spacingLetter;
    public final float spacingMult;
    public final List<InnerEffectTextStrokeConfig> strokeConfigs;
    public final int textColorEnd;
    public final int textColorStart;
    public final int textSize;
    public final Pair<String, String> typefacePath;

    @InterfaceC1294060jmO
    public static /* synthetic */ void getFontStyle$annotations() {
    }

    public final InnerEffectTextConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Pair<String, String> pair, int i15, Paint.Style style, int i16, int i17, C12KA c12ka, C12KE c12ke, int i18, float f, float f2, float f3, String str, List<InnerEffectTextStrokeConfig> list, List<InnerEffectTextCoverConfig> list2, List<InnerEffectTextBgConfig> list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig) {
        return new InnerEffectTextConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, pair, i15, style, i16, i17, c12ka, c12ke, i18, f, f2, f3, str, list, list2, list3, innerEffectTextShadowConfig, innerEffectExtraConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextConfig)) {
            return false;
        }
        InnerEffectTextConfig innerEffectTextConfig = (InnerEffectTextConfig) obj;
        return this.paddingStart == innerEffectTextConfig.paddingStart && this.paddingEnd == innerEffectTextConfig.paddingEnd && this.paddingTop == innerEffectTextConfig.paddingTop && this.paddingBottom == innerEffectTextConfig.paddingBottom && this.layerWeight == innerEffectTextConfig.layerWeight && this.marginStart == innerEffectTextConfig.marginStart && this.marginEnd == innerEffectTextConfig.marginEnd && this.marginTop == innerEffectTextConfig.marginTop && this.marginBottom == innerEffectTextConfig.marginBottom && this.textSize == innerEffectTextConfig.textSize && this.maxLine == innerEffectTextConfig.maxLine && this.minWidth == innerEffectTextConfig.minWidth && this.minHeight == innerEffectTextConfig.minHeight && this.replaceStringColor == innerEffectTextConfig.replaceStringColor && Intrinsics.LJFF(this.typefacePath, innerEffectTextConfig.typefacePath) && this.fontStyle == innerEffectTextConfig.fontStyle && this.paintStyle == innerEffectTextConfig.paintStyle && this.textColorStart == innerEffectTextConfig.textColorStart && this.textColorEnd == innerEffectTextConfig.textColorEnd && this.gradientType == innerEffectTextConfig.gradientType && this.gradientOrientation == innerEffectTextConfig.gradientOrientation && this.gravity == innerEffectTextConfig.gravity && Float.compare(this.spacingMult, innerEffectTextConfig.spacingMult) == 0 && Float.compare(this.spacingAdd, innerEffectTextConfig.spacingAdd) == 0 && Float.compare(this.spacingLetter, innerEffectTextConfig.spacingLetter) == 0 && Intrinsics.LJFF(this.cursorColor, innerEffectTextConfig.cursorColor) && Intrinsics.LJFF(this.strokeConfigs, innerEffectTextConfig.strokeConfigs) && Intrinsics.LJFF(this.coverConfigs, innerEffectTextConfig.coverConfigs) && Intrinsics.LJFF(this.bgConfigs, innerEffectTextConfig.bgConfigs) && Intrinsics.LJFF(this.shadowConfig, innerEffectTextConfig.shadowConfig) && Intrinsics.LJFF(this.extraConfig, innerEffectTextConfig.extraConfig);
    }

    public String toString() {
        return "InnerEffectTextConfig(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", layerWeight=" + this.layerWeight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", textSize=" + this.textSize + ", maxLine=" + this.maxLine + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", replaceStringColor=" + this.replaceStringColor + ", typefacePath=" + this.typefacePath + ", fontStyle=" + this.fontStyle + ", paintStyle=" + this.paintStyle + ", textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", gravity=" + this.gravity + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", spacingLetter=" + this.spacingLetter + ", cursorColor=" + this.cursorColor + ", strokeConfigs=" + this.strokeConfigs + ", coverConfigs=" + this.coverConfigs + ", bgConfigs=" + this.bgConfigs + ", shadowConfig=" + this.shadowConfig + ", extraConfig=" + this.extraConfig + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.marginStart);
        parcel.writeInt(this.marginEnd);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.maxLine);
        parcel.writeInt(this.minWidth);
        parcel.writeInt(this.minHeight);
        parcel.writeInt(this.replaceStringColor);
        parcel.writeSerializable(this.typefacePath);
        parcel.writeInt(this.fontStyle);
        parcel.writeString(this.paintStyle.name());
        parcel.writeInt(this.textColorStart);
        parcel.writeInt(this.textColorEnd);
        parcel.writeString(this.gradientType.name());
        parcel.writeString(this.gradientOrientation.name());
        parcel.writeInt(this.gravity);
        parcel.writeFloat(this.spacingMult);
        parcel.writeFloat(this.spacingAdd);
        parcel.writeFloat(this.spacingLetter);
        parcel.writeString(this.cursorColor);
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        Iterator<InnerEffectTextStrokeConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<InnerEffectTextCoverConfig> list2 = this.coverConfigs;
        parcel.writeInt(list2.size());
        Iterator<InnerEffectTextCoverConfig> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<InnerEffectTextBgConfig> list3 = this.bgConfigs;
        parcel.writeInt(list3.size());
        Iterator<InnerEffectTextBgConfig> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            innerEffectTextShadowConfig.writeToParcel(parcel, i);
        }
        this.extraConfig.writeToParcel(parcel, i);
    }

    public InnerEffectTextConfig() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 44, 3, 0, 0, -7829368, null, 0, Paint.Style.FILL, -1, -1, C12KA.NONE, C12KE.VERTICAL, 17, 1.0f, 0.0f, 0.0f, "", new ArrayList(), new ArrayList(), new ArrayList(), null, new InnerEffectExtraConfig(false));
    }

    public int hashCode() {
        int i = ((((((((((((((((((((((((((this.paddingStart * 31) + this.paddingEnd) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.layerWeight) * 31) + this.marginStart) * 31) + this.marginEnd) * 31) + this.marginTop) * 31) + this.marginBottom) * 31) + this.textSize) * 31) + this.maxLine) * 31) + this.minWidth) * 31) + this.minHeight) * 31) + this.replaceStringColor) * 31;
        Pair<String, String> pair = this.typefacePath;
        int iHashCode = (((((((((((((((((((((((((((((i + (pair == null ? 0 : pair.hashCode())) * 31) + this.fontStyle) * 31) + this.paintStyle.hashCode()) * 31) + this.textColorStart) * 31) + this.textColorEnd) * 31) + this.gradientType.hashCode()) * 31) + this.gradientOrientation.hashCode()) * 31) + this.gravity) * 31) + Float.floatToIntBits(this.spacingMult)) * 31) + Float.floatToIntBits(this.spacingAdd)) * 31) + Float.floatToIntBits(this.spacingLetter)) * 31) + this.cursorColor.hashCode()) * 31) + this.strokeConfigs.hashCode()) * 31) + this.coverConfigs.hashCode()) * 31) + this.bgConfigs.hashCode()) * 31;
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        return ((iHashCode + (innerEffectTextShadowConfig != null ? innerEffectTextShadowConfig.hashCode() : 0)) * 31) + this.extraConfig.hashCode();
    }

    public final List<InnerEffectTextBgConfig> getBgConfigs() {
        return this.bgConfigs;
    }

    public final List<InnerEffectTextCoverConfig> getCoverConfigs() {
        return this.coverConfigs;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final InnerEffectExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final C12KE getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final C12KA getGradientType() {
        return this.gradientType;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getLayerWeight() {
        return this.layerWeight;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginEnd() {
        return this.marginEnd;
    }

    public final int getMarginStart() {
        return this.marginStart;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final int getMaxLine() {
        return this.maxLine;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final Paint.Style getPaintStyle() {
        return this.paintStyle;
    }

    public final int getReplaceStringColor() {
        return this.replaceStringColor;
    }

    public final InnerEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final float getSpacingAdd() {
        return this.spacingAdd;
    }

    public final float getSpacingLetter() {
        return this.spacingLetter;
    }

    public final float getSpacingMult() {
        return this.spacingMult;
    }

    public final List<InnerEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final int getTextColorEnd() {
        return this.textColorEnd;
    }

    public final int getTextColorStart() {
        return this.textColorStart;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final Pair<String, String> getTypefacePath() {
        return this.typefacePath;
    }

    public InnerEffectTextConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, Pair<String, String> pair, int i15, Paint.Style style, int i16, int i17, C12KA c12ka, C12KE c12ke, int i18, float f, float f2, float f3, String str, List<InnerEffectTextStrokeConfig> list, List<InnerEffectTextCoverConfig> list2, List<InnerEffectTextBgConfig> list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig) {
        this.paddingStart = i;
        this.paddingEnd = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
        this.layerWeight = i5;
        this.marginStart = i6;
        this.marginEnd = i7;
        this.marginTop = i8;
        this.marginBottom = i9;
        this.textSize = i10;
        this.maxLine = i11;
        this.minWidth = i12;
        this.minHeight = i13;
        this.replaceStringColor = i14;
        this.typefacePath = pair;
        this.fontStyle = i15;
        this.paintStyle = style;
        this.textColorStart = i16;
        this.textColorEnd = i17;
        this.gradientType = c12ka;
        this.gradientOrientation = c12ke;
        this.gravity = i18;
        this.spacingMult = f;
        this.spacingAdd = f2;
        this.spacingLetter = f3;
        this.cursorColor = str;
        this.strokeConfigs = list;
        this.coverConfigs = list2;
        this.bgConfigs = list3;
        this.shadowConfig = innerEffectTextShadowConfig;
        this.extraConfig = innerEffectExtraConfig;
    }
}
