package com.ss.android.ugc.aweme.aweme.optimize;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class AwemeCacheConfigModel {

    @C09CT("api_list")
    public final List<String> apiPath;

    @C09CT("api_path_aweme_clean_threshold")
    public int apiPathAwemeCleanThreshold;

    @C09CT("api_path_max_aweme")
    public int apiPathMaxAweme;

    @C09CT("delay_time")
    public long delay;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("valid_period")
    public final long validPeriod;

    public AwemeCacheConfigModel() {
        this(false, null, 0L, 0, 0, 0L, 63, null);
    }

    public final void setApiPathAwemeCleanThreshold(int i) {
        this.apiPathAwemeCleanThreshold = i;
    }

    public final void setApiPathMaxAweme(int i) {
        this.apiPathMaxAweme = i;
    }

    public final void setDelay(long j) {
        this.delay = j;
    }

    public AwemeCacheConfigModel(boolean z, List<String> list, long j, int i, int i2, long j2) {
        this.enable = z;
        this.apiPath = list;
        this.validPeriod = j;
        this.apiPathMaxAweme = i;
        this.apiPathAwemeCleanThreshold = i2;
        this.delay = j2;
    }

    public AwemeCacheConfigModel(boolean z, List list, long j, int i, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? 21600000L : j, (i3 & 8) != 0 ? 100 : i, (i3 & 16) != 0 ? 120 : i2, (i3 & 32) != 0 ? 3000L : j2);
    }
}
