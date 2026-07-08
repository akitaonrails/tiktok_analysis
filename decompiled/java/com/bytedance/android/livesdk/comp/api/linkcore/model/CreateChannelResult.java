package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C2188811AlT;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse;
import tikcast.linkmic.controller.ResumeResp;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateChannelResult {
    public final boolean isResume;
    public final BizCreateChannelResponse multiGuestRespExtra;
    public CreateChannelResponse originData;
    public ResumeResp resumeResp;
    public final String selfLinkMicId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateChannelResult(multiGuestRespExtra=");
        sbLIZ.append(this.multiGuestRespExtra);
        sbLIZ.append(", isResume=");
        sbLIZ.append(this.isResume);
        sbLIZ.append(", resumeResp=");
        sbLIZ.append(this.resumeResp);
        sbLIZ.append(", selfLinkMicId=");
        sbLIZ.append(this.selfLinkMicId);
        sbLIZ.append(", originData=");
        sbLIZ.append(this.originData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateChannelResult(BizCreateChannelResponse bizCreateChannelResponse, boolean z, ResumeResp resumeResp, String str, CreateChannelResponse createChannelResponse) {
        this.multiGuestRespExtra = bizCreateChannelResponse;
        this.isResume = z;
        this.resumeResp = resumeResp;
        this.selfLinkMicId = str;
        this.originData = createChannelResponse;
    }
}
