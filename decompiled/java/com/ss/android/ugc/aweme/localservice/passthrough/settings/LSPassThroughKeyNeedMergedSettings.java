package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C452501pT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class LSPassThroughKeyNeedMergedSettings {
    public static final LSPassThroughKeyNeedMergedSettings INSTANCE = new LSPassThroughKeyNeedMergedSettings();
    public static final LSPassThroughKeyNeedMergedConfig defaultConfig = new LSPassThroughKeyNeedMergedConfig(Collections.singletonList("order_attribute"));
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(74));

    private final LSPassThroughKeyNeedMergedConfig getConfig() {
        return (LSPassThroughKeyNeedMergedConfig) config$delegate.getValue();
    }

    public final LSPassThroughKeyNeedMergedConfig getDefaultConfig() {
        return defaultConfig;
    }

    public final boolean needMerge(String str) {
        List<String> list;
        LSPassThroughKeyNeedMergedConfig config = getConfig();
        if (config != null && (list = config.keyList) != null) {
            return list.contains(str);
        }
        return false;
    }
}
