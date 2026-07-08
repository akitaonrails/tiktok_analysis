package com.ss.android.ugc.aweme.subscription.network.models;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class SubsInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("is_preview")
    public final Boolean isPreviewOn;

    public final Boolean isPreviewOn() {
        return this.isPreviewOn;
    }

    public SubsInfo(Boolean bool) {
        this.isPreviewOn = bool;
    }
}
