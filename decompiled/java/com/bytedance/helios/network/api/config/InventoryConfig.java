package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class InventoryConfig {

    @C09CT("body_sample")
    public final double bodySample;

    @C09CT("cookie_sample")
    public final double cookieSample;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("header_sample")
    public final double headerSample;

    @C09CT("query_sample")
    public final double querySample;

    @C09CT("sample")
    public final double sample;

    @C09CT("specified")
    public final NetworkCondition specified;

    @C09CT("stack_sample")
    public final double stackSample;

    public InventoryConfig() {
        this(true, 0.001d, 0.0d, 1.0d, 1.0d, 0.0d, 1.0d, new NetworkCondition(null, null, null, 7, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InventoryConfig)) {
            return false;
        }
        InventoryConfig inventoryConfig = (InventoryConfig) obj;
        return this.enabled == inventoryConfig.enabled && Double.compare(this.sample, inventoryConfig.sample) == 0 && Double.compare(this.stackSample, inventoryConfig.stackSample) == 0 && Double.compare(this.headerSample, inventoryConfig.headerSample) == 0 && Double.compare(this.querySample, inventoryConfig.querySample) == 0 && Double.compare(this.bodySample, inventoryConfig.bodySample) == 0 && Double.compare(this.cookieSample, inventoryConfig.cookieSample) == 0 && Intrinsics.LJFF(this.specified, inventoryConfig.specified);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public final int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((r0 * 31) + C786410Ut5.X2(this.sample)) * 31) + C786410Ut5.X2(this.stackSample)) * 31) + C786410Ut5.X2(this.headerSample)) * 31) + C786410Ut5.X2(this.querySample)) * 31) + C786410Ut5.X2(this.bodySample)) * 31) + C786410Ut5.X2(this.cookieSample)) * 31) + this.specified.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InventoryConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", sample=");
        sbLIZ.append(this.sample);
        sbLIZ.append(", stackSample=");
        sbLIZ.append(this.stackSample);
        sbLIZ.append(", headerSample=");
        sbLIZ.append(this.headerSample);
        sbLIZ.append(", querySample=");
        sbLIZ.append(this.querySample);
        sbLIZ.append(", bodySample=");
        sbLIZ.append(this.bodySample);
        sbLIZ.append(", cookieSample=");
        sbLIZ.append(this.cookieSample);
        sbLIZ.append(", specified=");
        sbLIZ.append(this.specified);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InventoryConfig(boolean z, double d, double d2, double d3, double d4, double d5, double d6, NetworkCondition networkCondition) {
        this.enabled = z;
        this.sample = d;
        this.stackSample = d2;
        this.headerSample = d3;
        this.querySample = d4;
        this.bodySample = d5;
        this.cookieSample = d6;
        this.specified = networkCondition;
    }
}
