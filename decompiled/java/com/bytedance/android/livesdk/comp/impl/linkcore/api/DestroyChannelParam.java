package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class DestroyChannelParam {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("finish_reason")
    public Long finishReason;

    @C09CT("myself")
    public UserBean player;

    public DestroyChannelParam() {
        this(null, null, null, 0L);
    }

    public DestroyChannelParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, Long l2) {
        this.common = linkCommonBean;
        this.player = userBean;
        this.channelId = l;
        this.finishReason = l2;
    }
}
