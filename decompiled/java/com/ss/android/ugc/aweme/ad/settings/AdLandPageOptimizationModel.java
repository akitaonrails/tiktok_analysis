package com.ss.android.ugc.aweme.ad.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLandPageOptimizationModel {

    @C09CT("enable_cache_channel_path")
    public final boolean enableCacheChannelPath;

    @C09CT("enable_parse_manifest_on_null")
    public final boolean enableParseManifest;

    @C09CT("remove_sync_block")
    public final boolean enableRemoveSyncBlock;

    @C09CT("enable_remove_useless_interceptor")
    public final boolean enableRemoveUselessInterceptor;

    @C09CT("enable_resource_to_mem")
    public final boolean enableResourceToMem;

    @C09CT("enable_use_url_md5_map")
    public final boolean enableUseMd5UrlMap;

    public AdLandPageOptimizationModel() {
        this(false, false, false, false, false, false);
    }

    public AdLandPageOptimizationModel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.enableCacheChannelPath = z;
        this.enableParseManifest = z2;
        this.enableUseMd5UrlMap = z3;
        this.enableResourceToMem = z4;
        this.enableRemoveSyncBlock = z5;
        this.enableRemoveUselessInterceptor = z6;
    }
}
