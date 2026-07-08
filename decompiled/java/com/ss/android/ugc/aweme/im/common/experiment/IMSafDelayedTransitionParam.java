package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes5.dex */
public final class IMSafDelayedTransitionParam {

    @C09CT("onresume_duration_ms")
    public final long onResumeDurationMs;

    @C09CT("release_after_next_frame")
    public final boolean releaseAfterNextFrame;

    @C09CT("transition_timeout_ms")
    public final long transitionTimeoutMs;

    @C09CT("trigger_after_list_skeleton")
    public final boolean triggerAfterListSkeleton;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMSafDelayedTransitionParam)) {
            return false;
        }
        IMSafDelayedTransitionParam iMSafDelayedTransitionParam = (IMSafDelayedTransitionParam) obj;
        return this.transitionTimeoutMs == iMSafDelayedTransitionParam.transitionTimeoutMs && this.onResumeDurationMs == iMSafDelayedTransitionParam.onResumeDurationMs && this.triggerAfterListSkeleton == iMSafDelayedTransitionParam.triggerAfterListSkeleton && this.releaseAfterNextFrame == iMSafDelayedTransitionParam.releaseAfterNextFrame;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.transitionTimeoutMs) * 31) + C786410Ut5.Y2(this.onResumeDurationMs)) * 31) + C786410Ut5.Z2(this.triggerAfterListSkeleton)) * 31) + C786410Ut5.Z2(this.releaseAfterNextFrame);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSafDelayedTransitionParam(transitionTimeoutMs=");
        sbLIZ.append(this.transitionTimeoutMs);
        sbLIZ.append(", onResumeDurationMs=");
        sbLIZ.append(this.onResumeDurationMs);
        sbLIZ.append(", triggerAfterListSkeleton=");
        sbLIZ.append(this.triggerAfterListSkeleton);
        sbLIZ.append(", releaseAfterNextFrame=");
        sbLIZ.append(this.releaseAfterNextFrame);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMSafDelayedTransitionParam() {
        this(0L, 500L, false, false);
    }

    public IMSafDelayedTransitionParam(long j, long j2, boolean z, boolean z2) {
        this.transitionTimeoutMs = j;
        this.onResumeDurationMs = j2;
        this.triggerAfterListSkeleton = z;
        this.releaseAfterNextFrame = z2;
    }
}
