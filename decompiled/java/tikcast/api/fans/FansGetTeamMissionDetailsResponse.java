package tikcast.api.fans;

import X.C09CT;
import webcast.data.FansClubTeamMissionDetails;
import webcast.data.FansLevelInfo;

/* JADX INFO: loaded from: classes.dex */
public final class FansGetTeamMissionDetailsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("details")
        public FansClubTeamMissionDetails details;

        @C09CT("is_hit_claim_mode")
        public boolean isHitClaimMode;

        @C09CT("level_info")
        public FansLevelInfo levelInfo;
    }
}
