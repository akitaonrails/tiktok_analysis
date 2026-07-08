package com.ss.android.ugc.aweme.poi.detail.dishes;

import X.C1186170gyN;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.poi.detail.dishes.PoiInnerPageMobData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiInnerPageMobData implements Parcelable {
    public static final C1186170gyN CREATOR = new Parcelable.Creator<PoiInnerPageMobData>() { // from class: X.0gyN
        @Override // android.os.Parcelable.Creator
        public final PoiInnerPageMobData createFromParcel(Parcel parcel) {
            return new PoiInnerPageMobData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PoiInnerPageMobData[] newArray(int i) {
            return new PoiInnerPageMobData[i];
        }
    };
    public final String collectInfo;
    public final String enterFrom;
    public final String fromGroupId;
    public final String initialPoiEnterFrom;
    public final String initialPoiEnterMethod;
    public final String initialPoiFromGroupId;
    public final String moduleName;
    public final String poiId;
    public final String regionCode;

    /* JADX WARN: Illegal instructions before constructor call */
    public PoiInnerPageMobData() {
        String str = null;
        this(str, str, str, str, 511);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiInnerPageMobData)) {
            return false;
        }
        PoiInnerPageMobData poiInnerPageMobData = (PoiInnerPageMobData) obj;
        return Intrinsics.LJFF(this.enterFrom, poiInnerPageMobData.enterFrom) && Intrinsics.LJFF(this.moduleName, poiInnerPageMobData.moduleName) && Intrinsics.LJFF(this.poiId, poiInnerPageMobData.poiId) && Intrinsics.LJFF(this.collectInfo, poiInnerPageMobData.collectInfo) && Intrinsics.LJFF(this.regionCode, poiInnerPageMobData.regionCode) && Intrinsics.LJFF(this.fromGroupId, poiInnerPageMobData.fromGroupId) && Intrinsics.LJFF(this.initialPoiEnterFrom, poiInnerPageMobData.initialPoiEnterFrom) && Intrinsics.LJFF(this.initialPoiEnterMethod, poiInnerPageMobData.initialPoiEnterMethod) && Intrinsics.LJFF(this.initialPoiFromGroupId, poiInnerPageMobData.initialPoiFromGroupId);
    }

    public final int hashCode() {
        String str = this.enterFrom;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.moduleName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.collectInfo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.regionCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fromGroupId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.initialPoiEnterFrom;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.initialPoiEnterMethod;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.initialPoiFromGroupId;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiInnerPageMobData(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", moduleName=");
        sbLIZ.append(this.moduleName);
        sbLIZ.append(", poiId=");
        sbLIZ.append(this.poiId);
        sbLIZ.append(", collectInfo=");
        sbLIZ.append(this.collectInfo);
        sbLIZ.append(", regionCode=");
        sbLIZ.append(this.regionCode);
        sbLIZ.append(", fromGroupId=");
        sbLIZ.append(this.fromGroupId);
        sbLIZ.append(", initialPoiEnterFrom=");
        sbLIZ.append(this.initialPoiEnterFrom);
        sbLIZ.append(", initialPoiEnterMethod=");
        sbLIZ.append(this.initialPoiEnterMethod);
        sbLIZ.append(", initialPoiFromGroupId=");
        sbLIZ.append(this.initialPoiFromGroupId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.moduleName);
        parcel.writeString(this.poiId);
        parcel.writeString(this.collectInfo);
        parcel.writeString(this.regionCode);
        parcel.writeString(this.fromGroupId);
        parcel.writeString(this.initialPoiEnterFrom);
        parcel.writeString(this.initialPoiEnterMethod);
        parcel.writeString(this.initialPoiFromGroupId);
    }

    public /* synthetic */ PoiInnerPageMobData(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, null, null, null, null, null);
    }

    public PoiInnerPageMobData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.enterFrom = str;
        this.moduleName = str2;
        this.poiId = str3;
        this.collectInfo = str4;
        this.regionCode = str5;
        this.fromGroupId = str6;
        this.initialPoiEnterFrom = str7;
        this.initialPoiEnterMethod = str8;
        this.initialPoiFromGroupId = str9;
    }
}
