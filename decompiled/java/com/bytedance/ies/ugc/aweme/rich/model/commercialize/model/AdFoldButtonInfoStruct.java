package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFoldButtonInfoStruct implements Serializable {

    @C09CT("disable_fold_cta")
    public final boolean disableFoldCTA;

    @C09CT("should_show")
    public final boolean shouldShow;

    public AdFoldButtonInfoStruct() {
        this(false, false);
    }

    public final boolean getDisableFoldCTA() {
        return this.disableFoldCTA;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public AdFoldButtonInfoStruct(boolean z, boolean z2) {
        this.shouldShow = z;
        this.disableFoldCTA = z2;
    }
}
