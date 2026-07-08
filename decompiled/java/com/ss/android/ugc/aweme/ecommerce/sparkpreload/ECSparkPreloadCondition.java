package com.ss.android.ugc.aweme.ecommerce.sparkpreload;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ECSparkPreloadCondition {

    @C09CT("event_params")
    public final List<ECSparkPreloadEventParams> eventParams;

    @C09CT("router_params")
    public final List<ECSparkPreloadRouterParams> routerParams;

    @C09CT("trigger_type")
    public final String triggerType;

    public ECSparkPreloadCondition() {
        this(null, null, null);
    }

    public ECSparkPreloadCondition(String str, List<ECSparkPreloadEventParams> list, List<ECSparkPreloadRouterParams> list2) {
        this.triggerType = str;
        this.eventParams = list;
        this.routerParams = list2;
    }
}
