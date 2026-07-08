package com.ss.android.ugc.aweme.websocket.api.data;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class WsConnectionInfo {

    @C09CT("channel_id")
    public Integer channelId;

    @C09CT("channel_type")
    public Integer channelType;

    @C09CT("error")
    public WsConnectionError error;

    @C09CT("error_code")
    public Integer errorCode;

    @C09CT("private_protocol_enable")
    public Integer privateProtocolEnable;

    @C09CT("state")
    public Integer state;

    @C09CT("type")
    public Integer type;

    @C09CT("url")
    public String url;

    public WsConnectionInfo() {
        this(null, null, null, null, null, null, null, null);
    }

    public WsConnectionInfo(Integer num, Integer num2, Integer num3, String str, Integer num4, WsConnectionError wsConnectionError, Integer num5, Integer num6) {
        this.channelId = num;
        this.type = num2;
        this.state = num3;
        this.url = str;
        this.channelType = num4;
        this.error = wsConnectionError;
        this.errorCode = num5;
        this.privateProtocolEnable = num6;
    }
}
