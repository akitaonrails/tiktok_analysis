package com.ss.android.ugc.aweme.aikit.api.common.task;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UserBaseInfo implements Serializable {

    @C09CT("app_id")
    public final String appId;

    @C09CT("avatar")
    public final ImageInfo avatar;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("live_photo")
    public final LivePhotoInfo livePhoto;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("sec_uid")
    public final String secUid;

    public UserBaseInfo() {
        this(null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBaseInfo)) {
            return false;
        }
        UserBaseInfo userBaseInfo = (UserBaseInfo) obj;
        return Intrinsics.LJFF(this.id, userBaseInfo.id) && Intrinsics.LJFF(this.secUid, userBaseInfo.secUid) && Intrinsics.LJFF(this.appId, userBaseInfo.appId) && Intrinsics.LJFF(this.nickname, userBaseInfo.nickname) && Intrinsics.LJFF(this.avatar, userBaseInfo.avatar) && Intrinsics.LJFF(this.livePhoto, userBaseInfo.livePhoto);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secUid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickname;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ImageInfo imageInfo = this.avatar;
        int iHashCode5 = (iHashCode4 + (imageInfo == null ? 0 : imageInfo.hashCode())) * 31;
        LivePhotoInfo livePhotoInfo = this.livePhoto;
        return iHashCode5 + (livePhotoInfo != null ? livePhotoInfo.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserBaseInfo(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.secUid);
        sbLIZ.append(", appId=");
        sbLIZ.append(this.appId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatar=");
        sbLIZ.append(this.avatar);
        sbLIZ.append(", livePhoto=");
        sbLIZ.append(this.livePhoto);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UserBaseInfo(String str, String str2, String str3, String str4, ImageInfo imageInfo, LivePhotoInfo livePhotoInfo) {
        this.id = str;
        this.secUid = str2;
        this.appId = str3;
        this.nickname = str4;
        this.avatar = imageInfo;
        this.livePhoto = livePhotoInfo;
    }
}
