package com.ss.android.ugc.aweme.websocket.api.data;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class WsConnectionError {

    @C09CT("code")
    public Integer code;

    @C09CT("message")
    public String message;

    @C09CT("request_log")
    public RequestLog requestLog;

    @C09CT("ws_state")
    public Integer wsState;

    public WsConnectionError() {
        this(null, null, null, null);
    }

    public WsConnectionError(Integer num, String str, RequestLog requestLog, Integer num2) {
        this.code = num;
        this.message = str;
        this.requestLog = requestLog;
        this.wsState = num2;
    }
}
