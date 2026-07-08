package com.ss.android.ugc.aweme.im.chatlist.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestPriorityConfigData {

    @C09CT("accept_rate_threshold")
    public final double acceptRateThreshold;

    @C09CT("collaboration_invites_tag_threshold")
    public final double collaborationInvitesThreshold;

    @C09CT("priority_daily_decay")
    public final double dailyDecayRatio;

    @C09CT("priority_display_min_score_for_client_ai")
    public final double displayThresholdForClientAI;

    @C09CT("priority_display_min_score_for_server")
    public final double displayThresholdForServer;

    @C09CT("max_time_show_in_priority_section")
    public final int maxTimeShowInPriority;

    @C09CT("potential_paid_tag_threshold")
    public final double potentialThreshold;

    @C09CT("priority_display_count")
    public final int priorityLimitSize;

    @C09CT("priority_max_cell_count")
    public final int priorityMaxCellCountNew;

    @C09CT("priority_display_model_scene_for_android")
    public final String priorityModelScene;

    @C09CT("priority_ai_scoring_threshold")
    public final double scoringThreshold;

    public MessageRequestPriorityConfigData() {
        this(15, 30.0d, "", 0.2d, 0.5d, 30.0d, 130.0d, 7, 3, 0.5d, 0.5d);
    }

    public MessageRequestPriorityConfigData(int i, double d, String str, double d2, double d3, double d4, double d5, int i2, int i3, double d6, double d7) {
        this.priorityLimitSize = i;
        this.displayThresholdForServer = d;
        this.priorityModelScene = str;
        this.dailyDecayRatio = d2;
        this.displayThresholdForClientAI = d3;
        this.scoringThreshold = d4;
        this.acceptRateThreshold = d5;
        this.priorityMaxCellCountNew = i2;
        this.maxTimeShowInPriority = i3;
        this.potentialThreshold = d6;
        this.collaborationInvitesThreshold = d7;
    }
}
