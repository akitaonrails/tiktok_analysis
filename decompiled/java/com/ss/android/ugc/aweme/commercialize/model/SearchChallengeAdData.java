package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class SearchChallengeAdData implements Serializable {

    @C09CT("creative_id")
    public long creativeId;

    @C09CT("log_extra")
    public String logExtra;

    public long getCreativeId() {
        return this.creativeId;
    }

    public String getLogExtra() {
        return this.logExtra;
    }
}
