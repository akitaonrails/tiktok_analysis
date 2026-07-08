package tikcast.api.anchor;

import X.C09CT;
import com.bytedance.android.livesdk.model.KaraokeSong;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeQueueListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("offset")
        public long offset;

        @C09CT("queue_list")
        public List<KaraokeSong> queueList = new ArrayList();

        @C09CT("total_count")
        public long totalCount;
    }
}
