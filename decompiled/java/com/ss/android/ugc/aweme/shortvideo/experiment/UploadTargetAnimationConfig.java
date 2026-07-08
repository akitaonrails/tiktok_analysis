package com.ss.android.ugc.aweme.shortvideo.experiment;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes23.dex */
public final class UploadTargetAnimationConfig {

    @C09CT("bridge_animation_max_duration_ms")
    public final long bridgeAnimationMaxDurationMs;

    @C09CT("bridge_animation_ms_per_percent")
    public final long bridgeAnimationMsPerPercent;

    @C09CT("enable_image_mode")
    public final boolean enableImageMode;

    @C09CT("start_progress")
    public final float startProgress;

    @C09CT("upload_target_animation_duration")
    public final long uploadTargetAnimationDurationInMs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadTargetAnimationConfig)) {
            return false;
        }
        UploadTargetAnimationConfig uploadTargetAnimationConfig = (UploadTargetAnimationConfig) obj;
        return this.uploadTargetAnimationDurationInMs == uploadTargetAnimationConfig.uploadTargetAnimationDurationInMs && this.bridgeAnimationMsPerPercent == uploadTargetAnimationConfig.bridgeAnimationMsPerPercent && this.bridgeAnimationMaxDurationMs == uploadTargetAnimationConfig.bridgeAnimationMaxDurationMs && Float.compare(this.startProgress, uploadTargetAnimationConfig.startProgress) == 0 && this.enableImageMode == uploadTargetAnimationConfig.enableImageMode;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadTargetAnimationConfig(uploadTargetAnimationDurationInMs=");
        sbLIZ.append(this.uploadTargetAnimationDurationInMs);
        sbLIZ.append(", bridgeAnimationMsPerPercent=");
        sbLIZ.append(this.bridgeAnimationMsPerPercent);
        sbLIZ.append(", bridgeAnimationMaxDurationMs=");
        sbLIZ.append(this.bridgeAnimationMaxDurationMs);
        sbLIZ.append(", startProgress=");
        sbLIZ.append(this.startProgress);
        sbLIZ.append(", enableImageMode=");
        sbLIZ.append(this.enableImageMode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UploadTargetAnimationConfig() {
        this(0L, 8L, 500L, 0.5f, false);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.uploadTargetAnimationDurationInMs) * 31) + C786410Ut5.Y2(this.bridgeAnimationMsPerPercent)) * 31) + C786410Ut5.Y2(this.bridgeAnimationMaxDurationMs)) * 31) + Float.floatToIntBits(this.startProgress)) * 31) + C786410Ut5.Z2(this.enableImageMode);
    }

    public UploadTargetAnimationConfig(long j, long j2, long j3, float f, boolean z) {
        this.uploadTargetAnimationDurationInMs = j;
        this.bridgeAnimationMsPerPercent = j2;
        this.bridgeAnimationMaxDurationMs = j3;
        this.startProgress = f;
        this.enableImageMode = z;
    }
}
