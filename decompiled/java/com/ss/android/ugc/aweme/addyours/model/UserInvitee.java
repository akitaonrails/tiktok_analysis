package com.ss.android.ugc.aweme.addyours.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class UserInvitee implements Serializable, Parcelable {
    public static final Parcelable.Creator<UserInvitee> CREATOR = new Parcelable.Creator<UserInvitee>() { // from class: X.0OAw
        @Override // android.os.Parcelable.Creator
        public final UserInvitee createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            Integer numValueOf2 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new UserInvitee(string, string2, string3, urlModel, numValueOf, numValueOf2, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final UserInvitee[] newArray(int i) {
            return new UserInvitee[i];
        }
    };

    @C09CT("avatar_model")
    public final UrlModel avatarModel;

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("follow_status")
    public final Integer followStatus;

    @C09CT("follower_status")
    public final Integer followerStatus;

    @C09CT("invited")
    public final boolean invited;

    @C09CT("is_muf")
    public final boolean isMuf;

    @C09CT("uid")
    public final String uid;

    @C09CT("user_name")
    public final String userName;

    public final UserInvitee copy(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, boolean z, boolean z2) {
        return new UserInvitee(str, str2, str3, urlModel, num, num2, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        int iHashCode = this.uid.hashCode() * 31;
        String str = this.userName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.avatarModel;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        Integer num = this.followStatus;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.followerStatus;
        return ((((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.invited)) * 31) + C786410Ut5.Z2(this.isMuf);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserInvitee(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.avatarUrl);
        sbLIZ.append(", avatarModel=");
        sbLIZ.append(this.avatarModel);
        sbLIZ.append(", followStatus=");
        sbLIZ.append(this.followStatus);
        sbLIZ.append(", followerStatus=");
        sbLIZ.append(this.followerStatus);
        sbLIZ.append(", invited=");
        sbLIZ.append(this.invited);
        sbLIZ.append(", isMuf=");
        sbLIZ.append(this.isMuf);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uid);
        parcel.writeString(this.userName);
        parcel.writeString(this.avatarUrl);
        parcel.writeSerializable(this.avatarModel);
        Integer num = this.followStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.followerStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.invited ? 1 : 0);
        parcel.writeInt(this.isMuf ? 1 : 0);
    }

    public final UrlModel getAvatarModel() {
        return this.avatarModel;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Integer getFollowStatus() {
        return this.followStatus;
    }

    public final Integer getFollowerStatus() {
        return this.followerStatus;
    }

    public final boolean getInvited() {
        return this.invited;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean isMuf() {
        return this.isMuf;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UserInvitee)) {
            return false;
        }
        return Intrinsics.LJFF(this.uid, ((UserInvitee) obj).uid);
    }

    public UserInvitee(String str, String str2, String str3, UrlModel urlModel, Integer num, Integer num2, boolean z, boolean z2) {
        this.uid = str;
        this.userName = str2;
        this.avatarUrl = str3;
        this.avatarModel = urlModel;
        this.followStatus = num;
        this.followerStatus = num2;
        this.invited = z;
        this.isMuf = z2;
    }
}
