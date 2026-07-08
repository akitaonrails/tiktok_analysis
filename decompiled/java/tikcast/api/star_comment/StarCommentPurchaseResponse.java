package tikcast.api.star_comment;

import X.C09CT;
import tikcast.api.user_level.PayGradeInfo;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentPurchaseResponse {

    @C09CT("data")
    public Data data;

    @C09CT("extra")
    public Extra extra;

    public static final class Data {

        @C09CT("coins")
        public long coins;

        @C09CT("msg_id")
        public long msgId;

        @C09CT("pay_grade_info")
        public PayGradeInfo payGradeInfo;

        @C09CT("purchase_result")
        public int purchaseResult;

        @C09CT("queue")
        public StarCommentQueue queue;

        @C09CT("room_user_count")
        public long roomUserCount;

        @C09CT("server_cur_msg_start_time_ms")
        public long serverCurMsgStartTimeMs;
    }

    public static final class Extra {

        @C09CT("custom_error")
        public RechargeCustomError customError;
    }
}
