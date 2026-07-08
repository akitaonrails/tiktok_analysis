package com.ss.android.ugc.aweme.story.note.avatar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AvatarThoughtSocialAvatarResponse extends BaseResponse {

    @C09CT("has_valid_avatar_selfie")
    public final Boolean hasValidAvatarSelfie;

    @C09CT("user_base_avatar_meta")
    public final List<AvatarMetaInfoWithCategory> userBaseAvatarMeta;

    @C09CT("user_base_avatar_struct")
    public final List<UserBaseAvatarStruct> userBaseAvatarStruct;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarThoughtSocialAvatarResponse)) {
            return false;
        }
        AvatarThoughtSocialAvatarResponse avatarThoughtSocialAvatarResponse = (AvatarThoughtSocialAvatarResponse) obj;
        return Intrinsics.LJFF(this.userBaseAvatarStruct, avatarThoughtSocialAvatarResponse.userBaseAvatarStruct) && Intrinsics.LJFF(this.userBaseAvatarMeta, avatarThoughtSocialAvatarResponse.userBaseAvatarMeta) && Intrinsics.LJFF(this.hasValidAvatarSelfie, avatarThoughtSocialAvatarResponse.hasValidAvatarSelfie);
    }

    public final int hashCode() {
        List<UserBaseAvatarStruct> list = this.userBaseAvatarStruct;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AvatarMetaInfoWithCategory> list2 = this.userBaseAvatarMeta;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.hasValidAvatarSelfie;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarThoughtSocialAvatarResponse(userBaseAvatarStruct=");
        sbLIZ.append(this.userBaseAvatarStruct);
        sbLIZ.append(", userBaseAvatarMeta=");
        sbLIZ.append(this.userBaseAvatarMeta);
        sbLIZ.append(", hasValidAvatarSelfie=");
        sbLIZ.append(this.hasValidAvatarSelfie);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AvatarThoughtSocialAvatarResponse(List<UserBaseAvatarStruct> list, List<AvatarMetaInfoWithCategory> list2, Boolean bool) {
        this.userBaseAvatarStruct = list;
        this.userBaseAvatarMeta = list2;
        this.hasValidAvatarSelfie = bool;
    }
}
