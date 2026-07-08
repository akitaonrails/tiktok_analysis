package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitThemeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class PDPBenefitThemeData implements Parcelable {
    public final String bgColor;
    public final String descColor;
    public static final Parcelable.Creator<PDPBenefitThemeData> CREATOR = new Parcelable.Creator<PDPBenefitThemeData>() { // from class: X.0vjV
        @Override // android.os.Parcelable.Creator
        public final PDPBenefitThemeData createFromParcel(Parcel parcel) {
            return new PDPBenefitThemeData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PDPBenefitThemeData[] newArray(int i) {
            return new PDPBenefitThemeData[i];
        }
    };
    public static final int $stable = 8;

    public PDPBenefitThemeData() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPBenefitThemeData)) {
            return false;
        }
        PDPBenefitThemeData pDPBenefitThemeData = (PDPBenefitThemeData) obj;
        return Intrinsics.LJFF(this.descColor, pDPBenefitThemeData.descColor) && Intrinsics.LJFF(this.bgColor, pDPBenefitThemeData.bgColor);
    }

    public final int hashCode() {
        String str = this.descColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bgColor;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PDPBenefitThemeData(descColor=");
        sbLIZ.append(this.descColor);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.descColor);
        parcel.writeString(this.bgColor);
    }

    public PDPBenefitThemeData(String str, String str2) {
        this.descColor = str;
        this.bgColor = str2;
    }
}
