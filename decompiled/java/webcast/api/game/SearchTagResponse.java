package webcast.api.game;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchTagResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_end")
        public boolean isEnd;

        @C09CT("result_list")
        public List<GameTagSearchResult> resultList;

        @C09CT("search_id")
        public String searchId = "";
    }
}
