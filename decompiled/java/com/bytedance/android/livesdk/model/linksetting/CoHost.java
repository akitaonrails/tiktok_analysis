package com.bytedance.android.livesdk.model.linksetting;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.LinkmicGuestUser;

/* JADX INFO: loaded from: classes.dex */
public final class CoHost {

    @C09CT("linked_guest_users")
    public Map<Long, LinkmicGuestUser> linkedGuestUsers;

    @C09CT("linked_users")
    public List<LinkmicUser> linkedUsers;

    @C09CT("multi_cohost_permission")
    public boolean multiCoHostPermission;

    public CoHost() {
        this(false, null, new LinkedHashMap());
    }

    public CoHost(boolean z, List<LinkmicUser> list, Map<Long, LinkmicGuestUser> map) {
        this.multiCoHostPermission = z;
        this.linkedUsers = list;
        this.linkedGuestUsers = map;
    }
}
