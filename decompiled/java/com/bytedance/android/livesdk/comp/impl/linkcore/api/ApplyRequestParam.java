package com.bytedance.android.livesdk.comp.impl.linkcore.api;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizApplyParams;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyRequestParam {

    @C09CT("applier")
    public UserBean applicant;

    @C09CT("multi_guest_req_extra")
    public BizApplyParams bizApplyParams;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("common")
    public LinkCommonBean common;

    @C09CT("applier_pos")
    public MicPositionData position;

    public ApplyRequestParam() {
        this(null, null, null, null, null);
    }

    public ApplyRequestParam(LinkCommonBean linkCommonBean, Long l, UserBean userBean, MicPositionData micPositionData, BizApplyParams bizApplyParams) {
        this.common = linkCommonBean;
        this.channelId = l;
        this.applicant = userBean;
        this.position = micPositionData;
        this.bizApplyParams = bizApplyParams;
    }
}
