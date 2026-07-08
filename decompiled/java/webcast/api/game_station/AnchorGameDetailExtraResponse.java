package webcast.api.game_station;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameStationOuterActivityInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class AnchorGameDetailExtraResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("activity_groups")
        public List<GameStationOuterActivityInfo> activityGroups = new ArrayList();
    }
}
