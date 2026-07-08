package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class FetchVideoResponse {

    @C09CT("video_aweme_detail_list")
    public final List<Aweme> awemeList;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final String nextItemId;

    @C09CT("status_code")
    public final Integer statusCode;

    public FetchVideoResponse() {
        this(null, Boolean.FALSE, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchVideoResponse(List<? extends Aweme> list, Boolean bool, Integer num, String str) {
        this.awemeList = list;
        this.hasMore = bool;
        this.statusCode = num;
        this.nextItemId = str;
    }
}
