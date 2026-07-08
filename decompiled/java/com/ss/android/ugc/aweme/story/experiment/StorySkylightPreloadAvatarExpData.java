package com.ss.android.ugc.aweme.story.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class StorySkylightPreloadAvatarExpData {

    @C09CT("skylight_avatar_preload_independent_cache")
    public final boolean enableIndependentCache;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("preload_count_for_following")
    public final int preloadCountForFollowing;

    @C09CT("preload_count_for_friends")
    public final int preloadCountForFriends;

    @C09CT("preload_count_for_fyp")
    public final int preloadCountForFyp;

    @C09CT("preload_count_for_inbox")
    public final int preloadCountForInbox;

    @C09CT("preload_in_target_scene")
    public final int preloadInTargetScene;

    public StorySkylightPreloadAvatarExpData() {
        this(false, false, 0, 10, 10, 10, 10);
    }

    public StorySkylightPreloadAvatarExpData(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5) {
        this.enablePreload = z;
        this.enableIndependentCache = z2;
        this.preloadInTargetScene = i;
        this.preloadCountForInbox = i2;
        this.preloadCountForFriends = i3;
        this.preloadCountForFollowing = i4;
        this.preloadCountForFyp = i5;
    }
}
