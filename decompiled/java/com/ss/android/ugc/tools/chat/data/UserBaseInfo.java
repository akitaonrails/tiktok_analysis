package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserBaseInfo {

    @C09CT("app_id")
    public final String appId;

    @C09CT("avatar")
    public final Avatar avatar;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_uid")
    public final String secUserId;

    @C09CT("uniq_id")
    public final String uniqId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String userId;

    public UserBaseInfo() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBaseInfo)) {
            return false;
        }
        UserBaseInfo userBaseInfo = (UserBaseInfo) obj;
        return Intrinsics.LJFF(this.userId, userBaseInfo.userId) && Intrinsics.LJFF(this.secUserId, userBaseInfo.secUserId) && Intrinsics.LJFF(this.appId, userBaseInfo.appId) && Intrinsics.LJFF(this.nickname, userBaseInfo.nickname) && Intrinsics.LJFF(this.avatar, userBaseInfo.avatar) && Intrinsics.LJFF(this.uniqId, userBaseInfo.uniqId);
    }

    public final int hashCode() {
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

    public final String toString() {
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

    public UserBaseInfo(String str, String str2, String str3, String str4, Avatar avatar, String str5) {
        this.userId = str;
        this.secUserId = str2;
        this.appId = str3;
        this.nickname = str4;
        this.avatar = avatar;
        this.uniqId = str5;
    }
}
