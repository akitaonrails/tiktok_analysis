package com.ss.android.ugc.aweme.story.experiment.feed;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class StoryGestureConfig {

    @C09CT("tt_story_horizontal_switch_user_anim_interval")
    public final long ttStoryHorizontalSwitchUserAnimInterval;

    @C09CT("tt_story_long_press_interval")
    public final int ttStoryLongPressInterval;

    public StoryGestureConfig() {
        this(500, 300L);
    }

    public StoryGestureConfig(int i, long j) {
        this.ttStoryLongPressInterval = i;
        this.ttStoryHorizontalSwitchUserAnimInterval = j;
    }
}
