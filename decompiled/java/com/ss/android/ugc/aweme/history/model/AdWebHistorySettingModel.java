package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class AdWebHistorySettingModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("ad")
    public final Integer ad;

    @C09CT("history")
    public final Integer history;

    public AdWebHistorySettingModel() {
        this(null, null);
    }

    public AdWebHistorySettingModel(Integer num, Integer num2) {
        this.ad = num;
        this.history = num2;
    }
}
