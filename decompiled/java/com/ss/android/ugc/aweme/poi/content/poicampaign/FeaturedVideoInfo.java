package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class FeaturedVideoInfo {

    @C09CT("video_aweme_detail_list")
    public final List<Aweme> awemeModelList;

    @C09CT("decoration_img")
    public final String decorationImg;

    @C09CT("indicator_title")
    public final String indicatorTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public FeaturedVideoInfo(List<? extends Aweme> list, String str, String str2) {
        this.awemeModelList = list;
        this.indicatorTitle = str;
        this.decorationImg = str2;
    }
}
