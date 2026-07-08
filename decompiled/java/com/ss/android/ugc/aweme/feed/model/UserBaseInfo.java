package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserBaseInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<UserBaseInfo> CREATOR = new Creator();

    @C09CT("app_id")
    public String appId;

    @C09CT("avatar")
    public Avatar avatar;

    @C09CT("nickname")
    public String nickname;

    @C09CT("sec_uid")
    public String secUserId;

    @C09CT("uniq_id")
    public String uniqId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String userId;

    public static final class Creator implements Parcelable.Creator<UserBaseInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserBaseInfo createFromParcel(Parcel parcel) {
            return new UserBaseInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Avatar.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserBaseInfo[] newArray(int i) {
            return new UserBaseInfo[i];
        }
    }

    public UserBaseInfo() {
    }

    public final UserBaseInfo copy(String str, String str2, String str3, String str4, Avatar avatar, String str5) {
        return new UserBaseInfo(str, str2, str3, str4, avatar, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBaseInfo)) {
            return false;
        }
        UserBaseInfo userBaseInfo = (UserBaseInfo) obj;
        return Intrinsics.LJFF(this.userId, userBaseInfo.userId) && Intrinsics.LJFF(this.secUserId, userBaseInfo.secUserId) && Intrinsics.LJFF(this.appId, userBaseInfo.appId) && Intrinsics.LJFF(this.nickname, userBaseInfo.nickname) && Intrinsics.LJFF(this.avatar, userBaseInfo.avatar) && Intrinsics.LJFF(this.uniqId, userBaseInfo.uniqId);
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUserId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickname;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Avatar avatar = this.avatar;
        int iHashCode5 = (iHashCode4 + (avatar == null ? 0 : avatar.hashCode())) * 31;
        String str5 = this.uniqId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserBaseInfo(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", secUserId=");
        sbLIZ.append(this.secUserId);
        sbLIZ.append(", appId=");
        sbLIZ.append(this.appId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", uniqId=");
        sbLIZ.append(this.uniqId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.secUserId);
        parcel.writeString(this.appId);
        parcel.writeString(this.nickname);
        Avatar avatar = this.avatar;
        if (avatar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avatar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.uniqId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final String getUniqId() {
        return this.uniqId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public UserBaseInfo(String str, String str2, String str3, String str4, Avatar avatar, String str5) {
        this.userId = str;
        this.secUserId = str2;
        this.appId = str3;
        this.nickname = str4;
        this.avatar = avatar;
        this.uniqId = str5;
    }
}
