package com.ss.android.ugc.aweme.search.pages.middlepage.historytag.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class HistoryListParams {

    @C09CT("intent")
    public final List<HistoryIntentInfoParams> intent;

    @C09CT("word")
    public final String word;

    public HistoryListParams(String str, List<HistoryIntentInfoParams> list) {
        this.word = str;
        this.intent = list;
    }
}
