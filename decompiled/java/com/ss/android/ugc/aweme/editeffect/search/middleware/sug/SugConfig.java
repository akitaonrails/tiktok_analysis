package com.ss.android.ugc.aweme.editeffect.search.middleware.sug;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class SugConfig {

    @C09CT("disable_pre_info_id")
    public final String disablePreInfoIdval;

    @C09CT("is_predict_sug")
    public final boolean isPredictSug;

    public SugConfig() {
        this(null, false);
    }

    public SugConfig(String str, boolean z) {
        this.disablePreInfoIdval = str;
        this.isPredictSug = z;
    }
}
