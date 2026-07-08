package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import webcast.data.FansLevelInfo;
import webcast.data.FansLevelUpgradeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class FansEventMessage extends AbstractC1136060ffY {

    @C09CT("data")
    public FansEventData data;

    @C09CT("event_type")
    public int eventType;

    @C09CT("fans_level_info")
    public FansLevelInfo fansLevelInfo;

    @C09CT("fans_level_upgrade_info")
    public FansLevelUpgradeInfo fansLevelUpgradeInfo;

    @C09CT("user")
    public User user;

    public FansEventMessage() {
        this.type = C001A.FANS_EVENT_MESSAGE;
    }
}
