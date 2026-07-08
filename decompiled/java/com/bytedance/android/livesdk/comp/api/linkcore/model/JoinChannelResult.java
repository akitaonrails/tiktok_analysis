package com.bytedance.android.livesdk.comp.api.linkcore.model;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponse;

/* JADX INFO: loaded from: classes.dex */
public final class JoinChannelResult {
    public final BizJoinChannelResponse multiGuestRespExtra;

    public JoinChannelResult(BizJoinChannelResponse bizJoinChannelResponse) {
        this.multiGuestRespExtra = bizJoinChannelResponse;
    }
}
