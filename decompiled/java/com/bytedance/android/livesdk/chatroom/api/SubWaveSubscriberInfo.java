package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SubWaveSubscriberInfo {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("user_id")
    public long userId;

    @C09CT("display_id")
    public String displayId = "";

    @C09CT("user_id_str")
    public String userIdStr = "";

    @C09CT("badge_list")
    public List<BadgeStruct> badgeList = new ArrayList();
}
