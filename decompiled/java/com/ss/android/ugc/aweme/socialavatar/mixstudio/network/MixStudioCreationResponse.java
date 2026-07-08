package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MixStudioCreationResponse extends BaseResponse {

    @C09CT("task_id")
    public final String mixStudioTaskId;

    public MixStudioCreationResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MixStudioCreationResponse) && Intrinsics.LJFF(this.mixStudioTaskId, ((MixStudioCreationResponse) obj).mixStudioTaskId);
    }

    public final int hashCode() {
        String str = this.mixStudioTaskId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioCreationResponse(mixStudioTaskId=");
        sbLIZ.append(this.mixStudioTaskId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MixStudioCreationResponse(String str) {
        this.mixStudioTaskId = str;
    }
}
