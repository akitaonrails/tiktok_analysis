package webcast.privilege.fans;

import X.C09CT;
import webcast.data.CommunityImageInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class FansCommunityRedeemResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("image_info")
        public CommunityImageInfo imageInfo;

        @C09CT("redeem_status")
        public int redeemStatus;

        @C09CT("user_score")
        public long userScore;
    }
}
