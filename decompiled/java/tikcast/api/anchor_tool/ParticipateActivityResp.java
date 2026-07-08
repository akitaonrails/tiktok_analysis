package tikcast.api.anchor_tool;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ParticipateActivityResp {

    @C09CT("data")
    public ParticipateActivityData data;

    public static final class ParticipateActivityData {

        @C09CT("failed_reason")
        public String failedReason = "";

        @C09CT("is_success")
        public boolean isSuccess;
    }
}
