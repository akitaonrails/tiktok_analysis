package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.EsportsParticipant;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.PartnershipDropsTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class AudienceRoomInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class DropsInfo {

        @C09CT("card_show_duration")
        public long cardShowDuration;

        @C09CT("pin_status")
        public int pinStatus;

        @C09CT("reward_count")
        public long rewardCount;

        @C09CT("user_can_claim_drops_info")
        public UserCanClaimDropsInfo userCanClaimDropsInfo;

        @C09CT("promoting_drops_id")
        public String promotingDropsId = "";

        @C09CT("gift_icon")
        public String giftIcon = "";

        @C09CT("tasks")
        public List<PartnershipDropsTask> tasks = new ArrayList();

        @C09CT("game_id")
        public String gameId = "";

        @C09CT("game_name")
        public String gameName = "";

        @C09CT("drops_name")
        public String dropsName = "";
    }

    public static final class EsportsBriefMatchInfo {

        @C09CT("participants")
        public List<EsportsParticipant> participants = new ArrayList();

        @C09CT("total_participants")
        public int totalParticipants;
    }

    public static final class EsportsBriefTournamentInfo {

        @C09CT("brief_match_info")
        public EsportsBriefMatchInfo briefMatchInfo;

        @C09CT("esports_tournament_type")
        public int esportsTournamentType;

        @C09CT("tournament_id")
        public String tournamentId = "";

        @C09CT("tournament_name")
        public String tournamentName = "";
    }

    public static final class PartnershipInfo {

        @C09CT("cps_click_id")
        public long cpsClickId;

        @C09CT("downloaded_count")
        public long downloadedCount;

        @C09CT("info")
        public UserInfo info;

        @C09CT("game_tasks")
        public List<BriefGameTask> gameTasks = new ArrayList();

        @C09CT("display_task_id")
        public String displayTaskId = "";

        @C09CT("game_cta_map")
        public Map<String, GameCTAInfo> gameCtaMap = new LinkedHashMap();
    }

    public static final class ResponseData {

        @C09CT("drops_info")
        public DropsInfo dropsInfo;

        @C09CT("esports_tournament_brief_info")
        public EsportsBriefTournamentInfo esportsTournamentBriefInfo;

        @C09CT("partnership_info")
        public PartnershipInfo partnershipInfo;
    }

    public static final class UserCanClaimDropsInfo {

        @C09CT("gift_expire_ts")
        public int giftExpireTs;

        @C09CT("show_claim_drops_gift_notice")
        public boolean showClaimDropsGiftNotice;
    }
}
