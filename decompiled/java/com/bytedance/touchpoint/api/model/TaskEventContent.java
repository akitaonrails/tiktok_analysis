package com.bytedance.touchpoint.api.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskEventContent {

    @C09CT("biz_time")
    public final long bizTime;

    @C09CT("event_params")
    public final String eventParams;

    @C09CT("report_instruction")
    public ReportInstruction reportInstruction;

    @C09CT("req_id")
    public final String reqId;

    @C09CT("task_event_id")
    public final String taskEventId;

    @C09CT("task_event_key")
    public final String taskEventKey;

    @C09CT("user_action_content")
    public final UserActionContent userActionContent;

    @C09CT("user_action_type")
    public final String userActionType;

    @C09CT("valid_rules")
    public List<ValidRule> validRules;

    public TaskEventContent(String str, String str2, long j, String str3, String str4, String str5, List<ValidRule> list, ReportInstruction reportInstruction, UserActionContent userActionContent) {
        this.taskEventId = str;
        this.taskEventKey = str2;
        this.bizTime = j;
        this.reqId = str3;
        this.eventParams = str4;
        this.userActionType = str5;
        this.validRules = list;
        this.reportInstruction = reportInstruction;
        this.userActionContent = userActionContent;
    }
}
