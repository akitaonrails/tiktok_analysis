package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingTOAddressInfo implements Parcelable {

    @C09CT("no_ship_to_addr")
    public final Boolean noShipToAddress;
    public static final Parcelable.Creator<ShippingTOAddressInfo> CREATOR = new Parcelable.Creator<ShippingTOAddressInfo>() { // from class: X.03FN
        @Override // android.os.Parcelable.Creator
        public final ShippingTOAddressInfo createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            return new ShippingTOAddressInfo(boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingTOAddressInfo[] newArray(int i) {
            return new ShippingTOAddressInfo[i];
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
        return (obj instanceof ShippingTOAddressInfo) && Intrinsics.LJFF(this.noShipToAddress, ((ShippingTOAddressInfo) obj).noShipToAddress);
    }

    public final int hashCode() {
        Boolean bool = this.noShipToAddress;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingTOAddressInfo(noShipToAddress=");
        sbLIZ.append(this.noShipToAddress);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        Boolean bool = this.noShipToAddress;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public ShippingTOAddressInfo(Boolean bool) {
        this.noShipToAddress = bool;
    }
}
