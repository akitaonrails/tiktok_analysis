package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitStyleInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PDPBenefitStyleInfo implements Parcelable {

    @C09CT("bg_color")
    public final String bgColor;

    @C09CT("bg_color_dark_mode")
    public final String bgColorDark;

    @C09CT("desc_color")
    public final String descColor;

    @C09CT("desc_color_dark_mode")
    public final String descColorDark;
    public static final Parcelable.Creator<PDPBenefitStyleInfo> CREATOR = new Parcelable.Creator<PDPBenefitStyleInfo>() { // from class: X.0vjU
        @Override // android.os.Parcelable.Creator
        public final PDPBenefitStyleInfo createFromParcel(Parcel parcel) {
            return new PDPBenefitStyleInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPBenefitStyleInfo[] newArray(int i) {
            return new PDPBenefitStyleInfo[i];
        }
    };
    public static final int $stable = 8;

    public PDPBenefitStyleInfo() {
        this(null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPBenefitStyleInfo)) {
            return false;
        }
        PDPBenefitStyleInfo pDPBenefitStyleInfo = (PDPBenefitStyleInfo) obj;
        return Intrinsics.LJFF(this.descColor, pDPBenefitStyleInfo.descColor) && Intrinsics.LJFF(this.descColorDark, pDPBenefitStyleInfo.descColorDark) && Intrinsics.LJFF(this.bgColor, pDPBenefitStyleInfo.bgColor) && Intrinsics.LJFF(this.bgColorDark, pDPBenefitStyleInfo.bgColorDark);
    }

    public final int hashCode() {
        String str = this.descColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.descColorDark;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bgColorDark;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPBenefitStyleInfo(descColor=");
        sbLIZ.append(this.descColor);
        sbLIZ.append(", descColorDark=");
        sbLIZ.append(this.descColorDark);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(", bgColorDark=");
        sbLIZ.append(this.bgColorDark);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.descColor);
        parcel.writeString(this.descColorDark);
        parcel.writeString(this.bgColor);
        parcel.writeString(this.bgColorDark);
    }

    public PDPBenefitStyleInfo(String str, String str2, String str3, String str4) {
        this.descColor = str;
        this.descColorDark = str2;
        this.bgColor = str3;
        this.bgColorDark = str4;
    }
}
