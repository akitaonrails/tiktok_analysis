package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class UserEmotesUploadResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("emote_list")
        public List<UserEmote> emoteList = new ArrayList();
    }
}
