package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public final class SocialAvatarLikeStatusResponse extends BaseResponse {

    @C09CT("has_liked")
    public final boolean hasLiked;

    public SocialAvatarLikeStatusResponse() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SocialAvatarLikeStatusResponse) && this.hasLiked == ((SocialAvatarLikeStatusResponse) obj).hasLiked;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.hasLiked);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarLikeStatusResponse(hasLiked=");
        sbLIZ.append(this.hasLiked);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarLikeStatusResponse(boolean z) {
        this.hasLiked = z;
    }
}
