package com.ss.android.ugc.aweme.ecommerce.api.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AddressLocation implements Parcelable {
    public static final Parcelable.Creator<AddressLocation> CREATOR = new Parcelable.Creator<AddressLocation>() { // from class: X.02kb
        @Override // android.os.Parcelable.Creator
        public final AddressLocation createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Icon iconCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                iconCreateFromParcel = Icon.CREATOR.createFromParcel(parcel);
            }
            return new AddressLocation(numValueOf, iconCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AddressLocation[] newArray(int i) {
            return new AddressLocation[i];
        }
    };

    @C09CT("pin_point_icon")
    public Icon pinPointIcon;

    @C09CT("zoom_level")
    public Integer zoomLevel;

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
        return Intrinsics.LJFF(this.zoomLevel, addressLocation.zoomLevel) && Intrinsics.LJFF(this.pinPointIcon, addressLocation.pinPointIcon);
    }

    public final int hashCode() {
        Integer num = this.zoomLevel;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Icon icon = this.pinPointIcon;
        return iHashCode + (icon != null ? icon.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressLocation(zoomLevel=");
        sbLIZ.append(this.zoomLevel);
        sbLIZ.append(", pinPointIcon=");
        sbLIZ.append(this.pinPointIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.zoomLevel;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Icon icon = this.pinPointIcon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i);
        }
    }

    public AddressLocation(Integer num, Icon icon) {
        this.zoomLevel = num;
        this.pinPointIcon = icon;
    }
}
