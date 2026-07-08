package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C09CT;
import X.C12KA;
import X.C12KE;
import X.EnumC1083790eJF;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class OuterEffectTextConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextConfig> CREATOR = new Parcelable.Creator<OuterEffectTextConfig>() { // from class: X.12K8
        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextConfig createFromParcel(Parcel parcel) {
            OuterEffectTextShadowConfig outerEffectTextShadowConfigCreateFromParcel;
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i16 = parcel.readInt();
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            float f = parcel.readFloat();
            float f2 = parcel.readFloat();
            float f3 = parcel.readFloat();
            String string5 = parcel.readString();
            int i19 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i19);
            for (int i20 = 0; i20 != i19; i20++) {
                arrayList.add(OuterEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
            }
            int i21 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i21);
            for (int i22 = 0; i22 != i21; i22++) {
                arrayList2.add(OuterEffectTextCoverConfig.CREATOR.createFromParcel(parcel));
            }
            int i23 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i23);
            for (int i24 = 0; i24 != i23; i24++) {
                arrayList3.add(OuterEffectTextBgConfig.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                outerEffectTextShadowConfigCreateFromParcel = null;
            } else {
                outerEffectTextShadowConfigCreateFromParcel = OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel);
            }
            return new OuterEffectTextConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, string, string2, i14, i15, string3, string4, i16, i17, i18, f, f2, f3, string5, arrayList, arrayList2, arrayList3, outerEffectTextShadowConfigCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final OuterEffectTextConfig[] newArray(int i) {
            return new OuterEffectTextConfig[i];
        }
    };

    @C09CT("bg_configs")
    public final List<OuterEffectTextBgConfig> bgConfigs;

    @C09CT("cover_configs")
    public final List<OuterEffectTextCoverConfig> coverConfigs;

    @C09CT("cursor_color")
    public final String cursorColor;

    @C09CT("font_style")
    public final int fontStyle;

    @C09CT("gradient_orientation")
    public final int gradientOrientation;

    @C09CT("gradient_type")
    public final int gradientType;

    @C09CT("gravity")
    public final int gravity;

    @C09CT("layer_weight")
    public final int layerWeight;

    @C09CT("margin_bottom")
    public final int marginBottom;

    @C09CT("margin_end")
    public final int marginEnd;

    @C09CT("margin_start")
    public final int marginStart;

    @C09CT("margin_top")
    public final int marginTop;

    @C09CT("max_line")
    public final int maxLine;

    @C09CT("min_height")
    public final int minHeight;

    @C09CT("min_width")
    public final int minWidth;

    @C09CT("padding_bottom")
    public final int paddingBottom;

    @C09CT("padding_end")
    public final int paddingEnd;

    @C09CT("padding_start")
    public final int paddingStart;

    @C09CT("padding_top")
    public final int paddingTop;

    @C09CT("paint_style")
    public final int paintStyle;

    @C09CT("placeholder_string_color")
    public final String placeholderStringColor;

    @C09CT("shadow_config")
    public final OuterEffectTextShadowConfig shadowConfig;

    @C09CT("spacing_add")
    public final float spacingAdd;

    @C09CT("spacing_letter")
    public final float spacingLetter;

    @C09CT("spacing_mult")
    public final float spacingMult;

    @C09CT("stroke_configs")
    public final List<OuterEffectTextStrokeConfig> strokeConfigs;

    @C09CT("text_color_end")
    public final String textColorEnd;

    @C09CT("text_color_start")
    public final String textColorStart;

    @C09CT("text_size")
    public final int textSize;

    @C09CT("typeface_id")
    public final String typefaceId;

    public final OuterEffectTextConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, int i18, float f, float f2, float f3, String str5, List<OuterEffectTextStrokeConfig> list, List<OuterEffectTextCoverConfig> list2, List<OuterEffectTextBgConfig> list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        return new OuterEffectTextConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, str, str2, i14, i15, str3, str4, i16, i17, i18, f, f2, f3, str5, list, list2, list3, outerEffectTextShadowConfig);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextConfig)) {
            return false;
        }
        OuterEffectTextConfig outerEffectTextConfig = (OuterEffectTextConfig) obj;
        return this.paddingStart == outerEffectTextConfig.paddingStart && this.paddingEnd == outerEffectTextConfig.paddingEnd && this.paddingTop == outerEffectTextConfig.paddingTop && this.paddingBottom == outerEffectTextConfig.paddingBottom && this.layerWeight == outerEffectTextConfig.layerWeight && this.marginStart == outerEffectTextConfig.marginStart && this.marginEnd == outerEffectTextConfig.marginEnd && this.marginTop == outerEffectTextConfig.marginTop && this.marginBottom == outerEffectTextConfig.marginBottom && this.textSize == outerEffectTextConfig.textSize && this.maxLine == outerEffectTextConfig.maxLine && this.minWidth == outerEffectTextConfig.minWidth && this.minHeight == outerEffectTextConfig.minHeight && Intrinsics.LJFF(this.placeholderStringColor, outerEffectTextConfig.placeholderStringColor) && Intrinsics.LJFF(this.typefaceId, outerEffectTextConfig.typefaceId) && this.fontStyle == outerEffectTextConfig.fontStyle && this.paintStyle == outerEffectTextConfig.paintStyle && Intrinsics.LJFF(this.textColorStart, outerEffectTextConfig.textColorStart) && Intrinsics.LJFF(this.textColorEnd, outerEffectTextConfig.textColorEnd) && this.gradientType == outerEffectTextConfig.gradientType && this.gradientOrientation == outerEffectTextConfig.gradientOrientation && this.gravity == outerEffectTextConfig.gravity && Float.compare(this.spacingMult, outerEffectTextConfig.spacingMult) == 0 && Float.compare(this.spacingAdd, outerEffectTextConfig.spacingAdd) == 0 && Float.compare(this.spacingLetter, outerEffectTextConfig.spacingLetter) == 0 && Intrinsics.LJFF(this.cursorColor, outerEffectTextConfig.cursorColor) && Intrinsics.LJFF(this.strokeConfigs, outerEffectTextConfig.strokeConfigs) && Intrinsics.LJFF(this.coverConfigs, outerEffectTextConfig.coverConfigs) && Intrinsics.LJFF(this.bgConfigs, outerEffectTextConfig.bgConfigs) && Intrinsics.LJFF(this.shadowConfig, outerEffectTextConfig.shadowConfig);
    }

    public String toString() {
        return "OuterEffectTextConfig(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", layerWeight=" + this.layerWeight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", textSize=" + this.textSize + ", maxLine=" + this.maxLine + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", placeholderStringColor=" + this.placeholderStringColor + ", typefaceId=" + this.typefaceId + ", fontStyle=" + this.fontStyle + ", paintStyle=" + this.paintStyle + ", textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", gravity=" + this.gravity + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", spacingLetter=" + this.spacingLetter + ", cursorColor=" + this.cursorColor + ", strokeConfigs=" + this.strokeConfigs + ", coverConfigs=" + this.coverConfigs + ", bgConfigs=" + this.bgConfigs + ", shadowConfig=" + this.shadowConfig + ')';
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
        parcel.writeString(this.placeholderStringColor);
        parcel.writeString(this.typefaceId);
        parcel.writeInt(this.fontStyle);
        parcel.writeInt(this.paintStyle);
        parcel.writeString(this.textColorStart);
        parcel.writeString(this.textColorEnd);
        parcel.writeInt(this.gradientType);
        parcel.writeInt(this.gradientOrientation);
        parcel.writeInt(this.gravity);
        parcel.writeFloat(this.spacingMult);
        parcel.writeFloat(this.spacingAdd);
        parcel.writeFloat(this.spacingLetter);
        parcel.writeString(this.cursorColor);
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        Iterator<OuterEffectTextStrokeConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<OuterEffectTextCoverConfig> list2 = this.coverConfigs;
        parcel.writeInt(list2.size());
        Iterator<OuterEffectTextCoverConfig> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<OuterEffectTextBgConfig> list3 = this.bgConfigs;
        parcel.writeInt(list3.size());
        Iterator<OuterEffectTextBgConfig> it4 = list3.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(parcel, i);
        }
    }

    public OuterEffectTextConfig() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 44, 3, 0, 0, "#FF888888", "", 0, Paint.Style.FILL.ordinal(), "#ffffffff", "#ffffffff", C12KA.NONE.getType(), C12KE.VERTICAL.getOrientation(), EnumC1083790eJF.CENTER.getGravity(), 1.0f, 0.0f, 0.0f, "", new ArrayList(), new ArrayList(), new ArrayList(), null);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.paddingStart * 31) + this.paddingEnd) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.layerWeight) * 31) + this.marginStart) * 31) + this.marginEnd) * 31) + this.marginTop) * 31) + this.marginBottom) * 31) + this.textSize) * 31) + this.maxLine) * 31) + this.minWidth) * 31) + this.minHeight) * 31) + this.placeholderStringColor.hashCode()) * 31) + this.typefaceId.hashCode()) * 31) + this.fontStyle) * 31) + this.paintStyle) * 31) + this.textColorStart.hashCode()) * 31) + this.textColorEnd.hashCode()) * 31) + this.gradientType) * 31) + this.gradientOrientation) * 31) + this.gravity) * 31) + Float.floatToIntBits(this.spacingMult)) * 31) + Float.floatToIntBits(this.spacingAdd)) * 31) + Float.floatToIntBits(this.spacingLetter)) * 31) + this.cursorColor.hashCode()) * 31) + this.strokeConfigs.hashCode()) * 31) + this.coverConfigs.hashCode()) * 31) + this.bgConfigs.hashCode()) * 31;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        return iHashCode + (outerEffectTextShadowConfig == null ? 0 : outerEffectTextShadowConfig.hashCode());
    }

    public final List<OuterEffectTextBgConfig> getBgConfigs() {
        return this.bgConfigs;
    }

    public final List<OuterEffectTextCoverConfig> getCoverConfigs() {
        return this.coverConfigs;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
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

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final String getPlaceholderStringColor() {
        return this.placeholderStringColor;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
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

    public final List<OuterEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final String getTextColorEnd() {
        return this.textColorEnd;
    }

    public final String getTextColorStart() {
        return this.textColorStart;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final String getTypefaceId() {
        return this.typefaceId;
    }

    public OuterEffectTextConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, int i18, float f, float f2, float f3, String str5, List<OuterEffectTextStrokeConfig> list, List<OuterEffectTextCoverConfig> list2, List<OuterEffectTextBgConfig> list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
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
        this.placeholderStringColor = str;
        this.typefaceId = str2;
        this.fontStyle = i14;
        this.paintStyle = i15;
        this.textColorStart = str3;
        this.textColorEnd = str4;
        this.gradientType = i16;
        this.gradientOrientation = i17;
        this.gravity = i18;
        this.spacingMult = f;
        this.spacingAdd = f2;
        this.spacingLetter = f3;
        this.cursorColor = str5;
        this.strokeConfigs = list;
        this.coverConfigs = list2;
        this.bgConfigs = list3;
        this.shadowConfig = outerEffectTextShadowConfig;
    }
}
