package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.MatchedAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class MatchedAddress implements Parcelable {

    @C09CT("multilevel_districts")
    public final List<District> multilevelDistricts;

    @C09CT("related_city_info")
    public final String relatedCityInfo;

    @C09CT("zipcode_info")
    public final String zipcodeInfo;
    public static final Parcelable.Creator<MatchedAddress> CREATOR = new Parcelable.Creator<MatchedAddress>() { // from class: X.0vUf
        @Override // android.os.Parcelable.Creator
        public final MatchedAddress createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(District.CREATOR.createFromParcel(parcel));
                }
            }
            return new MatchedAddress(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MatchedAddress[] newArray(int i) {
            return new MatchedAddress[i];
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
        if (!(obj instanceof MatchedAddress)) {
            return false;
        }
        MatchedAddress matchedAddress = (MatchedAddress) obj;
        return Intrinsics.LJFF(this.zipcodeInfo, matchedAddress.zipcodeInfo) && Intrinsics.LJFF(this.relatedCityInfo, matchedAddress.relatedCityInfo) && Intrinsics.LJFF(this.multilevelDistricts, matchedAddress.multilevelDistricts);
    }

    public final int hashCode() {
        String str = this.zipcodeInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.relatedCityInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<District> list = this.multilevelDistricts;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MatchedAddress(zipcodeInfo=");
        sbLIZ.append(this.zipcodeInfo);
        sbLIZ.append(", relatedCityInfo=");
        sbLIZ.append(this.relatedCityInfo);
        sbLIZ.append(", multilevelDistricts=");
        sbLIZ.append(this.multilevelDistricts);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zipcodeInfo);
        parcel.writeString(this.relatedCityInfo);
        List<District> list = this.multilevelDistricts;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<District> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public MatchedAddress(String str, String str2, List<District> list) {
        this.zipcodeInfo = str;
        this.relatedCityInfo = str2;
        this.multilevelDistricts = list;
    }
}
