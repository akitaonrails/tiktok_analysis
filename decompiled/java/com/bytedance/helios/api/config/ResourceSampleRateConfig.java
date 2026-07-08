package com.bytedance.helios.api.config;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public final class ResourceSampleRateConfig extends DefaultSampleRateConfig {

    @C09CT("resource_id")
    public final String resourceId;

    public ResourceSampleRateConfig() {
        this("", 0.0d, 0.01d, 1.0d, 1.0d);
    }

    @Override // com.bytedance.helios.api.config.DefaultSampleRateConfig
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResourceSampleRateConfig(resourceId='");
        sbLIZ.append(this.resourceId);
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

    public final String getResourceId() {
        return this.resourceId;
    }

    public ResourceSampleRateConfig(String str, double d, double d2, double d3, double d4) {
        super(d, d2, d3, d4);
        this.resourceId = str;
    }
}
