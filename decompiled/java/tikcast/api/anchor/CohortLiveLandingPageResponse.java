package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CohortLiveLandingPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("topic_title")
        public String topicTitle = "";

        @C09CT("items")
        public List<CohortLiveVideoItem> items = new ArrayList();
    }
}
