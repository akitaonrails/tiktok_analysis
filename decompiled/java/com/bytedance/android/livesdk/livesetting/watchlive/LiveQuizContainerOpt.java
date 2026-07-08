package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveQuizContainerOpt {
    public static final TypeAdapter ADAPTER = new LiveQuizContainerOpt_OptTypeAdapter(NormalGson.singleton());

    @C09CT("downgrade")
    public boolean downgrade;

    @C09CT("ignore_failed_preload")
    public boolean ignoreFailedPreload;

    @C09CT("preload_allow_list")
    public List<String> preloadAllowList;

    @C09CT("preload_schema")
    public String preloadSchema;

    @C09CT("reuse_allow_list")
    public List<String> reuseAllowList;

    public LiveQuizContainerOpt() {
        this(false, null, new ArrayList(), new ArrayList(), true);
    }

    public LiveQuizContainerOpt(boolean z, String str, List<String> list, List<String> list2, boolean z2) {
        this.downgrade = z;
        this.preloadSchema = str;
        this.reuseAllowList = list;
        this.preloadAllowList = list2;
        this.ignoreFailedPreload = z2;
    }
}
