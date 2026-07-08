package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;

/* JADX INFO: loaded from: classes.dex */
public final class QuickChatContent {

    @C09CT("emote")
    public EmoteModel emote;

    @C09CT("text")
    public String text = "";

    @C09CT("text_starling_key")
    public String textStarlingKey = "";

    @C09CT("type")
    public int type;
}
