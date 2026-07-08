package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class KickOutParam {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("kick_player")
    public UserBean guest;

    @C09CT("kickout_reason")
    public int kickOutReason;

    @C09CT("operator")
    public UserBean operator;

    @C09CT("myself")
    public UserBean owner;

    public KickOutParam() {
        this(null, null, null, null, null, 0);
    }

    public KickOutParam(LinkCommonBean linkCommonBean, UserBean userBean, UserBean userBean2, UserBean userBean3, Long l, int i) {
        this.common = linkCommonBean;
        this.owner = userBean;
        this.guest = userBean2;
        this.operator = userBean3;
        this.channelId = l;
        this.kickOutReason = i;
    }
}
