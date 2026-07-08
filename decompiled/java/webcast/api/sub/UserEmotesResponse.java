package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.chatroom.api.UserEmoteLimit;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class UserEmotesResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("emote_limit")
        public UserEmoteLimit emoteLimit;

        @C09CT("emote_list")
        public List<UserEmote> emoteList = new ArrayList();

        @C09CT("host_info")
        public User hostInfo;
    }
}
