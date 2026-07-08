package tikcast.api.anchor_tool;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ClaimRewardResp {

    @C09CT("data")
    public ClaimRewardData data;

    public static final class ClaimRewardData {

        @C09CT("failed_reason")
        public String failedReason = "";

        @C09CT("is_success")
        public boolean isSuccess;
    }
}
