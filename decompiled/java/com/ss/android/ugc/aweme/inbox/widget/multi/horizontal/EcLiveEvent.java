package com.ss.android.ugc.aweme.inbox.widget.multi.horizontal;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class EcLiveEvent implements Serializable {

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("need_adjust_priority")
    public final Boolean needAdjustPriority;

    public EcLiveEvent() {
        this(null, null, null);
    }

    public EcLiveEvent(String str, Boolean bool, String str2) {
        this.eventId = str;
        this.needAdjustPriority = bool;
        this.daInfo = str2;
    }
}
