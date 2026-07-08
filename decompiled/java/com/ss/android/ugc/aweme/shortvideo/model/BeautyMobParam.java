package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class BeautyMobParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<BeautyMobParam> CREATOR = new Creator();

    @C09CT("beautifyChildIdListStr")
    public final String beautifyChildIdListStr;

    @C09CT("beautifyChildNameListStr")
    public final String beautifyChildNameListStr;

    @C09CT("beautifyChildValueListStr")
    public final String beautifyChildValueListStr;

    @C09CT("beautifyParentIdListStr")
    public final String beautifyParentIdListStr;

    @C09CT("beautifyParentNameListStr")
    public final String beautifyParentNameListStr;

    @C09CT("beautifyParentValueListStr")
    public final String beautifyParentValueListStr;

    public static final class Creator implements Parcelable.Creator<BeautyMobParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeautyMobParam createFromParcel(Parcel parcel) {
            return new BeautyMobParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeautyMobParam[] newArray(int i) {
            return new BeautyMobParam[i];
        }
    }

    public final BeautyMobParam copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new BeautyMobParam(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautyMobParam)) {
            return false;
        }
        BeautyMobParam beautyMobParam = (BeautyMobParam) obj;
        return Intrinsics.LJFF(this.beautifyChildIdListStr, beautyMobParam.beautifyChildIdListStr) && Intrinsics.LJFF(this.beautifyChildNameListStr, beautyMobParam.beautifyChildNameListStr) && Intrinsics.LJFF(this.beautifyChildValueListStr, beautyMobParam.beautifyChildValueListStr) && Intrinsics.LJFF(this.beautifyParentIdListStr, beautyMobParam.beautifyParentIdListStr) && Intrinsics.LJFF(this.beautifyParentNameListStr, beautyMobParam.beautifyParentNameListStr) && Intrinsics.LJFF(this.beautifyParentValueListStr, beautyMobParam.beautifyParentValueListStr);
    }

    public int hashCode() {
        return (((((((((this.beautifyChildIdListStr.hashCode() * 31) + this.beautifyChildNameListStr.hashCode()) * 31) + this.beautifyChildValueListStr.hashCode()) * 31) + this.beautifyParentIdListStr.hashCode()) * 31) + this.beautifyParentNameListStr.hashCode()) * 31) + this.beautifyParentValueListStr.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautyMobParam(beautifyChildIdListStr=");
        sbLIZ.append(this.beautifyChildIdListStr);
        sbLIZ.append(", beautifyChildNameListStr=");
        sbLIZ.append(this.beautifyChildNameListStr);
        sbLIZ.append(", beautifyChildValueListStr=");
        sbLIZ.append(this.beautifyChildValueListStr);
        sbLIZ.append(", beautifyParentIdListStr=");
        sbLIZ.append(this.beautifyParentIdListStr);
        sbLIZ.append(", beautifyParentNameListStr=");
        sbLIZ.append(this.beautifyParentNameListStr);
        sbLIZ.append(", beautifyParentValueListStr=");
        sbLIZ.append(this.beautifyParentValueListStr);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.beautifyChildIdListStr);
        parcel.writeString(this.beautifyChildNameListStr);
        parcel.writeString(this.beautifyChildValueListStr);
        parcel.writeString(this.beautifyParentIdListStr);
        parcel.writeString(this.beautifyParentNameListStr);
        parcel.writeString(this.beautifyParentValueListStr);
    }

    public BeautyMobParam() {
        this("", "", "", "", "", "");
    }

    public final String getBeautifyChildIdListStr() {
        return this.beautifyChildIdListStr;
    }

    public final String getBeautifyChildNameListStr() {
        return this.beautifyChildNameListStr;
    }

    public final String getBeautifyChildValueListStr() {
        return this.beautifyChildValueListStr;
    }

    public final String getBeautifyParentIdListStr() {
        return this.beautifyParentIdListStr;
    }

    public final String getBeautifyParentNameListStr() {
        return this.beautifyParentNameListStr;
    }

    public final String getBeautifyParentValueListStr() {
        return this.beautifyParentValueListStr;
    }

    public BeautyMobParam(String str, String str2, String str3, String str4, String str5, String str6) {
        this.beautifyChildIdListStr = str;
        this.beautifyChildNameListStr = str2;
        this.beautifyChildValueListStr = str3;
        this.beautifyParentIdListStr = str4;
        this.beautifyParentNameListStr = str5;
        this.beautifyParentValueListStr = str6;
    }
}
