package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizPermitParams;
import com.bytedance.android.livesdk.model.message.linkcore.DSLConfig;

/* JADX INFO: loaded from: classes.dex */
public final class PermitParam {

    @C09CT("applier")
    public UserBean applicant;

    @C09CT("permiter")
    public UserBean approver;

    @C09CT("multi_guest_req_extra")
    public BizPermitParams bizPermitParams;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("dsl")
    public DSLConfig dsl;

    @C09CT("operator")
    public UserBean operator;

    @C09CT("reply_status")
    public int permitStatus;

    public PermitParam() {
        this(null, null, null, null, null, 0, null, null);
    }

    public PermitParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, UserBean userBean2, UserBean userBean3, int i, DSLConfig dSLConfig, BizPermitParams bizPermitParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.approver = userBean;
        this.applicant = userBean2;
        this.operator = userBean3;
        this.permitStatus = i;
        this.dsl = dSLConfig;
        this.bizPermitParams = bizPermitParams;
    }
}
