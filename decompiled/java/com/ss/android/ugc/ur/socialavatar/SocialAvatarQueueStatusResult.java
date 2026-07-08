package com.ss.android.ugc.ur.socialavatar;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarQueueStatusResult extends BaseResponse {

    @C09CT("avg_task_time")
    public final Long avgTaskTime;

    @C09CT("queue_wait_time")
    public final Long queueWaitTime;

    public SocialAvatarQueueStatusResult() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarQueueStatusResult)) {
            return false;
        }
        SocialAvatarQueueStatusResult socialAvatarQueueStatusResult = (SocialAvatarQueueStatusResult) obj;
        return Intrinsics.LJFF(this.avgTaskTime, socialAvatarQueueStatusResult.avgTaskTime) && Intrinsics.LJFF(this.queueWaitTime, socialAvatarQueueStatusResult.queueWaitTime);
    }

    public final int hashCode() {
        Long l = this.avgTaskTime;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.queueWaitTime;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarQueueStatusResult(avgTaskTime=");
        sbLIZ.append(this.avgTaskTime);
        sbLIZ.append(", queueWaitTime=");
        sbLIZ.append(this.queueWaitTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarQueueStatusResult(Long l, Long l2) {
        this.avgTaskTime = l;
        this.queueWaitTime = l2;
    }
}
