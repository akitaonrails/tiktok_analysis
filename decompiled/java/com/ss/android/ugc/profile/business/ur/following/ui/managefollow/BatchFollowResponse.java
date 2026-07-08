package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BatchFollowResponse extends BaseResponse {

    @C09CT("error_user_ids")
    public final List<Long> errorUserIds;

    @C09CT("unfollow_flag")
    public final Boolean unfollowFlag;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchFollowResponse)) {
            return false;
        }
        BatchFollowResponse batchFollowResponse = (BatchFollowResponse) obj;
        return Intrinsics.LJFF(this.unfollowFlag, batchFollowResponse.unfollowFlag) && Intrinsics.LJFF(this.errorUserIds, batchFollowResponse.errorUserIds);
    }

    public final int hashCode() {
        Boolean bool = this.unfollowFlag;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<Long> list = this.errorUserIds;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchFollowResponse(unfollowFlag=");
        sbLIZ.append(this.unfollowFlag);
        sbLIZ.append(", errorUserIds=");
        sbLIZ.append(this.errorUserIds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BatchFollowResponse(Boolean bool, List<Long> list) {
        this.unfollowFlag = bool;
        this.errorUserIds = list;
    }
}
