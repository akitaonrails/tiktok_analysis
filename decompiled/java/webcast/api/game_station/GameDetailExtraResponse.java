package webcast.api.game_station;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.ItemInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailExtraResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("related_videos")
        public List<ItemInfo> relatedVideos = new ArrayList();
    }
}
