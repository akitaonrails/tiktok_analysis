package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.subscribe.model.SubscriberInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetTimerSubscriberListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_next")
        public boolean hasNext;

        @C09CT("next_cursor")
        public long nextCursor;

        @C09CT("subscriber_count")
        public long subscriberCount;

        @C09CT("subscribers")
        public List<SubscriberInfo> subscribers = new ArrayList();
    }
}
