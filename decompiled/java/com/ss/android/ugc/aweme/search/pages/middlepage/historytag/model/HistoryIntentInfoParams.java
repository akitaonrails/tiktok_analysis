package com.ss.android.ugc.aweme.search.pages.middlepage.historytag.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.UserIntentExtra;

/* JADX INFO: loaded from: classes11.dex */
public final class HistoryIntentInfoParams {

    @C09CT("intent_type")
    public final Integer historyIntentType;

    @C09CT("user_intent_extra")
    public final UserIntentExtra userIntentExtra;

    public HistoryIntentInfoParams() {
        this(null, null);
    }

    public HistoryIntentInfoParams(Integer num, UserIntentExtra userIntentExtra) {
        this.historyIntentType = num;
        this.userIntentExtra = userIntentExtra;
    }
}
