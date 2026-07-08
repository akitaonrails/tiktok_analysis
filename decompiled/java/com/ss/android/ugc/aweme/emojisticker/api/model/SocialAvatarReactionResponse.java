package com.ss.android.ugc.aweme.emojisticker.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SocialAvatarReactionResponse extends BaseResponse {

    @C09CT("social_avatar_sticker_result")
    public final SocialAvatarReactionResult socialAvatarReactionResult;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SocialAvatarReactionResponse) && Intrinsics.LJFF(this.socialAvatarReactionResult, ((SocialAvatarReactionResponse) obj).socialAvatarReactionResult);
    }

    public final int hashCode() {
        SocialAvatarReactionResult socialAvatarReactionResult = this.socialAvatarReactionResult;
        if (socialAvatarReactionResult == null) {
            return 0;
        }
        return socialAvatarReactionResult.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarReactionResponse(socialAvatarReactionResult=");
        sbLIZ.append(this.socialAvatarReactionResult);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarReactionResponse(SocialAvatarReactionResult socialAvatarReactionResult) {
        this.socialAvatarReactionResult = socialAvatarReactionResult;
    }
}
