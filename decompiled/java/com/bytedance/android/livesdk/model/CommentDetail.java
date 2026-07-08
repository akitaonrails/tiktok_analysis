package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CommentDetail {

    @C09CT("content")
    public String content = "";

    /* JADX INFO: renamed from: emotes, reason: collision with root package name */
    @C09CT("emotes")
    public List<EmoteWithIndex> f313emotes = new ArrayList();

    @C09CT("event_time")
    public long eventTime;

    @C09CT("msg_id")
    public long msgId;

    public static final class EmoteWithIndex {

        @C09CT("emote")
        public EmoteModel emote;

        @C09CT("index")
        public long index;
    }
}
