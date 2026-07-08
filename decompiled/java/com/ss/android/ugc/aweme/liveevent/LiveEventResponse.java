package com.ss.android.ugc.aweme.liveevent;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class LiveEventResponse {

    @C09CT("status_code")
    public long code;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("status_msg")
    public String msg = "";

    @C09CT("has_permission")
    public Boolean hasPermission = Boolean.FALSE;

    @C09CT("events")
    public List<LiveEventModule> eventList = new ArrayList();
}
