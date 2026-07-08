package webcast.api.game_station;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class GameDetailHotHashtagResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("hashtags")
        public List<GameHashtag> hashtags = new ArrayList();

        public static final class GameHashtag {

            @C09CT("hashtag_post_count")
            public long hashtagPostCount;

            @C09CT("hashtag_vv")
            public long hashtagVv;

            @C09CT("hashtag_id")
            public String hashtagId = "";

            @C09CT("hashtag_name")
            public String hashtagName = "";

            @C09CT("hashtag_vv_fmt")
            public String hashtagVvFmt = "";

            @C09CT("hashtag_post_count_fmt")
            public String hashtagPostCountFmt = "";
        }
    }
}
