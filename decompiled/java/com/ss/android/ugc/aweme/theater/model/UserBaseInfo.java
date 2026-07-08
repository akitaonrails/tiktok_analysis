package com.ss.android.ugc.aweme.theater.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.theater.model.AvatarModel;
import com.ss.android.ugc.aweme.theater.model.UserBaseInfo;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserBaseInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<UserBaseInfo> CREATOR = new Parcelable.Creator<UserBaseInfo>() { // from class: X.02tr
        @Override // android.os.Parcelable.Creator
        public final UserBaseInfo createFromParcel(Parcel parcel) {
            Long lValueOf;
            String string = parcel.readString();
            AvatarModel avatarModelCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                avatarModelCreateFromParcel = AvatarModel.CREATOR.createFromParcel(parcel);
            }
            return new UserBaseInfo(string, lValueOf, string2, string3, avatarModelCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UserBaseInfo[] newArray(int i) {
            return new UserBaseInfo[i];
        }
    };

    @C09CT("avatar")
    public final AvatarModel avatar;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    @C09CT("uniq_id")
    public final String uniqId;

    public UserBaseInfo() {
        this(null, 0L, null, null, null);
    }

    public final UserBaseInfo copy(String str, Long l, String str2, String str3, AvatarModel avatarModel) {
        return new UserBaseInfo(str, l, str2, str3, avatarModel);
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
        return Intrinsics.LJFF(this.uniqId, userBaseInfo.uniqId) && Intrinsics.LJFF(this.id, userBaseInfo.id) && Intrinsics.LJFF(this.nickname, userBaseInfo.nickname) && Intrinsics.LJFF(this.secUid, userBaseInfo.secUid) && Intrinsics.LJFF(this.avatar, userBaseInfo.avatar);
    }

    public int hashCode() {
        String str = this.uniqId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.id;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secUid;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AvatarModel avatarModel = this.avatar;
        return iHashCode4 + (avatarModel != null ? avatarModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserBaseInfo(uniqId=");
        sbLIZ.append(this.uniqId);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uniqId);
        Long l = this.id;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.nickname);
        parcel.writeString(this.secUid);
        AvatarModel avatarModel = this.avatar;
        if (avatarModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avatarModel.writeToParcel(parcel, i);
        }
    }

    public final AvatarModel getAvatar() {
        return this.avatar;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUniqId() {
        return this.uniqId;
    }

    public UserBaseInfo(String str, Long l, String str2, String str3, AvatarModel avatarModel) {
        this.uniqId = str;
        this.id = l;
        this.nickname = str2;
        this.secUid = str3;
        this.avatar = avatarModel;
    }
}
