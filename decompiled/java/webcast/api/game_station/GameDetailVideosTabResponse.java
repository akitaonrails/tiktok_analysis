package webcast.api.game_station;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailVideosTabResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("videos_tab")
        public List<GameDetailVideosTab> videosTab = new ArrayList();

        public static final class GameDetailVideosTab {

            @C09CT("tab_type")
            public int tabType;

            @C09CT("tab_name")
            public String tabName = "";

            @C09CT("tab_id")
            public String tabId = "";

            @C09CT("recall_rule_id")
            public String recallRuleId = "";

            @C09CT("recall_hashtag_id")
            public String recallHashtagId = "";

            @C09CT("post_extra")
            public String postExtra = "";
        }
    }
}
