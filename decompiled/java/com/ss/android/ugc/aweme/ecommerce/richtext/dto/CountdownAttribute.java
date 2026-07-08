package com.ss.android.ugc.aweme.ecommerce.richtext.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CountdownAttribute;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Font;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class CountdownAttribute implements Parcelable {
    public static final Parcelable.Creator<CountdownAttribute> CREATOR = new Parcelable.Creator<CountdownAttribute>() { // from class: X.02mh
        @Override // android.os.Parcelable.Creator
        public final CountdownAttribute createFromParcel(Parcel parcel) {
            Font fontCreateFromParcel;
            CustomColor customColorCreateFromParcel;
            String string = parcel.readString();
            CustomColor customColorCreateFromParcel2 = null;
            if (parcel.readInt() == 0) {
                fontCreateFromParcel = null;
            } else {
                fontCreateFromParcel = Font.CREATOR.createFromParcel(parcel);
            }
            Font font = fontCreateFromParcel;
            if (parcel.readInt() == 0) {
                customColorCreateFromParcel = null;
            } else {
                customColorCreateFromParcel = CustomColor.CREATOR.createFromParcel(parcel);
            }
            CustomColor customColor = customColorCreateFromParcel;
            if (parcel.readInt() != 0) {
                customColorCreateFromParcel2 = CustomColor.CREATOR.createFromParcel(parcel);
            }
            return new CountdownAttribute(string, font, customColor, customColorCreateFromParcel2);
        }

        @Override // android.os.Parcelable.Creator
        public final CountdownAttribute[] newArray(int i) {
            return new CountdownAttribute[i];
        }
    };

    @C09CT("background_color")
    public CustomColor backgroundColor;

    @C09CT("end_time")
    public String endTime;

    @C09CT("font")
    public Font font;

    @C09CT("font_color")
    public CustomColor fontColor;

    public CountdownAttribute() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountdownAttribute)) {
            return false;
        }
        CountdownAttribute countdownAttribute = (CountdownAttribute) obj;
        return Intrinsics.LJFF(this.endTime, countdownAttribute.endTime) && Intrinsics.LJFF(this.font, countdownAttribute.font) && Intrinsics.LJFF(this.fontColor, countdownAttribute.fontColor) && Intrinsics.LJFF(this.backgroundColor, countdownAttribute.backgroundColor);
    }

    public final int hashCode() {
        String str = this.endTime;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Font font = this.font;
        int iHashCode2 = (iHashCode + (font == null ? 0 : font.hashCode())) * 31;
        CustomColor customColor = this.fontColor;
        int iHashCode3 = (iHashCode2 + (customColor == null ? 0 : customColor.hashCode())) * 31;
        CustomColor customColor2 = this.backgroundColor;
        return iHashCode3 + (customColor2 != null ? customColor2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownAttribute(endTime=");
        sbLIZ.append(this.endTime);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", fontColor=");
        sbLIZ.append(this.fontColor);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.endTime);
        Font font = this.font;
        if (font == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            font.writeToParcel(parcel, i);
        }
        CustomColor customColor = this.fontColor;
        if (customColor == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customColor.writeToParcel(parcel, i);
        }
        CustomColor customColor2 = this.backgroundColor;
        if (customColor2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customColor2.writeToParcel(parcel, i);
        }
    }

    public CountdownAttribute(String str, Font font, CustomColor customColor, CustomColor customColor2) {
        this.endTime = str;
        this.font = font;
        this.fontColor = customColor;
        this.backgroundColor = customColor2;
    }
}
