package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import X.C158B;
import X.C2188811AlT;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkLayerRTCP2PMessage {

    @C09CT("method")
    public String method;

    @C09CT("msg_id")
    public String msgId;

    @C09CT("param")
    public LinkLayerRTCMessageP2PParam param;

    @C09CT("ts")
    public Long timeStamp;

    public LinkLayerRTCP2PMessage() {
        this("", null, Long.valueOf(C158B.LIZ()), "");
    }

    public final void generateId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        sbLIZ.append('_');
        sbLIZ.append(this.timeStamp);
        this.msgId = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setMsgId(String str) {
        this.msgId = str;
    }

    public final void setParam(LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam) {
        this.param = linkLayerRTCMessageP2PParam;
    }

    public final void setTimeStamp(Long l) {
        this.timeStamp = l;
    }

    public LinkLayerRTCP2PMessage(String str, LinkLayerRTCMessageP2PParam linkLayerRTCMessageP2PParam, Long l, String str2) {
        this.method = str;
        this.param = linkLayerRTCMessageP2PParam;
        this.timeStamp = l;
        this.msgId = str2;
    }
}
