package com.ss.android.ugc.aweme.aigc.asynctask.models;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskProgressInfo {

    @C09CT("cover_thumb")
    public final String coverThumb;

    @C09CT("estimated_time_remaining_ms")
    public final long estimatedTimeRemainingMs;

    @C09CT("index")
    public final int index;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("nle_draft")
    public final String nleDraft;

    @C09CT("overall_progress_percent")
    public final int overallProgressPercent;

    @C09CT("progress_infos")
    public final String progressInfos;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("title")
    public final String title;

    public TaskProgressInfo() {
        this("", 0, 0, null, "", 0L, "", "", "", "");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskProgressInfo)) {
            return false;
        }
        TaskProgressInfo taskProgressInfo = (TaskProgressInfo) obj;
        return Intrinsics.LJFF(this.taskId, taskProgressInfo.taskId) && this.index == taskProgressInfo.index && this.overallProgressPercent == taskProgressInfo.overallProgressPercent && Intrinsics.LJFF(this.statusCode, taskProgressInfo.statusCode) && Intrinsics.LJFF(this.progressInfos, taskProgressInfo.progressInfos) && this.estimatedTimeRemainingMs == taskProgressInfo.estimatedTimeRemainingMs && Intrinsics.LJFF(this.nleDraft, taskProgressInfo.nleDraft) && Intrinsics.LJFF(this.musicId, taskProgressInfo.musicId) && Intrinsics.LJFF(this.coverThumb, taskProgressInfo.coverThumb) && Intrinsics.LJFF(this.title, taskProgressInfo.title);
    }

    public int hashCode() {
        int iHashCode = ((((this.taskId.hashCode() * 31) + this.index) * 31) + this.overallProgressPercent) * 31;
        Integer num = this.statusCode;
        return ((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.progressInfos.hashCode()) * 31) + C786410Ut5.Y2(this.estimatedTimeRemainingMs)) * 31) + this.nleDraft.hashCode()) * 31) + this.musicId.hashCode()) * 31) + this.coverThumb.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskProgressInfo(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", index=");
        sbLIZ.append(this.index);
        sbLIZ.append(", overallProgressPercent=");
        sbLIZ.append(this.overallProgressPercent);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", progressInfos=");
        sbLIZ.append(this.progressInfos);
        sbLIZ.append(", estimatedTimeRemainingMs=");
        sbLIZ.append(this.estimatedTimeRemainingMs);
        sbLIZ.append(", nleDraft=");
        sbLIZ.append(this.nleDraft);
        sbLIZ.append(", musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", coverThumb=");
        sbLIZ.append(this.coverThumb);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFailed() {
        Integer num = this.statusCode;
        if (num == null || num.intValue() == 0) {
            return false;
        }
        Integer num2 = this.statusCode;
        return num2 == null || num2.intValue() != 10001;
    }

    public final boolean isSuccess() {
        Integer num = this.statusCode;
        return num != null && num.intValue() == 0 && this.nleDraft.length() > 0;
    }

    public final boolean isFinished() {
        return isSuccess() || isFailed();
    }

    public TaskProgressInfo(String str, int i, int i2, Integer num, String str2, long j, String str3, String str4, String str5, String str6) {
        this.taskId = str;
        this.index = i;
        this.overallProgressPercent = i2;
        this.statusCode = num;
        this.progressInfos = str2;
        this.estimatedTimeRemainingMs = j;
        this.nleDraft = str3;
        this.musicId = str4;
        this.coverThumb = str5;
        this.title = str6;
    }
}
