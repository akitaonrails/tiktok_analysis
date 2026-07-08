package com.ss.android.ugc.aweme.commercialize.ams.adapter.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class AppMeasurementMigrateConfig {

    @C09CT("app_measurement_policy_opt")
    public final int measurementPolicyOpt;

    @C09CT("app_measurement_migrate_page_type")
    public final List<String> migratePageTypes;

    @C09CT("app_measurement_support_roi2")
    public final boolean supportROI2;

    @C09CT("app_measurement_support_search_roi2")
    public final boolean supportSearchROI2;

    @C09CT("app_measurement_migrate_type")
    public final int type;

    public AppMeasurementMigrateConfig() {
        this(0, null, false, false, 0, 31, null);
    }

    public AppMeasurementMigrateConfig(int i, List<String> list, boolean z, boolean z2, int i2) {
        this.type = i;
        this.migratePageTypes = list;
        this.supportROI2 = z;
        this.supportSearchROI2 = z2;
        this.measurementPolicyOpt = i2;
    }

    public AppMeasurementMigrateConfig(int i, List list, boolean z, boolean z2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? 0 : i2);
    }
}
