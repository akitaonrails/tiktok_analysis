package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ViewAllLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PudoAddressData implements Parcelable {

    @C09CT("center_address")
    public final Address centerAddress;

    @C09CT("pudo_address")
    public final List<PudoAddress> pudoAddress;

    @C09CT("view_all_location")
    public final ViewAllLocation viewAllLocation;
    public static final Parcelable.Creator<PudoAddressData> CREATOR = new Parcelable.Creator<PudoAddressData>() { // from class: X.02iW
        @Override // android.os.Parcelable.Creator
        public final PudoAddressData createFromParcel(Parcel parcel) {
            Address addressCreateFromParcel;
            ArrayList arrayList;
            ViewAllLocation viewAllLocationCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = Address.CREATOR.createFromParcel(parcel);
            }
            Address address = addressCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PudoAddress.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                viewAllLocationCreateFromParcel = ViewAllLocation.CREATOR.createFromParcel(parcel);
            }
            return new PudoAddressData(address, arrayList, viewAllLocationCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PudoAddressData[] newArray(int i) {
            return new PudoAddressData[i];
        }
    };
    public static final int $stable = 8;

    public PudoAddressData() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PudoAddressData)) {
            return false;
        }
        PudoAddressData pudoAddressData = (PudoAddressData) obj;
        return Intrinsics.LJFF(this.centerAddress, pudoAddressData.centerAddress) && Intrinsics.LJFF(this.pudoAddress, pudoAddressData.pudoAddress) && Intrinsics.LJFF(this.viewAllLocation, pudoAddressData.viewAllLocation);
    }

    public final int hashCode() {
        Address address = this.centerAddress;
        int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
        List<PudoAddress> list = this.pudoAddress;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ViewAllLocation viewAllLocation = this.viewAllLocation;
        return iHashCode2 + (viewAllLocation != null ? viewAllLocation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PudoAddressData(centerAddress=");
        sbLIZ.append(this.centerAddress);
        sbLIZ.append(", pudoAddress=");
        sbLIZ.append(this.pudoAddress);
        sbLIZ.append(", viewAllLocation=");
        sbLIZ.append(this.viewAllLocation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Address address = this.centerAddress;
        if (address == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
        }
        List<PudoAddress> list = this.pudoAddress;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PudoAddress> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ViewAllLocation viewAllLocation = this.viewAllLocation;
        if (viewAllLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewAllLocation.writeToParcel(parcel, i);
        }
    }

    public PudoAddressData(Address address, List<PudoAddress> list, ViewAllLocation viewAllLocation) {
        this.centerAddress = address;
        this.pudoAddress = list;
        this.viewAllLocation = viewAllLocation;
    }
}
