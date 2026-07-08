package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class AdDislikeReasonModel implements Serializable {

    @C09CT("action_type")
    public final int actionType;

    @C09CT("category_key")
    public final String key;

    @C09CT("reason_text")
    public final String reason;

    @C09CT("toast_text")
    public final String toast;

    public AdDislikeReasonModel() {
        this(null, null, null, 0);
    }

    public AdDislikeReasonModel(String str, String str2, String str3, int i) {
        this.key = str;
        this.reason = str2;
        this.toast = str3;
        this.actionType = i;
    }
}
