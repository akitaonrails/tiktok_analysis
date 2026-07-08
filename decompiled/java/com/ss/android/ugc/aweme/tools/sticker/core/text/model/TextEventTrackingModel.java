package com.ss.android.ugc.aweme.tools.sticker.core.text.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextEventTrackingModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TextEventTrackingModel implements Parcelable {

    @C09CT("ep_caption_template")
    public String epCaptionTemplate;

    @C09CT("ep_text_color_used")
    public Integer epTextColor;

    @C09CT("ep_text_font_used")
    public String epTextFont;

    @C09CT("ep_text_font_tab_name")
    public String epTextFontTabName;

    @C09CT("ep_text_animation_used")
    public String epTextMotion;

    @C09CT("ep_text_animation_tab_name")
    public String epTextMotionTabName;

    @C09CT("ep_text_paragraph_style")
    public Integer epTextParagraph;

    @C09CT("ep_text_style_used")
    public String epTextStyle;

    @C09CT("ep_text_style_tab_name")
    public String epTextStyleTabName;
    public static final Parcelable.Creator<TextEventTrackingModel> CREATOR = new Parcelable.Creator<TextEventTrackingModel>() { // from class: X.0EMF
        @Override // android.os.Parcelable.Creator
        public final TextEventTrackingModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new TextEventTrackingModel(numValueOf, string, string2, string3, string4, string5, string6, numValueOf2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextEventTrackingModel[] newArray(int i) {
            return new TextEventTrackingModel[i];
        }
    };
    public static final int $stable = 8;

    public TextEventTrackingModel() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextEventTrackingModel)) {
            return false;
        }
        TextEventTrackingModel textEventTrackingModel = (TextEventTrackingModel) obj;
        return Intrinsics.LJFF(this.epTextColor, textEventTrackingModel.epTextColor) && Intrinsics.LJFF(this.epTextFont, textEventTrackingModel.epTextFont) && Intrinsics.LJFF(this.epTextFontTabName, textEventTrackingModel.epTextFontTabName) && Intrinsics.LJFF(this.epTextStyle, textEventTrackingModel.epTextStyle) && Intrinsics.LJFF(this.epTextStyleTabName, textEventTrackingModel.epTextStyleTabName) && Intrinsics.LJFF(this.epTextMotion, textEventTrackingModel.epTextMotion) && Intrinsics.LJFF(this.epTextMotionTabName, textEventTrackingModel.epTextMotionTabName) && Intrinsics.LJFF(this.epTextParagraph, textEventTrackingModel.epTextParagraph) && Intrinsics.LJFF(this.epCaptionTemplate, textEventTrackingModel.epCaptionTemplate);
    }

    public final int hashCode() {
        Integer num = this.epTextColor;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.epTextFont;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.epTextFontTabName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.epTextStyle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.epTextStyleTabName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.epTextMotion;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.epTextMotionTabName;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.epTextParagraph;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.epCaptionTemplate;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextEventTrackingModel(epTextColor=");
        sbLIZ.append(this.epTextColor);
        sbLIZ.append(", epTextFont=");
        sbLIZ.append(this.epTextFont);
        sbLIZ.append(", epTextFontTabName=");
        sbLIZ.append(this.epTextFontTabName);
        sbLIZ.append(", epTextStyle=");
        sbLIZ.append(this.epTextStyle);
        sbLIZ.append(", epTextStyleTabName=");
        sbLIZ.append(this.epTextStyleTabName);
        sbLIZ.append(", epTextMotion=");
        sbLIZ.append(this.epTextMotion);
        sbLIZ.append(", epTextMotionTabName=");
        sbLIZ.append(this.epTextMotionTabName);
        sbLIZ.append(", epTextParagraph=");
        sbLIZ.append(this.epTextParagraph);
        sbLIZ.append(", epCaptionTemplate=");
        sbLIZ.append(this.epCaptionTemplate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.epTextColor;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.epTextFont);
        parcel.writeString(this.epTextFontTabName);
        parcel.writeString(this.epTextStyle);
        parcel.writeString(this.epTextStyleTabName);
        parcel.writeString(this.epTextMotion);
        parcel.writeString(this.epTextMotionTabName);
        Integer num2 = this.epTextParagraph;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.epCaptionTemplate);
    }

    public static TextEventTrackingModel LIZ(TextEventTrackingModel textEventTrackingModel) {
        Integer num = textEventTrackingModel.epTextColor;
        String str = textEventTrackingModel.epTextFont;
        String str2 = textEventTrackingModel.epTextFontTabName;
        String str3 = textEventTrackingModel.epTextStyle;
        String str4 = textEventTrackingModel.epTextStyleTabName;
        String str5 = textEventTrackingModel.epTextMotion;
        String str6 = textEventTrackingModel.epTextMotionTabName;
        Integer num2 = textEventTrackingModel.epTextParagraph;
        String str7 = textEventTrackingModel.epCaptionTemplate;
        textEventTrackingModel.getClass();
        return new TextEventTrackingModel(num, str, str2, str3, str4, str5, str6, num2, str7);
    }

    public TextEventTrackingModel(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Integer num2, String str7) {
        this.epTextColor = num;
        this.epTextFont = str;
        this.epTextFontTabName = str2;
        this.epTextStyle = str3;
        this.epTextStyleTabName = str4;
        this.epTextMotion = str5;
        this.epTextMotionTabName = str6;
        this.epTextParagraph = num2;
        this.epCaptionTemplate = str7;
    }
}
