package com.ss.android.ugc.aweme.commercialize.measurement.exposure;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class ExposureMeasurementConfig {

    @C09CT("exposure_all")
    public final boolean exposureAll;

    @C09CT("exposure_event_types")
    public final List<String> exposureEventTypes;

    public ExposureMeasurementConfig() {
        this(false, null, 3, null);
    }

    public ExposureMeasurementConfig(boolean z, List<String> list) {
        this.exposureAll = z;
        this.exposureEventTypes = list;
    }

    public ExposureMeasurementConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
