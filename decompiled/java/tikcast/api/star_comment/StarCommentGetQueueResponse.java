package tikcast.api.star_comment;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentGetQueueResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("advanced_interval_between_msg_ms")
        public long advancedIntervalBetweenMsgMs;

        @C09CT("client_reserve")
        public String clientReserve = "";

        @C09CT("lagging_interval_between_msg_ms")
        public long laggingIntervalBetweenMsgMs;

        @C09CT("normal_interval_between_msg_ms")
        public long normalIntervalBetweenMsgMs;

        @C09CT("polling_interval_ms")
        public long pollingIntervalMs;

        @C09CT("queue")
        public StarCommentQueue queue;

        @C09CT("server_cur_msg_start_time_ms")
        public long serverCurMsgStartTimeMs;
    }
}
