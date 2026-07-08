package com.ss.android.ugc.aweme.localservice.live.common.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class BCSwitchStatusRequest implements Serializable {

    @C09CT("user_id")
    public final String userId;

    public BCSwitchStatusRequest() {
        this(null);
    }

    public BCSwitchStatusRequest(String str) {
        this.userId = str;
    }
}
