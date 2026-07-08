package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class ApiSampleRateConfig extends DefaultSampleRateConfig {

    @C09CT("api_ids")
    public final List<Integer> apiIds;

    public ApiSampleRateConfig() {
        this(null, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    @Override // com.bytedance.helios.api.config.DefaultSampleRateConfig
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApiSampleRateConfig(apiIds='");
        sbLIZ.append(this.apiIds);
        sbLIZ.append("',monitorNormal=");
        sbLIZ.append(getMonitorNormal());
        sbLIZ.append(",monitorError=");
        sbLIZ.append(getMonitorError());
        sbLIZ.append(",interceptError=");
        sbLIZ.append(getInterceptError());
        sbLIZ.append(",localSampleRate=");
        sbLIZ.append(getLocalSampleRate());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    public ApiSampleRateConfig(List<Integer> list, double d, double d2, double d3, double d4) {
        super(d, d2, d3, d4);
        this.apiIds = list;
    }

    public ApiSampleRateConfig(List list, double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.01d : d2, (i & 8) != 0 ? 1.0d : d3, (i & 16) == 0 ? d4 : 1.0d);
    }
}
