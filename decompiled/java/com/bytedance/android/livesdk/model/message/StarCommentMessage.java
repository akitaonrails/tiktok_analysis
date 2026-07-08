package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.EmoteWithIndex;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StarCommentMessage {

    @C09CT("comment_option")
    public int commentOption;

    @C09CT("duration")
    public long duration;

    @C09CT("start_time_ms")
    public long startTimeMs;

    @C09CT("user")
    public User user;

    @C09CT("star_comment_id")
    public String starCommentId = "";

    @C09CT("content")
    public String content = "";

    @C09CT("content_language")
    public String contentLanguage = "";

    /* JADX INFO: renamed from: emotes, reason: collision with root package name */
    @C09CT("emotes")
    public List<EmoteWithIndex> f315emotes = new ArrayList();

    @C09CT("schema")
    public String schema = "";
}
