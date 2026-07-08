package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class UserEmote {

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("effect_id")
    public long effectId;

    @C09CT("emote_id")
    public long emoteId;

    @C09CT("image")
    public ImageModel image;

    @C09CT("user_emote_upload_source")
    public int userEmoteUploadSource;

    @C09CT("user_id")
    public long userId;

    @C09CT("user_info")
    public User userInfo;

    @C09CT("valid_expire_time")
    public long validExpireTime;

    @C09CT("valid_start_time")
    public long validStartTime;

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();

    @C09CT("emote_id_str")
    public String emoteIdStr = "";
}
