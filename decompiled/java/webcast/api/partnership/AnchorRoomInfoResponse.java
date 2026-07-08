package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorRoomInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class DropsInfo {

        @C09CT("has_sign")
        public boolean hasSign;

        @C09CT("show_drops")
        public boolean showDrops;

        @C09CT("drops_id_list")
        public List<Long> dropsIdList = new ArrayList();

        @C09CT("promoting_drops_id")
        public String promotingDropsId = "";

        @C09CT("promoting_drops_name")
        public String promotingDropsName = "";

        @C09CT("game_id")
        public String gameId = "";

        @C09CT("game_name")
        public String gameName = "";
    }

    public static final class PartnershipInfo {

        @C09CT("cps_click_id")
        public long cpsClickId;

        @C09CT("has_sign")
        public boolean hasSign;

        @C09CT("jump_schema")
        public String jumpSchema = "";

        @C09CT("show_partnership")
        public boolean showPartnership;
    }

    public static final class ResponseData {

        @C09CT("drops_info")
        public DropsInfo dropsInfo;

        @C09CT("is_org_account")
        public boolean isOrgAccount;

        @C09CT("live_take_decouple")
        public boolean liveTakeDecouple;

        @C09CT("partnership_info")
        public PartnershipInfo partnershipInfo;

        @C09CT("game_tasks")
        public List<BriefGameTask> gameTasks = new ArrayList();

        @C09CT("game_cta_map")
        public Map<String, GameCTAInfo> gameCtaMap = new LinkedHashMap();
    }
}
