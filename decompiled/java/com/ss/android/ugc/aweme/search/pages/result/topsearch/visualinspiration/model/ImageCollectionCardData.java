package com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageCollectionCardData implements Serializable {
    public static final int $stable = 8;

    @C09CT("items")
    public final ImageLoadMoreData items;

    public ImageCollectionCardData(ImageLoadMoreData imageLoadMoreData) {
        this.items = imageLoadMoreData;
    }
}
