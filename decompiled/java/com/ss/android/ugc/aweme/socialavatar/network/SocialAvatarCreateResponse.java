package com.ss.android.ugc.aweme.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SocialAvatarCreateResponse extends BaseResponse {
    public static final int $stable = 8;

    @C09CT("task_id")
    public final String taskId;

    public final SocialAvatarCreateResponse copy(String str) {
        return new SocialAvatarCreateResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SocialAvatarCreateResponse) && Intrinsics.LJFF(this.taskId, ((SocialAvatarCreateResponse) obj).taskId);
    }

    public int hashCode() {
        return this.taskId.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarCreateResponse(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SocialAvatarCreateResponse() {
        this("");
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public SocialAvatarCreateResponse(String str) {
        this.taskId = str;
    }
}
