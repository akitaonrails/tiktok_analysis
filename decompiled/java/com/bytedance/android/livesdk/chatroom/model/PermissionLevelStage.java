package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionLevelStage {

    @C09CT("abnormal_date")
    public long abnormalDate;

    @C09CT("stage_end_time")
    public long stageEndTime;

    @C09CT("stage_start_time")
    public long stageStartTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("task_stage")
    public int taskStage;

    @C09CT("tasks")
    public List<PermissionLevelTask> tasks;

    public static final class PermissionLevelTask {

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;

        @C09CT("task_type")
        public int taskType;

        @C09CT("text")
        public String text = "";

        @C09CT("current_value")
        public String currentValue = "";

        @C09CT("complete_value")
        public String completeValue = "";
    }
}
