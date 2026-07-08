package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class SubscribingInfo {

    @C09CT("all_levels")
    public List<SubLevel> allLevels = new ArrayList();

    @C09CT("anchor_info")
    public User anchorInfo;

    @C09CT("sub_info")
    public SubInfo subInfo;
}
