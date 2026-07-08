package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TeamUser {

    @C09CT("team_id")
    public long teamId;

    @C09CT("user_id")
    public List<Long> userIds;

    public TeamUser() {
        this(null, 0L);
    }

    public TeamUser(List<Long> list, long j) {
        this.userIds = list;
        this.teamId = j;
    }
}
