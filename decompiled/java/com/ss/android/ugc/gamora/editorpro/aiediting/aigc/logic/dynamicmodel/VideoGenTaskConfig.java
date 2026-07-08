package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoGenTaskConfig {

    @C09CT("degrade_req_key")
    public final String degradeReqKey;

    @C09CT("supported_aspect_ratios")
    public final List<String> supportedAspectRatios;

    @C09CT("supported_durations")
    public final List<Integer> supportedDurations;

    @C09CT("task_req_key")
    public final String taskReqKey;

    @C09CT("task_type")
    public final String taskType;

    public VideoGenTaskConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGenTaskConfig)) {
            return false;
        }
        VideoGenTaskConfig videoGenTaskConfig = (VideoGenTaskConfig) obj;
        return Intrinsics.LJFF(this.supportedAspectRatios, videoGenTaskConfig.supportedAspectRatios) && Intrinsics.LJFF(this.supportedDurations, videoGenTaskConfig.supportedDurations) && Intrinsics.LJFF(this.taskType, videoGenTaskConfig.taskType) && Intrinsics.LJFF(this.taskReqKey, videoGenTaskConfig.taskReqKey) && Intrinsics.LJFF(this.degradeReqKey, videoGenTaskConfig.degradeReqKey);
    }

    public final int hashCode() {
        return (((((((this.supportedAspectRatios.hashCode() * 31) + this.supportedDurations.hashCode()) * 31) + this.taskType.hashCode()) * 31) + this.taskReqKey.hashCode()) * 31) + this.degradeReqKey.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoGenTaskConfig(supportedAspectRatios=");
        sbLIZ.append(this.supportedAspectRatios);
        sbLIZ.append(", supportedDurations=");
        sbLIZ.append(this.supportedDurations);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", taskReqKey=");
        sbLIZ.append(this.taskReqKey);
        sbLIZ.append(", degradeReqKey=");
        sbLIZ.append(this.degradeReqKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static VideoGenTaskConfig LIZ(VideoGenTaskConfig videoGenTaskConfig, String str) {
        return new VideoGenTaskConfig(videoGenTaskConfig.supportedAspectRatios, videoGenTaskConfig.supportedDurations, videoGenTaskConfig.taskType, str, videoGenTaskConfig.degradeReqKey);
    }

    public VideoGenTaskConfig(List<String> list, List<Integer> list2, String str, String str2, String str3) {
        this.supportedAspectRatios = list;
        this.supportedDurations = list2;
        this.taskType = str;
        this.taskReqKey = str2;
        this.degradeReqKey = str3;
    }

    public VideoGenTaskConfig(List list, List list2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) == 0 ? str3 : "");
    }
}
