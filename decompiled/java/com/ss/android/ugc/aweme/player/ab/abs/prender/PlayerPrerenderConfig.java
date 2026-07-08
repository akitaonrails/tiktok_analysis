package com.ss.android.ugc.aweme.player.ab.abs.prender;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class PlayerPrerenderConfig {

    @C09CT("delay_first_prerender")
    public final int delayFirstPrerender;

    @C09CT("enable_limit_strategy")
    public final boolean enableLimitStrategy;

    @C09CT("in_scrolling_intercept")
    public final boolean inScrollingIntercept;

    @C09CT("judge_include_next")
    public final boolean judgeIncludeNext;

    @C09CT("limit_resolution")
    public final int limitResolution;

    @C09CT("limit_scene_list")
    public final List<Integer> limitSceneList;

    @C09CT("release_on_pause_delay_ms")
    public final long releaseOnPauseDelayMs;

    @C09CT("temp_reset_duplicate_switch")
    public final boolean tempResetDuplicateSwitch;

    @C09CT("trigger_in_page_switch_ms")
    public final long triggerInPageSwitchMs;

    public PlayerPrerenderConfig() {
        this(false, 0L, 0L, false, null, 0, false, false, 0, 511, null);
    }

    public PlayerPrerenderConfig(boolean z, long j, long j2, boolean z2, List<Integer> list, int i, boolean z3, boolean z4, int i2) {
        this.tempResetDuplicateSwitch = z;
        this.triggerInPageSwitchMs = j;
        this.releaseOnPauseDelayMs = j2;
        this.enableLimitStrategy = z2;
        this.limitSceneList = list;
        this.limitResolution = i;
        this.judgeIncludeNext = z3;
        this.inScrollingIntercept = z4;
        this.delayFirstPrerender = i2;
    }

    public PlayerPrerenderConfig(boolean z, long j, long j2, boolean z2, List list, int i, boolean z3, boolean z4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z, (i3 & 2) != 0 ? 0L : j, (i3 & 4) == 0 ? j2 : 0L, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? Collections.singletonList(-1) : list, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? false : z4, (i3 & 256) == 0 ? i2 : 0);
    }
}
