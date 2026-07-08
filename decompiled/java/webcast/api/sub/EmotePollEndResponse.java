package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.model.PollData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollEndResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("poll_data")
        public PollData pollData;

        @C09CT("user_emote_data")
        public Map<Long, UserEmote> userEmoteData = new LinkedHashMap();
    }
}
