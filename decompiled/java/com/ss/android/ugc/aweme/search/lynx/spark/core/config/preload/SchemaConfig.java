package com.ss.android.ugc.aweme.search.lynx.spark.core.config.preload;

import X.C09CT;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SchemaConfig {

    @C09CT("enable_multi_thread_preload")
    public boolean enableMultiThreadPreload;

    @C09CT("enable_release_useless_cache")
    public boolean enableReleaseUselessCache;

    @C09CT("preload_schema_map")
    public Map<String, String> preloadSchemaMap = new HashMap();
}
