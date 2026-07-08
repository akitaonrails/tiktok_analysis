package com.ss.android.ugc.aweme.minidrama.common.preload;

import X.C09CT;
import com.ss.android.ugc.aweme.model.PaidVideoItem;

/* JADX INFO: loaded from: classes25.dex */
public final class CollectionVideo {

    @C09CT("collection_id")
    public final Long collectionId;

    @C09CT("video")
    public final PaidVideoItem video;

    public CollectionVideo() {
        this(null, null);
    }

    public CollectionVideo(Long l, PaidVideoItem paidVideoItem) {
        this.collectionId = l;
        this.video = paidVideoItem;
    }
}
