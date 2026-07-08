package com.ss.android.ugc.aweme.localservice.live.common.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ProductOverviewRequest implements Serializable {

    @C09CT("room_id")
    public final String roomId;

    @C09CT("UserId")
    public final String userId;

    public ProductOverviewRequest() {
        this(null, null);
    }

    public ProductOverviewRequest(String str, String str2) {
        this.roomId = str;
        this.userId = str2;
    }
}
