package com.bytedance.android.livesdk.subscribe.model.goal;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SubGoalInfo {

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("show_entrance")
    public boolean hasGoalEntrance;

    @C09CT("has_ongoing_goal")
    public boolean hasOngoingGoal;

    @C09CT("need_show_sub_only_goal")
    public boolean needShowSubOnlyGoal;

    @C09CT("progress")
    public long progress;

    @C09CT("set_goal_notice")
    public String setGoalNotice;

    @C09CT("goal_schema_scene")
    public int subGoalScene;

    @C09CT("manage_goal_url")
    public String subGoalTargetUrl;

    @C09CT("target")
    public long target;
}
