package com.ss.android.ugc.aweme.image.collage.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class CollageGroup {
    public static final int $stable = 8;

    @C09CT("collage_list")
    public final List<CollageIntProtocol> collageList;

    @C09CT("image_count")
    public final Integer imageCount;

    public CollageGroup(Integer num, List<CollageIntProtocol> list) {
        this.imageCount = num;
        this.collageList = list;
    }
}
