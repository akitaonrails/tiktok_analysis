package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class SubOnlyVideoGates implements Serializable {

    @C09CT("is_sov_urlless_enabled")
    public Boolean isSovUrllessEnabled = Boolean.FALSE;

    public final Boolean isSovUrllessEnabled() {
        return this.isSovUrllessEnabled;
    }

    public final void setSovUrllessEnabled(Boolean bool) {
        this.isSovUrllessEnabled = bool;
    }
}
