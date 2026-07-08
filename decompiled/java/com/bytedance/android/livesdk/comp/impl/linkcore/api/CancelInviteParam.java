package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class CancelInviteParam {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("invitee")
    public UserBean invitee;

    @C09CT("invitor")
    public UserBean inviter;

    @C09CT("operator")
    public UserBean operator;

    public CancelInviteParam() {
        this(null, null, null, null, null);
    }

    public CancelInviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.inviter = userBean;
        this.invitee = userBean2;
        this.operator = userBean3;
    }
}
