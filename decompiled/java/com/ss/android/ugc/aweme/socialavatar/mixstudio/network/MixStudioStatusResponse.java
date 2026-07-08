package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioStatusResponse extends BaseResponse {

    @C09CT("allowed_to_generate_more")
    public final Boolean allowedToGenerateMore;

    @C09CT("input_source_type")
    public final int inputSourceType;

    @C09CT("task")
    public final MixStudioTask mixStudioTask;

    @C09CT("polling_interval_ms")
    public final Integer pollingIntervalMs;

    public MixStudioStatusResponse() {
        this(null, null, null, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStudioStatusResponse)) {
            return false;
        }
        MixStudioStatusResponse mixStudioStatusResponse = (MixStudioStatusResponse) obj;
        return Intrinsics.LJFF(this.mixStudioTask, mixStudioStatusResponse.mixStudioTask) && Intrinsics.LJFF(this.pollingIntervalMs, mixStudioStatusResponse.pollingIntervalMs) && Intrinsics.LJFF(this.allowedToGenerateMore, mixStudioStatusResponse.allowedToGenerateMore) && this.inputSourceType == mixStudioStatusResponse.inputSourceType;
    }

    public final int hashCode() {
        MixStudioTask mixStudioTask = this.mixStudioTask;
        int iHashCode = (mixStudioTask == null ? 0 : mixStudioTask.hashCode()) * 31;
        Integer num = this.pollingIntervalMs;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.allowedToGenerateMore;
        return ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.inputSourceType;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioStatusResponse(mixStudioTask=");
        sbLIZ.append(this.mixStudioTask);
        sbLIZ.append(", pollingIntervalMs=");
        sbLIZ.append(this.pollingIntervalMs);
        sbLIZ.append(", allowedToGenerateMore=");
        sbLIZ.append(this.allowedToGenerateMore);
        sbLIZ.append(", inputSourceType=");
        sbLIZ.append(this.inputSourceType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MixStudioStatusResponse(MixStudioTask mixStudioTask, Integer num, Boolean bool, int i) {
        this.mixStudioTask = mixStudioTask;
        this.pollingIntervalMs = num;
        this.allowedToGenerateMore = bool;
        this.inputSourceType = i;
    }
}
