package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class BizApplyParams {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("enter_action")
    public int enterAction;

    @C09CT("enter_action_reason")
    public int enterActionReason;

    @C09CT("follow")
    public boolean follow;

    @C09CT("inviter_role")
    public int inviterRole;

    @C09CT("inviter_user_id")
    public long inviterUserId;

    @C09CT("join_game_session_id")
    public long joinGameSessionId;

    @C09CT("lineup_resume_link")
    public boolean lineupResumeLink;

    @C09CT("link_type")
    public long linkType;

    @C09CT("mg_enter_params_proto_json")
    public String mgEnterParamsProtoJson;

    @C09CT("request_param")
    public String requestParam;

    @C09CT("share_revenue_setting")
    public int shareRevenueSetting;

    @C09CT("share_revenue_setting_ratio")
    public int shareRevenueSettingRatio;

    @C09CT("user_return_type")
    public int userReturnType;

    public final String toString() {
        return "BizApplyParams(linkType=" + this.linkType + ", anchorId=" + this.anchorId + ", userReturnType=" + this.userReturnType + ", follow=" + this.follow + ", shareRevenueSetting=" + this.shareRevenueSetting + ", inviterRole=" + this.inviterRole + ", inviterUserId=" + this.inviterUserId + ", requestParam=" + this.requestParam + ", joinGameSessionId=" + this.joinGameSessionId + ", shareRevenueSettingRatio=" + this.shareRevenueSettingRatio + ", mgEnterParamsProtoJson=" + this.mgEnterParamsProtoJson + ", enterAction=" + this.enterAction + ", enterActionReason=" + this.enterActionReason + ", lineupResumeLink=" + this.lineupResumeLink + ')';
    }

    public BizApplyParams() {
        this(0L, 0L, 0, false, 0, 0, 0L, "", 0L, 0, "", 0, 0, false);
    }

    public BizApplyParams(long j, long j2, int i, boolean z, int i2, int i3, long j3, String str, long j4, int i4, String str2, int i5, int i6, boolean z2) {
        this.linkType = j;
        this.anchorId = j2;
        this.userReturnType = i;
        this.follow = z;
        this.shareRevenueSetting = i2;
        this.inviterRole = i3;
        this.inviterUserId = j3;
        this.requestParam = str;
        this.joinGameSessionId = j4;
        this.shareRevenueSettingRatio = i4;
        this.mgEnterParamsProtoJson = str2;
        this.enterAction = i5;
        this.enterActionReason = i6;
        this.lineupResumeLink = z2;
    }
}
