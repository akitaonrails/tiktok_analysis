package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class TaskDetail {

    @C09CT("complete_percentage")
    public final float completePercentage;

    @C09CT("content")
    public final List<Content> content;

    @C09CT("created_at")
    public final long createdAt;

    @C09CT("ended_at")
    public final long endedAt;

    @C09CT("input_content_list")
    public final List<InputContent> inputContentList;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("updated_at")
    public final long updatedAt;

    @C09CT("waiting_time")
    public final long waitingTime;

    public TaskDetail() {
        this(null, 0, null, 0L, 0L, 0L, null, 0.0f, 0L, null, 1023, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskDetail(taskId=");
        sbLIZ.append(this.taskId);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", createdAt=");
        sbLIZ.append(this.createdAt);
        sbLIZ.append(", updatedAt=");
        sbLIZ.append(this.updatedAt);
        sbLIZ.append(", endedAt=");
        sbLIZ.append(this.endedAt);
        sbLIZ.append(", inputContentList=");
        sbLIZ.append(this.inputContentList);
        sbLIZ.append(", completePercentage=");
        sbLIZ.append(this.completePercentage);
        sbLIZ.append(", waitingTime=");
        sbLIZ.append(this.waitingTime);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TaskDetail(String str, int i, String str2, long j, long j2, long j3, List<InputContent> list, float f, long j4, List<Content> list2) {
        this.taskId = str;
        this.statusCode = i;
        this.message = str2;
        this.createdAt = j;
        this.updatedAt = j2;
        this.endedAt = j3;
        this.inputContentList = list;
        this.completePercentage = f;
        this.waitingTime = j4;
        this.content = list2;
    }

    public TaskDetail(String str, int i, String str2, long j, long j2, long j3, List list, float f, long j4, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? 0L : j2, (i2 & 32) != 0 ? 0L : j3, (i2 & 64) != 0 ? C13BV.INSTANCE : list, (i2 & 128) != 0 ? 0.0f : f, (i2 & 256) == 0 ? j4 : 0L, (i2 & 512) != 0 ? C13BV.INSTANCE : list2);
    }
}
