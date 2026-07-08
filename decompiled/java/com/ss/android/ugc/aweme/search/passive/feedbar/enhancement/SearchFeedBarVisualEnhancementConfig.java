package com.ss.android.ugc.aweme.search.passive.feedbar.enhancement;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFeedBarVisualEnhancementConfig {

    @C09CT("daily_click_threshold")
    public final int dailyClickThreshold;

    @C09CT("daily_show_threshold")
    public final Integer dailyShowThreshold;

    @C09CT("days_threshold_of_no_clicking")
    public final int daysThresholdOfNoClicking;

    @C09CT("enable_debug")
    public final boolean enableDebug;

    @C09CT("enabled_enter_from_list")
    public final List<String> enabledEnterFromList;

    @C09CT("enabled_for_ad_start_hub")
    public final int enabledForAdStartHub;

    @C09CT("enhancement_style")
    public final int enhancementStyle;

    @C09CT("play_progress_threshold")
    public final float playProgressThreshold;

    @C09CT("trigger_events")
    public final int triggerEvents;

    public SearchFeedBarVisualEnhancementConfig() {
        this(false, 0, 0, null, 0, 0.0f, 0, 0, null, 511, null);
    }

    public SearchFeedBarVisualEnhancementConfig(boolean z, int i, int i2, Integer num, int i3, float f, int i4, int i5, List<String> list) {
        this.enableDebug = z;
        this.enhancementStyle = i;
        this.dailyClickThreshold = i2;
        this.dailyShowThreshold = num;
        this.daysThresholdOfNoClicking = i3;
        this.playProgressThreshold = f;
        this.triggerEvents = i4;
        this.enabledForAdStartHub = i5;
        this.enabledEnterFromList = list;
    }

    public SearchFeedBarVisualEnhancementConfig(boolean z, int i, int i2, Integer num, int i3, float f, int i4, int i5, List list, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? false : z, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 3 : i2, (i6 & 8) != 0 ? null : num, (i6 & 16) == 0 ? i3 : 3, (i6 & 32) != 0 ? 50.0f : f, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) == 0 ? i5 : 0, (i6 & 256) != 0 ? C13BV.INSTANCE : list);
    }
}
