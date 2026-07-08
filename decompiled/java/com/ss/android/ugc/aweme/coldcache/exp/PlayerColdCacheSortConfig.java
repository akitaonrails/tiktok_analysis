package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class PlayerColdCacheSortConfig {

    @C09CT("adjust_similar")
    public final boolean adjustSimilar;

    @C09CT("after_watched_k_sort")
    public final int afterWatchedKSort;

    @C09CT("cache_video_all_finished")
    public final boolean cacheVideoAllFinished;

    @C09CT("chunk_size")
    public final int chunkSize;

    @C09CT("coeffs")
    public final List<Double> coefficients;

    @C09CT("cold_cache")
    public PlayerCacheSortSetting coldCacheSorterCfg;

    @C09CT("cold_rank_include_unconsumed")
    public final boolean coldRankIncludeUnconsumed;

    @C09CT("dimensions")
    public final List<Integer> dimensions;

    @C09CT("eliminate_size")
    public final int eliminateSize;

    @C09CT("eliminate_step_size")
    public final int eliminateStepSize;

    @C09CT("enable_history_record")
    public final boolean enableHistoryRecord;

    @C09CT("enable_strategy_sort")
    public final boolean enableStrategySort;

    @C09CT("first_only_timeliness")
    public final int firstOnlyTimeliness;

    @C09CT("golden_house")
    public final PlayerCacheSortSetting goldenHouseSorterCfg;

    @C09CT("incomplete_demotion")
    public final boolean incompleteDemotion;

    @C09CT("lower_non_video_rank")
    public final boolean lowerNonVideoRank;

    @C09CT("lowest_score_limit_time")
    public final int lowestScoreLimitTime;

    @C09CT("max_eliminate_count")
    public final int maxEliminateCount;

    @C09CT("max_loop_count")
    public final int maxLoopCount;

    @C09CT("max_values")
    public final List<Double> maxValues;

    @C09CT("min_sort_cache_size")
    public final int minSortCacheSize;

    @C09CT("min_values")
    public final List<Double> minValues;

    @C09CT("need_local_swap")
    public final boolean needLocalSwap;

    @C09CT("only_sort_no_score")
    public final boolean onlySortNoScore;

    @C09CT("pic_pt_params")
    public final List<Double> picPlayTimeParams;

    @C09CT("reduction_ratio")
    public final float reductionRatio;

    @C09CT("save_history_step_exp")
    public final int saveHistoryStepExp;

    @C09CT("sort_eps")
    public final double sortEPS;

    @C09CT("sort_K")
    public final int sortK;

    @C09CT("sort_omega")
    public final double sortOmega;

    @C09CT("sort_type")
    public final int sortType;

    @C09CT("unconsumed")
    public final PlayerCacheSortSetting unconsumedSorterCfg;

    @C09CT("within_time_h")
    public final int withinTimeH;

    public PlayerColdCacheSortConfig() {
        this(false, 0, 0, false, 0, null, null, null, null, 0.0d, 0.0d, 0, null, false, 0.0f, false, 0, false, 0, false, false, 0, 0, 0, 0, 0, 0, false, false, 0, null, null, null, -1, 1, null);
    }

    public PlayerColdCacheSortConfig(boolean z, int i, int i2, boolean z2, int i3, List<Integer> list, List<Double> list2, List<Double> list3, List<Double> list4, double d, double d2, int i4, List<Double> list5, boolean z3, float f, boolean z4, int i5, boolean z5, int i6, boolean z6, boolean z7, int i7, int i8, int i9, int i10, int i11, int i12, boolean z8, boolean z9, int i13, PlayerCacheSortSetting playerCacheSortSetting, PlayerCacheSortSetting playerCacheSortSetting2, PlayerCacheSortSetting playerCacheSortSetting3) {
        this.enableStrategySort = z;
        this.afterWatchedKSort = i;
        this.sortType = i2;
        this.enableHistoryRecord = z2;
        this.sortK = i3;
        this.dimensions = list;
        this.coefficients = list2;
        this.minValues = list3;
        this.maxValues = list4;
        this.sortOmega = d;
        this.sortEPS = d2;
        this.chunkSize = i4;
        this.picPlayTimeParams = list5;
        this.adjustSimilar = z3;
        this.reductionRatio = f;
        this.onlySortNoScore = z4;
        this.saveHistoryStepExp = i5;
        this.cacheVideoAllFinished = z5;
        this.maxLoopCount = i6;
        this.needLocalSwap = z6;
        this.lowerNonVideoRank = z7;
        this.eliminateSize = i7;
        this.lowestScoreLimitTime = i8;
        this.eliminateStepSize = i9;
        this.maxEliminateCount = i10;
        this.firstOnlyTimeliness = i11;
        this.withinTimeH = i12;
        this.incompleteDemotion = z8;
        this.coldRankIncludeUnconsumed = z9;
        this.minSortCacheSize = i13;
        this.coldCacheSorterCfg = playerCacheSortSetting;
        this.unconsumedSorterCfg = playerCacheSortSetting2;
        this.goldenHouseSorterCfg = playerCacheSortSetting3;
    }

    public PlayerColdCacheSortConfig(boolean z, int i, int i2, boolean z2, int i3, List list, List list2, List list3, List list4, double d, double d2, int i4, List list5, boolean z3, float f, boolean z4, int i5, boolean z5, int i6, boolean z6, boolean z7, int i7, int i8, int i9, int i10, int i11, int i12, boolean z8, boolean z9, int i13, PlayerCacheSortSetting playerCacheSortSetting, PlayerCacheSortSetting playerCacheSortSetting2, PlayerCacheSortSetting playerCacheSortSetting3, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z, (i14 & 2) != 0 ? 5 : i, (i14 & 4) != 0 ? 0 : i2, (i14 & 8) != 0 ? false : z2, (i14 & 16) != 0 ? 10 : i3, (i14 & 32) != 0 ? C13BV.INSTANCE : list, (i14 & 64) != 0 ? C13BV.INSTANCE : list2, (i14 & 128) != 0 ? C13BV.INSTANCE : list3, (i14 & 256) != 0 ? C13BV.INSTANCE : list4, (i14 & 512) != 0 ? 0.0d : d, (i14 & 1024) != 0 ? 0.001d : d2, (i14 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 500 : i4, (i14 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list5, (i14 & 8192) != 0 ? true : z3, (i14 & 16384) != 0 ? 1.0f : f, (32768 & i14) != 0 ? false : z4, (65536 & i14) != 0 ? 10 : i5, (131072 & i14) != 0 ? false : z5, (262144 & i14) != 0 ? 10 : i6, (524288 & i14) != 0 ? false : z6, (1048576 & i14) != 0 ? false : z7, (2097152 & i14) != 0 ? 0 : i7, (4194304 & i14) != 0 ? 4 : i8, (8388608 & i14) != 0 ? 2 : i9, (16777216 & i14) != 0 ? -1 : i10, (33554432 & i14) != 0 ? 0 : i11, (67108864 & i14) != 0 ? 24 : i12, (134217728 & i14) != 0 ? false : z8, (268435456 & i14) != 0 ? false : z9, (536870912 & i14) != 0 ? 1 : i13, (1073741824 & i14) != 0 ? null : playerCacheSortSetting, (i14 & Integer.MIN_VALUE) != 0 ? new PlayerCacheSortSetting(0, false, false, null, null, null, null, null, 0.0d, 0.0d, 0, null, false, 0, false, 32767, null) : playerCacheSortSetting2, (i15 & 1) != 0 ? new PlayerCacheSortSetting(0, false, false, null, null, null, null, null, 0.0d, 0.0d, 0, null, false, 0, false, 32767, null) : playerCacheSortSetting3);
    }
}
