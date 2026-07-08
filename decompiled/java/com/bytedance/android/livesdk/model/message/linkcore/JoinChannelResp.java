package com.bytedance.android.livesdk.model.message.linkcore;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponse;

/* JADX INFO: loaded from: classes.dex */
public final class JoinChannelResp extends LinkMicUplinkBaseResp {

    @C09CT("linkLayerListUser")
    public LinkLayerListUser linkLayerListUser;

    @C09CT("multi_guest_resp_extra")
    public BizJoinChannelResponse multiGuestRespExtra;

    public JoinChannelResp() {
        super(null);
    }
}
