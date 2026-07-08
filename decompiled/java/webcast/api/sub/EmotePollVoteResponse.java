package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollVoteResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("comment_banned")
        public boolean commentBanned;

        @C09CT("option_list")
        public List<PollOptionInfo> optionList = new ArrayList();

        @C09CT("user_emote_data")
        public Map<Long, UserEmote> userEmoteData = new LinkedHashMap();
    }
}
