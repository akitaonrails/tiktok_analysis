package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.model;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchReviewAggregationProduct implements Serializable {
    public static final int $stable = 8;
    public final List<Map<?, ?>> coverVideoList;

    @C09CT("cover_video_list")
    public final List<Map<?, ?>> coverVideoListRawData;

    @C09CT("unique_id")
    public final String uniqueId;

    @C09CT("video_cursor")
    public final Integer videoCursor;

    public SearchReviewAggregationProduct() {
        this(null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchReviewAggregationProduct(List<? extends Map<?, ?>> list, String str, Integer num) {
        this.coverVideoListRawData = list;
        this.uniqueId = str;
        this.videoCursor = num;
        ArrayList arrayList = null;
        if (list != 0) {
            arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Map map = (Map) it2.next();
                if (map != null && (!map.isEmpty())) {
                    arrayList.add(map);
                }
            }
        }
        this.coverVideoList = arrayList;
    }
}
