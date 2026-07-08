package com.ss.android.ugc.aweme.affinity;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AffinityEvent {

    @C09CT("event_params")
    public final Map<?, ?> eventParams;

    @C09CT("event_name")
    public final String featureName;

    @C09CT("from_uid")
    public final String fromUid;

    @C09CT("timestamp")
    public final long timeStamp;

    public AffinityEvent(String str, String str2, long j, Map<?, ?> map) {
        this.featureName = str;
        this.fromUid = str2;
        this.timeStamp = j;
        this.eventParams = map;
    }
}
