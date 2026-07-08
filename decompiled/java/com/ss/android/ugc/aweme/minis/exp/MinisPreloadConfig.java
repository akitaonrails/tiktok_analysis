package com.ss.android.ugc.aweme.minis.exp;

import X.C09CT;
import X.C2097608Jq;
import X.C2097908Jt;
import X.EnumC2196771AyJ;
import java.io.Serializable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class MinisPreloadConfig implements Serializable {

    @C09CT("preload_delay_trigger_duration")
    public final long delayPreloadTriggerDuration;

    @C09CT("h5_resource_cache_config")
    public final MinisH5ResourceCacheConfig h5ResourceCacheConfig;

    @C09CT("max_preload_minis_count")
    public final int maxPreloadMinisCount;

    @C09CT("max_preload_minis_count_by_scene")
    public final Map<String, Integer> maxPreloadMinisCountByScene;

    @C09CT("preload_performance_checker_config")
    public final MinisPreloadPerformanceCheckerConfig performanceCheckerConfig;

    @C09CT("pre_download_config")
    public final MinisPreDownloadConfig preDownloadConfig;

    @C09CT("preload_interval_seconds_by_scene")
    public final Map<String, Long> preloadIntervalSecondsByScene;

    public MinisPreloadConfig() {
        this(0L, null, null, 0, null, null, null, 127, null);
    }

    public final int getMaxPreloadCount(EnumC2196771AyJ enumC2196771AyJ) {
        Integer num;
        Map<String, Integer> map = this.maxPreloadMinisCountByScene;
        if (map != null && (num = map.get(enumC2196771AyJ.getScene())) != null) {
            return num.intValue();
        }
        return this.maxPreloadMinisCount;
    }

    public final long getPreloadIntervalMillis(EnumC2196771AyJ enumC2196771AyJ) {
        Long l;
        Map<String, Long> map = this.preloadIntervalSecondsByScene;
        if (map == null || (l = map.get(enumC2196771AyJ.getScene())) == null) {
            return 0L;
        }
        long jLongValue = l.longValue();
        if (jLongValue <= 0) {
            return 0L;
        }
        return jLongValue * 1000;
    }

    public MinisPreloadConfig(long j, MinisPreDownloadConfig minisPreDownloadConfig, MinisH5ResourceCacheConfig minisH5ResourceCacheConfig, int i, Map<String, Integer> map, MinisPreloadPerformanceCheckerConfig minisPreloadPerformanceCheckerConfig, Map<String, Long> map2) {
        this.delayPreloadTriggerDuration = j;
        this.preDownloadConfig = minisPreDownloadConfig;
        this.h5ResourceCacheConfig = minisH5ResourceCacheConfig;
        this.maxPreloadMinisCount = i;
        this.maxPreloadMinisCountByScene = map;
        this.performanceCheckerConfig = minisPreloadPerformanceCheckerConfig;
        this.preloadIntervalSecondsByScene = map2;
    }

    public MinisPreloadConfig(long j, MinisPreDownloadConfig minisPreDownloadConfig, MinisH5ResourceCacheConfig minisH5ResourceCacheConfig, int i, Map map, MinisPreloadPerformanceCheckerConfig minisPreloadPerformanceCheckerConfig, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 500L : j, (i2 & 2) != 0 ? new MinisPreDownloadConfig(0, 0, null, null, 0L, 0, false, 127, null) : minisPreDownloadConfig, (i2 & 4) != 0 ? new MinisH5ResourceCacheConfig(10, true, 72, 1, 20) : minisH5ResourceCacheConfig, (i2 & 8) != 0 ? 3 : i, (i2 & 16) != 0 ? C2097608Jq.LJIIIIZZ(new Pair(EnumC2196771AyJ.FEED_SIDEBAR.getScene(), 6), new Pair(EnumC2196771AyJ.DM_PLAYGROUND.getScene(), 6)) : map, (i2 & 32) != 0 ? new MinisPreloadPerformanceCheckerConfig(null, 1, null) : minisPreloadPerformanceCheckerConfig, (i2 & 64) != 0 ? C2097908Jt.LIZJ(new Pair(EnumC2196771AyJ.FEED_SIDEBAR.getScene(), 259200L)) : map2);
    }
}
