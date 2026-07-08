package webcast.api.game_station;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.GameStationAttributionInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGameDetailBaseResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("attribution_info")
        public GameStationAttributionInfo attributionInfo;

        @C09CT("game_info")
        public GameStationGameInfo gameInfo;

        @C09CT("reward_list")
        public List<BriefBenefitInfo> rewardList = new ArrayList();
    }
}
