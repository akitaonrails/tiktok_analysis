package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.PudoServiceList;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ViewAllLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PudoServiceList implements Parcelable {

    @C09CT("pudo_address")
    public List<PudoAddress> pudoAddress;

    @C09CT("view_all_location")
    public ViewAllLocation viewAllLocation;
    public static final Parcelable.Creator<PudoServiceList> CREATOR = new Parcelable.Creator<PudoServiceList>() { // from class: X.02hW
        @Override // android.os.Parcelable.Creator
        public final PudoServiceList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ViewAllLocation viewAllLocationCreateFromParcel = null;
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
            return new PudoServiceList(arrayList, viewAllLocationCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PudoServiceList[] newArray(int i) {
            return new PudoServiceList[i];
        }
    };
    public static final int $stable = 8;

    public PudoServiceList() {
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
        if (!(obj instanceof PudoServiceList)) {
            return false;
        }
        PudoServiceList pudoServiceList = (PudoServiceList) obj;
        return Intrinsics.LJFF(this.pudoAddress, pudoServiceList.pudoAddress) && Intrinsics.LJFF(this.viewAllLocation, pudoServiceList.viewAllLocation);
    }

    public final int hashCode() {
        List<PudoAddress> list = this.pudoAddress;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ViewAllLocation viewAllLocation = this.viewAllLocation;
        return iHashCode + (viewAllLocation != null ? viewAllLocation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PudoServiceList(pudoAddress=");
        sbLIZ.append(this.pudoAddress);
        sbLIZ.append(", viewAllLocation=");
        sbLIZ.append(this.viewAllLocation);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
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

    public PudoServiceList(List<PudoAddress> list, ViewAllLocation viewAllLocation) {
        this.pudoAddress = list;
        this.viewAllLocation = viewAllLocation;
    }
}
