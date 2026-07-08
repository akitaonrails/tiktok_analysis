package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class CreatorLeagueDetails {

    @C09CT("breakthrough_details")
    public BreakThroughDetails breakthroughDetails;

    @C09CT("maintain_details")
    public MaintainDetails maintainDetails;

    public static final class BreakThroughDetails {

        @C09CT("did_breakthrough")
        public boolean didBreakthrough;

        @C09CT("historical_highest_league")
        public String historicalHighestLeague = "";

        @C09CT("next_league")
        public String nextLeague = "";

        @C09CT("description")
        public String description = "";
    }

    public static final class MaintainDetails {

        @C09CT("show_records")
        public boolean showRecords;

        @C09CT("records")
        public List<LeagueRecord> records = new ArrayList();

        @C09CT("description")
        public String description = "";

        public static final class LeagueRecord {

            @C09CT("league")
            public String league = "";

            @C09CT("state")
            public int state;
        }
    }
}
