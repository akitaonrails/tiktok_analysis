package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class CoinCountModel {

    @C09CT("count")
    public final String count;

    @C09CT("index")
    public final Integer index;

    public CoinCountModel() {
        this(null, null);
    }

    public CoinCountModel(Integer num, String str) {
        this.index = num;
        this.count = str;
    }
}
