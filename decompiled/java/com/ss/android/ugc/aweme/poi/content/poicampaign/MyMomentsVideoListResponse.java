package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class MyMomentsVideoListResponse {

    @C09CT("video_aweme_detail_list")
    public final List<Aweme> awemeList;

    @C09CT("decoration_img")
    public final String decorationImage;

    @C09CT("description")
    public final String description;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final String nextItemId;

    @C09CT("no_data_img")
    public final String noDataImage;

    @C09CT("secondary_top_img")
    public final String secondaryTopImage;

    @C09CT("status_code")
    public final Integer statusCode;

    /* JADX WARN: Multi-variable type inference failed */
    public MyMomentsVideoListResponse(Integer num, List<? extends Aweme> list, String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.statusCode = num;
        this.awemeList = list;
        this.nextItemId = str;
        this.secondaryTopImage = str2;
        this.decorationImage = str3;
        this.description = str4;
        this.noDataImage = str5;
        this.hasMore = bool;
    }
}
