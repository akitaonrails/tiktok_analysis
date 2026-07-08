package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ResultItem implements Serializable {

    @C09CT("aweme_id")
    public final String aweme_id;

    public final String getAweme_id() {
        return this.aweme_id;
    }

    public ResultItem(String str) {
        this.aweme_id = str;
    }
}
