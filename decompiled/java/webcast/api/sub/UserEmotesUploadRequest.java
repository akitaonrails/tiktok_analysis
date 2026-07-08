package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class UserEmotesUploadRequest {

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("upload_emote_list")
    public List<UserEmote> uploadEmoteList = new ArrayList();
}
