package webcast.api.ranklist_class;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class LeagueRewardsInfoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("league_detail")
        public LeagueDetail leagueDetail;

        @C09CT("weekly_mission")
        public WeeklyMission weeklyMission;
    }
}
