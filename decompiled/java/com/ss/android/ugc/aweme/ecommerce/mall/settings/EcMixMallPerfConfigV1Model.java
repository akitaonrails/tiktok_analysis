package com.ss.android.ugc.aweme.ecommerce.mall.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcMixMallPerfConfigV1Model {

    @C09CT("enable_high_priority_mix_mall_preload_task")
    public final Integer enableBoostMallPreloadTaskPriority;

    @C09CT("enable_cache_gaid_in_memory")
    public final Integer enableCacheGAIDInMemory;

    @C09CT("enable_calc_width_when_preload_feed_card")
    public final Integer enableCalcWidthWhenPreloadFeedCard;

    @C09CT("enable_crop_online_data_before_save_cache")
    public final Integer enableCropOnlineDataBeforeSaveCache;

    @C09CT("enable_full_list_fps")
    public final Integer enableFullListFps;

    @C09CT("enable_gecko_info_opt_by_channel")
    public final Integer enableGeckoInfoOptByChannel;

    @C09CT("enable_lazy_init_before_preload_api")
    public final Integer enableLazyInitBeforePreloadApi;

    @C09CT("enable_run_block_post_at_front_of_queue")
    public final Integer enableRunBlockPostAtFrontOfQueue;

    @C09CT("enable_set_skeleton_layer_below")
    public final Integer enableSetSkeletonLayerBelow;

    @C09CT("enable_skip_preload_api_save_cache")
    public final Integer enableSkipPreloadApiSaveCache;

    @C09CT("enable_skip_sketch_loading_if_cache")
    public final Integer enableSkipSketchLoadingIfCache;

    @C09CT("enable_video_time_view_by_java")
    public final Integer enableVideoTimeViewByJava;

    @C09CT("enter_mall_async_predecode_list")
    public final List<String> enterMallAsyncPreDecodeList;

    @C09CT("opt_merge_cache_and_online_render_strategy")
    public final Integer mergeCacheAndOnlineRenderStrategy;

    @C09CT("opt_api_callback")
    public final Integer optApiCallback;

    @C09CT("opt_cache_first_fetch_render")
    public final Integer optCacheFirstFetchRender;

    @C09CT("opt_prefetch_timing")
    public final Integer optPrefetchTiming;

    public EcMixMallPerfConfigV1Model() {
        this(0, 0, 0, 0, 0, 1, 1, 0, 0, 0, null, 0, 0, 0, 0, 1, 1);
    }

    public EcMixMallPerfConfigV1Model(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, List<String> list, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16) {
        this.enableVideoTimeViewByJava = num;
        this.enableBoostMallPreloadTaskPriority = num2;
        this.enableCacheGAIDInMemory = num3;
        this.enableGeckoInfoOptByChannel = num4;
        this.mergeCacheAndOnlineRenderStrategy = num5;
        this.enableSetSkeletonLayerBelow = num6;
        this.enableRunBlockPostAtFrontOfQueue = num7;
        this.enableLazyInitBeforePreloadApi = num8;
        this.enableCropOnlineDataBeforeSaveCache = num9;
        this.enableSkipSketchLoadingIfCache = num10;
        this.enterMallAsyncPreDecodeList = list;
        this.enableSkipPreloadApiSaveCache = num11;
        this.optCacheFirstFetchRender = num12;
        this.optPrefetchTiming = num13;
        this.optApiCallback = num14;
        this.enableCalcWidthWhenPreloadFeedCard = num15;
        this.enableFullListFps = num16;
    }
}
