package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ShippingService implements Parcelable {

    @C09CT("shipping_rights_content")
    public String shippingRightsContent;
    public static final Parcelable.Creator<ShippingService> CREATOR = new Parcelable.Creator<ShippingService>() { // from class: X.02mW
        @Override // android.os.Parcelable.Creator
        public final ShippingService createFromParcel(Parcel parcel) {
            return new ShippingService(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingService[] newArray(int i) {
            return new ShippingService[i];
        }
    };
    public static final int $stable = 8;

    public ShippingService() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShippingService) && Intrinsics.LJFF(this.shippingRightsContent, ((ShippingService) obj).shippingRightsContent);
    }

    public final int hashCode() {
        String str = this.shippingRightsContent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShippingService(shippingRightsContent=");
        sbLIZ.append(this.shippingRightsContent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shippingRightsContent);
    }

    public ShippingService(String str) {
        this.shippingRightsContent = str;
    }
}
