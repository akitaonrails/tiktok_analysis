package com.bytedance.android.livesdk.comp.api.event.api.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveEventResponse {

    @C09CT("status_code")
    public final long code;

    @C09CT("events")
    public final List<LiveEventModule> eventList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("has_permission")
    public final Boolean hasPermission;

    @C09CT("status_msg")
    public final String msg;

    public LiveEventResponse() {
        this(0L, "", false, Boolean.FALSE, new ArrayList());
    }

    public LiveEventResponse(long j, String str, boolean z, Boolean bool, List<LiveEventModule> list) {
        this.code = j;
        this.msg = str;
        this.hasMore = z;
        this.hasPermission = bool;
        this.eventList = list;
    }
}
