package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressLocation implements Parcelable {

    @C09CT("address_map_schema")
    public String addressMapSchema;

    @C09CT("bubble_text")
    public String bubbleText;

    @C09CT("default_zoom_level")
    public Integer defaultZoomLevel;

    @C09CT("latitude")
    public String latitude;

    @C09CT("longitude")
    public String longitude;

    @C09CT("pinpoint_icon")
    public Icon pinPointIcon;

    @C09CT("tip_icon")
    public Icon tipIcon;

    @C09CT("tip_text")
    public String tipText;
    public static final Parcelable.Creator<AddressLocation> CREATOR = new Parcelable.Creator<AddressLocation>() { // from class: X.0370
        @Override // android.os.Parcelable.Creator
        public final AddressLocation createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Icon icon = (Icon) parcel.readParcelable(AddressLocation.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AddressLocation(string, icon, string2, numValueOf, (Icon) parcel.readParcelable(AddressLocation.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddressLocation[] newArray(int i) {
            return new AddressLocation[i];
        }
    };
    public static final int $stable = 8;

    public AddressLocation() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressLocation)) {
            return false;
        }
        AddressLocation addressLocation = (AddressLocation) obj;
        return Intrinsics.LJFF(this.addressMapSchema, addressLocation.addressMapSchema) && Intrinsics.LJFF(this.tipIcon, addressLocation.tipIcon) && Intrinsics.LJFF(this.tipText, addressLocation.tipText) && Intrinsics.LJFF(this.defaultZoomLevel, addressLocation.defaultZoomLevel) && Intrinsics.LJFF(this.pinPointIcon, addressLocation.pinPointIcon) && Intrinsics.LJFF(this.bubbleText, addressLocation.bubbleText) && Intrinsics.LJFF(this.latitude, addressLocation.latitude) && Intrinsics.LJFF(this.longitude, addressLocation.longitude);
    }

    public final int hashCode() {
        String str = this.addressMapSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.tipIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.tipText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.defaultZoomLevel;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Icon icon2 = this.pinPointIcon;
        int iHashCode5 = (iHashCode4 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        String str3 = this.bubbleText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.latitude;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.longitude;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressLocation(addressMapSchema=");
        sbLIZ.append(this.addressMapSchema);
        sbLIZ.append(", tipIcon=");
        sbLIZ.append(this.tipIcon);
        sbLIZ.append(", tipText=");
        sbLIZ.append(this.tipText);
        sbLIZ.append(", defaultZoomLevel=");
        sbLIZ.append(this.defaultZoomLevel);
        sbLIZ.append(", pinPointIcon=");
        sbLIZ.append(this.pinPointIcon);
        sbLIZ.append(", bubbleText=");
        sbLIZ.append(this.bubbleText);
        sbLIZ.append(", latitude=");
        sbLIZ.append(this.latitude);
        sbLIZ.append(", longitude=");
        sbLIZ.append(this.longitude);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.addressMapSchema);
        parcel.writeParcelable(this.tipIcon, i);
        parcel.writeString(this.tipText);
        Integer num = this.defaultZoomLevel;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.pinPointIcon, i);
        parcel.writeString(this.bubbleText);
        parcel.writeString(this.latitude);
        parcel.writeString(this.longitude);
    }

    public AddressLocation(String str, Icon icon, String str2, Integer num, Icon icon2, String str3, String str4, String str5) {
        this.addressMapSchema = str;
        this.tipIcon = icon;
        this.tipText = str2;
        this.defaultZoomLevel = num;
        this.pinPointIcon = icon2;
        this.bubbleText = str3;
        this.latitude = str4;
        this.longitude = str5;
    }
}
