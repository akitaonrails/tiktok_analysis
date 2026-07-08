package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UserStruct implements Serializable {
    public static final int $stable = 8;

    @C09CT("avatar_thumb")
    public final ImageUrlModel avatarThumb;

    @C09CT("is_verified")
    public final Boolean isVerified;

    @C09CT("nickname")
    public final String nickname;

    @C09CT("uid")
    public final String uid;

    @C09CT("unique_id")
    public final String uniqueId;

    public UserStruct() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserStruct)) {
            return false;
        }
        UserStruct userStruct = (UserStruct) obj;
        return Intrinsics.LJFF(this.uid, userStruct.uid) && Intrinsics.LJFF(this.uniqueId, userStruct.uniqueId) && Intrinsics.LJFF(this.nickname, userStruct.nickname) && Intrinsics.LJFF(this.avatarThumb, userStruct.avatarThumb) && Intrinsics.LJFF(this.isVerified, userStruct.isVerified);
    }

    public int hashCode() {
        String str = this.uid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uniqueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageUrlModel imageUrlModel = this.avatarThumb;
        int iHashCode4 = (iHashCode3 + (imageUrlModel == null ? 0 : imageUrlModel.hashCode())) * 31;
        Boolean bool = this.isVerified;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStruct(uid=");
        sbLIZ.append(this.uid);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.uniqueId);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.nickname);
        sbLIZ.append(", avatarThumb=");
        sbLIZ.append(this.avatarThumb);
        sbLIZ.append(", isVerified=");
        sbLIZ.append(this.isVerified);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Boolean isVerified() {
        return this.isVerified;
    }

    public UserStruct(String str, String str2, String str3, ImageUrlModel imageUrlModel, Boolean bool) {
        this.uid = str;
        this.uniqueId = str2;
        this.nickname = str3;
        this.avatarThumb = imageUrlModel;
        this.isVerified = bool;
    }
}
