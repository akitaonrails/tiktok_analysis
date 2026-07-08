package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class RoomAuthStatus implements Serializable {

    @C09CT("CommercePermission")
    public int commercePermission;

    public final int getCommercePermission() {
        return this.commercePermission;
    }

    public final void setCommercePermission(int i) {
        this.commercePermission = i;
    }
}
