package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.model.PollData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("poll_data_list")
        public List<PollData> pollDataList = new ArrayList();

        @C09CT("user_emote_data")
        public Map<Long, UserEmote> userEmoteData = new LinkedHashMap();

        @C09CT("added_emote_data")
        public Map<Long, Long> addedEmoteData = new LinkedHashMap();
    }
}
