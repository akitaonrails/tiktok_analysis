package com.bytedance.touchpoint.api.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class TaskEvent {
    public Integer LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;

    @C09CT("event_params")
    public Map<String, String> customEventParams;

    @C09CT("display_info")
    public DisplayInfo displayInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("progress_info")
    public ProgressInfo progressInfo;

    @C09CT("report_instruction")
    public ReportInstruction reportInstruction;

    @C09CT("start_condition")
    public final StartCondition startCondition;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Status status;

    @C09CT("task_event_key")
    public String taskEventKey;

    @C09CT("name")
    public final String taskEventName;

    @C09CT("user_action_type")
    public final String userActionType;

    @C09CT("valid_rules_seconds")
    public List<ValidRule> validRuleSeconds;

    @C09CT("valid_rules")
    public List<ValidRule> validRules;

    public TaskEvent(String str, String str2, String str3, StartCondition startCondition, List<ValidRule> list, List<ValidRule> list2, ReportInstruction reportInstruction, Map<String, String> map, Status status, ProgressInfo progressInfo, String str4, DisplayInfo displayInfo, Integer num, Integer num2, boolean z, Integer num3) {
        this.id = str;
        this.taskEventName = str2;
        this.userActionType = str3;
        this.startCondition = startCondition;
        this.validRules = list;
        this.validRuleSeconds = list2;
        this.reportInstruction = reportInstruction;
        this.customEventParams = map;
        this.status = status;
        this.progressInfo = progressInfo;
        this.taskEventKey = str4;
        this.displayInfo = displayInfo;
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = num3;
    }
}
