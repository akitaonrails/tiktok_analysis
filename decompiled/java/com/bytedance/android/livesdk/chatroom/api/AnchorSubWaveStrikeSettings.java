package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorSubWaveStrikeSettings {

    @C09CT("duration_time")
    public long durationTime;

    @C09CT("emote_list")
    public List<EmoteModel> emoteList = new ArrayList();

    @C09CT("need_sub_count")
    public long needSubCount;

    @C09CT("strike_enabled")
    public boolean strikeEnabled;
}
