package com.ss.android.ugc.airemix.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixUserData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixUserData implements Parcelable {
    public static final Parcelable.Creator<AIRemixUserData> CREATOR = new Parcelable.Creator<AIRemixUserData>() { // from class: X.0Lq0
        @Override // android.os.Parcelable.Creator
        public final AIRemixUserData createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new AIRemixUserData(string, string2, string3, string4, lValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixUserData[] newArray(int i) {
            return new AIRemixUserData[i];
        }
    };

    @C09CT("cameo_id")
    public final String cameoId;

    @C09CT("followers")
    public final Long followers;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("name")
    public final String name;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    @C09CT("unique_id")
    public final String uniqueId;

    /* JADX WARN: Multi-variable type inference failed */
    public AIRemixUserData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixUserData)) {
            return false;
        }
        AIRemixUserData aIRemixUserData = (AIRemixUserData) obj;
        return Intrinsics.LJFF(this.iconUrl, aIRemixUserData.iconUrl) && Intrinsics.LJFF(this.name, aIRemixUserData.name) && Intrinsics.LJFF(this.uid, aIRemixUserData.uid) && Intrinsics.LJFF(this.uniqueId, aIRemixUserData.uniqueId) && Intrinsics.LJFF(this.followers, aIRemixUserData.followers) && Intrinsics.LJFF(this.cameoId, aIRemixUserData.cameoId) && Intrinsics.LJFF(this.secUid, aIRemixUserData.secUid);
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uid;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.uniqueId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.followers;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.cameoId;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secUid;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixUserData(iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", followers=");
        sbLIZ.append(this.followers);
        sbLIZ.append(", cameoId=");
        sbLIZ.append(this.cameoId);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.uid);
        parcel.writeString(this.uniqueId);
        Long l = this.followers;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.cameoId);
        parcel.writeString(this.secUid);
    }

    public AIRemixUserData(String str, String str2, String str3, String str4, Long l, String str5, String str6) {
        this.iconUrl = str;
        this.name = str2;
        this.uid = str3;
        this.uniqueId = str4;
        this.followers = l;
        this.cameoId = str5;
        this.secUid = str6;
    }

    public /* synthetic */ AIRemixUserData(String str, String str2, String str3, String str4, Long l, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : l, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null);
    }
}
