package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizLeaveParams;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveChannelParam {

    @C09CT("multi_guest_req_extra")
    public BizLeaveParams bizLeaveParams;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("leave_reason")
    public int leaveReason;

    @C09CT("myself")
    public UserBean player;

    public LeaveChannelParam() {
        this(null, null, null, 0, null);
    }

    public LeaveChannelParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, int i, BizLeaveParams bizLeaveParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.player = userBean;
        this.leaveReason = i;
        this.bizLeaveParams = bizLeaveParams;
    }
}
