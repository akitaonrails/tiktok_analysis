package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class AdsInfo {

    @C09CT("show_retention_popup")
    public Boolean showRetentionPopup;

    public AdsInfo() {
        this(Boolean.FALSE);
    }

    public AdsInfo(Boolean bool) {
        this.showRetentionPopup = bool;
    }
}
