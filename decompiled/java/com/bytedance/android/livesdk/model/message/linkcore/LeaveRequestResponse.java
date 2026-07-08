package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import webcast.data.multilive_biz.BizLeaveResponse;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveRequestResponse extends LinkMicUplinkBaseResp {

    @C09CT("multi_guest_resp_extra")
    public BizLeaveResponse multiGuestRespExtra;

    public LeaveRequestResponse() {
        super(null);
    }
}
