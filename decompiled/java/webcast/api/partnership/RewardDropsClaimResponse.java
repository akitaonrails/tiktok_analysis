package webcast.api.partnership;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class RewardDropsClaimResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("cdkey")
        public String cdkey = "";

        @C09CT("is_auth")
        public boolean isAuth;

        @C09CT("reward_time")
        public long rewardTime;

        @C09CT("reward_type")
        public int rewardType;
    }
}
