package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LogisticLinkRichText implements Parcelable {

    @C09CT("arguments")
    public Map<String, LogisticLinkText> arguments;

    @C09CT("template")
    public String template;

    @C09CT("text_color")
    public String textColor;

    @C09CT("text_color_type")
    public Integer textColorType;

    @C09CT("text_dark_color")
    public String textDarkColor;

    @C09CT("text_font_type")
    public Integer textFontType;
    public static final Parcelable.Creator<LogisticLinkRichText> CREATOR = new Parcelable.Creator<LogisticLinkRichText>() { // from class: X.02mP
        @Override // android.os.Parcelable.Creator
        public final LogisticLinkRichText createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), LogisticLinkText.CREATOR.createFromParcel(parcel));
                }
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new LogisticLinkRichText(string, linkedHashMap, string2, string3, numValueOf, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final LogisticLinkRichText[] newArray(int i) {
            return new LogisticLinkRichText[i];
        }
    };
    public static final int $stable = 8;

    public LogisticLinkRichText() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticLinkRichText)) {
            return false;
        }
        LogisticLinkRichText logisticLinkRichText = (LogisticLinkRichText) obj;
        return Intrinsics.LJFF(this.template, logisticLinkRichText.template) && Intrinsics.LJFF(this.arguments, logisticLinkRichText.arguments) && Intrinsics.LJFF(this.textColor, logisticLinkRichText.textColor) && Intrinsics.LJFF(this.textDarkColor, logisticLinkRichText.textDarkColor) && Intrinsics.LJFF(this.textColorType, logisticLinkRichText.textColorType) && Intrinsics.LJFF(this.textFontType, logisticLinkRichText.textFontType);
    }

    public final int hashCode() {
        String str = this.template;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, LogisticLinkText> map = this.arguments;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.textColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textDarkColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.textColorType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textFontType;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticLinkRichText(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", arguments=");
        sbLIZ.append(this.arguments);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(", textDarkColor=");
        sbLIZ.append(this.textDarkColor);
        sbLIZ.append(", textColorType=");
        sbLIZ.append(this.textColorType);
        sbLIZ.append(", textFontType=");
        sbLIZ.append(this.textFontType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.template);
        Map<String, LogisticLinkText> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, LogisticLinkText> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.textColor);
        parcel.writeString(this.textDarkColor);
        Integer num = this.textColorType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.textFontType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public LogisticLinkRichText(String str, Map<String, LogisticLinkText> map, String str2, String str3, Integer num, Integer num2) {
        this.template = str;
        this.arguments = map;
        this.textColor = str2;
        this.textDarkColor = str3;
        this.textColorType = num;
        this.textFontType = num2;
    }
}
