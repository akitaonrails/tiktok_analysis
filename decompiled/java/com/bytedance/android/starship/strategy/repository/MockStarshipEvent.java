package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MockStarshipEvent implements Serializable {

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("event_params")
    public final Map<String, Object> eventParams;

    public MockStarshipEvent() {
        this(null, null, 0L);
    }

    public MockStarshipEvent(String str, Map<String, ? extends Object> map, long j) {
        this.eventName = str;
        this.eventParams = map;
        this.delayTime = j;
    }
}
