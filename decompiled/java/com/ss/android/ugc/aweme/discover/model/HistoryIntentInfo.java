package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class HistoryIntentInfo implements Serializable {

    @C09CT("ecom_intent_extra")
    public final EcomIntentExtra ecomIntentExtra;

    @C09CT("his_intent_type")
    public final Integer historyIntentType;

    @C09CT("user_intent_extra")
    public final UserIntentExtra userIntentExtra;

    public HistoryIntentInfo() {
        this(null, null, null);
    }

    public HistoryIntentInfo(Integer num, UserIntentExtra userIntentExtra, EcomIntentExtra ecomIntentExtra) {
        this.historyIntentType = num;
        this.userIntentExtra = userIntentExtra;
        this.ecomIntentExtra = ecomIntentExtra;
    }
}
