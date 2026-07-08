package com.ss.android.ugc.aweme.im.saas.host.api.im.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class NoticeAckPayload implements Serializable {

    @C09CT("activity_status_switch")
    public final Integer activityStatusSwitch;

    @C09CT("group_rec_show_info")
    public final GroupRecShowInfo groupRecShowInfo;

    @C09CT("group_user_recommendation_report_ack")
    public final GroupUserRecommendationAck userRecommendationAck;

    public NoticeAckPayload() {
        this(null, null, null);
    }

    public final Integer getActivityStatusSwitch() {
        return this.activityStatusSwitch;
    }

    public final GroupRecShowInfo getGroupRecShowInfo() {
        return this.groupRecShowInfo;
    }

    public final GroupUserRecommendationAck getUserRecommendationAck() {
        return this.userRecommendationAck;
    }

    public NoticeAckPayload(GroupUserRecommendationAck groupUserRecommendationAck, Integer num, GroupRecShowInfo groupRecShowInfo) {
        this.userRecommendationAck = groupUserRecommendationAck;
        this.activityStatusSwitch = num;
        this.groupRecShowInfo = groupRecShowInfo;
    }
}
