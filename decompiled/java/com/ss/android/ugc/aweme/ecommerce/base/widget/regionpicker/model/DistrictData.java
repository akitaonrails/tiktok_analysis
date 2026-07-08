package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.MatchedAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictData implements Parcelable {

    @C09CT("districts")
    public final List<District> districts;

    @C09CT("has_next_level")
    public final Boolean hasNextLevel;

    @C09CT("matched_address_list")
    public final List<MatchedAddress> matchedAddressList;

    @C09CT("placeholder_hint")
    public final String placeholderHint;

    @C09CT("searchbar_hint")
    public final String searchbarHint;

    @C09CT("title")
    public final String title;

    @C09CT("title_en")
    public final String titleEn;
    public static final Parcelable.Creator<DistrictData> CREATOR = new Parcelable.Creator<DistrictData>() { // from class: X.0vUb
        @Override // android.os.Parcelable.Creator
        public final DistrictData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z;
            Boolean boolValueOf;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(District.CREATOR.createFromParcel(parcel));
                }
            }
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
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(MatchedAddress.CREATOR.createFromParcel(parcel));
                }
            }
            return new DistrictData(arrayList, boolValueOf, string, string2, string3, string4, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final DistrictData[] newArray(int i) {
            return new DistrictData[i];
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
        if (!(obj instanceof DistrictData)) {
            return false;
        }
        DistrictData districtData = (DistrictData) obj;
        return Intrinsics.LJFF(this.districts, districtData.districts) && Intrinsics.LJFF(this.hasNextLevel, districtData.hasNextLevel) && Intrinsics.LJFF(this.title, districtData.title) && Intrinsics.LJFF(this.titleEn, districtData.titleEn) && Intrinsics.LJFF(this.placeholderHint, districtData.placeholderHint) && Intrinsics.LJFF(this.searchbarHint, districtData.searchbarHint) && Intrinsics.LJFF(this.matchedAddressList, districtData.matchedAddressList);
    }

    public final int hashCode() {
        List<District> list = this.districts;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasNextLevel;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.title;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.titleEn;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.placeholderHint;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchbarHint;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<MatchedAddress> list2 = this.matchedAddressList;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DistrictData(districts=");
        sbLIZ.append(this.districts);
        sbLIZ.append(", hasNextLevel=");
        sbLIZ.append(this.hasNextLevel);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", titleEn=");
        sbLIZ.append(this.titleEn);
        sbLIZ.append(", placeholderHint=");
        sbLIZ.append(this.placeholderHint);
        sbLIZ.append(", searchbarHint=");
        sbLIZ.append(this.searchbarHint);
        sbLIZ.append(", matchedAddressList=");
        sbLIZ.append(this.matchedAddressList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<District> list = this.districts;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<District> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.hasNextLevel;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.titleEn);
        parcel.writeString(this.placeholderHint);
        parcel.writeString(this.searchbarHint);
        List<MatchedAddress> list2 = this.matchedAddressList;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<MatchedAddress> it3 = list2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public DistrictData(List<District> list, Boolean bool, String str, String str2, String str3, String str4, List<MatchedAddress> list2) {
        this.districts = list;
        this.hasNextLevel = bool;
        this.title = str;
        this.titleEn = str2;
        this.placeholderHint = str3;
        this.searchbarHint = str4;
        this.matchedAddressList = list2;
    }
}
