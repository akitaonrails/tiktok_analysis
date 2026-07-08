package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RankInfo implements Parcelable {

    @C09CT("rank_hint")
    public final String rankHint;

    @C09CT("rank_id")
    public final String rankId;

    @C09CT("rank_info_style")
    public final Integer rankInfoStyle;

    @C09CT("rank_level_num")
    public final Integer rankLevelNum;

    @C09CT("rank_level_str")
    public final String rankLevelStr;

    @C09CT("rank_name")
    public final String rankName;

    @C09CT("schema")
    public final String schema;

    @C09CT("uniq_tpp_name")
    public final String tpp;
    public static final Parcelable.Creator<RankInfo> CREATOR = new Parcelable.Creator<RankInfo>() { // from class: X.04AR
        @Override // android.os.Parcelable.Creator
        public final RankInfo createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            return new RankInfo(string, numValueOf, string2, string3, string4, string5, string6, numValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final RankInfo[] newArray(int i) {
            return new RankInfo[i];
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
        if (!(obj instanceof RankInfo)) {
            return false;
        }
        RankInfo rankInfo = (RankInfo) obj;
        return Intrinsics.LJFF(this.rankHint, rankInfo.rankHint) && Intrinsics.LJFF(this.rankLevelNum, rankInfo.rankLevelNum) && Intrinsics.LJFF(this.rankLevelStr, rankInfo.rankLevelStr) && Intrinsics.LJFF(this.rankName, rankInfo.rankName) && Intrinsics.LJFF(this.tpp, rankInfo.tpp) && Intrinsics.LJFF(this.schema, rankInfo.schema) && Intrinsics.LJFF(this.rankId, rankInfo.rankId) && Intrinsics.LJFF(this.rankInfoStyle, rankInfo.rankInfoStyle);
    }

    public final int hashCode() {
        String str = this.rankHint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.rankLevelNum;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.rankLevelStr;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rankName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tpp;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.schema;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rankId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.rankInfoStyle;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankInfo(rankHint=");
        sbLIZ.append(this.rankHint);
        sbLIZ.append(", rankLevelNum=");
        sbLIZ.append(this.rankLevelNum);
        sbLIZ.append(", rankLevelStr=");
        sbLIZ.append(this.rankLevelStr);
        sbLIZ.append(", rankName=");
        sbLIZ.append(this.rankName);
        sbLIZ.append(", tpp=");
        sbLIZ.append(this.tpp);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.schema);
        sbLIZ.append(", rankId=");
        sbLIZ.append(this.rankId);
        sbLIZ.append(", rankInfoStyle=");
        sbLIZ.append(this.rankInfoStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.rankHint);
        Integer num = this.rankLevelNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.rankLevelStr);
        parcel.writeString(this.rankName);
        parcel.writeString(this.tpp);
        parcel.writeString(this.schema);
        parcel.writeString(this.rankId);
        Integer num2 = this.rankInfoStyle;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public RankInfo(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Integer num2) {
        this.rankHint = str;
        this.rankLevelNum = num;
        this.rankLevelStr = str2;
        this.rankName = str3;
        this.tpp = str4;
        this.schema = str5;
        this.rankId = str6;
        this.rankInfoStyle = num2;
    }
}
