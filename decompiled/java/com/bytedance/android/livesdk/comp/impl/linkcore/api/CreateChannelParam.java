package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;

/* JADX INFO: loaded from: classes.dex */
public final class CreateChannelParam {

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("config")
    public InitConfig config;

    @C09CT("multi_guest_req_extra")
    public BizCreateChannelParams extra;

    @C09CT("layout_id")
    public String layoutId;

    @C09CT("live_room_mode")
    public Long liveRoomMode;

    @C09CT("net_mode")
    public long netMode;

    @C09CT("myself")
    public UserBean player;

    public CreateChannelParam(LinkCommonBean linkCommonBean, UserBean userBean, InitConfig initConfig, String str, BizCreateChannelParams bizCreateChannelParams, Long l, long j) {
        this.common = linkCommonBean;
        this.player = userBean;
        this.config = initConfig;
        this.layoutId = str;
        this.extra = bizCreateChannelParams;
        this.liveRoomMode = l;
        this.netMode = j;
    }
}
