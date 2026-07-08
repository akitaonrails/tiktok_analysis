package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.FeedItemList;

/* JADX INFO: loaded from: classes29.dex */
public final class EsportsHighlightVideosResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class EsportsInfo {

        @C09CT("game_id")
        public String gameId = "";

        @C09CT("game_name")
        public String gameName = "";
    }

    public static final class ResponseData {

        @C09CT("esports_info")
        public EsportsInfo esportsInfo;

        @C09CT("items")
        public FeedItemList items;

        @C09CT("score")
        public long score;
    }
}
