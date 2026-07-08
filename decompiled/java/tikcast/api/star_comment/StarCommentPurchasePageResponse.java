package tikcast.api.star_comment;

import X.C09CT;
import tikcast.api.privilege.PrivilegePrompt;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentPurchasePageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("baseline_price")
        public long baselinePrice;

        @C09CT("desc_info")
        public PrivilegePrompt descInfo;

        @C09CT("error_code")
        public long errorCode;

        @C09CT("not_allow_reason")
        public String notAllowReason = "";

        @C09CT("original_queue")
        public StarCommentQueue originalQueue;

        @C09CT("purchase_page_status")
        public int purchasePageStatus;

        @C09CT("queue")
        public StarCommentQueue queue;

        @C09CT("word_limit")
        public int wordLimit;
    }
}
