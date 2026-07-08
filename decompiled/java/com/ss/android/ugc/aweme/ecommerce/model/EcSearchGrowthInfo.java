package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class EcSearchGrowthInfo implements Serializable {

    @C09CT("feed_mall_button_score")
    public Float feedMallButtonScore;

    @C09CT("mall_words_click")
    public Float mallWordsClick;

    @C09CT("mall_words_show")
    public Float mallWordsShow;

    @C09CT("video_search_rec_info")
    public String videoSearchRecInfo;

    public EcSearchGrowthInfo() {
        this(null, null, null, null);
    }

    public EcSearchGrowthInfo(String str, Float f, Float f2, Float f3) {
        this.videoSearchRecInfo = str;
        this.mallWordsShow = f;
        this.mallWordsClick = f2;
        this.feedMallButtonScore = f3;
    }
}
