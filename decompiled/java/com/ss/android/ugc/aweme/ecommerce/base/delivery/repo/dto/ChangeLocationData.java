package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1164480gPO;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ChangeLocationData implements Parcelable, InterfaceC1164480gPO {

    @C09CT("description")
    public final String description;

    @C09CT("region")
    public final Region region;

    @C09CT("description_v2")
    public final ECRichText richDescription;

    @C09CT("zipcode_keyboard_type")
    public final Integer zipcodeKeyboardType;

    @C09CT("zipcode_max_length")
    public final Integer zipcodeMaxLength;

    @C09CT("zipcode_place_holder_hint")
    public final String zipcodePlaceHolderHint;

    @C09CT("zipcode_title")
    public final String zipcodeTitle;
    public static final Parcelable.Creator<ChangeLocationData> CREATOR = new Parcelable.Creator<ChangeLocationData>() { // from class: X.03FW
        @Override // android.os.Parcelable.Creator
        public final ChangeLocationData createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Region regionCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                regionCreateFromParcel = Region.CREATOR.createFromParcel(parcel);
            }
            return new ChangeLocationData(string, string2, numValueOf, numValueOf2, string3, regionCreateFromParcel, (ECRichText) parcel.readParcelable(ChangeLocationData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ChangeLocationData[] newArray(int i) {
            return new ChangeLocationData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeLocationData)) {
            return false;
        }
        ChangeLocationData changeLocationData = (ChangeLocationData) obj;
        return Intrinsics.LJFF(this.description, changeLocationData.description) && Intrinsics.LJFF(this.zipcodePlaceHolderHint, changeLocationData.zipcodePlaceHolderHint) && Intrinsics.LJFF(this.zipcodeMaxLength, changeLocationData.zipcodeMaxLength) && Intrinsics.LJFF(this.zipcodeKeyboardType, changeLocationData.zipcodeKeyboardType) && Intrinsics.LJFF(this.zipcodeTitle, changeLocationData.zipcodeTitle) && Intrinsics.LJFF(this.region, changeLocationData.region) && Intrinsics.LJFF(this.richDescription, changeLocationData.richDescription);
    }

    public final int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.zipcodePlaceHolderHint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.zipcodeMaxLength;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.zipcodeKeyboardType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.zipcodeTitle;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Region region = this.region;
        int iHashCode6 = (iHashCode5 + (region == null ? 0 : region.hashCode())) * 31;
        ECRichText eCRichText = this.richDescription;
        return iHashCode6 + (eCRichText != null ? eCRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeLocationData(description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", zipcodePlaceHolderHint=");
        sbLIZ.append(this.zipcodePlaceHolderHint);
        sbLIZ.append(", zipcodeMaxLength=");
        sbLIZ.append(this.zipcodeMaxLength);
        sbLIZ.append(", zipcodeKeyboardType=");
        sbLIZ.append(this.zipcodeKeyboardType);
        sbLIZ.append(", zipcodeTitle=");
        sbLIZ.append(this.zipcodeTitle);
        sbLIZ.append(", region=");
        sbLIZ.append(this.region);
        sbLIZ.append(", richDescription=");
        sbLIZ.append(this.richDescription);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        parcel.writeString(this.zipcodePlaceHolderHint);
        Integer num = this.zipcodeMaxLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.zipcodeKeyboardType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.zipcodeTitle);
        Region region = this.region;
        if (region == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            region.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.richDescription, i);
    }

    @Override // X.InterfaceC1164480gPO
    public final String LIZ() {
        String strLIZIZ;
        Region region = this.region;
        return (region == null || (strLIZIZ = region.LIZIZ()) == null) ? "" : strLIZIZ;
    }

    public ChangeLocationData(String str, String str2, Integer num, Integer num2, String str3, Region region, ECRichText eCRichText) {
        this.description = str;
        this.zipcodePlaceHolderHint = str2;
        this.zipcodeMaxLength = num;
        this.zipcodeKeyboardType = num2;
        this.zipcodeTitle = str3;
        this.region = region;
        this.richDescription = eCRichText;
    }
}
