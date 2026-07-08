package com.ss.android.ugc.feed.platform.cell.interact.hotspot;

import X.C09CT;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedUnifiedComponentSpacingConfig {

    @C09CT("enable_left_expand")
    public final Boolean enableLeftExpand;

    @C09CT("genres")
    public final Set<String> genres;

    @C09CT("scenes")
    public final Set<String> scenes;

    public FeedUnifiedComponentSpacingConfig(Set<String> set, Set<String> set2, Boolean bool) {
        this.scenes = set;
        this.genres = set2;
        this.enableLeftExpand = bool;
    }
}
