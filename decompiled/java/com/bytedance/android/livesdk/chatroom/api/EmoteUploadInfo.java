package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public final class EmoteUploadInfo {

    @C09CT("emote_upload_source")
    public int emoteUploadSource;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_id_str")
    public String userIdStr = "";

    @C09CT("user_info")
    public User userInfo;
}
