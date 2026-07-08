package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizPartialFinishStepModel implements Serializable {

    @C09CT("coin_count")
    public final String coinCount;

    @C09CT("coin_count_list")
    public final List<CoinCountModel> coinCountList;

    @C09CT("coin_dark_img")
    public final String coinDarkImage;

    @C09CT("coin_img")
    public final String coinImage;

    @C09CT("first_text")
    public final String firstText;

    @C09CT("second_text")
    public final String secondText;

    public PoiQuizPartialFinishStepModel() {
        this(null, null, null, null, null, null);
    }

    public PoiQuizPartialFinishStepModel(String str, String str2, String str3, String str4, String str5, List<CoinCountModel> list) {
        this.firstText = str;
        this.coinImage = str2;
        this.coinCount = str3;
        this.coinDarkImage = str4;
        this.secondText = str5;
        this.coinCountList = list;
    }
}
