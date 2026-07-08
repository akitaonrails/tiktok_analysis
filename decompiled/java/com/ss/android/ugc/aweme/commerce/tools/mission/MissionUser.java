package com.ss.android.ugc.aweme.commerce.tools.mission;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionUser;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MissionUser implements Parcelable, Serializable {
    public static final Parcelable.Creator<MissionUser> CREATOR = new Parcelable.Creator<MissionUser>() { // from class: X.0Z2i
        @Override // android.os.Parcelable.Creator
        public final MissionUser createFromParcel(Parcel parcel) {
            return new MissionUser(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MissionUser[] newArray(int i) {
            return new MissionUser[i];
        }
    };

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uid")
    public final String uid;

    public MissionUser() {
        this(null, null, null);
    }

    public final MissionUser copy(String str, String str2, String str3) {
        return new MissionUser(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionUser)) {
            return false;
        }
        MissionUser missionUser = (MissionUser) obj;
        return Intrinsics.LJFF(this.uid, missionUser.uid) && Intrinsics.LJFF(this.secUid, missionUser.secUid) && Intrinsics.LJFF(this.nickname, missionUser.nickname);
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MissionUser(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeString(this.nickname);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public MissionUser(String str, String str2, String str3) {
        this.uid = str;
        this.secUid = str2;
        this.nickname = str3;
    }
}
