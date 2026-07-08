package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class StickerAnimationTasksListResponse extends BaseResponse {

    @C09CT("tasks")
    public final List<RemoteStickerAnimationTask> animationTasks;

    @C09CT("polling_interval_ms")
    public final long pollingIntervalMs;

    public StickerAnimationTasksListResponse() {
        this(null, 0L, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerAnimationTasksListResponse)) {
            return false;
        }
        StickerAnimationTasksListResponse stickerAnimationTasksListResponse = (StickerAnimationTasksListResponse) obj;
        return Intrinsics.LJFF(this.animationTasks, stickerAnimationTasksListResponse.animationTasks) && this.pollingIntervalMs == stickerAnimationTasksListResponse.pollingIntervalMs;
    }

    public final int hashCode() {
        return (this.animationTasks.hashCode() * 31) + C786410Ut5.Y2(this.pollingIntervalMs);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerAnimationTasksListResponse(animationTasks=");
        sbLIZ.append(this.animationTasks);
        sbLIZ.append(", pollingIntervalMs=");
        sbLIZ.append(this.pollingIntervalMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StickerAnimationTasksListResponse(List<RemoteStickerAnimationTask> list, long j) {
        this.animationTasks = list;
        this.pollingIntervalMs = j;
    }

    public StickerAnimationTasksListResponse(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0L : j);
    }
}
