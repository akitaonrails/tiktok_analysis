package webcast.api.game_station;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationOuterActivityInfo;
import com.bytedance.android.livesdk.game.model.ItemInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailPreviewResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("game_info")
        public GameStationGameInfo gameInfo;

        @C09CT("activity_groups")
        public List<GameStationOuterActivityInfo> activityGroups = new ArrayList();

        @C09CT("related_videos")
        public List<ItemInfo> relatedVideos = new ArrayList();
    }
}
