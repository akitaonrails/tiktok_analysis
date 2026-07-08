package com.ss.android.ugc.aweme.cutsame;

import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.cutsame.PUGCTemplateDetail;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class PUGCTemplateDetail implements Parcelable {
    public final String coverUrl;
    public final String extra;
    public final String nickName;
    public final String nleSummary;
    public final Long provider;
    public final String templateMd5;
    public final String templateUrl;
    public final String title;
    public static final Parcelable.Creator<PUGCTemplateDetail> CREATOR = new Parcelable.Creator<PUGCTemplateDetail>() { // from class: X.0Ksr
        @Override // android.os.Parcelable.Creator
        public final PUGCTemplateDetail createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new PUGCTemplateDetail(string, string2, parcel.readString(), parcel.readString(), lValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PUGCTemplateDetail[] newArray(int i) {
            return new PUGCTemplateDetail[i];
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
        if (!(obj instanceof PUGCTemplateDetail)) {
            return false;
        }
        PUGCTemplateDetail pUGCTemplateDetail = (PUGCTemplateDetail) obj;
        return Intrinsics.LJFF(this.templateUrl, pUGCTemplateDetail.templateUrl) && Intrinsics.LJFF(this.templateMd5, pUGCTemplateDetail.templateMd5) && Intrinsics.LJFF(this.provider, pUGCTemplateDetail.provider) && Intrinsics.LJFF(this.coverUrl, pUGCTemplateDetail.coverUrl) && Intrinsics.LJFF(this.title, pUGCTemplateDetail.title) && Intrinsics.LJFF(this.nickName, pUGCTemplateDetail.nickName) && Intrinsics.LJFF(this.extra, pUGCTemplateDetail.extra) && Intrinsics.LJFF(this.nleSummary, pUGCTemplateDetail.nleSummary);
    }

    public final int hashCode() {
        String str = this.templateUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateMd5;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.provider;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.coverUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nickName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.extra;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nleSummary;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PUGCTemplateDetail(templateUrl=");
        sbLIZ.append(this.templateUrl);
        sbLIZ.append(", templateMd5=");
        sbLIZ.append(this.templateMd5);
        sbLIZ.append(", provider=");
        sbLIZ.append(this.provider);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.coverUrl);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", nickName=");
        sbLIZ.append(this.nickName);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", nleSummary=");
        sbLIZ.append(this.nleSummary);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateUrl);
        parcel.writeString(this.templateMd5);
        Long l = this.provider;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.nickName);
        parcel.writeString(this.extra);
        parcel.writeString(this.nleSummary);
    }

    public PUGCTemplateDetail(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7) {
        this.templateUrl = str;
        this.templateMd5 = str2;
        this.provider = l;
        this.coverUrl = str3;
        this.title = str4;
        this.nickName = str5;
        this.extra = str6;
        this.nleSummary = str7;
    }
}
