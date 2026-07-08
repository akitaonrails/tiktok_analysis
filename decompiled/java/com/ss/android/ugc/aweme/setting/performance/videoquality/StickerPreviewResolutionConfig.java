package com.ss.android.ugc.aweme.setting.performance.videoquality;

import X.C09CT;
import X.C13BV;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public final class StickerPreviewResolutionConfig {

    @C09CT("block_category")
    public final List<String> blockCategories;

    @C09CT("block_effect")
    public final List<String> blockEffects;

    @C09CT("disable_downgrade_by_ppi")
    public final boolean disableDowngradeByPPI;

    @C09CT("downgrade_second_level_condition")
    public final n downgradeSecondLevelCondition;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_downgrade_by_perf_stats")
    public final boolean enableDowngradeByPerfStats;

    @C09CT("enable_downgrade_with_multi_segments")
    public final boolean enableDowngradeMultiSegments;

    @C09CT("enable_downgrade_second_level")
    public final boolean enableDowngradeSecondLevel;

    @C09CT("perf_stats_downgrade_condition")
    public final n perfStatsDowngradeCondition;

    @C09CT("resolution")
    public final List<String> resolution;

    public StickerPreviewResolutionConfig() {
        this(false, false, false, null, null, null, false, null, false, null, 1023, null);
    }

    public StickerPreviewResolutionConfig(boolean z, boolean z2, boolean z3, List<String> list, List<String> list2, List<String> list3, boolean z4, n nVar, boolean z5, n nVar2) {
        this.enable = z;
        this.enableDowngradeMultiSegments = z2;
        this.disableDowngradeByPPI = z3;
        this.resolution = list;
        this.blockCategories = list2;
        this.blockEffects = list3;
        this.enableDowngradeByPerfStats = z4;
        this.perfStatsDowngradeCondition = nVar;
        this.enableDowngradeSecondLevel = z5;
        this.downgradeSecondLevelCondition = nVar2;
    }

    public StickerPreviewResolutionConfig(boolean z, boolean z2, boolean z3, List list, List list2, List list3, boolean z4, n nVar, boolean z5, n nVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? C13BV.INSTANCE : list2, (i & 32) != 0 ? C13BV.INSTANCE : list3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : nVar, (i & 256) == 0 ? z5 : false, (i & 512) == 0 ? nVar2 : null);
    }
}
