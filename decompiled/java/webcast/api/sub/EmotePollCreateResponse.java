package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.api.interaction.PollStartResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollCreateResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("resp")
        public PollStartResponse resp;

        @C09CT("user_emote_data")
        public Map<Long, UserEmote> userEmoteData = new LinkedHashMap();
    }
}
