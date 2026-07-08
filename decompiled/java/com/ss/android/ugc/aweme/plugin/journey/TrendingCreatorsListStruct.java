package com.ss.android.ugc.aweme.plugin.journey;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class TrendingCreatorsListStruct {

    @C09CT("trending_creators")
    public final List<TrendingCreatorStruct> creators;

    @C09CT("interest_id")
    public final String interestId;

    @C09CT("interest_text")
    public final String interestText;

    public TrendingCreatorsListStruct(String str, String str2, List<TrendingCreatorStruct> list) {
        this.interestId = str;
        this.interestText = str2;
        this.creators = list;
    }
}
