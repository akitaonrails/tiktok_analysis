package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarTaskStatusResponse extends BaseResponse {

    @C09CT("bytesync_status")
    public final int status;

    @C09CT("status_extra")
    public final SocialAvatarTaskStatusExtra statusExtra;

    @C09CT("thumbnail_url")
    public final List<String> thumbnailUrl;

    public SocialAvatarTaskStatusResponse() {
        this(0, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarTaskStatusResponse)) {
            return false;
        }
        SocialAvatarTaskStatusResponse socialAvatarTaskStatusResponse = (SocialAvatarTaskStatusResponse) obj;
        return this.status == socialAvatarTaskStatusResponse.status && Intrinsics.LJFF(this.thumbnailUrl, socialAvatarTaskStatusResponse.thumbnailUrl) && Intrinsics.LJFF(this.statusExtra, socialAvatarTaskStatusResponse.statusExtra);
    }

    public final int hashCode() {
        int i = this.status * 31;
        List<String> list = this.thumbnailUrl;
        int iHashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        SocialAvatarTaskStatusExtra socialAvatarTaskStatusExtra = this.statusExtra;
        return iHashCode + (socialAvatarTaskStatusExtra != null ? socialAvatarTaskStatusExtra.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarTaskStatusResponse(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", thumbnailUrl=");
        sbLIZ.append(this.thumbnailUrl);
        sbLIZ.append(", statusExtra=");
        sbLIZ.append(this.statusExtra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarTaskStatusResponse(int i, List<String> list, SocialAvatarTaskStatusExtra socialAvatarTaskStatusExtra) {
        this.status = i;
        this.thumbnailUrl = list;
        this.statusExtra = socialAvatarTaskStatusExtra;
    }
}
