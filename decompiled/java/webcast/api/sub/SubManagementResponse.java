package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class SubManagementResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("active_subscriber_cnt")
        public long activeSubscriberCnt;

        @C09CT("live_sub_only_config")
        public LiveSubOnlyConfig liveSubOnlyConfig;

        @C09CT("sub_only_chat_status")
        public int subOnlyChatStatus;

        @C09CT("sub_only_live_status")
        public int subOnlyLiveStatus;
    }
}
