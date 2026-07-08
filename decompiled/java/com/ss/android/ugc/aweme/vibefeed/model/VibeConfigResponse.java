package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class VibeConfigResponse extends BaseResponse {

    @C09CT("config")
    public final VibeFeedConfig config;

    @C09CT("joined_feed_users")
    public final List<VibeFeedUser> feedUsers;

    public VibeConfigResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VibeConfigResponse)) {
            return false;
        }
        VibeConfigResponse vibeConfigResponse = (VibeConfigResponse) obj;
        return Intrinsics.LJFF(this.config, vibeConfigResponse.config) && Intrinsics.LJFF(this.feedUsers, vibeConfigResponse.feedUsers);
    }

    public final int hashCode() {
        VibeFeedConfig vibeFeedConfig = this.config;
        int iHashCode = (vibeFeedConfig == null ? 0 : vibeFeedConfig.hashCode()) * 31;
        List<VibeFeedUser> list = this.feedUsers;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeConfigResponse(config=");
        sbLIZ.append(this.config);
        sbLIZ.append(", feedUsers=");
        sbLIZ.append(this.feedUsers);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VibeConfigResponse(VibeFeedConfig vibeFeedConfig, List<VibeFeedUser> list) {
        this.config = vibeFeedConfig;
        this.feedUsers = list;
    }
}
