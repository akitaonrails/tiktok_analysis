package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.im.JoinGroupMessageExtra;

/* JADX INFO: loaded from: classes.dex */
public final class PopupStateChangeContent {

    @C09CT("join_user")
    public JoinGroupMessageExtra.RivalExtra joinUser;

    @C09CT("other_users")
    public List<JoinGroupMessageExtra.RivalExtra> otherUsers = new ArrayList();

    @C09CT("rival_guests_map")
    public Map<Long, JoinGroupMessageExtra.RivalGuestExtras> rivalGuestsMap = new LinkedHashMap();
}
