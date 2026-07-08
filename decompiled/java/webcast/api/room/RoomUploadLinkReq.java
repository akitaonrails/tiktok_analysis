package webcast.api.room;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class RoomUploadLinkReq {

    @C09CT("method")
    public int method;

    @C09CT("request_time_ms")
    public long requestTimeMs;

    @C09CT("seq_id")
    public long seqId;

    @C09CT("service")
    public int service;

    @C09CT("payload_encoding")
    public String payloadEncoding = "";

    @C09CT("payload")
    public String payload = "";

    @C09CT("header_msg_id")
    public String headerMsgId = "";

    @C09CT("trace_enable")
    public String traceEnable = "";
}
