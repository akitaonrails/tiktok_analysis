package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class ActivityStatusAccuracyAnalysisConfig {

    @C09CT("activity_status_accuracy_polling_config_list")
    public final List<ActivityStatusAccuracyPollingConfig> activityStatusAccuracyPollingConfigList;

    @C09CT("enable")
    public final boolean enable;

    public ActivityStatusAccuracyAnalysisConfig() {
        this(false, null, 3, null);
    }

    public ActivityStatusAccuracyAnalysisConfig(boolean z, List<ActivityStatusAccuracyPollingConfig> list) {
        this.enable = z;
        this.activityStatusAccuracyPollingConfigList = list;
    }

    public ActivityStatusAccuracyAnalysisConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
