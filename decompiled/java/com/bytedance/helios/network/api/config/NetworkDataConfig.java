package com.bytedance.helios.network.api.config;

import X.C09CT;
import X.C13LQ;
import X.C2188811AlT;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkDataConfig {

    @C09CT("cookie_strategy")
    public final DataOperationStrategy cookieStrategy;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("header_strategy")
    public final DataOperationStrategy headerStrategy;

    @C09CT("query_strategy")
    public final DataOperationStrategy queryStrategy;

    public NetworkDataConfig() {
        this(false, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkDataConfig)) {
            return false;
        }
        NetworkDataConfig networkDataConfig = (NetworkDataConfig) obj;
        return this.enabled == networkDataConfig.enabled && Intrinsics.LJFF(this.cookieStrategy, networkDataConfig.cookieStrategy) && Intrinsics.LJFF(this.queryStrategy, networkDataConfig.queryStrategy) && Intrinsics.LJFF(this.headerStrategy, networkDataConfig.headerStrategy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((r0 * 31) + this.cookieStrategy.hashCode()) * 31) + this.queryStrategy.hashCode()) * 31) + this.headerStrategy.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkDataConfig(enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(", cookieStrategy=");
        sbLIZ.append(this.cookieStrategy);
        sbLIZ.append(", queryStrategy=");
        sbLIZ.append(this.queryStrategy);
        sbLIZ.append(", headerStrategy=");
        sbLIZ.append(this.headerStrategy);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NetworkDataConfig(boolean z, DataOperationStrategy dataOperationStrategy, DataOperationStrategy dataOperationStrategy2, DataOperationStrategy dataOperationStrategy3) {
        this.enabled = z;
        this.cookieStrategy = dataOperationStrategy;
        this.queryStrategy = dataOperationStrategy2;
        this.headerStrategy = dataOperationStrategy3;
    }

    public NetworkDataConfig(boolean z, DataOperationStrategy dataOperationStrategy, DataOperationStrategy dataOperationStrategy2, DataOperationStrategy dataOperationStrategy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new DataOperationStrategy(null, null, 3, null) : dataOperationStrategy, (i & 4) != 0 ? new DataOperationStrategy(C13LQ.LJLIIL(new String[]{"clientudid", "install_id", "google_aid", "cdid", "openudid", "sim_serial_number", "udid", "uid"}), null, 2, null) : dataOperationStrategy2, (i & 8) != 0 ? new DataOperationStrategy(null, null, 3, null) : dataOperationStrategy3);
    }
}
