package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DailyChallengesClaimAllResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("result")
        public int result;

        @C09CT("successfully_claimed_challenge_ids")
        public List<Long> successfullyClaimedChallengeIds = new ArrayList();
    }
}
