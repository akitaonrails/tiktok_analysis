package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SocialAvatarCreateResponse extends BaseResponse {

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("task_id")
    public final String taskId;

    public SocialAvatarCreateResponse() {
        this("", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialAvatarCreateResponse)) {
            return false;
        }
        SocialAvatarCreateResponse socialAvatarCreateResponse = (SocialAvatarCreateResponse) obj;
        return Intrinsics.LJFF(this.taskId, socialAvatarCreateResponse.taskId) && Intrinsics.LJFF(this.logPb, socialAvatarCreateResponse.logPb);
    }

    public final int hashCode() {
        int iHashCode = this.taskId.hashCode() * 31;
        LogPbBean logPbBean = this.logPb;
        return iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarCreateResponse(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", logPb=");
        sbLIZ.append(this.logPb);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarCreateResponse(String str, LogPbBean logPbBean) {
        this.taskId = str;
        this.logPb = logPbBean;
    }
}
