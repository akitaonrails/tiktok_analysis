package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;

/* JADX INFO: loaded from: classes.dex */
public final class JoinChannelParam {

    @C09CT("multi_guest_req_extra")
    public BizJoinChannelParams bizJoinChannelParams;

    @C09CT("channel_id")
    public long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("myself")
    public UserBean operater;

    public JoinChannelParam() {
        this(null, 0L, null, null);
    }

    public JoinChannelParam(LinkCommonBean linkCommonBean, long j, UserBean userBean, BizJoinChannelParams bizJoinChannelParams) {
        this.common = linkCommonBean;
        this.channelId = j;
        this.operater = userBean;
        this.bizJoinChannelParams = bizJoinChannelParams;
    }
}
