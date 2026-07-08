package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StickerAnimationCreateResponse extends BaseResponse {

    @C09CT("task_id")
    public final String taskId;

    public StickerAnimationCreateResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StickerAnimationCreateResponse) && Intrinsics.LJFF(this.taskId, ((StickerAnimationCreateResponse) obj).taskId);
    }

    public final int hashCode() {
        String str = this.taskId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerAnimationCreateResponse(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerAnimationCreateResponse(String str) {
        this.taskId = str;
    }
}
