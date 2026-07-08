package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;
import webcast.data.MsgFilter;
import webcast.data.UserIdentity;

/* JADX INFO: loaded from: classes.dex */
public class EmoteChatMessage extends AbstractC1136060ffY {

    @C09CT("emote_list")
    public List<EmoteModel> emoteList;

    @C09CT("msg_filter")
    public MsgFilter msgFilter;

    @C09CT("user")
    public User user;

    @C09CT("user_identity")
    public UserIdentity userIdentity;

    @Override // X.AbstractC1136060ffY
    public final boolean supportDisplayText() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        List<EmoteModel> list;
        return (this.user == null || (list = this.emoteList) == null || list.isEmpty()) ? false : true;
    }

    public EmoteChatMessage() {
        this.type = C001A.EMOTE_CHAT;
    }
}
