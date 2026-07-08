package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingDialogDto implements Parcelable {

    @C09CT("body_text")
    public String bodyText;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("header_text")
    public String headerText;
    public static final Parcelable.Creator<ShippingDialogDto> CREATOR = new Parcelable.Creator<ShippingDialogDto>() { // from class: X.02Up
        @Override // android.os.Parcelable.Creator
        public final ShippingDialogDto createFromParcel(Parcel parcel) {
            return new ShippingDialogDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingDialogDto[] newArray(int i) {
            return new ShippingDialogDto[i];
        }
    };
    public static final int $stable = 8;

    public ShippingDialogDto() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingDialogDto)) {
            return false;
        }
        ShippingDialogDto shippingDialogDto = (ShippingDialogDto) obj;
        return Intrinsics.LJFF(this.headerText, shippingDialogDto.headerText) && Intrinsics.LJFF(this.bodyText, shippingDialogDto.bodyText) && Intrinsics.LJFF(this.buttonText, shippingDialogDto.buttonText);
    }

    public final int hashCode() {
        String str = this.headerText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingDialogDto(headerText=");
        sbLIZ.append(this.headerText);
        sbLIZ.append(", bodyText=");
        sbLIZ.append(this.bodyText);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.headerText);
        parcel.writeString(this.bodyText);
        parcel.writeString(this.buttonText);
    }

    public ShippingDialogDto(String str, String str2, String str3) {
        this.headerText = str;
        this.bodyText = str2;
        this.buttonText = str3;
    }
}
