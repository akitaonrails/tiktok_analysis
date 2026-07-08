package com.ss.android.ugc.aweme.minis.model.iaa;

import X.C09CT;
import X.C1780920wRe;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisRewardedAdData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MinisRewardedAdData implements Parcelable {

    @C09CT("adInstanceUniqueId")
    public final String adInstanceUniqueId;

    @C09CT("adPlacementId")
    public final String adPlacementId;

    @C09CT("ad_request_time")
    public Long adRequestTime;

    @C09CT("client_key")
    public final String clientKey;
    public boolean hasShown;

    @C09CT("nested_layer_index")
    public final Integer nestedLayerIndex;

    @C09CT("rit")
    public final String rit;

    @C09CT("video_id")
    public final String videoId;
    public static final C1780920wRe Companion = new C1780920wRe();
    public static final Parcelable.Creator<MinisRewardedAdData> CREATOR = new Parcelable.Creator<MinisRewardedAdData>() { // from class: X.0wRd
        @Override // android.os.Parcelable.Creator
        public final MinisRewardedAdData createFromParcel(Parcel parcel) {
            boolean z;
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new MinisRewardedAdData(string, string2, string3, string4, z, lValueOf, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MinisRewardedAdData[] newArray(int i) {
            return new MinisRewardedAdData[i];
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
        if (!(obj instanceof MinisRewardedAdData)) {
            return false;
        }
        MinisRewardedAdData minisRewardedAdData = (MinisRewardedAdData) obj;
        return Intrinsics.LJFF(this.adInstanceUniqueId, minisRewardedAdData.adInstanceUniqueId) && Intrinsics.LJFF(this.adPlacementId, minisRewardedAdData.adPlacementId) && Intrinsics.LJFF(this.rit, minisRewardedAdData.rit) && Intrinsics.LJFF(this.clientKey, minisRewardedAdData.clientKey) && this.hasShown == minisRewardedAdData.hasShown && Intrinsics.LJFF(this.adRequestTime, minisRewardedAdData.adRequestTime) && Intrinsics.LJFF(this.nestedLayerIndex, minisRewardedAdData.nestedLayerIndex) && Intrinsics.LJFF(this.videoId, minisRewardedAdData.videoId);
    }

    public final int hashCode() {
        String str = this.adInstanceUniqueId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adPlacementId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rit;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.clientKey;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.hasShown)) * 31;
        Long l = this.adRequestTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.nestedLayerIndex;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.videoId;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRewardedAdData(adInstanceUniqueId=");
        sbLIZ.append(this.adInstanceUniqueId);
        sbLIZ.append(", adPlacementId=");
        sbLIZ.append(this.adPlacementId);
        sbLIZ.append(", rit=");
        sbLIZ.append(this.rit);
        sbLIZ.append(", clientKey=");
        sbLIZ.append(this.clientKey);
        sbLIZ.append(", hasShown=");
        sbLIZ.append(this.hasShown);
        sbLIZ.append(", adRequestTime=");
        sbLIZ.append(this.adRequestTime);
        sbLIZ.append(", nestedLayerIndex=");
        sbLIZ.append(this.nestedLayerIndex);
        sbLIZ.append(", videoId=");
        sbLIZ.append(this.videoId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.adInstanceUniqueId);
        parcel.writeString(this.adPlacementId);
        parcel.writeString(this.rit);
        parcel.writeString(this.clientKey);
        parcel.writeInt(this.hasShown ? 1 : 0);
        Long l = this.adRequestTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.nestedLayerIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.videoId);
    }

    public MinisRewardedAdData(String str, String str2, String str3, String str4, boolean z, Long l, Integer num, String str5) {
        this.adInstanceUniqueId = str;
        this.adPlacementId = str2;
        this.rit = str3;
        this.clientKey = str4;
        this.hasShown = z;
        this.adRequestTime = l;
        this.nestedLayerIndex = num;
        this.videoId = str5;
    }
}
