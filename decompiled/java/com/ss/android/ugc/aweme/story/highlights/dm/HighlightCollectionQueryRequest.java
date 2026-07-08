package com.ss.android.ugc.aweme.story.highlights.dm;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class HighlightCollectionQueryRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("collections")
    public final List<HighlightCollectionQuery> collections;

    @C09CT(Scene.SCENE_SERVICE)
    public final Integer scene;

    public HighlightCollectionQueryRequest(List<HighlightCollectionQuery> list, Integer num) {
        this.collections = list;
        this.scene = num;
    }
}
