package com.bytedance.android.livesdk.model.message.linker.random_linkmic_message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public class LinkerRandomMatchContent {

    @C09CT("group_channel_id")
    public long groupChannelId;

    @C09CT("inner_channel_id")
    public long innerChannelId;

    @C09CT("invite_type")
    public Long inviteType;

    @C09CT("match_id")
    public String matchId;

    @C09CT("paired_time")
    public long pairedTime;

    @C09CT("play_type")
    public int playType;

    @C09CT("room_id")
    public long roomId;

    @C09CT("source_type")
    public long sourceType;

    @C09CT("user")
    public User user;
}
