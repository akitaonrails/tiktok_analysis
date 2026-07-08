package com.bytedance.touchpoint.core.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveNewUserActivityConfig {

    @C09CT("enable_onelink_popup_cancel")
    public final boolean enableOnelinkPopupCancel;

    @C09CT("enable_onelink_popup_request")
    public final boolean enableOnelinkPopupRequest;

    public IncentiveNewUserActivityConfig() {
        this(false, false);
    }

    public IncentiveNewUserActivityConfig(boolean z, boolean z2) {
        this.enableOnelinkPopupRequest = z;
        this.enableOnelinkPopupCancel = z2;
    }
}
