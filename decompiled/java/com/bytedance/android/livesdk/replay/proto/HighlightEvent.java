package com.bytedance.android.livesdk.replay.proto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightEvent {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("region_type")
    public int regionType;

    @C09CT("event_name")
    public String eventName = "";

    @C09CT("sub_activities")
    public List<SubHighlightEvent> subActivities = new ArrayList();
}
