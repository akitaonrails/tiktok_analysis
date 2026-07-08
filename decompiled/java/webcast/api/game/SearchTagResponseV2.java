package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchTagResponseV2 {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("is_end")
        public boolean isEnd;

        @C09CT("result_list")
        public List<GameTagSearchResultV2> resultList = new ArrayList();
    }
}
