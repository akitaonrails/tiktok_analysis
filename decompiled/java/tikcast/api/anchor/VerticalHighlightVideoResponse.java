package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class VerticalHighlightVideoResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("creators_num")
        public String creatorsNum = "";

        @C09CT("viewers_num")
        public String viewersNum = "";

        @C09CT("topic_name")
        public String topicName = "";

        @C09CT("items")
        public List<VerticalVideoItem> items = new ArrayList();
    }
}
