package com.bytedance.android.livesdk.model.message.linker.linked_list_change_message;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes.dex */
public class ListUser {

    @C09CT("linker_id")
    public long channelId;

    @C09CT("link_status")
    public int linkStatus;

    @C09CT("link_type")
    public int linkType;

    @C09CT("linkmic_id")
    public long linkmicId;

    @C09CT("linkmic_id_str")
    public String linkmicIdStr;

    @C09CT("modify_time")
    public long modifyTime;

    @C09CT("role_type")
    public int roleType;

    @C09CT("silence_status")
    public int silenceStatus;

    @C09CT("user")
    public User user;

    @C09CT("user_position")
    public int userPosition;
}
