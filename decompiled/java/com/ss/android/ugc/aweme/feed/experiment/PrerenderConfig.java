package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes33.dex */
public final class PrerenderConfig implements Serializable {

    @C09CT("allow_schema_list")
    public final List<String> allowSchemaList;

    @C09CT("deny_schema_list")
    public final List<String> denySchemaList;

    @C09CT("enable_prerender")
    public final boolean enablePrerender;

    @C09CT("expired_time_in_seconds")
    public final int expiredTimeInSeconds;

    @C09CT("volume")
    public final double volume;

    public PrerenderConfig() {
        this(false, null, null, 0.0d, 0, 31, null);
    }

    public PrerenderConfig(boolean z, List<String> list, List<String> list2, double d, int i) {
        this.enablePrerender = z;
        this.allowSchemaList = list;
        this.denySchemaList = list2;
        this.volume = d;
        this.expiredTimeInSeconds = i;
    }

    public PrerenderConfig(boolean z, List list, List list2, double d, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? 8.0d : d, (i2 & 16) != 0 ? 180 : i);
    }
}
