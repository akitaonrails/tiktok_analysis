package com.ss.android.ugc.aweme.experiment.net;

import X.C09CT;
import X.C13LQ;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class PreConnectStrategy {

    @C09CT("domains")
    public final Set<String> domains;

    @C09CT("interval")
    public final int interval;

    @C09CT("strategy")
    public final int strategy;

    public PreConnectStrategy() {
        this(0, null, 0, 7, null);
    }

    public PreConnectStrategy(int i, Set<String> set, int i2) {
        this.strategy = i;
        this.domains = set;
        this.interval = i2;
    }

    public PreConnectStrategy(int i, Set set, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? C13LQ.LJLIIL(new String[]{"api.tiktokv", "log.tiktok", "search.tiktokv", "webcast.tiktokv", "webcast-va.tiktokv"}) : set, (i3 & 4) != 0 ? 30 : i2);
    }
}
