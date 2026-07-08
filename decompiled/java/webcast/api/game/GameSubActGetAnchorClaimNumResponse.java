package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GameSubActGetAnchorClaimNumResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("can_claim")
        public boolean canClaim;

        @C09CT("can_not_claim_reason")
        public String canNotClaimReason = "";

        @C09CT("claim_num")
        public int claimNum;
    }
}
