package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import webcast.data.multilive_biz.BizInviteParams;

/* JADX INFO: loaded from: classes.dex */
public final class InviteParam {

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("config")
    public InitConfig config;

    @C09CT("dsl")
    public DSLConfig dsl;

    @C09CT("multi_guest_req_extra")
    public BizInviteParams extra;

    @C09CT("invitee")
    public UserBean invitee;

    @C09CT("invitor")
    public UserBean inviter;

    @C09CT("operator")
    public UserBean operator;

    @C09CT("invitee_pos")
    public MicPositionData position;

    public InviteParam() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public InviteParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, MicPositionData micPositionData, InitConfig initConfig, DSLConfig dSLConfig, BizInviteParams bizInviteParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.inviter = userBean;
        this.invitee = userBean2;
        this.operator = userBean3;
        this.position = micPositionData;
        this.config = initConfig;
        this.dsl = dSLConfig;
        this.extra = bizInviteParams;
    }
}
