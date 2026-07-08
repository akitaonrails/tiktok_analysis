package com.ss.android.ugc.aweme.series.promote;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class PromoteImpressionEvent {

    @C09CT("event")
    public final Integer eventType;

    @C09CT("events")
    public final List<EventTypes> eventTypes;

    public PromoteImpressionEvent() {
        this(null, null);
    }

    public PromoteImpressionEvent(Integer num, List<EventTypes> list) {
        this.eventType = num;
        this.eventTypes = list;
    }
}
