package webcast.api.sub;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetAnchorSubscriberListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("goal_count")
        public long goalCount;

        @C09CT("reach_count")
        public long reachCount;

        @C09CT("subscriber_msg")
        public List<SubscriberMsg> subscriberMsg;

        @C09CT("total_sub_count")
        public long totalSubCount;
    }
}
