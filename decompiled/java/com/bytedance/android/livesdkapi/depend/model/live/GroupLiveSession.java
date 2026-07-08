package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GroupLiveSession {

    @C09CT("group_live_members")
    public List<GroupLiveMember> groupLiveMembers = new ArrayList();

    @C09CT("is_group_live_session")
    public boolean isGroupLiveSession;

    @C09CT("last_visit_time")
    public long lastVisitTime;
}
