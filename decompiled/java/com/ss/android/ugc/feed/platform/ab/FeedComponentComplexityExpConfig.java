package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedComponentComplexityExpConfig {

    @C09CT("enabled_scene")
    public final List<String> enabledScene;

    @C09CT("is_open_async_mob")
    public final Boolean isOpenAsyncMob;

    @C09CT("use_new_maker")
    public final Map<String, Boolean> useNewMaker;

    @C09CT("use_new_trigger")
    public final Boolean useNewTrigger;

    public FeedComponentComplexityExpConfig() {
        this(Boolean.FALSE, null, null, null);
    }

    public FeedComponentComplexityExpConfig(Boolean bool, Map<String, Boolean> map, Boolean bool2, List<String> list) {
        this.useNewTrigger = bool;
        this.useNewMaker = map;
        this.isOpenAsyncMob = bool2;
        this.enabledScene = list;
    }
}
