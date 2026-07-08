package tikcast.api.star_comment;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentDeleteResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("queue")
        public StarCommentQueue queue;

        @C09CT("server_cur_msg_start_time_ms")
        public long serverCurMsgStartTimeMs;
    }
}
