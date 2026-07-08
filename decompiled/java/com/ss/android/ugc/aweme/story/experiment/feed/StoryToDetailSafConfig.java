package com.ss.android.ugc.aweme.story.experiment.feed;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryToDetailSafConfig {

    @C09CT("tt_story_animation_type")
    public final int animationType;

    @C09CT("tt_story_enable_adapt_surface_view_transition")
    public final boolean enableAdaptSurfaceViewTransition;

    @C09CT("tt_story_force_wrap_context_for_preload")
    public final boolean forceWrapContextForPreload;

    @C09CT("tt_story_player_progress_memory_leak_fix")
    public final boolean playerProgressMemoryLeakFix;

    @C09CT("tt_story_scene")
    public final List<String> storyScene;

    @C09CT("tt_story_with_shell_activity")
    public final boolean withShellActivity;

    public StoryToDetailSafConfig() {
        this(null, false, 0, false, false, false, 63, null);
    }

    public StoryToDetailSafConfig(List<String> list, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.storyScene = list;
        this.withShellActivity = z;
        this.animationType = i;
        this.forceWrapContextForPreload = z2;
        this.playerProgressMemoryLeakFix = z3;
        this.enableAdaptSurfaceViewTransition = z4;
    }

    public StoryToDetailSafConfig(List list, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? 1 : i, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? true : z3, (i2 & 32) == 0 ? z4 : true);
    }
}
