package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes33.dex */
public final class ReuseConfig implements Serializable {

    @C09CT("allow_schema_list")
    public final List<String> allowSchemaList;

    @C09CT("deny_schema_list")
    public final List<String> denySchemaList;

    @C09CT("enable_spark_stay_alive")
    public final boolean enableSparkStayAlive;

    @C09CT("expired_time_in_seconds")
    public final int expiredTimeInSeconds;

    @C09CT("volume")
    public final double volume;

    public ReuseConfig() {
        this(false, null, 0.0d, 0, null, 31, null);
    }

    public ReuseConfig(boolean z, List<String> list, double d, int i, List<String> list2) {
        this.enableSparkStayAlive = z;
        this.allowSchemaList = list;
        this.volume = d;
        this.expiredTimeInSeconds = i;
        this.denySchemaList = list2;
    }

    public ReuseConfig(boolean z, List list, double d, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? 8.0d : d, (i2 & 8) != 0 ? 180 : i, (i2 & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
