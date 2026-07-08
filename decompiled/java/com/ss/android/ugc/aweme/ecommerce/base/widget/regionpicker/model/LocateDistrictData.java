package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.LocateDistrictData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LocateDistrictData implements Parcelable {

    @C09CT("district")
    public final District district;

    @C09CT("errors")
    public final List<Error> errors;
    public static final Parcelable.Creator<LocateDistrictData> CREATOR = new Parcelable.Creator<LocateDistrictData>() { // from class: X.0vUw
        @Override // android.os.Parcelable.Creator
        public final LocateDistrictData createFromParcel(Parcel parcel) {
            District districtCreateFromParcel;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                districtCreateFromParcel = null;
            } else {
                districtCreateFromParcel = District.CREATOR.createFromParcel(parcel);
            }
            District district = districtCreateFromParcel;
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Error.CREATOR.createFromParcel(parcel));
                }
            }
            return new LocateDistrictData(district, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final LocateDistrictData[] newArray(int i) {
            return new LocateDistrictData[i];
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
        if (!(obj instanceof LocateDistrictData)) {
            return false;
        }
        LocateDistrictData locateDistrictData = (LocateDistrictData) obj;
        return Intrinsics.LJFF(this.district, locateDistrictData.district) && Intrinsics.LJFF(this.errors, locateDistrictData.errors);
    }

    public final int hashCode() {
        District district = this.district;
        int iHashCode = (district == null ? 0 : district.hashCode()) * 31;
        List<Error> list = this.errors;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocateDistrictData(district=");
        sbLIZ.append(this.district);
        sbLIZ.append(", errors=");
        sbLIZ.append(this.errors);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        District district = this.district;
        if (district == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            district.writeToParcel(parcel, i);
        }
        List<Error> list = this.errors;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Error> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public LocateDistrictData(District district, List<Error> list) {
        this.district = district;
        this.errors = list;
    }
}
