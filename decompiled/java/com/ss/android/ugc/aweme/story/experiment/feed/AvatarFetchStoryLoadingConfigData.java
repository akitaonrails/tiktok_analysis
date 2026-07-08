package com.ss.android.ugc.aweme.story.experiment.feed;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class AvatarFetchStoryLoadingConfigData {

    @C09CT(Scene.SCENE_SERVICE)
    public final List<String> scene;

    @C09CT("timeout")
    public final long timeout;

    public AvatarFetchStoryLoadingConfigData() {
        this(null, 0L, 3, null);
    }

    public AvatarFetchStoryLoadingConfigData(List<String> list, long j) {
        this.scene = list;
        this.timeout = j;
    }

    public AvatarFetchStoryLoadingConfigData(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 2000L : j);
    }
}
