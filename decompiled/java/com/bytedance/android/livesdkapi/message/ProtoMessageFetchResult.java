package com.bytedance.android.livesdkapi.message;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class ProtoMessageFetchResult {

    @C09CT("cursor")
    public String cursor;

    @C09CT("fetch_interval")
    public long fetchInterval;

    @C09CT("fetch_type")
    public int fetchType;

    @C09CT("heartbeat_duration")
    public long heartbeatDuration;

    @C09CT("history_comment_cursor")
    public String historyCommentCursor = "";

    @C09CT("history_no_more")
    public boolean historyNoMore;

    @C09CT("internal_ext")
    public String internalExt;

    @C09CT("is_first")
    public boolean isFirst;

    @C09CT("messages")
    public List<BaseProtoMessage> messages;

    @C09CT("need_ack")
    public boolean needAck;

    @C09CT("now")
    public long now;

    @C09CT("push_server")
    public String pushServer;

    @C09CT("route_params")
    public Map<String, String> routeParams;

    /* JADX INFO: loaded from: classes13.dex */
    public static final class BaseProtoMessage {

        @C09CT("is_history")
        public boolean isHistory;

        @C09CT("method")
        public String method = "";

        @C09CT("msg_id")
        public long msgId;

        @C09CT("msg_type")
        public int msgType;

        @C09CT("offset")
        public long offset;

        @C09CT("payload")
        public byte[] payload;

        @C09CT("sample_flag")
        public int sampleFlag;
    }
}
