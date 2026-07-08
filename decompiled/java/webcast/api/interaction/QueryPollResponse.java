package webcast.api.interaction;

import X.C09CT;
import com.bytedance.android.livesdk.model.PollInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class QueryPollResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("poll_info")
        public PollInfo pollInfo;
    }
}
