package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C09CT;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCEffectMessage {

    @C09CT("client_log_id")
    public final Integer clientLogId;

    @C09CT("client_task_id")
    public final Integer clientTaskId;

    @C09CT("data")
    public final Data data;

    @C09CT("effect_id")
    public final Integer effectId;

    @C09CT("error")
    public final Error error;

    @C09CT("job_type")
    public final String jobType;

    @C09CT("params")
    public final List<n> params;

    @C09CT("resource")
    public final List<Resource> resource;

    @C09CT("stage")
    public final TaskStage stage;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("task_type")
    public final String taskType;

    @C09CT("trigger")
    public final TaskTrigger trigger;

    @C09CT("version")
    public final String version;

    public AIGCEffectMessage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public AIGCEffectMessage(TaskStage taskStage, TaskTrigger taskTrigger, Integer num, String str, String str2, String str3, Integer num2, Integer num3, String str4, Error error, String str5, List<n> list, List<Resource> list2, Data data) {
        this.stage = taskStage;
        this.trigger = taskTrigger;
        this.effectId = num;
        this.styleId = str;
        this.taskType = str2;
        this.jobType = str3;
        this.clientTaskId = num2;
        this.clientLogId = num3;
        this.status = str4;
        this.error = error;
        this.version = str5;
        this.params = list;
        this.resource = list2;
        this.data = data;
    }
}
