package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class SubActGetRewardResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("have_claimed")
        public boolean haveClaimed;

        @C09CT("reward")
        public Reward reward;
    }
}
