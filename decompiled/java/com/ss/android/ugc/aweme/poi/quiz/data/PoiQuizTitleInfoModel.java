package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizTitleInfoModel implements Serializable {

    @C09CT("coin_count")
    public final String coinCount;

    @C09CT("coin_img")
    public final String coinImage;

    @C09CT("has_coin")
    public final Boolean hasCoin;

    @C09CT("text")
    public final String text;

    public PoiQuizTitleInfoModel() {
        this(null, null, null, null);
    }

    public PoiQuizTitleInfoModel(String str, String str2, Boolean bool, String str3) {
        this.text = str;
        this.coinCount = str2;
        this.hasCoin = bool;
        this.coinImage = str3;
    }
}
