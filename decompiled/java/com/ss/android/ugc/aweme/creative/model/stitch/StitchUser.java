package com.ss.android.ugc.aweme.creative.model.stitch;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class StitchUser implements Parcelable {
    public static final Parcelable.Creator<StitchUser> CREATOR = new Parcelable.Creator<StitchUser>() { // from class: X.0Z2h
        @Override // android.os.Parcelable.Creator
        public final StitchUser createFromParcel(Parcel parcel) {
            return new StitchUser(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StitchUser[] newArray(int i) {
            return new StitchUser[i];
        }
    };

    @C09CT("nickname")
    public final String nickname;

    @C09CT("duet_sec_uid")
    public final String secUid;

    @C09CT("short_id")
    public final String shortId;

    @C09CT("duet_uid")
    public final String uid;

    @C09CT("unique_id")
    public final String uniqueId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchUser)) {
            return false;
        }
        StitchUser stitchUser = (StitchUser) obj;
        return Intrinsics.LJFF(this.uid, stitchUser.uid) && Intrinsics.LJFF(this.secUid, stitchUser.secUid) && Intrinsics.LJFF(this.nickname, stitchUser.nickname) && Intrinsics.LJFF(this.uniqueId, stitchUser.uniqueId) && Intrinsics.LJFF(this.shortId, stitchUser.shortId);
    }

    public final int hashCode() {
        return (((((((this.uid.hashCode() * 31) + this.secUid.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.uniqueId.hashCode()) * 31) + this.shortId.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StitchUser(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", shortId=");
        sbLIZ.append(this.shortId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.secUid);
        parcel.writeString(this.nickname);
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.shortId);
    }

    public StitchUser() {
        this("", "", "", "", "");
    }

    public StitchUser(String str, String str2, String str3, String str4, String str5) {
        this.uid = str;
        this.secUid = str2;
        this.nickname = str3;
        this.uniqueId = str4;
        this.shortId = str5;
    }
}
