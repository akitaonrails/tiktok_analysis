package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class QuickChatInfo {

    @C09CT("display_type")
    public int displayType;

    @C09CT("duration")
    public long duration;

    @C09CT("priority")
    public long priority;

    @C09CT("list")
    public List<String> list = new ArrayList();

    @C09CT("emote_list")
    public List<EmoteModel> emoteList = new ArrayList();
}
