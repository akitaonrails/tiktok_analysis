package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C09CT;
import X.C158B;
import X.C2188811AlT;
import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkLayerRTCMessage {

    @C09CT("index")
    public long index;

    @C09CT("method")
    public String method;

    @C09CT("msg_id")
    public String msgId;

    @C09CT("os")
    public String os;

    @C09CT("param")
    public LinkLayerRTCMessageParam param;

    @C09CT("ts")
    public Long timeStamp;

    @C09CT("uid")
    public String uid;

    public LinkLayerRTCMessage() {
        this("", null, Long.valueOf(C158B.LIZ()), "", -1L, "", "");
    }

    public final void generateId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        sbLIZ.append('_');
        sbLIZ.append(this.timeStamp);
        this.msgId = C2188811AlT.LIZIZ(sbLIZ);
        this.os = "Android";
    }

    public final void setIndex(long j) {
        this.index = j;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setMsgId(String str) {
        this.msgId = str;
    }

    public final void setOs(String str) {
        this.os = str;
    }

    public final void setParam(LinkLayerRTCMessageParam linkLayerRTCMessageParam) {
        this.param = linkLayerRTCMessageParam;
    }

    public final void setTimeStamp(Long l) {
        this.timeStamp = l;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public LinkLayerRTCMessage(String str, LinkLayerRTCMessageParam linkLayerRTCMessageParam, Long l, String str2, long j, String str3, String str4) {
        this.method = str;
        this.param = linkLayerRTCMessageParam;
        this.timeStamp = l;
        this.msgId = str2;
        this.index = j;
        this.uid = str3;
        this.os = str4;
    }
}
