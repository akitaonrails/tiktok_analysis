package webcast.api.game_station;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.FeedItemList;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailVideosResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("items")
        public FeedItemList items;

        @C09CT("score")
        public long score;
    }
}
