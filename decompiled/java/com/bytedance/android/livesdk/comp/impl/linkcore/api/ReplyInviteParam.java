package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizReplyParams;

/* JADX INFO: loaded from: classes.dex */
public final class ReplyInviteParam {

    @C09CT("multi_guest_req_extra")
    public BizReplyParams bizReplyParams;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("invite_operator")
    public UserBean inviteOperator;

    @C09CT("invitee")
    public UserBean invitee;

    @C09CT("invitor")
    public UserBean inviter;

    @C09CT("reply_status")
    public int replyStatus;

    public ReplyInviteParam() {
        this(null, null, null, null, null, 0, null);
    }

    public ReplyInviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, int i, BizReplyParams bizReplyParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.invitee = userBean;
        this.inviteOperator = userBean2;
        this.inviter = userBean3;
        this.replyStatus = i;
        this.bizReplyParams = bizReplyParams;
    }
}
