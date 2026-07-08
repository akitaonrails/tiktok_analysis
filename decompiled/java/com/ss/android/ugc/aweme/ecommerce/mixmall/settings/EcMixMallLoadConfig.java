package com.ss.android.ugc.aweme.ecommerce.mixmall.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallLoadConfig {

    @C09CT("cache_tabbar_max_count")
    public final Integer cacheTabBarMaxCount;

    @C09CT("cache_write_interval")
    public final Integer cacheWriteInterval;

    @C09CT("dynamic_params_timeout_interval")
    public final Integer dynamicParamsTimeoutInterval;

    @C09CT("enable_clip_feed")
    public final Integer enableClipFeed;

    @C09CT("enable_native_generate_behavior_params")
    public final Integer enableNativeGenerateBehaviorParams;

    @C09CT("enable_native_generate_traffic_diversion_info")
    public final Integer enableNativeGenerateTdi;

    @C09CT("feed_first_step_item_count")
    public final Integer feedFirstStepItemCount;

    @C09CT("init_runtime_card_if_no_cache")
    public final Integer initRuntimeCardIfNoCache;

    @C09CT("lazy_load_interval")
    public final Integer lazyLoadInterval;

    @C09CT("ec_mix_mall_live_poster_opt")
    public final Integer livePosterOpt;

    @C09CT("ec_mix_mall_player_opt")
    public final Integer playerOpt;

    @C09CT("remove_feed_media_card_from_cache")
    public final Integer removeMediaCardFromCache;

    @C09CT("ec_mix_mall_scroll_play")
    public final Integer scrollPlay;

    @C09CT("sync_load_cache")
    public final Integer syncLoadCache;

    @C09CT("use_cache")
    public final Integer useCache;

    @C09CT("ec_mix_mall_video_opt")
    public final Integer videoOpt;

    public EcMixMallLoadConfig() {
        this(5, 2000, 1, 1, 200, 4, 100, 1, 1, 1, 1, 0, 1, 1, 1, 0);
    }

    public EcMixMallLoadConfig(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16) {
        this.cacheTabBarMaxCount = num;
        this.cacheWriteInterval = num2;
        this.enableClipFeed = num3;
        this.removeMediaCardFromCache = num4;
        this.dynamicParamsTimeoutInterval = num5;
        this.feedFirstStepItemCount = num6;
        this.lazyLoadInterval = num7;
        this.syncLoadCache = num8;
        this.useCache = num9;
        this.enableNativeGenerateTdi = num10;
        this.initRuntimeCardIfNoCache = num11;
        this.scrollPlay = num12;
        this.videoOpt = num13;
        this.playerOpt = num14;
        this.livePosterOpt = num15;
        this.enableNativeGenerateBehaviorParams = num16;
    }
}
