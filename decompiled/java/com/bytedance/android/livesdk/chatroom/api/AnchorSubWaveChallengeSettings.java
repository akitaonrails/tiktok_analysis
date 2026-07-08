package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorSubWaveChallengeSettings {

    @C09CT("during_time")
    public long duringTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("need_sub_counts")
    public long needSubCounts;

    @C09CT("name")
    public String name = "";

    @C09CT("emote_list")
    public List<EmoteModel> emoteList = new ArrayList();
}
