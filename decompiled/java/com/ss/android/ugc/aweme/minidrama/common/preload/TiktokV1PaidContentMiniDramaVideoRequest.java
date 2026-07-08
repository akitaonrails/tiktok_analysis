package com.ss.android.ugc.aweme.minidrama.common.preload;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class TiktokV1PaidContentMiniDramaVideoRequest {

    @C09CT("collection_ids")
    public final List<Long> collectionIds;

    @C09CT("root_scene")
    public final Integer rootScene;

    public TiktokV1PaidContentMiniDramaVideoRequest() {
        this(null, null);
    }

    public TiktokV1PaidContentMiniDramaVideoRequest(List<Long> list, Integer num) {
        this.collectionIds = list;
        this.rootScene = num;
    }
}
