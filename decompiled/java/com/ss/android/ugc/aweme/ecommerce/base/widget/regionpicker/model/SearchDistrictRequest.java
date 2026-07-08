package com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SearchDistrictRequest implements Parcelable {

    @C09CT("address_entrance_scene")
    public final Integer addressEntranceScene;

    @C09CT("geoname_ids")
    public final List<String> geoNameIds;

    @C09CT("key")
    public final String key;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("search_districts_type")
    public final Integer searchType;

    @C09CT("target_district_keys")
    public final List<String> targetDistrictKeys;
    public static final Parcelable.Creator<SearchDistrictRequest> CREATOR = new Parcelable.Creator<SearchDistrictRequest>() { // from class: X.03s6
        @Override // android.os.Parcelable.Creator
        public final SearchDistrictRequest createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new SearchDistrictRequest(numValueOf, arrayListCreateStringArrayList, string, numValueOf2, parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchDistrictRequest[] newArray(int i) {
            return new SearchDistrictRequest[i];
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
        if (!(obj instanceof SearchDistrictRequest)) {
            return false;
        }
        SearchDistrictRequest searchDistrictRequest = (SearchDistrictRequest) obj;
        return Intrinsics.LJFF(this.searchType, searchDistrictRequest.searchType) && Intrinsics.LJFF(this.geoNameIds, searchDistrictRequest.geoNameIds) && Intrinsics.LJFF(this.key, searchDistrictRequest.key) && Intrinsics.LJFF(this.addressEntranceScene, searchDistrictRequest.addressEntranceScene) && Intrinsics.LJFF(this.targetDistrictKeys, searchDistrictRequest.targetDistrictKeys) && Intrinsics.LJFF(this.preLogId, searchDistrictRequest.preLogId);
    }

    public final int hashCode() {
        Integer num = this.searchType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.geoNameIds;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.key;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.addressEntranceScene;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list2 = this.targetDistrictKeys;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.preLogId;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchDistrictRequest(searchType=");
        sbLIZ.append(this.searchType);
        sbLIZ.append(", geoNameIds=");
        sbLIZ.append(this.geoNameIds);
        sbLIZ.append(", key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", addressEntranceScene=");
        sbLIZ.append(this.addressEntranceScene);
        sbLIZ.append(", targetDistrictKeys=");
        sbLIZ.append(this.targetDistrictKeys);
        sbLIZ.append(", preLogId=");
        sbLIZ.append(this.preLogId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.searchType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.geoNameIds);
        parcel.writeString(this.key);
        Integer num2 = this.addressEntranceScene;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeStringList(this.targetDistrictKeys);
        parcel.writeString(this.preLogId);
    }

    public SearchDistrictRequest(Integer num, List<String> list, String str, Integer num2, List<String> list2, String str2) {
        this.searchType = num;
        this.geoNameIds = list;
        this.key = str;
        this.addressEntranceScene = num2;
        this.targetDistrictKeys = list2;
        this.preLogId = str2;
    }
}
