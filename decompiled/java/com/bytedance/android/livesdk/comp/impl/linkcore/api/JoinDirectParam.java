package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;

/* JADX INFO: loaded from: classes.dex */
public final class JoinDirectParam {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("multi_guest_req_extra")
    public BizJoinDirectParams multiGuestReqExtra;

    @C09CT("myself")
    public UserBean self;

    public JoinDirectParam() {
        this(null, null, null, null);
    }

    public JoinDirectParam(LinkCommonBean linkCommonBean, UserBean userBean, Long l, BizJoinDirectParams bizJoinDirectParams) {
        this.common = linkCommonBean;
        this.self = userBean;
        this.channelId = l;
        this.multiGuestReqExtra = bizJoinDirectParams;
    }
}
