package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCancelApplyParams;

/* JADX INFO: loaded from: classes.dex */
public final class CancelApplyParam {

    @C09CT("applier")
    public UserBean applicant;

    @C09CT("multi_guest_req_extra")
    public BizCancelApplyParams bizCancelApplyParams;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    public CancelApplyParam() {
        this(null, null, null, null);
    }

    public CancelApplyParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, BizCancelApplyParams bizCancelApplyParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.applicant = userBean;
        this.bizCancelApplyParams = bizCancelApplyParams;
    }
}
