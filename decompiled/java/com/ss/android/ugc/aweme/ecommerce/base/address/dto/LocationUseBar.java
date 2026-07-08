package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.LocationUseBar;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationUseBar implements Parcelable {

    @C09CT("address_unavailable_tips")
    public final String addressUnavailableTips;

    @C09CT("grant_button_text")
    public final String grantButtonText;

    @C09CT("grant_tips_text")
    public final String grantTipsText;

    @C09CT("location_icon")
    public final Icon locationIcon;

    @C09CT("location_icon_has_permission")
    public final Icon locationIconHasPermission;

    @C09CT("title")
    public final String title;

    @C09CT("use_button_text")
    public final String useButtonText;
    public static final Parcelable.Creator<LocationUseBar> CREATOR = new Parcelable.Creator<LocationUseBar>() { // from class: X.0372
        @Override // android.os.Parcelable.Creator
        public final LocationUseBar createFromParcel(Parcel parcel) {
            return new LocationUseBar(parcel.readString(), (Icon) parcel.readParcelable(LocationUseBar.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Icon) parcel.readParcelable(LocationUseBar.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocationUseBar[] newArray(int i) {
            return new LocationUseBar[i];
        }
    };
    public static final int $stable = 8;

    public LocationUseBar() {
        this(null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationUseBar)) {
            return false;
        }
        LocationUseBar locationUseBar = (LocationUseBar) obj;
        return Intrinsics.LJFF(this.title, locationUseBar.title) && Intrinsics.LJFF(this.locationIcon, locationUseBar.locationIcon) && Intrinsics.LJFF(this.useButtonText, locationUseBar.useButtonText) && Intrinsics.LJFF(this.grantButtonText, locationUseBar.grantButtonText) && Intrinsics.LJFF(this.grantTipsText, locationUseBar.grantTipsText) && Intrinsics.LJFF(this.addressUnavailableTips, locationUseBar.addressUnavailableTips) && Intrinsics.LJFF(this.locationIconHasPermission, locationUseBar.locationIconHasPermission);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.locationIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        String str2 = this.useButtonText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.grantButtonText;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.grantTipsText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.addressUnavailableTips;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Icon icon2 = this.locationIconHasPermission;
        return iHashCode6 + (icon2 != null ? icon2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocationUseBar(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", locationIcon=");
        sbLIZ.append(this.locationIcon);
        sbLIZ.append(", useButtonText=");
        sbLIZ.append(this.useButtonText);
        sbLIZ.append(", grantButtonText=");
        sbLIZ.append(this.grantButtonText);
        sbLIZ.append(", grantTipsText=");
        sbLIZ.append(this.grantTipsText);
        sbLIZ.append(", addressUnavailableTips=");
        sbLIZ.append(this.addressUnavailableTips);
        sbLIZ.append(", locationIconHasPermission=");
        sbLIZ.append(this.locationIconHasPermission);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.locationIcon, i);
        parcel.writeString(this.useButtonText);
        parcel.writeString(this.grantButtonText);
        parcel.writeString(this.grantTipsText);
        parcel.writeString(this.addressUnavailableTips);
        parcel.writeParcelable(this.locationIconHasPermission, i);
    }

    public LocationUseBar(String str, Icon icon, String str2, String str3, String str4, String str5, Icon icon2) {
        this.title = str;
        this.locationIcon = icon;
        this.useButtonText = str2;
        this.grantButtonText = str3;
        this.grantTipsText = str4;
        this.addressUnavailableTips = str5;
        this.locationIconHasPermission = icon2;
    }
}
