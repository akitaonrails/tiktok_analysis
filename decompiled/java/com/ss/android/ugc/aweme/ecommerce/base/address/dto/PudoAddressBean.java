package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PudoAddressBean implements Parcelable {

    @C09CT("pudo_address")
    public final PudoAddress pudoAddress;
    public static final Parcelable.Creator<PudoAddressBean> CREATOR = new Parcelable.Creator<PudoAddressBean>() { // from class: X.02sa
        @Override // android.os.Parcelable.Creator
        public final PudoAddressBean createFromParcel(Parcel parcel) {
            PudoAddress pudoAddressCreateFromParcel;
            if (parcel.readInt() == 0) {
                pudoAddressCreateFromParcel = null;
            } else {
                pudoAddressCreateFromParcel = PudoAddress.CREATOR.createFromParcel(parcel);
            }
            return new PudoAddressBean(pudoAddressCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PudoAddressBean[] newArray(int i) {
            return new PudoAddressBean[i];
        }
    };
    public static final int $stable = 8;

    public PudoAddressBean() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PudoAddressBean) && Intrinsics.LJFF(this.pudoAddress, ((PudoAddressBean) obj).pudoAddress);
    }

    public final int hashCode() {
        PudoAddress pudoAddress = this.pudoAddress;
        if (pudoAddress == null) {
            return 0;
        }
        return pudoAddress.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PudoAddressBean(pudoAddress=");
        sbLIZ.append(this.pudoAddress);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PudoAddress pudoAddress = this.pudoAddress;
        if (pudoAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pudoAddress.writeToParcel(parcel, i);
        }
    }

    public PudoAddressBean(PudoAddress pudoAddress) {
        this.pudoAddress = pudoAddress;
    }
}
