package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AutoCutAgentProgress {

    @C09CT("duration_ms")
    public final Long durationMs;

    @C09CT("estimated_time_remaining_ms")
    public final long estimatedTimeRemainingMs;

    @C09CT("is_display_task_completed_others_running")
    public boolean isDisplayTaskCompletedOthersRunning;

    @C09CT("is_display_task_failed")
    public boolean isDisplayTaskFailed;

    @C09CT("music_clip_id")
    public final String musicClipId;

    @C09CT("music_info")
    public final MusicInfo musicInfo;

    @C09CT("nle_draft")
    public final String nleDraft;

    @C09CT("overall_progress_percent")
    public final int overallProgressPercent;

    @C09CT("progress_infos")
    public final List<PhaseProgressInfo> progressInfos;

    @C09CT("task_progress_info")
    public List<TaskProgressInfo> taskProgressInfos;

    public AutoCutAgentProgress() {
        this(0, null, null, null, null, 0L, false, false, null, null, 1023, null);
    }

    public final AutoCutAgentProgress copy(int i, List<PhaseProgressInfo> list, String str, MusicInfo musicInfo, String str2, long j, boolean z, boolean z2, List<TaskProgressInfo> list2, Long l) {
        return new AutoCutAgentProgress(i, list, str, musicInfo, str2, j, z, z2, list2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutAgentProgress)) {
            return false;
        }
        AutoCutAgentProgress autoCutAgentProgress = (AutoCutAgentProgress) obj;
        return this.overallProgressPercent == autoCutAgentProgress.overallProgressPercent && Intrinsics.LJFF(this.progressInfos, autoCutAgentProgress.progressInfos) && Intrinsics.LJFF(this.musicClipId, autoCutAgentProgress.musicClipId) && Intrinsics.LJFF(this.musicInfo, autoCutAgentProgress.musicInfo) && Intrinsics.LJFF(this.nleDraft, autoCutAgentProgress.nleDraft) && this.estimatedTimeRemainingMs == autoCutAgentProgress.estimatedTimeRemainingMs && this.isDisplayTaskFailed == autoCutAgentProgress.isDisplayTaskFailed && this.isDisplayTaskCompletedOthersRunning == autoCutAgentProgress.isDisplayTaskCompletedOthersRunning && Intrinsics.LJFF(this.taskProgressInfos, autoCutAgentProgress.taskProgressInfos) && Intrinsics.LJFF(this.durationMs, autoCutAgentProgress.durationMs);
    }

    public int hashCode() {
        int iHashCode = ((this.overallProgressPercent * 31) + this.progressInfos.hashCode()) * 31;
        String str = this.musicClipId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MusicInfo musicInfo = this.musicInfo;
        int iHashCode3 = (((((((((iHashCode2 + (musicInfo == null ? 0 : musicInfo.hashCode())) * 31) + this.nleDraft.hashCode()) * 31) + C786410Ut5.Y2(this.estimatedTimeRemainingMs)) * 31) + C786410Ut5.Z2(this.isDisplayTaskFailed)) * 31) + C786410Ut5.Z2(this.isDisplayTaskCompletedOthersRunning)) * 31;
        List<TaskProgressInfo> list = this.taskProgressInfos;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.durationMs;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAgentProgress(overallProgressPercent=");
        sbLIZ.append(this.overallProgressPercent);
        sbLIZ.append(", progressInfos=");
        sbLIZ.append(this.progressInfos);
        sbLIZ.append(", musicClipId=");
        sbLIZ.append(this.musicClipId);
        sbLIZ.append(", musicInfo=");
        sbLIZ.append(this.musicInfo);
        sbLIZ.append(", nleDraft=");
        sbLIZ.append(this.nleDraft);
        sbLIZ.append(", estimatedTimeRemainingMs=");
        sbLIZ.append(this.estimatedTimeRemainingMs);
        sbLIZ.append(", isDisplayTaskFailed=");
        sbLIZ.append(this.isDisplayTaskFailed);
        sbLIZ.append(", isDisplayTaskCompletedOthersRunning=");
        sbLIZ.append(this.isDisplayTaskCompletedOthersRunning);
        sbLIZ.append(", taskProgressInfos=");
        sbLIZ.append(this.taskProgressInfos);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.durationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isDisplayTaskCompletedOthersRunning() {
        return this.isDisplayTaskCompletedOthersRunning;
    }

    public final boolean isDisplayTaskFailed() {
        return this.isDisplayTaskFailed;
    }

    public final void setDisplayTaskCompletedOthersRunning(boolean z) {
        this.isDisplayTaskCompletedOthersRunning = z;
    }

    public final void setDisplayTaskFailed(boolean z) {
        this.isDisplayTaskFailed = z;
    }

    public final void setTaskProgressInfos(List<TaskProgressInfo> list) {
        this.taskProgressInfos = list;
    }

    public AutoCutAgentProgress(int i, List<PhaseProgressInfo> list, String str, MusicInfo musicInfo, String str2, long j, boolean z, boolean z2, List<TaskProgressInfo> list2, Long l) {
        this.overallProgressPercent = i;
        this.progressInfos = list;
        this.musicClipId = str;
        this.musicInfo = musicInfo;
        this.nleDraft = str2;
        this.estimatedTimeRemainingMs = j;
        this.isDisplayTaskFailed = z;
        this.isDisplayTaskCompletedOthersRunning = z2;
        this.taskProgressInfos = list2;
        this.durationMs = l;
    }

    public AutoCutAgentProgress(int i, List list, String str, MusicInfo musicInfo, String str2, long j, boolean z, boolean z2, List list2, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : musicInfo, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? false : z, (i2 & 128) == 0 ? z2 : false, (i2 & 256) != 0 ? null : list2, (i2 & 512) == 0 ? l : null);
    }
}
