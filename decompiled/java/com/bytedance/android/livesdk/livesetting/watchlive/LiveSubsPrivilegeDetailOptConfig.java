package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveSubsPrivilegeDetailOptConfig {
    public static final TypeAdapter ADAPTER = new LiveSubsPrivilegeDetailOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_preload_reuse")
    public boolean enablePreloadReuse;

    @C09CT("ignore_failed_preload")
    public boolean ignoreFailedPreload;

    @C09CT("preload_allow_list")
    public List<String> preloadAllowList;

    @C09CT("preload_data_idle")
    public boolean preloadDataIdle;

    @C09CT("preload_delay")
    public long preloadDelay;

    @C09CT("preload_schema")
    public String preloadSchema;

    @C09CT("reuse_allow_list")
    public List<String> reuseAllowList;

    public LiveSubsPrivilegeDetailOptConfig() {
        this(false, null, new ArrayList(), new ArrayList(), true, 2000L, false);
    }

    public LiveSubsPrivilegeDetailOptConfig(boolean z, String str, List<String> list, List<String> list2, boolean z2, long j, boolean z3) {
        this.enablePreloadReuse = z;
        this.preloadSchema = str;
        this.reuseAllowList = list;
        this.preloadAllowList = list2;
        this.ignoreFailedPreload = z2;
        this.preloadDelay = j;
        this.preloadDataIdle = z3;
    }
}
