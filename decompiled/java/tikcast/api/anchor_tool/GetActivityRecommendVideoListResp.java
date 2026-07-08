package tikcast.api.anchor_tool;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetActivityRecommendVideoListResp {

    @C09CT("data")
    public GetActivityRecommendVideoListData data;

    public static final class GetActivityRecommendVideoListData {

        @C09CT("introductions")
        public List<RecommendVideo> introductions = new ArrayList();

        @C09CT("tutorials")
        public List<RecommendVideo> tutorials = new ArrayList();

        @C09CT("top_cases")
        public List<RecommendVideo> topCases = new ArrayList();
    }
}
