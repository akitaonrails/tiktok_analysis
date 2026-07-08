package com.bytedance.helios.api.config;

import X.C09CT;
import X.C13LQ;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

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

    public NetworkDataConfig(boolean z, DataOperationStrategy dataOperationStrategy, DataOperationStrategy dataOperationStrategy2, DataOperationStrategy dataOperationStrategy3) {
        this.enabled = z;
        this.cookieStrategy = dataOperationStrategy;
        this.queryStrategy = dataOperationStrategy2;
        this.headerStrategy = dataOperationStrategy3;
    }

    public NetworkDataConfig(boolean z, DataOperationStrategy dataOperationStrategy, DataOperationStrategy dataOperationStrategy2, DataOperationStrategy dataOperationStrategy3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new DataOperationStrategy(new LinkedHashSet(), new LinkedHashMap()) : dataOperationStrategy, (i & 4) != 0 ? new DataOperationStrategy(C13LQ.LJLIIL(new String[]{"clientudid", "install_id", "google_aid", "cdid", "openudid", "sim_serial_number", "udid", "uid"}), new LinkedHashMap()) : dataOperationStrategy2, (i & 8) != 0 ? new DataOperationStrategy(new LinkedHashSet(), new LinkedHashMap()) : dataOperationStrategy3);
    }
}
